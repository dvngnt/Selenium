package ex5;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest {



	@Test
	public void loginviaEmail(){
		System.out.println("login via email");
		try{
			Assert.assertEquals("bob", "bo1b");	
		}
		catch(java.lang.AssertionError e){
			System.out.println("whaaaaa");
			
		}
		
	}

	@Test
	public void loginViaFacebook(){
		System.out.println("login via Facebook");
	}

	@Test
	public void loginviatwitter(){
		System.out.println("login via twitter");
	}
}
