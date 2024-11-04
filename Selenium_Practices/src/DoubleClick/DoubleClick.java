package DoubleClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Browser
		WebDriver driver = new FirefoxDriver();
		
		//Open Application
		driver.get("file:///D:/Kosmik%20Technologies/Documents/Material/doubleClickMe.html");
		
		//Identify double click button
		Thread.sleep(3000);
		WebElement double_Click = driver.findElement(By.xpath("/html/body/button"));
		
		//Actions object to perform double click action
		Actions action = new Actions(driver);
		action.doubleClick(double_Click).perform();
		
	}

}
