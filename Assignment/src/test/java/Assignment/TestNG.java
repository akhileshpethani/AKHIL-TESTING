package Assignment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class TestNG {
	

@Test
public void openSite()
{
    WebDriver driver = DriverConnection.getDriver(null);

    driver.get("https://demo.automationtesting.in/SignIn.html");

    System.out.println("TestNG executed");

    driver.quit();
}



}
