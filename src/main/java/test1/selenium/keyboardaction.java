package test1.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class keyboardaction {
	
	EdgeDriver driver;
	  void launch() {
		  
		  System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
			
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	  void search()
	  {
		  WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		  //enter key
		  se.sendKeys("Software Testing");
		  se.sendKeys(Keys.ENTER);
	  }
	  void copypaste()
	  {
		  WebElement name=driver.findElement(By.id("name"));
		  name.sendKeys("vaibhavi");
		  name.sendKeys(Keys.CONTROL+"A");
	      name.sendKeys(Keys.CONTROL+"C");
	      
	      WebElement email=driver.findElement(By.id("email"));
		  email.sendKeys("vaibhavi@gmail.com");
		  email.sendKeys(Keys.CONTROL+"A");
	      email.sendKeys(Keys.CONTROL+"C");
	  }
	  void delete() throws InterruptedException
	  {
		  WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		  se.sendKeys("java");
		  Thread.sleep(1000);
		  se.sendKeys(Keys.CONTROL+"A");
		  se.sendKeys(Keys.DELETE);
	  }
	  public static void main(String[] args) throws InterruptedException {
		  keyboardaction k=new keyboardaction();
		  k.launch();
		  k.search();
		  k.copypaste();
		  k.delete();
	  }

}
