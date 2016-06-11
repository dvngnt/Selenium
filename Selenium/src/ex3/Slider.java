package ex3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgantt2\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0); //second way use switchTo().frame and index
		
		
		try {
			WebElement slider = driver.findElement(By.className("ui-slider-handle")); 
			System.out.println(slider.getAttribute("tabindex"));
			Actions action = new Actions(driver);
			action.clickAndHold(slider).moveByOffset(80, 0).build().perform();
			// default slider
			
			
		} 
		
		
		catch (Exception e) {
			System.out.println("it isn't working");
		}


	}

}