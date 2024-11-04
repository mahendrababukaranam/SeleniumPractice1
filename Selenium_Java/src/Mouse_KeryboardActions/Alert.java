package Mouse_KeryboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		Thread.sleep(2000);
		Actions A = new Actions(driver);
		A.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		A.keyDown(Keys.NUMPAD6).keyUp(Keys.NUMPAD6).perform();
		
	}

}
