package Package2.Project2;

import java.time.Duration;

import org.openqa.selenium.By;
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

	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueShopping;
	
	public void hoverOverOnAccountList(WebDriver driver)
	{
		System.out.println("DEBUG: hoverOverOnAccountList 1");
		Actions a1=new Actions(driver);
		System.out.println("DEBUG: hoverOverOnAccountList ");
		a1.moveToElement(accountslist).perform();
	}
	public void clickToSignIn(WebDriver driver)
	{
		System.out.println("DEBUG: clickToSignIn HomePage 1 ");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("DEBUG: clickToSignIn HomePage 2");
		  if (driver.findElements(By.xpath("//span[@class='nav-line-2 ']")).size() > 0) 
		  {
		        System.out.println("DEBUG: accountslist found, hovering and signing in");
		        hoverOverOnAccountList(driver);
		        signin.click();
		  } 
		  else 
		  {
		        System.out.println("DEBUG: accountslist NOT found, clicking Continue Shopping");
		        continueShopping.click();
		        hoverOverOnAccountList(driver);
		        signin.click();		        
		  }
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
