package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_top_bottom_and_bottom_top_3000px {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		//Scroll top to bottom 6000px
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,6000)");
		
		//Scroll top to bottom 6000px and bottom to top -3000
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-3000)");
	}
}