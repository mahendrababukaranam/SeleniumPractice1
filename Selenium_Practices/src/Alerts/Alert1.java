package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr587676");
		driver.findElement(By.name("password")).sendKeys("neguvYj");
		driver.findElement(By.name("btnLogin")).click();
		
		//Logout
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
		
		//Move to Alert
		Alert alert = driver.switchTo().alert();
		
		
		//Get Text on Alert
		String alert_text = alert.getText();
		
		//Print alert text
		System.out.println(alert_text);
		
		Thread.sleep(3000);
		//Click on Ok button on alert
		alert.accept();
		Thread.sleep(3000);
		driver.close();

	}

}
