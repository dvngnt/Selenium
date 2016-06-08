package ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CssSelectors {

	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
	}
}
