package Excel_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XLS_File {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		//Accessing the Excel file into the Eclipse
		  FileInputStream FIS = new FileInputStream("D:\\Excel_Handling\\Excel\\Login.xls");
		  
		  //Getting workbook from the Excel file
		  HSSFWorkbook workbook = new HSSFWorkbook(FIS);
		  
		  //Getting Sheet from the Workbook
		  HSSFSheet sheet = workbook.getSheet("Credentials");
		  
		  //Read user name from the sheet
		  String username = sheet.getRow(1).getCell(0).getStringCellValue();
		 
		  //Read password from the sheet
		  String password = sheet.getRow(1).getCell(1).getStringCellValue();
		  
		  //Identifying the user name and password fields and read the credentials into input fields
		  
		  //User Name Input Field
		  driver.findElement(By.name("txtUserName")).sendKeys(username);
		  
		  //Password Input Field
		  driver.findElement(By.name("txtPassword")).sendKeys(password);
		  
		  //Identifying the login button and click on Login Button
		  driver.findElement(By.name("Submit")).click();
		  
		  //Identify Welcome Text
		  String welcome_text = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		  
		  //Print Welcome text
		  System.out.println(welcome_text);
		  
		  //Close Current Tab
		  driver.close();
		
	}

}
