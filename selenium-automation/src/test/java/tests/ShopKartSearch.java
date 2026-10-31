
package tests;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopKartSearch {

    public static void main(String[] args) {

        WebDriver driver = null;

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        try {
            System.out.println("Step 1: Opening Chrome");

            driver = new ChromeDriver();
            driver.manage().window().maximize();

            System.out.println("Step 2: Opening ShopKart");

            driver.get("https://shopkart11.in/");

            WebDriverWait wait =
                    new WebDriverWait(driver, Duration.ofSeconds(15));

            System.out.println("Step 3: Finding search box");

            By searchLocator = By.xpath(
                "//input[@placeholder='Search for products,brand and more']"
            );

            WebElement searchBox = wait.until(
                ExpectedConditions.elementToBeClickable(searchLocator)
            );

            System.out.println("Step 4: Search box found");

            // Record time before searching
            LocalDateTime beforeSearch = LocalDateTime.now();
            long startTime = System.currentTimeMillis();

            System.out.println(
                "Time before searching: " + beforeSearch.format(formatter)
            );

            // Enter product name
            searchBox.clear();
            searchBox.sendKeys("shoes");

            System.out.println("Product entered: shoes");

            // Start the search
            searchBox.sendKeys(Keys.ENTER);

            // Wait for the page URL or content to change if possible.
            // This avoids assuming that pressing Enter always works.
            try {
                wait.until(ExpectedConditions.or(
                    ExpectedConditions.urlContains("search"),
                    ExpectedConditions.urlContains("shoes")
                ));
                System.out.println("Search-related URL detected.");
            } catch (Exception e) {
                System.out.println(
                    "No matching URL detected; search may use another method."
                );
            }

            // Record time after the search attempt
            long endTime = System.currentTimeMillis();
            LocalDateTime afterSearch = LocalDateTime.now();

            System.out.println(
                "Time after searching: " + afterSearch.format(formatter)
            );

            System.out.println(
                "Time taken: " + (endTime - startTime) + " milliseconds"
            );

            System.out.println(
                "Time taken: " + ((endTime - startTime) / 1000.0)
                        + " seconds"
            );

            System.out.println("Current URL: " + driver.getCurrentUrl());
            System.out.println("Page title: " + driver.getTitle());

        } catch (Exception e) {

            System.out.println("TEST FAILED");
            System.out.println(
                "Error type: " + e.getClass().getSimpleName()
            );
            System.out.println("Error message: " + e.getMessage());

            e.printStackTrace();

        } finally {

            if (driver != null) {
                driver.quit();
                System.out.println("Browser closed");
            }
        }
    }
}