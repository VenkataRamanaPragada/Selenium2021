package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_CustomizedCSS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("HiVenkat");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		String s = driver.findElement(By.cssSelector("[role='alert']")).getText();
		System.out.println(s);

		/*
		 * driver.findElement(By.xpath("//input[@type='email']")).sendKeys("JiVenkat");
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
		 * driver.findElement(By.xpath("//*[@value='Log In']")).click();
		 * System.out.println(driver.findElement(By.xpath("//*[@role='alert']")).getText
		 * ());
		 * 
		 */
		driver.close();

	}

}
