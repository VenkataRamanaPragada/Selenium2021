package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WebDriveMethodsAndLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("WelcomeBack:)");
		//Create webdriver object
		//WebDriver is an interface which has got
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\pvram\\Downloads\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\pvram\\Downloads\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		String s=driver.getTitle();
		System.out.println(s);
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.facebook.com/");
		String s1=driver.getTitle();
		System.out.println(s1);
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.getCurrentUrl();
		//driver.getTitle();
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.name("email")).sendKeys("venkat");
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ramana");
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("account?")).click();
		
		//driver.close();
				driver.quit();//closes all windows opened by selenium
	}

}
