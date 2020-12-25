	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manimala/Desktop/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		//WebElement signup=driver.findElement(By.xpath("//div[@id='reg_form_box']/div[@class='_1lch']/button[@id='u_0_14']"));
		//signup.click();
		//locate new password field from mobile number
		WebElement password=driver.findElement(By.xpath("//input[@id='u_0_s']/following::input[@data-type='password' and @name='reg_passwd__']"));
		password.sendKeys("Mani@123");
		//locate mobile number field using new password
		WebElement mobile_number=driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[@name='reg_email__']"));
		mobile_number.sendKeys("9042697550");
		//locate surname using female gender
		//WebElement surname=driver.findElement(By.xpath("//input[@id='u_0_4']/ancestor::div[2]/div[1]/div/div[2]"));
		//surname.sendKeys("Manimala");
		//using precedings
		WebElement surname2=driver.findElement(By.xpath("//input[@id='u_0_4']/preceding::input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']"));
		surname2.sendKeys("saroja");
		driver.close();
		
	}

}
