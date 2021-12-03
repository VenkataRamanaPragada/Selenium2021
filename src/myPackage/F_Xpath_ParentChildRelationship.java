package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_Xpath_ParentChildRelationship {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Selenium");
		// div[@class='SDkEP']---is xpath for parent object
		// using the above xpath we interacting with object with input tag
		// driver.close();

	}
}
