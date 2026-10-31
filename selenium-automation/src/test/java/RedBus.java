import java.util.concurrent.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.className("label___3c7f79")).click();
		
		
		
	}

}
