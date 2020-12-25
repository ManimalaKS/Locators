import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manimala/Desktop/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("manimalazina@gmail.com");
		

	}

}
