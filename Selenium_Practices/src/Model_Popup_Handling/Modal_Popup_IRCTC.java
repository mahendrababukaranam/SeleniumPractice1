package Model_Popup_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Modal_Popup_IRCTC {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Get the title of the current page
		String title = driver.getTitle();
		
		//Print the title
		System.out.println(title);
		
		//Click on Login Button on page
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
		
		//Wait
		Thread.sleep(2000);
		//Click on sign in button on window
		driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/form/span/button")).click();
		
		//Identify the error text and get the text
		String error_text = driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/form/div[1]")).getText();
		
		//Print the error text
		System.out.println(error_text);
		//Verify the message
		if(error_text.equals("Please Enter Valid User ID")) {
			System.out.println(error_text+" and "+"Please Enter Valid User ID"+" both are same");
		}
		else {
			System.out.println(error_text+" and "+"Please Enter Valid User ID"+" both are not same");
		}
		
		//Close the Window 
		//driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/a")).click();
		
		//Switch to window
		WebDriver modal = driver.switchTo().window(driver.getWindowHandle());
		Thread.sleep(3000);
		
		//Close the window
		modal.close();
		
		//Close Browser
		driver.quit();
		
	}

}
