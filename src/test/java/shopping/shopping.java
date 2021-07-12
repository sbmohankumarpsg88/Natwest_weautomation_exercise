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

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


public class shopping extends PageObject {
	
	//@Managed
	//WebgetDriver() getDriver()=null;
	
	public void openwebsite()
	
	{
	// String getDriver()path=System.getProperty("user.dir");
	 //System.setProperty("webgetDriver().chrome.getDriver()",getDriver()path+"/libs/chromegetDriver().exe");
	 //getDriver() = new ChromegetDriver()();
	 
/**Removed driver instance from here and updated driver details in serenity.properties file to get better serenity reports with screen shots*/
	
	 
    getDriver().manage().window().maximize();
    getDriver().get("http://automationpractice.com/");
    System.out.println("User opened website successfully");
   
	}
	
	public void signin()
	{
		getDriver().findElement(By.xpath("//*[@class='login']")).click();
		System.out.println("User clicked on Sign In link");
		Serenity.takeScreenshot();
	}

public void enterusernamepw(String username,String password)

{
	getDriver().findElement(By.name("email")).sendKeys(username);
	getDriver().findElement(By.name("passwd")).sendKeys(password);
	System.out.println("User entered username nad passsword");
	Serenity.takeScreenshot();
}

public void btnsign()

{

	getDriver().findElement(By.name("SubmitLogin")).click();
	System.out.println("User clicked on Sign button");
	Serenity.takeScreenshot();
}

public void btnsearchbox(String category)

{
	getDriver().findElement(By.name("search_query")).sendKeys(category);
	Serenity.takeScreenshot();
	getDriver().findElement(By.name("submit_search")).click();
	System.out.println("User entered Category of clothes");
	Serenity.takeScreenshot();
	}

public void btnaddcart()

{
waitABit(1000);
Actions action = new Actions(getDriver());
WebElement mains= getDriver().findElement(By.xpath("//*[@class='product-image-container']"));
action.moveToElement(mains).perform();
action.click(mains);
getDriver().findElement(By.xpath("//*[@title='Add to cart']")).click();
System.out.println("User clicked addcart");
Serenity.takeScreenshot();
}

public void btncheckout()
{
waitABit(1000);
getDriver().findElement(By.xpath("//*[@title='Proceed to checkout']")).click();
System.out.println("User clicked checkout");
Serenity.takeScreenshot();
}

public void btncheckoutsummary()
{
waitABit(1000);
Serenity.takeScreenshot();
getDriver().findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']")).click();
System.out.println("User clicked checkout in summary page");
Serenity.takeScreenshot();
}

public void btncheckoutaddress()
{
Serenity.takeScreenshot();
getDriver().findElement(By.xpath("//*[@name='processAddress']")).click();
System.out.println("User clicked checkout on addresspage");
Serenity.takeScreenshot();
}

public void btnterms()
{
	waitABit(1000);
	Serenity.takeScreenshot();
	getDriver().findElement(By.xpath("//*[@type='checkbox']")).click();
	System.out.println("User selected checkbox for terms and condition");
	Serenity.takeScreenshot();
}

public void btncheckoutshipping()
{
	waitABit(1000);
	Serenity.takeScreenshot();
	getDriver().findElement(By.xpath("//*[@name='processCarrier']")).click();
	System.out.println("User clicked checkout on shippingpage");
	Serenity.takeScreenshot();
}

public void btnpayment()
{
	waitABit(1000);
	Serenity.takeScreenshot();
	getDriver().findElement(By.xpath("//*[@class='bankwire']")).click();
	System.out.println("User clicked on wire payment");
	Serenity.takeScreenshot();
}

public void btnconfirm()
{
	waitABit(1000);
	Serenity.takeScreenshot();
	getDriver().findElement(By.xpath("//*[@class='button btn btn-default button-medium']")).click();
	System.out.println("User clicked on order confirm button");
	Serenity.takeScreenshot();
}

public void btnbackorder()
{
	waitABit(1000);
	Serenity.takeScreenshot();
	getDriver().findElement(By.xpath("//*[@title='Back to orders']")).click();
	System.out.println("User clicked on back to order");
	Serenity.takeScreenshot();
}

public void verifyorder()
{
	String actualString = getDriver().findElement(By.xpath("//*[@class='label dark']")).getText();
	Assert.assertTrue(actualString.contains("On backorder"));
	System.out.println("User verified the order status in history");
	Serenity.takeScreenshot();
}

public void btnsignout()
{

	getDriver().findElement(By.xpath("//*[@class='logout']")).click();
	Serenity.takeScreenshot();
    getDriver().close();
    
    System.out.println("User signout from the website");
    Serenity.takeScreenshot();
}


public void btnprofile()
{

	getDriver().findElement(By.xpath("//*[@class='account']")).click();
	System.out.println("User clicked on user profile");
	Serenity.takeScreenshot();
	}


public void lnkpersonalinfo()
{
	
	getDriver().findElement(By.xpath("//*[@title='Information']")).click();
	System.out.println("User clicked on user personal information");
	Serenity.takeScreenshot();
}

public void updatename(String firstname,String password)
{

	getDriver().findElement(By.id("firstname")).clear();
	getDriver().findElement(By.id("firstname")).sendKeys(firstname);
	Serenity.takeScreenshot();
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,400)","");
	Serenity.takeScreenshot();
	getDriver().findElement(By.id("old_passwd")).sendKeys(password);
	System.out.println("User updated firstname");
	Serenity.takeScreenshot();
}

public void btnsave()
{

	getDriver().findElement(By.name("submitIdentity")).click();
	System.out.println("User saved the updated firstname");
	Serenity.takeScreenshot();
}

public void verifyupdatemsg()
{

	String actualString = getDriver().findElement(By.xpath("//*[@class='alert alert-success']")).getText();
	Assert.assertTrue(actualString.contains("Your personal information has been successfully updated."));
	System.out.println("User verified sucessful message");
	Serenity.takeScreenshot();
}
public void scrolldown()
{
	Serenity.takeScreenshot();
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,700)","");	
	Serenity.takeScreenshot();	
}
}
