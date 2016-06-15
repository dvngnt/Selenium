package ex5;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_01 {

	@BeforeClass
	public void beforeClass(){
		System.out.println("The start");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("ohpen");
	}
	
	@Test
	public void test1(){
		System.out.println("inside test 1");
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(1, 2);
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("klose browser");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("the end");
	}
	// beforeSuite > beforeTest > BeforeClass > BeforeMethod > Test > AfterMethod > AfterClass > AfterTest > AfterSuite
}
