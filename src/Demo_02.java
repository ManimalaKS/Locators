import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manimala/Desktop/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		int sliders=driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println(size);
		for(WebElement all_links:links)
		{
			System.out.println(all_links.getText());
		}

	}

}
