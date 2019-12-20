
package Testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners interface which imeplements TestNg listeners

public class Listeners implements ITestListener {
	@Override
	public void	onTestStart(ITestResult result) {
		System.out.println("before executing any methods in this class");
		
	}
	
	@Override
	public void	onTestSuccess(ITestResult result) {
		//screenshot code
	}
	@Override
	public void	onTestFailure(ITestResult result) {
		
	}
	@Override
	public void	onTestSkipped(ITestResult result) {
		
	}
	@Override
	public void	onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void	onStart(ITestContext context) {
		
	}
}
