package test1.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertbutton {
	
	EdgeDriver driver;
	  void launch() {
		  
		  System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
			
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	  void simpleAlert() throws InterruptedException
	  { 
		  driver.findElement(By.id("alertBtn")).click();
		  Alert al=driver.switchTo().alert();
	      System.out.println(al.getText());
	      Thread.sleep(2000);
	      al.accept();
	  }
	  void confirmation_alert() throws InterruptedException {
		  driver.findElement(By.id("confirmBtn")).click();
		  Alert al2=driver.switchTo().alert();
		  
		  Thread.sleep(1000);
		  al2.accept();//press ok
		  
		  driver.findElement(By.id("confirmBtn")).click();
		  Alert al3=driver.switchTo().alert();
		  
		  Thread.sleep(1000);
		  al3.dismiss();//press cancle
	  }
	  void prompt_alert()
	  {
		  driver.findElement(By.id("promptBtn")).click();
		  Alert al4=driver.switchTo().alert();
		  al4.sendKeys("vaibhavi");
		  al4.accept();
	  }
	  public static void main(String[] args) throws InterruptedException {
		  
		  alertbutton a=new alertbutton();
		  a.launch();
		  a.simpleAlert();
		  a.confirmation_alert();
		  a.prompt_alert();
	  }

}
