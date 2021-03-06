package ex3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgantt2\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0); //second way use switchTo().frame and index
		
		
		try {
			WebElement drag = driver.findElement(By.id("draggable")); 
			System.out.println(drag.getText());
			Actions action = new Actions(driver);
			action.dragAndDropBy(drag, 50,50).build().perform();;
		} 
		
		
		catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("it isn't working");
		}


	}

}