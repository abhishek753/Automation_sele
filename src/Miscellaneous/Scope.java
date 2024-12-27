package Miscellaneous;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {

		// 1.Give me the count of links on the page.
		// 2.Count of Footer Section.

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting WebDriver Scope.
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3.Count of first footer section.
		WebElement coulumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coulumndriver.findElements(By.tagName("a")).size());

		// 4.Click on each link in the column and check if the page are opening.
		for (int i = 1; i < coulumndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coulumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
