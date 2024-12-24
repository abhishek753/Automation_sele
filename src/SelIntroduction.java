import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome-- ChromeDriver ->Methods
		//ChromeDriver.exe --> Chrome browser selenium Manager
		
		//Step to invoke chrome driver // 
	//	System.setProperty("webdriver.chrome.driver","/Users/Lenovo/Documents/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
