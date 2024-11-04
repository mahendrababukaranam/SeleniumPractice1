package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		//Identify button and click on button
		driver.findElement(By.name("Submit")).click();
		
		Alert alert = driver.switchTo().alert();
		String alert_text = alert.getText();
		System.out.println(alert_text);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
	}

}
