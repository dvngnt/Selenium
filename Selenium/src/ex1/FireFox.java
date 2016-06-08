package ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com");
		driver.manage().window().maximize();
	}
	

}