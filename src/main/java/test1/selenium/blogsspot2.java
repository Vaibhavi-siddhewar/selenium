package test1.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class blogsspot2 {
	
	EdgeDriver driver;
	  void launch() {
		  
		  System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
			
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    void practice_form() throws InterruptedException {

	        // ===== Basic Details =====

	        driver.findElement(By.id("name")).sendKeys("Yogita");
	        driver.findElement(By.id("email")).sendKeys("yogita@gmail.com");
	        driver.findElement(By.id("phone")).sendKeys("9876543210");
	        driver.findElement(By.id("textarea")).sendKeys("Mumbai, Maharashtra");

	        // ===== Gender =====
	        driver.findElement(By.id("female")).click();

	        // ===== Days =====
	        driver.findElement(By.id("monday")).click();
	        driver.findElement(By.id("friday")).click();

	        // ===== Country Dropdown =====
	        Select country = new Select(driver.findElement(By.id("country")));
	        country.selectByVisibleText("India");

	        // ===== Colors (Multiple Select Dropdown) =====
	        Select colors = new Select(driver.findElement(By.id("colors")));
	        colors.selectByVisibleText("Red");
	        colors.selectByVisibleText("Green");

	        // ===== Sorted List (Animals) =====
	        Select animals = new Select(driver.findElement(By.id("animals")));
	        animals.selectByVisibleText("Cat");
	        animals.selectByVisibleText("Dog");

	        // ===== Date Picker 1 (mm/dd/yyyy) =====
	        driver.findElement(By.id("datepicker")).sendKeys("02/28/2026");

	        // ===== Date Picker 2 (dd/mm/yyyy) =====
	        driver.findElement(By.id("txtDate")).sendKeys("28/02/2026");

	        // ===== Date Picker 3 (Date Range) =====
	        driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[1]"))
	                .sendKeys("01-03-2026");

	        driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[2]"))
	                .sendKeys("05-03-2026");

	        // ===== Submit Button =====
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        Thread.sleep(3000);
	    }
	 
	    	void upload_file()
	    	{
	    		WebElement upload =driver.findElement(By.id("singleFileInput"));
	    		upload.sendKeys("C:\\vaibhavicorejava\\selenium");
	    		System.out.println("file is upload");
	    	}
	    	 void webtable() throws InterruptedException
	    	 {
	    		 driver.findElement(By.name("BookTable")).click();
	    		 System.out.println("webtable is display");
	    		 Thread.sleep(2000);
	    	 }
	    	 
	    	 
	    	 void pagination_table() throws InterruptedException
	         {
	        	 driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr[1]/td[4]/input")).click();
	             System.out.println("Pagination checkbox clicked");
	             Thread.sleep(2000);
	         }
	         void svg() throws InterruptedException
	         {
	        	 WebElement svgElement = driver.findElement(By.xpath("//*[local-name()='svg']"));

	             if (svgElement.isDisplayed()) {
	                 System.out.println("SVG is visible");
	             } else {
	                 System.out.println("SVG not visible");
	             }
	             Thread.sleep(2000);
	         }
	         
	      void scrolling_dropdown() throws InterruptedException
	      {
	    	   WebElement sc=driver.findElement(By.id("dropdown"));
	    	   Select dropdown=new  Select(sc);
	    	   dropdown.deselectByIndex(3);
	    	   System.out.println(" scrolling dropdown is display");
	    	   Thread.sleep(2000);
	      }
	      
	      void mobile_links() throws InterruptedException
	      {
	    	  driver.findElement(By.id("samsung")).click();
	    	  driver.findElement(By.id("realme")).click();
	    	  driver.findElement(By.id("moto")).click();
	    	  System.out.println(" link is work properly");
	    	  Thread.sleep(2000);
	      }
	       void  laptops_links() throws InterruptedException
	       {
	    	   driver.findElement(By.id("apple")).click();
	    	   driver.findElement(By.id("lenovo")).click();
	    	   driver.findElement(By.id("dell")).click();
	    	   Thread.sleep(2000);
	       }
	        void shadow_dom() throws InterruptedException
	        {
	        	driver.findElement(By.xpath("//*[@id=\"shadow_host\"]//input[3]")).click();
	        	Thread.sleep(2000);
	        }
	        
	         void  form() throws InterruptedException
	         {
	        	 driver.findElement(By.id("input1")).sendKeys("saurabh");
	        	 driver.findElement(By.id("btn1")).click();
	        	 System.out.println(" section 1 is display");
	        	 driver.findElement(By.name("input2")).sendKeys("vaibhav");
	        	 driver.findElement(By.className("rectangular-button")).click();
	        	 System.out.println(" section 2 is display");
	        	 Thread.sleep(2000);
	         }
	         
	        void footer_links() throws InterruptedException
	        {
	        	driver.findElement(By.tagName("a")).click();
	        	 System.out.println(" link is open");
	        	 
	        	driver.findElement(By.linkText("Hidden Elements & AJAX")).click();
	        	System.out.println(" hidden link is open");
	        	
	        	driver.findElement(By.linkText("Download Files")).click();
	        	System.out.println(" download folder is open");
	        	Thread.sleep(2000);
	    }

	    public static void main(String args[]) throws InterruptedException {

	    	blogsspot2 ob = new blogsspot2();
	        ob.launch();
	        ob.practice_form();
	        ob.upload_file();
	       //obj.webtable();
	        ob.pagination_table();
	        ob.svg();
	    }
	}