package WebsiteOpenElementsSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VCUBE\\Tutorials\\Jar Files or Drivers\\Drivers\\Browser Packs\\Extracted Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.name("txtUserName"));
					un.sendKeys("selenium");
					
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("txtPassword"));
					pwd.sendKeys("selenium");
					
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.name("Submit"));
					btn.click();
					
		Thread.sleep(2000);
		driver.quit();
	}

}
