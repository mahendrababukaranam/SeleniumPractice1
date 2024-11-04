package Add_Employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Add_Employee {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		
		//Add Employee
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Ravindra");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("K");
		driver.findElement(By.id("btnEdit")).click();
	}

}
