package test1.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	
	EdgeDriver driver;
	  void launch() {
		  
		  System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
			
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/s/?ie=UTF8&keywords=join+amazon+prime&index=aps&tag=msndeskstdin-21&ref=pd_sl_9ntprzamt3_b&adgrpid=1327112148528381&hvadid=82944775541359&hvnetw=o&hvqmt=b&hvbmt=bb&hvdev=c&hvlocint=&hvlocphy=155058&hvtargid=kwd-82945393014646:loc-90&hydadcr=5626_2377281&mcid=3861a9d242543041b997efa1f39279d3&msclkid=b0f7032bac4313f908776a8f9adb9897");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	  void mouseover() 
	  {
		  Actions act=new Actions(driver);
	      act.moveToElement(driver.findElement(By.xpath("//span[text()='Fresh']"))).build().perform();
	      //WebElement fresh=driver.findElement(By.xpath("//span[text()='Fresh']"));
	     // act.moveToElement(fresh).build().perform();
	  }
	  public static void main(String[] args) {
		  
		  actionclass a=new actionclass();
		  a.launch();
		  a.mouseover();
	  }
}
