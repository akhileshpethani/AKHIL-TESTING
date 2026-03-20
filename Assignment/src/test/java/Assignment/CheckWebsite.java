package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverConnection.DriverConnection;

public class CheckWebsite {
	

	    public static void main(String[] args) {
	    	
	    	String url ="https://demo.automationtesting.in/SignIn.html";

	        WebDriver driver = DriverConnection.getDriver(null);

	        String keyword="openbrowser";

	        

	        if(keyword.equals("openurl"))
	        {
	            driver.get("https://demo.automationtesting.in/SignIn.html");
	        }

	        keyword="enteremail";

	        if(keyword.equals("enteremail"))
	        {
	            driver.findElement(By.xpath("//input[@placeholder='Email id for Sign Up']")).sendKeys("test@gmail.com");
	        }

	        keyword="enterpassword";

	        if(keyword.equals("enterpassword"))
	        {
	            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
	        }

	        keyword="clicklogin";

	        if(keyword.equals("clicklogin"))
	        {
	            driver.findElement(By.id("enterbtn")).click();
	        }

	        keyword="closebrowser";

	        if(keyword.equals("closebrowser"))
	        {
	            driver.quit();
	        }

	    }

}
