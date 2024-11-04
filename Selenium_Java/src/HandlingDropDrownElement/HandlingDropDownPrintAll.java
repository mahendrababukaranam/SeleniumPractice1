package HandlingDropDrownElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownPrintAll {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\VCUBE\\Tutorials\\Jar Files or Drivers\\Drivers\\Browser Packs\\Extracted Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
					
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
					
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		
		driver.switchTo().frame(0);
		WebElement dd = driver.findElement(By.id("loc_code"));
		List<WebElement> ddall = dd.findElements(By.tagName("option"));
		System.out.println("Total Elements are : "+ddall.size());
		
		for(int ddlist=0; ddlist<ddall.size(); ddlist++) {
			//System.out.println("The dropdown list "+ddlist+" is "+ddall.get(ddlist).getText());
			System.out.println(ddall.get(ddlist).getText());
		}

	}

}