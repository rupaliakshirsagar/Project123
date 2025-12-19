package Package2.Project2;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
import Utility.ListenersLogic;
import Utility.RetryLogic;

@Listeners(ListenersLogic.class)

public class TestCase1_LoginToAmazon extends BaseClass

{
    @Test(retryAnalyzer=RetryLogic.class)
    public void withValidCredentials() throws InterruptedException
    {
    	HomePage homepage= new HomePage(driver);
    	homepage.hoverOverOnAccountList(driver);
    	homepage.clickToSignIn();
    	
    	LoginPage loginpage=new LoginPage(driver);
    	loginpage.enterUsername();
    	loginpage.clickOnContinue();
    	loginpage.enterPassword();
    	loginpage.clickToSignIn();
    	
    	
    }
}