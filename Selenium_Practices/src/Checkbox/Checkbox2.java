package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox2 {

	public static void main(String[] args) {
				//Open Browser
				WebDriver driver = new FirefoxDriver();
				
				//Open Application
				driver.get("https://demo.guru99.com/test/radio.html");
				
				
				//Identifying checkbox
				WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
				
				//click on checkbox
				checkbox.click();
			
	}

}
