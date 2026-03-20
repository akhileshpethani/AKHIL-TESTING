package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverConnection.DriverConnection;

public class login {
	

    public static void main(String[] args) throws IOException {
    	
    	String url ="https://demo.automationtesting.in/SignIn.html";

        WebDriver driver = DriverConnection.getDriver(null);
       
        FileInputStream file = new FileInputStream("\"C:\\Users\\jagruti\\Downloads\\assignment.xlsx\"");

        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet("FIRST");

        int rowCount = sheet.getLastRowNum();

        for(int i=1;i<=rowCount;i++)
        {
            String email = sheet.getRow(i).getCell(0).getStringCellValue();
            String pass = sheet.getRow(i).getCell(1).getStringCellValue();

            driver.findElement(By.xpath("//input[@placeholder='Email id for Sign Up']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);

            driver.findElement(By.id("enterbtn")).click();

            System.out.println("Login Tested with: "+email);
        }

        wb.close();
        driver.quit();
    }

}
