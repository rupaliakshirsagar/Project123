package Package2.Project2;


	
	import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
import Utility.ListenersLogic;
import Utility.RetryLogic;

@Listeners(ListenersLogic.class)

	public class TestCase2_LoginAmazonAndSearch extends BaseClass{
		//@Test(retryAnalyzer=RetryLogic.class)
	@Test()
	public void loginandsearching() throws InterruptedException
	{
		System.out.println("DEBUG: Started execution for TestCase == 2");
		HomePage homepage= new HomePage(driver);
		//homepage.hoverOverOnAccountList(driver);
		System.out.println("DEBUG: 1 TestCase == 2");
		homepage.clickToSignIn(driver);
		System.out.println("DEBUG: 2 TestCase == 2");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername();
		loginpage.clickOnContinue();
		loginpage.enterPassword();
		loginpage.clickToSignIn();
		
		Thread.sleep(6000);
		
		homepage.SearchingProduct();

		
	}
	

}
