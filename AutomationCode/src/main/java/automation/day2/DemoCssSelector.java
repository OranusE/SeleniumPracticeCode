package automation.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		String url = "https://www.orangehrm.com/en/book-a-free-demo";
		
		driver.get(url);
		WebElement fullName = driver.findElement(By.cssSelector("#Form_getForm_FullName"));
		fullName.sendKeys("Chandan");
		driver.findElement(By.cssSelector("input[id=Form_getForm_Contact]")).sendKeys("0934809");
		
		List<WebElement>listOfLinks = 	driver.findElements(By.tagName("a"));
		
		System.out.println(listOfLinks.size());
		
		for(WebElement e:listOfLinks)
		{
			System.out.println(e.getText());
		}
		
		
	}

}
