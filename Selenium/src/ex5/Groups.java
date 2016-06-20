package ex5;

import org.testng.annotations.Test;

public class Groups {

	
	@Test(groups={"performance"})
	public void feature1(){
		System.out.println("feature 1");
	}
	
	@Test(groups={"regression"})
	public void feature2(){
		System.out.println("feature 2");
	}
	
	
	@Test(groups={"performance","regression"})
	public void feature3(){
		System.out.println("feature 3");
	}
}
