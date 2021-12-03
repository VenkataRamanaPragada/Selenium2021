package myPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Z_ScrollingWebpageandTables {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// get no of links in webpage
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // URL in the browser

		// using Javascriptexecutor to scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		// object level scrolling, we need to pass the css pf the table to queryselector
		// as shown below
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);

		List<WebElement> values1 = driver.findElements(By.cssSelector("table[name='courses'] td:nth-child(3)"));

		int sum1 = 0;
		for (int i = 0; i < values1.size(); i++) {
			System.out.println(values1.get(i).getText());
			sum1 = sum1 + Integer.parseInt(values1.get(i).getText());
		}
		System.out.println(sum1);

		// int
		// colcount=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/thead/tr/th")).size();
		// int
		// rowcount=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr")).size();
		// System.out.println("Columns count: "+colcount);
		// System.out.println("Rows count: "+rowcount);
		// int sum=0;
		// for(int i=1;i<=rowcount;i++)
		// {
		// String xpath="//div[@class='tableFixHead']/table/tbody/tr["+i+"]/td[4]";
		// sum=sum+Integer.parseInt(driver.findElement(By.xpath(xpath)).getText());

		// }
		// System.out.println(sum);

		// int
		// colcount=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/thead/tr/th")).size();
		// int
		// rowcount=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr")).size();
		// System.out.println("Columns count: "+colcount);
		// System.out.println("Rows count: "+rowcount);

	}

}