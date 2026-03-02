package test1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class locatorsinselenium {
	
//xpath and cssselector
	
	EdgeDriver driver;
    void launch_setup()
    {
    	System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
    	driver=new EdgeDriver();
    	driver.get("https://www.demoblaze.com/");
    	driver.manage().window().maximize();
    }
	void xpath_locator()
	{
		//1.tagname[@attribute='value']
		//driver.findElement(By.linkText("Sign up")).click();
	    //driver.findElement(By.xpath("//a[@id='signin2']")).click();
	    //driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("dolly");
        
		//2.parenttagname/childtagname
		//driver.findElement(By.xpath("//li/a")).click();
	    //3.tagname
		//driver.findElement(By.xpath("//img")).click();
	    //4.tagname[text()='value']
		//driver.findElement(By.xpath("//a[text()='Sansung galaxy s6']")).click();
	}
	
	void css_selectorlocator()
	{
		//1.tagname[attribute='value']
		//driver.findElement(By.cssSelector("a[id='login2']")).click();
	    
		//2.tagname#idvalue
		//driver.findElement(By.cssSelector("a#login2")).click();
	
		//3.tagname.classname
		//4.tagname
		//driver.findElement(By.cssSelector("img")).click();
	}
	
	    public static void main(String[] args) {
		locatorsinselenium ob=new locatorsinselenium();
		ob.launch_setup();
		ob.xpath_locator();
		ob.css_selectorlocator();
		
	}

}
