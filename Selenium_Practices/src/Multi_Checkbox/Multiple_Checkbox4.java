package Multi_Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Checkbox4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		   
        driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); 
        driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
			
        // Locate the main checkbox
        WebElement mainCheckbox = driver.findElement(By.id("allCheck")); 
        mainCheckbox.click();

      //Identifying List of Checkboxes
		List<WebElement> mul_Check = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

		//Get the size
		System.out.println(mul_Check.size());
	
		// Verify if all checkboxes are selected
		boolean allSelected = true;
		for (int i = 0; i < mul_Check.size(); i++) {
		    if (!mul_Check.get(i).isSelected()) {
		        allSelected = false;
		        break;
		    }
		}

		// Count the total number of checkboxes
        int totalCheckboxes = mul_Check.size();

        // Print results
        if (allSelected) {
            System.out.println("All " + totalCheckboxes + " checkboxes are successfully selected.");
        } else {
            System.out.println("Not all checkboxes are selected.");
        }
        
		
	}
}
