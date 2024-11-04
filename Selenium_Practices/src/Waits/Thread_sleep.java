package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Thread_sleep {
	public static void main(String[] args) throws InterruptedException {
		// launch browser	
				//WebDriver driver =new FirefoxDriver();
				//System.setProperty("webdriver.chrome.driver", "D:\\chrome-win64\\chrome.exe");
				 
				 WebDriver driver =new FirefoxDriver();
				//navigate to url
				driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
				//identify title of webpage and print title
				  String title=driver.getTitle();
				  System.out.println(title);
				//verify the title of webpage
		if(title.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("verified successfully");
		}
		else
		{
			System.out.println("title not verified ");
		}
		//identify user name element and enter user name
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		//identify password and enter password
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		//identify and click on login button
		driver.findElement(By.name("Submit")).click();
		//verify welcome page
		String text=driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
		System.out.println(text);
		if(text.equals("Welcome selenium"))
		{
			System.out.println("page text verified");
		}
		else
		{
			System.out.println("page text not verified");
		}		
		
	}
}
