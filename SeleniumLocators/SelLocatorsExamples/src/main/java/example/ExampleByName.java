package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleByName {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://google.com");
        Thread.sleep(2000);
        webDriver.findElement(By.id("W0wltc")).click();
        Thread.sleep(2000);
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("html tutorial", Keys.ENTER);
        // webDriver.findElement(By.name("btnK")).click();

        Thread.sleep(10000);
        webDriver.close();
        webDriver.quit();
    }
}
