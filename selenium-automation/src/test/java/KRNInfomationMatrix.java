import java.util.concurrent.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class KRNInfomationMatrix {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/selenium/testing");
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement textBox = driver.findElement(By.id("fname"));
		textBox.sendKeys("Hello Selenium");

		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text(='Generate Alert Box']")).click();
		Thread.sleep(3000);
		String altText=driver.switchTo().alert().getText();
		System.out.println(altText);
		driver.switchTo().alert().accept();

	}

}