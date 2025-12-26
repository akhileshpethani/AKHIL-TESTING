package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P002_FacebookLogin {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getdriver(url);

		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("7817930915");

		WebElement passElement = driver.findElement(By.name("pass"));
		passElement.sendKeys("@khil@#59");

		WebElement loginBTN = driver.findElement(By.name("login"));
		loginBTN.click();
		
		
	}

}
