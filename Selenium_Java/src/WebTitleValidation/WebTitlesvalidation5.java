package WebTitleValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTitlesvalidation5 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\VCUBE\\Tutorials\\Jar Files or Drivers\\Drivers\\Browser Packs\\Extracted Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		//Title:Before Login Validation
		String beforeLogin = driver.getTitle();
		System.out.println("Before Validation : "+beforeLogin);
		if(beforeLogin.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println(beforeLogin +" is matching with requirement");
		}
		else {
			System.out.println(beforeLogin +" is not matching with requirement");
		}
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
					
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
					
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		
		//Title:After Login
		String afterLogin = driver.getTitle();
		System.out.println("Before Validation : "+afterLogin);
		if(afterLogin.equals("OrangeHRM")) {
			System.out.println(afterLogin +" is matching with requirement");
		}
		else {
			System.out.println(afterLogin +" is not matching with requirement");
		}

		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
