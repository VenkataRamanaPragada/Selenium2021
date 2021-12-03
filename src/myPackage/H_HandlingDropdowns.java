package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H_HandlingDropdowns {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		// Static dropdown
		// the dropdown has select tag in html
		WebElement currencydropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(currencydropdown);
		// dropdown.selectByIndex(2);
		// dropdown.selectByVisibleText("AED");
		dropdown.selectByValue("USD");
		String s = dropdown.getFirstSelectedOption().getText();
		System.out.println(s);
		// driver.close();

	}
}
