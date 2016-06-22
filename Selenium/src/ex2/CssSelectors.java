package ex2;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.Architecture;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.MarionetteDriverManager;


public class CssSelectors implements Runnable{
	public static Stack<WebDriver> drivers = null;
	
	

	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriverManager.getInstance().setup();
		InternetExplorerDriverManager.getInstance().setup();
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		drivers = new Stack<WebDriver>();
	    WebDriver driver = new FirefoxDriver();
	    drivers.push(driver);
		WebDriver driver1 = new ChromeDriver();
		drivers.push(driver1);
		InternetExplorerDriver driver2 = new InternetExplorerDriver(capabilities);
		driver2.manage().deleteAllCookies();
		drivers.push(driver2);
		
		for(int i = 0; i <= CssSelectors.drivers.size(); i++){
		      (new Thread(new CssSelectors())).start();
		}
 

	   
		
	}
	public void run() {
		try {
			test((WebDriver) CssSelectors.drivers.pop());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test (WebDriver driver) throws InterruptedException{
		driver.get("https://www.tripadvisor.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	
			driver.findElement(By.cssSelector("#searchbox")).sendKeys("tokyo");
			
			driver.findElement(By.cssSelector("#date_picker_in_1")).click();
			 boolean found = false;
			 String want = "October 2016";
			 while(found == false){
				 Thread.sleep(300);
				 List<WebElement> list1 = driver.findElements(By.className("caption"));
				 

				 if(list1.get(0).getText().equals(want)){
					 found = true;
				 }
				 else{
					 
					 driver.findElement(By.cssSelector(".next.sprite-date_picker-btnRightIdle")).click();;
					 
				 }
			 }
			 if(found == true){
				 driver.findElement(By.cssSelector(".day.day_3")).click();
				 driver.findElement(By.cssSelector("#date_picker_out_1")).click();
				 found = false;
				 driver.findElement(By.cssSelector(".day.day_10")).click();
				 driver.findElement(By.cssSelector("#SUBMIT_HOTEL")).click();

				
			
			 }
		}
			
		
		
		
		
	

	
}
