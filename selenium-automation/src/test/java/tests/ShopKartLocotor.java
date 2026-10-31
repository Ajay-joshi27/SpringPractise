

package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopKartLocotor {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            // 1. Maximize browser
            driver.manage().window().maximize();

            // 2. Open ShopKart
            driver.get("https://shopkart11.in/");

            // 3. Create explicit wait (maximum 10 seconds)
            WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(10)
            );

            // 4. Locate the search box using XPath
            By searchLocator = By.xpath(
                "//input[@placeholder='Search for products,brand and more']"
            );

            // 5. Wait until the search box is visible
            WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    searchLocator
                )
            );

            // 6. Validate the search box
            System.out.println(
                "Search box displayed: " + searchBox.isDisplayed()
            );

            System.out.println(
                "Search box enabled: " + searchBox.isEnabled()
            );

            // 7. Enter a search term
            searchBox.sendKeys("shoes");

            // 8. Print the entered value
            System.out.println(
                "Entered search text: "
                + searchBox.getAttribute("value")
            );

        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());

        } finally {
            // 9. Close browser
            driver.quit();
        }
    }
}
