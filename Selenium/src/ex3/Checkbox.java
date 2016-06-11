package ex3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgantt2\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		try {
			
			List<WebElement> list = driver.findElements(By.name("sports"));
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i).getAttribute("value"));
				if((list.get(i).getAttribute("value").equals("football") | list.get(i).getAttribute("value").equals("soccer")) && list.get(i).isSelected() == false){
					list.get(i).click();
				}
			}
						
			
			
			
		} 
		
		
		catch (Exception e) {
			System.out.println("it isn't working");
		}


	}

}