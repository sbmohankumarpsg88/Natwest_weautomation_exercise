package shopping;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.thucydides.core.annotations.Steps;


public class shopping extends PageObject {
	
	WebDriver driver=null;
	
	public void openwebsite()
	
	{
	 String driverpath=System.getProperty("user.dir");
	 System.setProperty("webdriver.chrome.driver",driverpath+"/libs/chromedriver.exe");
	 driver = new ChromeDriver();
	 
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com/");
    System.out.println("User opened website successfully");
	}
	
	public void signin()
	{
		driver.findElement(By.xpath("//*[@class='login']")).click();
		System.out.println("User clicked on Sign In link");
		
	}

public void enterusernamepw(String username,String password)

{
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("passwd")).sendKeys(password);
	System.out.println("User entered username nad passsword");
}

public void btnsign()

{

	driver.findElement(By.name("SubmitLogin")).click();
	System.out.println("User clicked on Sign button");
}

public void btnsearchbox(String category)

{
	driver.findElement(By.name("search_query")).sendKeys(category);
	driver.findElement(By.name("submit_search")).click();
	System.out.println("User entered Category of clothes");
	}

public void btnaddcart()

{
waitABit(1000);
Actions action = new Actions(driver);
WebElement mains= driver.findElement(By.xpath("//*[@class='product-image-container']"));
action.moveToElement(mains).perform();
action.click(mains);
driver.findElement(By.xpath("//*[@title='Add to cart']")).click();
System.out.println("User clicked addcart");
}

public void btncheckout()
{
waitABit(1000);
driver.findElement(By.xpath("//*[@title='Proceed to checkout']")).click();
System.out.println("User clicked checkout");
}

public void btncheckoutsummary()
{
waitABit(1000);

driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']")).click();
System.out.println("User clicked checkout in summary page");
}

public void btncheckoutaddress()
{

driver.findElement(By.xpath("//*[@name='processAddress']")).click();
System.out.println("User clicked checkout on addresspage");
}

public void btnterms()
{
	waitABit(1000);
	driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	System.out.println("User selected checkbox for terms and condition");
}

public void btncheckoutshipping()
{
	waitABit(1000);
	driver.findElement(By.xpath("//*[@name='processCarrier']")).click();
	System.out.println("User clicked checkout on shippingpage");
}

public void btnpayment()
{
	waitABit(1000);
	driver.findElement(By.xpath("//*[@class='bankwire']")).click();
	System.out.println("User clicked on wire payment");
}

public void btnconfirm()
{
	waitABit(1000);
	driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']")).click();
	System.out.println("User clicked on order confirm button");
}

public void btnbackorder()
{
	waitABit(1000);
	driver.findElement(By.xpath("//*[@title='Back to orders']")).click();
	System.out.println("User clicked on back to order");
}

public void verifyorder()
{
	String actualString = driver.findElement(By.xpath("//*[@class='label dark']")).getText();
	Assert.assertTrue(actualString.contains("On backorder"));
	System.out.println("User verified the order status in history");
}

public void btnsignout()
{

	driver.findElement(By.xpath("//*[@class='logout']")).click();
    driver.close();
    
    System.out.println("User signout from the website");
    
}


public void btnprofile()
{

	driver.findElement(By.xpath("//*[@class='account']")).click();
	System.out.println("User clicked on user profile");
	}


public void lnkpersonalinfo()
{
	
	driver.findElement(By.xpath("//*[@title='Information']")).click();
	System.out.println("User clicked on user personal information");
    
}

public void updatename(String firstname,String password)
{

	driver.findElement(By.id("firstname")).clear();
	driver.findElement(By.id("firstname")).sendKeys(firstname);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)","");
	driver.findElement(By.id("old_passwd")).sendKeys(password);
	System.out.println("User updated firstname");
    
}

public void btnsave()
{

	driver.findElement(By.name("submitIdentity")).click();
	System.out.println("User saved the updated firstname");
    
}

public void verifyupdatemsg()
{

	String actualString = driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
	Assert.assertTrue(actualString.contains("Your personal information has been successfully updated."));
	System.out.println("User verified sucessful message");
    
}
public void scrolldown()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,700)","");	
		
}
}