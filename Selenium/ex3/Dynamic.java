package ex3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Dynamic {





	public static void main (String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("uh-search-box")).sendKeys("google");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("uh-assist-link-8")).click();
	}
}



