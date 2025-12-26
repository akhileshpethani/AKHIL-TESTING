package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class Work {
	public static void main(String[] args) {
		String url = ("https://demoqa.com/text-box");
		
		WebDriver driver = DriverConnection.getdriver(url);
		
		WebElement fullname = driver.findElement(By.id("userName"));
		fullname.sendKeys("akhilesh pethani ");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("akhileshpethani@gmail.com");
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("ahmedabad");
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys("junagadh");
		
		WebElement submitbtn = driver.findElement(By.id("submit"));
		submitbtn.click();
		
	}

}
