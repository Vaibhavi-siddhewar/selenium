package test1.selenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.edge.EdgeDriver;

public class driver_methods {

	public static void main(String args[]) throws InterruptedException {
	Launch_fb();
}
	static void Launch_fb() throws InterruptedException {
		
	{
		//1.configure webdriver
				System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
				System.out.println("configure Edgedriver");
				
				//2.Initialize webdriver
				EdgeDriver driver=new EdgeDriver();
				System.out.println("2.Initialize edgedriver");
	
	            driver.get("https://www.facebook.com/");
	            System.out.println("fb launch");
	            
	            driver.manage().window().maximize();
	            System.out.println("window maximized");
	            
	            System.out.println("Title: "+driver.getTitle());
	            
	            System.out.println("CurrentUrl: "+driver.getCurrentUrl());
	            
	            driver.navigate().to("http://chatgpt.com/?");
	            driver.navigate().back();//fb
	            
	            driver.navigate().forward();
	            Thread.sleep(2000);
	            driver.navigate().refresh();
	            
	            driver.close();
	            System.out.println("browser closed");
	           
	}
}
}