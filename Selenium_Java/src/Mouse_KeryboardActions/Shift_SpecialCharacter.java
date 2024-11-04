package Mouse_KeryboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shift_SpecialCharacter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		Actions A = new Actions(driver);
		A.keyDown(Keys.SHIFT).sendKeys("@").keyUp(Keys.SHIFT).perform();
		A.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
	}

}
