package WebTitleValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTitlesvalidation2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VCUBE\\Tutorials\\Jar Files or Drivers\\Drivers\\Browser Packs\\Extracted Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.froggabio.com/");
		
		//Title1
		String home = driver.getTitle();
		if(home.equals("FroggaBio - Homepage")) {
			System.out.println("Valid Title");
		}
		else {
			System.out.println("Invalid Title");
		}
		
		driver.findElement(By.id("idtBctNwkk")).click();
		
		//Title2
		String signup = driver.getTitle();
		if(signup.equals("Create New Customer Account")) {
			System.out.println("Valid Title");
		}
		else {
			System.out.println("Invalid Title");
		}
		
		Thread.sleep(4000);
		driver.findElement(By.id("prefix")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Mahendra");
		driver.quit();
		

	}

}
