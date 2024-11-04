package Add_Employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_Delete_Employee {

	public static void main(String[] args) throws InterruptedException {
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
		
		//Back to Employee Page
		driver.findElement(By.className("backbutton")).click();
		
		//Select Employee
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[5]/td[1]/input")).click();
		
		//Delete Employee
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
		
		//Get Delete employee message
		String del_text = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/span")).getText();
		System.out.println(del_text);
		
		//Verify delete message
		if(del_text.equals("Successfully Deleted")) {
			System.out.println("Employee Deleted successfully");
		}
		else {
			System.out.println("Employee not Deleted successfully");
		}
		Thread.sleep(4000);
		driver.close();
	
	}

}
