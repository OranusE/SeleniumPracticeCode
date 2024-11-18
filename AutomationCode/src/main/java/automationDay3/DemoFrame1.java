package automationDay3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://demo.guru99.com/test/guru99home/";
		// launch url
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		System.out.println(" We are on frame");
		driver.switchTo().defaultContent();
		
		
	}

}
	