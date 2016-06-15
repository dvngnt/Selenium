package ex3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	
	public static void main (String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.navigate().back();
		driver.navigate().refresh();
	}
}
