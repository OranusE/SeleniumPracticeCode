package automation.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://www.google.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
	//	driver.findElement(By.id("APjFqb")).sendKeys("Selenium" +Keys.ENTER);

	//	driver.findElement(By.name("q")).sendKeys("selenium tutorial"+Keys.ENTER);
		
		driver.findElement(By.className("gLFyf")).sendKeys("selenium tutorial"+Keys.ENTER);
	}

}
