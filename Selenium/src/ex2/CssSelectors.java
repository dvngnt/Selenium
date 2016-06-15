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
		//tagName[attributename='attributeValue']
    	//driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("sally"); one property
		//driver.findElement(By.cssSelector("input[id='login1'][name='login']")).sendKeys("two properties");
		driver.findElement(By.cssSelector("#login1")).sendKeys("shortcut");
		driver.findElement(By.cssSelector("#password")).sendKeys("sally");

	}
}
