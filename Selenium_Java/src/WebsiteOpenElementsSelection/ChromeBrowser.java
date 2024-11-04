package WebsiteOpenElementsSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VCUBE\\Tutorials\\Jar Files or Drivers\\Drivers\\Browser Packs\\Extracted Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.froggabio.com/");
		driver.findElement(By.id("idtBctNwkk")).click();
		//WebElement we= driver.findElement(By.id("firstname"));
		//we.sendKeys("Mahendra");
		driver.findElement(By.id("firstname")).sendKeys("Mahendra");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
