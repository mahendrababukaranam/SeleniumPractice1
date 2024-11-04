package Upload_File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_File {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		//Hover on PIM module
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"))).perform();
		
		//Click on add employee
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		
		//Switch to frame
		driver.switchTo().frame("rightMenu");
		
		//Upload File
		driver.findElement(By.id("photofile")).sendKeys("D:\\Office Files\\Exinent Info Solutions Pvt Ltd\\Exinent\\App Folders\\Playbacknow\\PBN-Image.png");
		

	}

}
