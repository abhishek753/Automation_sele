import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("contact");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("abhishek");
	//	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abhishek@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abhishek@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abc@gmail.com");
	//	driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9258999999");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8563856767");
	//	driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	//	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Abhishek");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
