package automationDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://jqueryui.com/resources/demos/droppable/default.html";
		// launch url
		driver.get(url);
	
		Actions action = new Actions(driver);
		
	
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
				WebElement target = driver.findElement(By.cssSelector("#droppable"));
				action.dragAndDrop(source, target).build().perform();
				
		
	}

}
