import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_06 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manimala/Desktop/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://books-pwakit.appspot.com/");
		WebElement root=driver.findElement(By.tagName("app-header")); //root element or shadow host
        JavascriptExecutor JS=(JavascriptExecutor)driver;
        WebElement shadowdom1=(WebElement)JS.executeScript("arguments[0].shadowRoot", root);
        WebElement appheader=shadowdom1.findElement(By.tagName("app-header"));
        WebElement apptoolbar=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
        WebElement bookdecorator=apptoolbar.findElement(By.tagName("book-input-decorator"));
        bookdecorator.findElement(By.cssSelector("input#input")).sendKeys("testing");;
        
        
	}

}
