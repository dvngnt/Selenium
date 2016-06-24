package ex13;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseClass {
	public static ThreadLocal <RemoteWebDriver> dr = new ThreadLocal<RemoteWebDriver>();
	

  
	
	@BeforeMethod
	@Parameters("myBrowser")
	public void beforemethod(String myBrowser) throws MalformedURLException{
		new WebDriverFactory();
		RemoteWebDriver driver = null;
		if(myBrowser.equals("chrome")){
			new DesiredCapabilities();
			DesiredCapabilities capablity = DesiredCapabilities.chrome();
			capablity.setBrowserName("chrome");
			capablity.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capablity);
			}
		if(myBrowser.equals("firefox")){
			new DesiredCapabilities();
			DesiredCapabilities capablity = DesiredCapabilities.chrome();
			capablity.setBrowserName("firefox");
			capablity.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capablity);
			}
		setWebDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	


	private void setWebDriver(RemoteWebDriver driver) {
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
