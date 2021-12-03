package myPackage;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class U_HandlingChildWindows_Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/"); // URL in the browser
		driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		String mailtext=driver.findElement(By.cssSelector(".im-para.red")).getText();
		String mail=mailtext.split(" ")[4];
		System.out.println(mail);
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#username")).sendKeys(mail);
		
		//Actions a= new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//*[text()='Account & Lists']"))).build().perform();
		//a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		//enter text and double click
		//a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		// driver.close();
	}

}