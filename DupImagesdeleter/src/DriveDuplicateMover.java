	import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class DriveDuplicateMover {

    public static void main(String[] args) {
        String scanDirectory = "D:\\"; 
        String duplicateDirectory = "D:\\duplicates"; 

        System.out.println("Starting deep scan of drive: " + scanDirectory);
        System.out.println("Duplicates will be moved to: " + duplicateDirectory);
        
        findAndMoveDuplicates(Paths.get(scanDirectory), Paths.get(duplicateDirectory));
    }

    public static void findAndMoveDuplicates(Path targetDir, Path duplicateFolder) {
        try {
            if (!Files.exists(duplicateFolder)) {
                Files.createDirectories(duplicateFolder);
                System.out.println("Created folder: " + duplicateFolder.toAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Failed to create duplicates directory: " + e.getMessage());
            return;
        }

        Map<String, Path> uniqueFilesMap = new HashMap<>();
        String[] imageExtensions = {".jpg", ".jpeg", ".png", ".gif", ".bmp", ".webp"};

        try {
            // Walk the file tree using a visitor pattern to safely handle permission errors
            Files.walkFileTree(targetDir, new SimpleFileVisitor<Path>() {
                
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    // CRITICAL SAFETY: Skip restricted system directories and the target folder itself before entering them
                    String dirName = dir.toString().toLowerCase();
                    String targetFolderStr = duplicateFolder.toString().toLowerCase();
                    
                    if (dirName.contains("$recycle.bin") 
                            || dirName.contains("system volume information") 
                            || dirName.contains(targetFolderStr)) {
                        return FileVisitResult.SKIP_SUBTREE; // Safely bypasses the entire folder hierarchy
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    if (Files.isRegularFile(path) && hasImageExtension(path, imageExtensions)) {
                        try {
                            String fileHash = calculateMD5(path);
                            
                            if (uniqueFilesMap.containsKey(fileHash)) {
                                Path targetPath = duplicateFolder.resolve(path.getFileName());
                                
                                if (Files.exists(targetPath)) {
                                    targetPath = duplicateFolder.resolve(System.currentTimeMillis() + "_" + path.getFileName());
                                }
                                
                                Files.move(path, targetPath, StandardCopyOption.REPLACE_EXISTING);
                                System.out.println("[MOVED] " + path.getFileName() + " -> " + targetPath.getFileName());
                            } else {
                                uniqueFilesMap.put(fileHash, path);
                            }
                        } catch (IOException | NoSuchAlgorithmException e) {
                            // Bypasses individual files that are locked by the OS or other software
                        }
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    // CRITICAL SAFETY: If Windows denies access to a file/folder, skip it entirely and continue scanning
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("\nScan complete.");
            System.out.println("Unique images kept in place: " + uniqueFilesMap.size());
            System.out.println("Review moved duplicates in: " + duplicateFolder.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Fatal error reading the drive structure: " + e.getMessage());
        }
    }

    private static String calculateMD5(Path filePath) throws IOException, NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        try (FileInputStream fis = new FileInputStream(filePath.toFile())) {
            byte[] byteArray = new byte[8192];
            int bytesCount;
            while ((bytesCount = fis.read(byteArray)) != -1) {
                digest.update(byteArray, 0, bytesCount);
            }
        }
        byte[] bytes = digest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    private static boolean hasImageExtension(Path path, String[] extensions) {
        String fileName = path.toString().toLowerCase();
        for (String ext : extensions) {
            if (fileName.endsWith(ext)) {
                return true;
            }
        }
        return false;
    }
}
