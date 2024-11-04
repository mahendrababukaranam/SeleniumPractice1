package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class autoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
				
				// Launch browser
				WebDriver driver=new FirefoxDriver();
				//navigate to URL
				driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
				
				
				//Identify user name and enter input value
				driver.findElement(By.name("txtUserName")).sendKeys("selenium");
				
				//Identify password and enter input value
				driver.findElement(By.name("txtPassword")).sendKeys("selenium");
				
				//Click on login button
				driver.findElement(By.name("Submit")).click();
				
				//Getting the title of the page
				String title=driver.getTitle();
				
				//Print Title
				System.out.println(title);
				
				//Verify the title
				if(title.equals("OrangeHRM"))
				{
					System.out.println("Title verified successfully");
				}
				else
				{
					System.out.println("Title not verified successfully");
				}
				//Get the welcome text after logged in
				String text=driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
				
				//Print welcome text
				System.out.println(text);
				
				//Verify welcome text
				if(text.equals("Welcome selenium"))
				{
					System.out.println("Text verified successfully");
				}
				else
				{
					System.out.println("text not verified");
				}
				
				//Mouse hover action 
				//Create object for action class to perform actions
				Actions action=new Actions(driver);
				
				//Identify the PIM module to hover
				action.moveToElement(driver.findElement(By.id("pim"))).perform();
				
				//Identify and click on add employee
				driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/ul/li[2]/a/span")).click();
				
				//Switch to frame
				driver.switchTo().frame(0);
				Thread.sleep(3000);
				
				//Click action on upload file field
				action.click(driver.findElement(By.id("photofile"))).perform();
				Thread.sleep(3000);
				
				//autoIT to upload file
				//Runtime.getRuntime().exec("‪D:\\Kosmik Technologies\\Documents\\Practice Documents\\Selenium\\12. autoIT\\AutoITFile1.exe");
				Runtime.getRuntime().exec("D:\\Kosmik Technologies\\Documents\\Practice Documents\\Selenium\\12. autoIT\\AutoITFile2.exe");
				Thread.sleep(3000);
				
				//Switch back to main window
				driver.switchTo().defaultContent();
				
				//Click on logout button
				driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
				
				//Close the window
				driver.close();

	}

}
