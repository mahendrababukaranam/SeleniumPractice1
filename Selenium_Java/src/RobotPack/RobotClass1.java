package RobotPack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		WebElement Actions = driver.findElement(By.id("pim"));
		
		Actions A = new Actions(driver);
		
		A.moveToElement(Actions).perform();	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmployeeId")).clear();
		
		driver.findElement(By.name("txtEmployeeId")).sendKeys("1219");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("K");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Babu");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mahendra");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("Maahi");
		
		driver.findElement(By.name("photofile")).click();
	}

}
