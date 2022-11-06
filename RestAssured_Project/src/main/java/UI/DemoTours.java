package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTours {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Driver/chromedriver.exe");
    //Initializing the driver
        WebDriver driver = new ChromeDriver();

        //Navigate the driver to the url
        driver.navigate().to("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.name("userName")).sendKeys("jaya");
        driver.findElement(By.name("password")).sendKeys("jaya");
        driver.findElement(By.name("submit")).click();
        driver.close();

    }
}
