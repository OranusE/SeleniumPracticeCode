package automation.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		String url = "https://www.orangehrm.com/en/book-a-free-demo";
		// launch url
		driver.get(url);
		//driver.close(); // close browser - single 
		driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("Mohit");
		driver.findElement(By.xpath("//*[@id='Form_getForm_Contact']")).sendKeys("2498024");
		
	}

}
