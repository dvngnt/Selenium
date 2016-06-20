package ex5;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{
	
	public void onTestSuccess(ITestResult tr){
		System.out.println("You passed");
	}
	
	public void onTestFailure(ITestResult tr){
		System.out.println("you failed");
	}
}
