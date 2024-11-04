package RobotPack;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployeeRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		WebElement Actions = driver.findElement(By.id("pim"));
		
		Actions A = new Actions(driver);
		
		A.moveToElement(Actions).perform();	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmployeeId")).clear();
		
		driver.findElement(By.name("txtEmployeeId")).sendKeys("1219");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("K");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Babu");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mahendra");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("Maahi");
		  
		//Hover
		//A.moveToElement(driver.findElement(By.name("photofile"))).perform();
		
		Thread.sleep(2000);
		//Click Action on choose file
		A.moveToElement(driver.findElement(By.name("photofile"))).click().perform();
		
		StringSelection S = new StringSelection("D:\\Company Files\\Exinent\\App Folders\\Images\\Travel\\person3.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);//Ctrl+C
		
		/*Robot class will run before toolkit it means toolkit will take some time to 
		copy the path of the file in that time robot will run. In that case we you 
		thead.sleep() to hold the rob class*/
		
		Thread.sleep(2000);
		//To paste the the file path (Ctrl+V)
		Robot R = new Robot();
        R.keyPress(KeyEvent.VK_CONTROL);
        R.keyPress(KeyEvent.VK_V);
        R.keyRelease(KeyEvent.VK_CONTROL);
        R.keyRelease(KeyEvent.VK_V);
        
        //Enter
        R.keyPress(KeyEvent.VK_ENTER);
        R.keyRelease(KeyEvent.VK_ENTER);
        
        driver.findElement(By.id("btnEdit")).click();

	}

}
