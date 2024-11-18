package automation.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://www.orangehrm.com/en/book-a-free-demo";
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Shalet");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("24098340");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Shalet@wm.com");
		driver.findElement(By.id("Form_getForm_CompanyName")).sendKeys("SIBM");
		
	}

}
