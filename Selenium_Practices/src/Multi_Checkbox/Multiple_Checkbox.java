package Multi_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		
		//Select Employee
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[2]/td[1]/input"));
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[3]/td[1]/input"));
		
		checkbox1.click();
		checkbox2.click();
				
				
	}
}
