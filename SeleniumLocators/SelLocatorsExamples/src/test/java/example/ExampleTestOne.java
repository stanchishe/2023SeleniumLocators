package example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleTestOne {
    static WebDriver webDriver;

    @BeforeAll
    public static void initiate() {
        ChromeOptions options = new ChromeOptions().addArguments("Start-Maximized");
        webDriver = new ChromeDriver(options);
    }

    @AfterAll
    public static void close() {
        webDriver.close();
        webDriver.quit();
    }


    @Test
    @DisplayName("should load the Google logo")
    public void shouldLoadLogo() {
        webDriver.get("https://google.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.findElement(By.id("W0wltc")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement googleLogo = webDriver.findElement(By.id("hplogo"));
        Assertions.assertTrue(googleLogo.isDisplayed(), "Something else was loaded");
    }
}
