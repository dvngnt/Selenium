package ex3;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Radio {





	public static void main (String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.name("group1"));
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).isSelected() == false){ // null or true
				list.get(i).click();
				Thread.sleep(2000);
			}
		}
		
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).isSelected() == false){ // null or true
				System.out.println(list.get(i).getAttribute("value"));
				Thread.sleep(3000);
			}
		}

		driver.close();
	}
}



