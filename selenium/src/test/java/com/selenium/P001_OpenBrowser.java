package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.close();
		
//		System.setProperty("webdriver.edge.driver","C:\\Users\\akhil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//	
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(3000);
//		driver.close();
		
//		System.setProperty("webdriver.getco.driver","C:\\Users\\akhil\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//	
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(1000);
//		driver.close();
		
	
	}
	

}
