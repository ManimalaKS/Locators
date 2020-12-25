import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manimala/Desktop/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		WebElement search=driver.findElement(By.id("search_query_top"));
		search.sendKeys("T-SHIRTS");
		WebElement search_icon=driver.findElement(By.name("submit_search"));
		search_icon.click();
		WebElement printed_chiffon=driver.findElement(By.linkText("Printed Chiffon Dress"));
		printed_chiffon.click();
		//driver.close();
		

	}

}
