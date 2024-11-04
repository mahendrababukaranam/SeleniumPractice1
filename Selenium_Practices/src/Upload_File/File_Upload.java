package Upload_File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		WebDriver driver= new FirefoxDriver();
		
		//Navigate to URL
		driver.get("https://demo.guru99.com/test/upload/");
		
		//Identify browse button and click
		//driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\KALPANA\\Downloads\\IMG-20180318-WA0206.jpg");
		
		//identify checkbox and click
		driver.findElement(By.id("terms")).click();
		
		//identify and click on submit button
		driver.findElement(By.id("submitbutton")).click();
		
		//verify text to know file submitted or not
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/ul/li/div[2]/h3/center")).getText();
		System.out.println(text);
		String expectedText = "1 file <br>has been successfully uploaded.";
		if(text.contains(expectedText))
		{
			System.out.println("File uploded");
		}
		else
		{
			System.out.println("File not uploded");
		}
		driver.close();
		

	}
	
}
