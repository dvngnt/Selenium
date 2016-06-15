package ex5;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_02 {
	
	@BeforeTest //before anything
	public void beforeTest(){
		System.out.println("Before Any Test");
	}
	
	@Test
	public void test3(){
		System.out.println("Inside Test 3");
	}
}
