package automationDay3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTable {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		String url = "https://www.nyse.com/ipo-center/ipo-pricing-stats";
		// launch url
		driver.get(url);
		
		List<WebElement> rows =	driver.findElements(By.xpath("//table[@class='table-data w-full table-border-rows']//tr"));
	
		//table[@class="table-data w-full table-border-rows"]/tbody/tr[11]
		
		int rowCount = rows.size();
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++)
		{
			WebElement companyName = driver.findElement(By.xpath("//table[@class='table-data w-full table-border-rows']/tbody/tr["+i+"]"));
			System.out.println(companyName.getText());
		}
		
	}
	

}
