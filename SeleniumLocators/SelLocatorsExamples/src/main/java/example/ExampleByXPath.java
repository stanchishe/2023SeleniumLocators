package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleByXPath {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://login.yahoo.com/");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("MY_YAhOO", Keys.ENTER);

        Thread.sleep(5000);
        webDriver.close();
        webDriver.quit();
    }
}
