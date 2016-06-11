package ex3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://jqueryui.com/resources/demos/draggable/default.html");//first way: add frame src to get url
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.switchTo().frame(0); //second way use switchTo().frame and index
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='content']/iframe"))); // third way buy xpath and switch to
		try {
			System.out.println(driver.findElement(By.id("draggable")).getText()); 
			driver.switchTo().defaultContent(); //switch back to main page
			System.out.println(driver.findElement(By.className("entry-title")).getText());
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("it isn't working");
		}


	}

}
