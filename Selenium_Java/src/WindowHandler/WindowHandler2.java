  package WindowHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandler2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\VCUBE\\Tutorials\\Jar Files or Drivers\\Drivers\\Browser Packs\\Extracted Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
					
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
					
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		
		System.out.println(driver.getTitle());
		
		WebElement H = driver.findElement(By.xpath("//*[@id=\"help\"]/a/span"));
		
		Actions A = new Actions(driver);
		A.moveToElement(H).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"help\"]/ul/li[2]/a/span")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("Opened browser windows count : "+windowhandles.size());
		
		ArrayList<String> order = new ArrayList<String>(windowhandles); 
		
		driver.switchTo().window(order.get(1));
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.switchTo().window(order.get(0));
		
		Thread.sleep(2000);
		driver.switchTo().window(order.get(1));
		
		Thread.sleep(2000);
		driver.switchTo().window(order.get(0));
		
		Thread.sleep(2000);
		driver.switchTo().window(order.get(1));
		
		
		
		
		
		
		

	}

}