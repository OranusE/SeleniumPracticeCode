package automationDay3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)");

		String parentId = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.linkText("Open Collective"));
		js.executeScript("arguments[0].click();", element);
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String childId = i1.next();
			if (!parentId.equalsIgnoreCase(childId)) {

				driver.switchTo().window(childId);
				System.out.println(driver.getTitle());
				driver.close();
			}

		}
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());

	}

}
