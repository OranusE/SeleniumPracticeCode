package automation.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		// launch url
		driver.get("https://www.google.com/");
		
		String actualTitle = driver.getTitle(); // returns current page title
		System.out.println(actualTitle);
		
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
