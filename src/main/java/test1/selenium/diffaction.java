package test1.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class diffaction {
	
	EdgeDriver driver;
	 Actions act;
	  void launch() {
		  
		  System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
			
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	  void mousehover()
	  {
		  Actions act = new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//button[text()='Point Me']"))).build().perform();	  
	  }
	  void draganddrop()
	  {
		  WebElement drag=driver.findElement(By.id("draggable"));
		  WebElement drop=driver.findElement(By.id("droppable"));
		  act.dragAndDrop(drag, drop).build().perform();
	  }
	  public static void main(String[] args) {
		  diffaction ob=new diffaction();
		  ob.launch();
		  ob.mousehover();
		  ob.draganddrop();
	  }
}
