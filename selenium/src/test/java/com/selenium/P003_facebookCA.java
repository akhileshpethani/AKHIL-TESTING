package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_facebookCA {
	public static void main(String[] args) {
		String url = ("https://www.facebook.com/");
		
		WebDriver driver =DriverConnection.getdriver(url);
		
		WebElement CAlink = driver.findElement(By.linkText("Create new account"));
		CAlink.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("akhil");
		

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("pethani");
		
		WebElement emailornum = driver.findElement(By.name("reg_email__"));
		emailornum.sendKeys("9925549185");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("@khilesh@#5599");
		
		WebElement submitbtn = driver.findElement(By.name("websubmit"));
		submitbtn.click();
	}

}
