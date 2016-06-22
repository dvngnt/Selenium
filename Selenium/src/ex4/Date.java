package ex4;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		try {
			driver.findElement(By.id("searchbox")).sendKeys("tokyo");
			driver.findElement(By.tagName("body")).click();
			driver.findElement(By.id("date_picker_in_1")).click();
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
				 driver.findElement(By.id("date_picker_out_1")).click();
				 found = false;
				 driver.findElement(By.cssSelector(".day.day_10")).click();
				 driver.findElement(By.id("SUBMIT_HOTEL")).click();
				 driver.findElement(By.className("ui_close_x")).click();

				
			
			 }
		}
			
		
		
		
		catch (Exception e) {
			System.out.println("it isn't working");
		}


	}

}