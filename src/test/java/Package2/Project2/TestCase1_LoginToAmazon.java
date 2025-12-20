package Package2.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
import Utility.ListenersLogic;
import Utility.RetryLogic;

@Listeners(ListenersLogic.class)

public class TestCase1_LoginToAmazon extends BaseClass

{
	//@Test(retryAnalyzer = RetryLogic.class)
	@Test()
	public void withValidCredentials() throws InterruptedException {
		System.out.println("DEBUG: Started execution for TestCase == 1");
		HomePage homepage = new HomePage(driver);
		//homepage.hoverOverOnAccountList(driver);
		System.out.println("DEBUG: 1 TestCase == 1");
		homepage.clickToSignIn(driver);
		System.out.println("DEBUG: 2 TestCase == 1");
		System.out.println("DEBUG: click is executed");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername();
		loginpage.clickOnContinue();
		loginpage.enterPassword();
		loginpage.clickToSignIn();

	}
}