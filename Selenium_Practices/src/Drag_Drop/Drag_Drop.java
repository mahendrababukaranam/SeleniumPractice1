package Drag_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement drag_Element = driver.findElement(By.id("box6"));
		
		WebElement drop_Element = driver.findElement(By.id("box103"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag_Element, drop_Element).perform();
	
	}

}
