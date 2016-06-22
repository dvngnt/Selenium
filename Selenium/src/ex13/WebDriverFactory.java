package ex13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class WebDriverFactory {
	
	static WebDriver create(String type){
		WebDriver driver = null;
		switch(type){
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			ChromeDriverManager.getInstance().setup();
			driver = new ChromeDriver();
			break;
		case "IE":
			InternetExplorerDriverManager.getInstance().setup();
			driver = new InternetExplorerDriver();	
			break;
		}
		return driver;
		
	}

}
