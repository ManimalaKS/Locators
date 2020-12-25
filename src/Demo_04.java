import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manimala/Desktop/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers");
		//Self Node
		String selfmsg=driver.findElement(By.xpath("//a[contains(text(),'Chartered Logistics')]/self::a")).getText();
        System.out.println(selfmsg);
        //parent node
        String parentmsg=driver.findElement(By.xpath("//a[contains(text(),'Chartered Logistics')]/parent::td")).getText();
        System.out.println(parentmsg);
        //child
        List <WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Chartered Logistics')]/ancestor::tr/child::td"));
         int size=childs.size();
         System.out.println(size);
         //ancestor
        String row=driver.findElement(By.xpath("//a[contains(text(),'Chartered Logistics')]/ancestor::tr")).getText();
        System.out.println(row);
        //descendants
        List <WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Chartered Logistics')]/ancestor::tr/descendant::*"));
        int total_descendants=descendants.size();
        System.out.println(total_descendants);
        //Following
        List <WebElement> following_node=driver.findElements(By.xpath("//a[contains(text(),'Chartered Logistics')]/ancestor::tr/following::tr"));
        int total_following=following_node.size();
        System.out.println(total_following);
        //Following-sibling
        List <WebElement> following_sibling=driver.findElements(By.xpath("//a[contains(text(),'Chartered Logistics')]/ancestor::tr/following-sibling::tr"));
        int total_following_siblings=following_sibling.size();
        System.out.println(total_following_siblings);
        //Preceding
        List <WebElement> preceding=driver.findElements(By.xpath("//a[contains(text(),'Chartered Logistics')]/ancestor::tr/preceding::tr"));
        int total_preceding=preceding.size();
        System.out.println(total_preceding);
        //Preceding-siblings
        List <WebElement> preceding_sibling=driver.findElements(By.xpath("//a[contains(text(),'Chartered Logistics')]/ancestor::tr/preceding-sibling::tr"));
        int total_preceding_sibling=preceding_sibling.size();
        System.out.println(total_preceding_sibling);
        
        
        
        driver.close();
	}

}
