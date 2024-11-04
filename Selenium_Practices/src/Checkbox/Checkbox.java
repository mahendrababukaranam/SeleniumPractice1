package Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
				//Open Browser
				//System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\mahin\\OneDrive\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
				WebDriver driver = new ChromeDriver();
				
				//Open Application
				driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
				
				//Identify user name field and enter user name
				driver.findElement(By.name("txtUserName")).sendKeys("selenium");
				
				//Identify password field and enter password
				driver.findElement(By.name("txtPassword")).sendKeys("selenium");
				
				//Identify button and click on button
				driver.findElement(By.name("Submit")).click();
				
				//Switching to frame
				driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
				
				//Identifying checkbox
				WebElement checkbox = driver.findElement(By.name("chkLocID[]"));
				
				//click on checkbox
				checkbox.click();
				
				//Verify Selected Checkbox
				if(checkbox.isSelected()) {
					System.out.println("Selected Successfully");
				}
				else
				{
					System.out.println("Not Selected Successfully");
				}
				Alert alert = driver.switchTo().alert();
	}

}
