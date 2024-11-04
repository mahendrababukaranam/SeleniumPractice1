package RightClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement about_link = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]"));
		
		Actions action = new Actions(driver);
		action.contextClick(about_link).perform();

	}

}
