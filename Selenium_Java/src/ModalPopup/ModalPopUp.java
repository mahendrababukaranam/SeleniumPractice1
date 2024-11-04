package ModalPopup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ModalPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\VCUBE\\Tutorials\\Batch 49_50\\Batch49_50_Testing Tools_11AM-20240522T075545Z-001\\Videos\\5.1. Selenium Elements\\Selenium Elements\\Model Popup.html");
		Thread.sleep(2000);
		driver.findElement(By.id("Modal")).click();
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.className("close")).click();
		
	}

}
