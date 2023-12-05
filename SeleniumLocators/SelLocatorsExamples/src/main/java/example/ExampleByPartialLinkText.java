package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://login.yahoo.com/");
        Thread.sleep(1000);
        webDriver.findElement(By.partialLinkText("Forgot")).click();

        Thread.sleep(5000);
        webDriver.close();
        webDriver.quit();
    }
}
