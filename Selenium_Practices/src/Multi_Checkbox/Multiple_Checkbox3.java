package Multi_Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Checkbox3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
			
		//Identifying List of Checkboxes
		List<WebElement> mul_Check = driver.findElements(By.xpath("//tbody//input[@type='checkbox']"));

		//Get the size
		System.out.println(mul_Check.size());
		
		for(int index=0; index<mul_Check.size(); index++) {
			
			mul_Check.get(index).click();
			
			if(mul_Check.get(index).isSelected()) {
				System.out.println(index+" index value check box is selected");
			}
			else {
				System.out.println(index+" index value check box is not selected");
			}
		}
		
	}
}
