package automationDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://spicejet.woohoo.in/home";
		// launch url
		driver.get(url);
	
		Actions action = new Actions(driver);
		
		WebElement TCLink = driver.findElement(By.linkText("T&C"));
		action.doubleClick(TCLink).build().perform();
		action.contextClick(TCLink).build().perform();
		
		
	}

}
