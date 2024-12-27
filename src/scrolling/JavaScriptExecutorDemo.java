package scrolling;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000L);
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=5000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0; i<values.size(); i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		assertEquals(sum, total);
		
		List<WebElement> adding =  driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sol=0;
		
		for(int j=0; j<adding.size(); j++)
		{
			sol = sol + Integer.parseInt(adding.get(j).getText());
		}
		
		System.out.println(sol);
		
		driver.quit();
	}
	

}
