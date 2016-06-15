package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("fa-search")).click();
		driver.findElement(By.id("gsc-i-id1")).sendKeys("javascript");
		driver.findElement(By.className("gsc-search-button")).click();
		driver.get(driver.findElement(By.linkText("JavaScript Introduction")).getAttribute("href"));
	}
	

}