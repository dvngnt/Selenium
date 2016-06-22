package ex13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Parallel {

	@Test(dataProvider="testData")
	public void test_01(String data){
		ChromeDriverManager.getInstance().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".topnav-icons.fa.fa-search.w3-right")).click();
		driver.findElement(By.cssSelector("#gsc-i-id1")).sendKeys(data);
		driver.findElement(By.cssSelector(".gsc-search-button.gsc-search-button-v2")).click();
	}
	
	@DataProvider(parallel=true)
	public Object[][] testData() {
		Object[][] obj = new Object[2][1]; //2 test, 1 arguments
		obj[0][0] = "test 1";
	    obj[1][0] = "test 2";

	    
	    return obj;
	}	
}
