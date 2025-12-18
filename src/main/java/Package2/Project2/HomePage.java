package Package2.Project2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	/*WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountlist;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signin;
	
	
	public void hoverover(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountlist).perform();
	}
	
	public void clickOnSignInHomePage()
	{
		signin.click();
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	*/
	
	//
	
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountslist;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signin;
	

	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;

	
	public void hoverOverOnAccountList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountslist).perform();
	}
	public void clickToSignIn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();

		//signin.click();
	}
	public void SearchingProduct() throws InterruptedException
	{
		
		search.sendKeys("Shoes"+Keys.ENTER);
		Thread.sleep(2000);
	}
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
