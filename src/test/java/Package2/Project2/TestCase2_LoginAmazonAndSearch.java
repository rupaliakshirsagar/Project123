package Package2.Project2;


	
	import org.testng.annotations.Test;

import Utility.BaseClass;

	

	public class TestCase2_LoginAmazonAndSearch extends BaseClass{
	@Test
	public void loginandsearching() throws InterruptedException
	{
		HomePage homepage= new HomePage(driver);
		homepage.hoverOverOnAccountList(driver);
		homepage.clickToSignIn();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername();
		loginpage.clickOnContinue();
		loginpage.enterPassword();
		loginpage.clickToSignIn();
		
		Thread.sleep(10000);
		
		homepage.SearchingProduct();

		
	}
	

}
