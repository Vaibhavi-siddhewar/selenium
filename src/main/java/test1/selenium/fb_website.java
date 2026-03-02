package test1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class fb_website {

	EdgeDriver driver;
    void invalid_login() {

        System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");

        driver = new EdgeDriver();

        driver.get("https://www.facebook.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

   
		driver.findElement(By.name("email")).sendKeys("fbt@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("fbt123");

        driver.findElement(By.name("login_button")).click();

      //  driver.quit();
    }

    public static void main(String[] args) {
    	fb_website ob = new fb_website();
        ob.invalid_login();
    }
}