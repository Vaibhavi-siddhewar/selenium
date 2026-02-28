package test1.selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class firstscript1 {

public static void main(String[] args) {
		
		//1.configure webdriver
		System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");
		System.out.println("configure Edgedriver");
		
		//2.Initialize webdriver
		EdgeDriver driver=new EdgeDriver();
		System.out.println("2.Initialize edgedriver");
		
		//3.launch website
		driver.get("http://www.fortunecloudindia.com/");
		System.out.println("3.launch website");
		
		driver.close();
	}

}

