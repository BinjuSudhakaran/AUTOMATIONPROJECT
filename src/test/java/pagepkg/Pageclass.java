package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclass
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu-item-12851\"]/a")
	WebElement login1;
	
	@FindBy(xpath="//*[@id=\"main\"]/article/div/div/div/ul/li[2]/p[2]/a")
	WebElement login2;
	
	@FindBy(xpath="//*[@id=\"input-1\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"input-2\"]")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"tab-1-content-1\"]/div[1]/form/div[4]/button")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[1]/nav/div/div[1]/ul/li[3]/a/span")
	WebElement certify;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[3]/div/div/div/div/div/section[1]/div[2]/a/div")
	WebElement viewcertificate;	
	
	@FindBy(xpath="//*[@id=\"download-button\"]/div/span")
	WebElement download;
	
	
	public Pageclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickLogin()
	{
		login1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		login2.click();
	}
	public void loginPage(String UN,String PWD) throws InterruptedException
	{
		username.clear();
		username.sendKeys(UN);
		pswd.clear();
		pswd.sendKeys(PWD);
		loginbtn.click();
		Thread.sleep(3000);
	}
	public void certify()
 	{
		
		certify.click();
		viewcertificate.click();
		download.click();
		driver.navigate().back();
		driver.navigate().back();
		
	}
		
	
}
