package ex13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestWebSite extends BaseClass {
	
	@Test
	public void test_01() throws InterruptedException{
		getWebDriver().get("https://jqueryui.com/droppable/");
		getWebDriver().switchTo().frame(0);
		WebElement drag = getWebDriver().findElement(By.id("draggable")); 
		WebElement drop = getWebDriver().findElement(By.id("droppable")); 
		Actions action = new Actions(getWebDriver());
		action.dragAndDrop(drag, drop).build().perform();


	}

	@Test
	public void test_02() throws InterruptedException{
		getWebDriver().get("http://www.rediff.com/");
		getWebDriver().findElement(By.linkText("Create a Rediffmail account")).click();
		List<WebElement> list = getWebDriver().findElements(By.cssSelector(".f14>tbody>tr>td>select"));
		Select day = new Select(list.get(1));
		day.selectByIndex(3);
		Select month = new Select(list.get(2));
		month.selectByIndex(10);
		Select year = new Select(list.get(3));
		year.selectByIndex(24);
		
	}
	@Test
	public void test_03() throws InterruptedException{
		getWebDriver().get("http://www.echoecho.com/htmlforms10.htm");
		getWebDriver().manage().window().maximize();
		List<WebElement> list = getWebDriver().findElements(By.name("group1"));
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
		
	}
}
