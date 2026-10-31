package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopKartHomePage {
    public static void main(String[] args) {
    	WebDriver driver =new ChromeDriver();
    	try {
    		driver.manage().window().maximize();
    		driver.get("https://shopkart11.in");
    		System.out.println("Title"+driver.getTitle());
    		System.out.println("URL"+driver.getCurrentUrl());
    		System.out.println("Page"+driver.getPageSource());
    	}finally {
    		driver.quit();
    	}
     
        
        
      
        
    }
}
