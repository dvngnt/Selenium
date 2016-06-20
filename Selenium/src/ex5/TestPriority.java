package ex5;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority=1)
	public void login(){
		System.out.println("logged in");
	}

	@Test(priority=2)
	public void navigation(){
		System.out.println("navigate");
	}

	@Test(priority=3)
	public void logout(){
		System.out.println("logged out");
	}
	
	
}
