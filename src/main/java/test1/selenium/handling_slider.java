package test1.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_slider {

	EdgeDriver driver;
	  void launch() {
		  
		  System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
			
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	  void leftslider()
	  {
		  WebElement left=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		  Actions ac=new Actions(driver);
		  ac.dragAndDropBy(left, 100, 0).build().perform();
		  }
	  
	  public static void main(String[] args) {
		  handling_slider hs=new handling_slider();
		  hs.launch();
		  hs.leftslider();
	  }
}
