package ex5;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestPriority {

	@Test()
	public void login(){
		System.out.println("logged in");
		Assert.assertEquals(1,2);
	}

	@Test(dependsOnMethods={"login"})
	public void navigation(){
		System.out.println("navigate");
	}

	@Test(dependsOnMethods={"login","navigation"})
	public void logout(){
		System.out.println("logged out");
	}
	
	
}
