package ex5;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest {



	@Test
	public void loginviaEmail(){
		System.out.println("login via email");
	}

	@Test
	public void loginViaFacebook(){
		System.out.println("login via Facebook");
		throw new SkipException("facebook not implemented");
	}

	@Test
	public void loginviatwitter(){
		System.out.println("login via twitter");
	}
}
