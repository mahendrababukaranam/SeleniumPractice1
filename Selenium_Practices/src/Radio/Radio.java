package Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) {
		//Open Browser
		WebDriver driver = new FirefoxDriver();
		
		//Open Application
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//Identify and select Radio button
		WebElement radio = driver.findElement(By.id("vfb-7-2"));
		radio.click();
		
		//Verify Radio button
		if(radio.isSelected()) {
			System.out.println("Radio button Sellected Successfully");
		}
		else {
			System.out.println("Radio button not Sellected Successfully");
		}
		

	}

}
