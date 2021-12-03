package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.name("username")).sendKeys("Venkat");
		driver.findElement(By.id("password")).sendKeys("password");
		// driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		// driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		// *[@id="Login"]-------------Xpath
		// #Login--------------CSS
		// String error1 =driver.findElement(By.xpath("//*[@id='error']")).getText();
		String s1 = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(s1);
		String error1 = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(error1);

	}

}
