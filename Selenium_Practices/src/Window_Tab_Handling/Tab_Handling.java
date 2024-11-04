package Window_Tab_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Handling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement about_link = driver.findElement(By.linkText("About"));
		
		Actions action = new Actions(driver);
		
		//Right Click
		action.contextClick(about_link).perform();
		
		//Moving to Right Click window options
		action.sendKeys(Keys.ARROW_DOWN).click().perform();
		
		/*//Handling Multiple tabs
		Set<String> tabs_handle = driver.getWindowHandles();
		
		//Get the size of the tabs
		System.out.println(tabs_handle.size());*/

	}

}
