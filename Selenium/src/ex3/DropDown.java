package ex3;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgantt2\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		try {
			driver.findElement(By.linkText("Create a Rediffmail account")).click();
			
			List<WebElement> list = driver.findElements(By.cssSelector(".f14>tbody>tr>td>select"));
			Select day = new Select(list.get(1));
			day.selectByIndex(3);
			Select month = new Select(list.get(2));
			month.selectByIndex(10);
			Select year = new Select(list.get(3));
			year.selectByIndex(24);
						
			
			
			
		} 
		
		
		catch (Exception e) {
			System.out.println("it isn't working");
		}


	}

}