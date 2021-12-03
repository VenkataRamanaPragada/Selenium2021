package myPackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O_Implicitwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String[] products = { "Brocolli", "Cauliflower", "Cucumber", "Onion" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); // URL in the browser
		additemstoCart(driver, products);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		String promoInfo = driver.findElement(By.cssSelector(".promoInfo")).getText();
		System.out.println(promoInfo);
		// driver.close();
	}

	public static void additemstoCart(WebDriver driver, String[] products) {
		List<String> itemsneeded = Arrays.asList(products);
		List<WebElement> prodname = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < prodname.size(); i++) {
			String name = prodname.get(i).getText();
			String actualname = name.split(" ")[0];
			if (itemsneeded.contains(actualname)) {
				j++;
				System.out.println("clicking on index " + i);

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == products.length) {
					break;
				}
			}
		}
	}

}