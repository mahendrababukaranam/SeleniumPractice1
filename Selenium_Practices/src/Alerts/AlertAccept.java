package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAccept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\VCUBE\\Tutorials\\Batch 49_50\\Batch49_50_Testing Tools_11AM-20240522T075545Z-001\\Videos\\5.1. Selenium Elements\\Selenium Elements\\Alert Message.html");
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Alert ale = driver.switchTo().alert();
		ale.accept();
	}

}
