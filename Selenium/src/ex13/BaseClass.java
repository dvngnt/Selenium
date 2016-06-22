package ex13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseClass {
	public static ThreadLocal <WebDriver> dr = new ThreadLocal<WebDriver>();

	
	@BeforeMethod
	public void beforemethod(){
		new WebDriverFactory();
		WebDriver driver = WebDriverFactory.create("Firefox");
		setWebDriver(driver);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	


	private void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}
	public WebDriver getWebDriver(){
		return dr.get();
	}
	@AfterMethod
	public void aftermethod(){
		getWebDriver().quit();
		dr.set(null);
	}
}
