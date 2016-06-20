package ex5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
	@Test(dataProvider="testData")
	public void registerUser(String firstname, String lastname, String email, String password){
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);

	}
	
	@DataProvider
	public Object[][] testData() {
		Object[][] obj = new Object[3][4]; //three test, four arguments
		obj[0][0] = "bob";
	    obj[0][1] = "smith";
	    obj[0][2] = "bsmith@gmail.com";
	    obj[0][3] = "123";
	    

		obj[1][0] = "sally";
	    obj[1][1] = "sitwell";
	    obj[1][2] = "nohair@stickwell";
	    obj[1][3] = "1234";
	    

		obj[2][0] = "bob";
	    obj[2][1] = "loblaw";
	    obj[2][2] = "mouthfull@gmail.com";
	    obj[2][3] = "12345";
	    
	    return obj;
	}	
	

}
