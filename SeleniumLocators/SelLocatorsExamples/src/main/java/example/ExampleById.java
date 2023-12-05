package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleById {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://accounts.google.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement userName = webDriver.findElement(By.id("identifierId"));
        userName.sendKeys("SOME_EMAIL@gmail.com", Keys.ENTER);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        webDriver.close();
        webDriver.quit();
    }
}
