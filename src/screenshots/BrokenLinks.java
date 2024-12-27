package screenshots;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// broken URL
		// Step 1 - Is to get all urls tied up to the links using selenium.
		// Java methods will call URL's and gets you the status code.
		// If status code >400 thn that url is not working -> link which tied to url is
		// broken.
		// a[herf*="soapui"]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode < 400, "The link with Text " + link.getText() + " is broken with code " + respCode);

		}
		a.assertAll();
	}

}
