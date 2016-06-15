package ex3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuit {

	public static void main (String[] args) throws InterruptedException{
	WebDriver driver = new FirefoxDriver();

	driver.get("http://www.hdfcbank.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("cee_closeBtn")).click();

	driver.findElement(By.cssSelector("#loginsubmit")).click();
	driver.quit();
	}
}
