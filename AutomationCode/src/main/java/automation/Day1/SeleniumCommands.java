package automation.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://www.selenium.dev/";
		// launch url
		driver.get(url);
		//driver.close(); // close browser - single 
		//driver.quit(); // close browser - all browser windows open by automation
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Documentation")).click();
		
		driver.findElement(By.partialLinkText("more & submit!")).click();

	}

}
