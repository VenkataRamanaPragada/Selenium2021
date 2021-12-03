package myPackage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class N_ECommerceAppAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] products = { "Brocolli", "Cauliflower", "Cucumber", "Onion" };
		List<String> itemsneeded = Arrays.asList(products);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); // URL in the browser
		List<WebElement> prodname = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < prodname.size(); i++) {
			String name = prodname.get(i).getText();
			String actualname = name.split(" ")[0];
			if (itemsneeded.contains(actualname)) {
				j++;
				System.out.println("clicking on index " + i);
				// Thread.sleep(7000);
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break;
				if (j == products.length) {
					break;
				}
			}
		}
		// driver.close();
	}
}