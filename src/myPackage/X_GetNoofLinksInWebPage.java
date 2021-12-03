package myPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class X_GetNoofLinksInWebPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// get no of links in webpage
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // URL in the browser
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Limitng webdriver scope
		// getting number of links from the footer of the webpage
		WebElement ele = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(ele.findElements(By.tagName("a")).size());

		// Find no of links in a column under footer
		WebElement footercolumn = ele.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercolumn.findElements(By.tagName("a")).size());

		// Click on each link in the column and check if the links are working
		for (int i = 1; i < footercolumn.findElements(By.tagName("a")).size(); i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		}
		Thread.sleep(6000);
		//Navigate to each tab and get the titles
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}