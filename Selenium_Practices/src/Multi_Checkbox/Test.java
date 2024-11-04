package Multi_Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);

		// checkbox 2
		List<WebElement> multicheck = driver.findElements(By.tagName("input"));
		System.out.println(multicheck.size());
		for (int i = 0; i <= multicheck.size(); i++) {
			multicheck.get(i).click();

			// verify multi check box
			if (multicheck.get(i).isSelected()) {
				System.out.println("check box completed");
			} else {
				System.out.println("check box not completed");
			}

		}

	}

}
