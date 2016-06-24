package ex10;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestLog {

	//Logger logger;
	
	@Test
	public void testLogs(){
		//logger = Logger.getLogger("devpinoyLogger");
		WebDriver driver = new ChromeDriver();
		//logger.debug("Starting of Selenium Test");
		//logger.debug("chrome opens");
		driver.get("https://google.com");
		//logger.debug("Navigate to Google");
		driver.manage().window().maximize();
		
	}
}
