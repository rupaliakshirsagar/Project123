package Package2.Project2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continuebutton;


	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement loginSingIn;
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueShopping;
	
	
	public void enterUsername()
	{
		username.sendKeys("automationbytanay@gmail.com");;
	}
	public void clickOnContinue()
	{
		continuebutton.click();
	}
	public void enterPassword() throws InterruptedException 
	{
		password.sendKeys("Test@001122");
	}
	public void clickToSignIn() throws InterruptedException
	{
		try {
			System.out.println("DEBUG: Test if it is working 1 ");
			loginSingIn.click();
			System.out.println("DEBUG: Test if it is working 2");
		//Thread.sleep(15000);
		}
		catch(Exception e)
		{
			System.out.println("DEBUG: Test if it is working 3");
			continueShopping.click();
			System.out.println("DEBUG: Test if it is working 4");
			
		}
		
		

	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}