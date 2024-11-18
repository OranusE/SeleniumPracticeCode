package automationDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://demo.guru99.com/test/delete_customer.php";
		// launch url
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("33434");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("33434");
	
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		Thread.sleep(2000);
		
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
	}

}
