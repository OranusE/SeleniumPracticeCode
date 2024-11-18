package automation.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://spicejet.woohoo.in/home";
		// launch url
		driver.get(url);
		
		driver.findElement(By.xpath("//span[contains(text(),'FAQ')]")).click();
	}

}
