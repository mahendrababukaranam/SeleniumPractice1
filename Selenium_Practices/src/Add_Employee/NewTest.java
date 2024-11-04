package Add_Employee;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	//Get the title
		  String title = driver.getTitle();
		  
		  //Print the title
		  System.out.println(title);
		  
		  //Verify title
		  Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
  }

  @AfterClass
  public void afterClass() {
	  //Close the browser
	  driver.quit();
  }

}
