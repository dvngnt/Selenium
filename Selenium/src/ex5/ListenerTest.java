package ex5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {
	
	
	@Test
	public void loginViaFacebook(){
		System.out.println("login via Facebook");
		
	}
	
	@Test
	public void loginViaEmail(){
		System.out.println("login via Facebook");
		Assert.assertEquals(1,2);
		
	}

}
