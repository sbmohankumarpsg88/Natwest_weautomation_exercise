package Stepdefinition;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import shopping.shopping;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Onlineshopping {


    @Steps
    shopping objshopping;
	
	@Given("A user is in Online shopping website")
	public void a_user_is_in_online_shopping_website() throws Exception {
		
		objshopping.openwebsite();
	}

	@And("user clicks on Sign In link")
	public void user_clicks_on_sign_in_link()throws Exception {
		
		objshopping.signin();
		
	}

	@When("user enters {string},{string} in the signin page")
	public void user_enters_in_the_signin_page(String username, String password) throws Exception {
		objshopping.enterusernamepw(username,password);
	}

	@When("user click on Signin button")
	public void user_click_on_signin_button() throws Exception {
		
		
		objshopping.scrolldown();
		objshopping.btnsign();
		
	}

	@Then("user enters {string} in the searchbox")
	public void user_enters_in_the_searchbox(String category) throws Exception {
		objshopping.btnsearchbox(category);
		
	}

	@Then("user clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() throws Exception{
		objshopping.scrolldown();
		objshopping.btnaddcart();
	}

	

	@Then("user clicks on Proceed to checkout in cart page")
	public void user_clicks_on_proceed_to_checkout_in_cart_page() throws Exception{
		
		objshopping.btncheckout();
	}

	@Then("user clicks on Proceed to checkout in summary page")
	public void user_clicks_on_proceed_to_checkout_in_summary_page() throws Exception{
		objshopping.scrolldown();
		objshopping.btncheckoutsummary();
		
		
	}

	@Then("user clicks on Proceed to checkout in address page")
	public void user_clicks_on_proceed_to_checkout_in_address_page() throws Exception{
		objshopping.scrolldown();
		objshopping.btncheckoutaddress();
        
	}

	@Then("user clicks on Terms and service checkbox")
	public void user_clicks_on_terms_and_service_checkbox() throws Exception{
		objshopping.scrolldown();
		objshopping.btnterms();
		
	}

	@Then("user clicks on Proceed to checkout in shipping page")
	public void user_clicks_on_proceed_to_checkout_in_shipping_page() throws Exception{
		objshopping.scrolldown();
		objshopping.btncheckoutshipping();
	}

	@Then("user chooses  pay by bank wire payment method")
	public void user_chooses_pay_by_bank_wire_payment_method()throws Exception {
		objshopping.scrolldown();
		objshopping.btnpayment();
		
		
	}

	@Then("user confirms order")
	public void user_confirms_order()throws Exception {
		objshopping.scrolldown();
		objshopping.btnconfirm();
	  
	}

	@Then("user click on Back to orders link")
	public void user_click_on_back_to_orders_link() throws Exception {
		objshopping.scrolldown();
		objshopping.btnbackorder();
	}

	@Then("user verify the order in the order history page")
	public void user_verify_the_order_in_the_order_history_page() throws Exception{
		objshopping.verifyorder();
	}

	@Then("user signout from the website")
	public void user_signout_from_the_website() throws Exception {
		objshopping.btnsignout();
	    
	}

	@Then("user clicks on user profile link")
	public void user_clicks_on_user_profile_link() throws Exception {
		
		objshopping.btnprofile();
	    
	}

	@Then("user clicks on My personal information link")
	public void user_clicks_on_my_personal_information_link() throws Exception {
		objshopping.scrolldown();
		objshopping.lnkpersonalinfo();
		
	}

	@Then("user updates {string} and enters {string}")
	public void user_updates_and_enters(String firstname, String password) throws Exception {
		objshopping.updatename(firstname,password);
		
		
	}

	@Then("user clicks on Save button")
	public void user_clicks_on_save_button() throws Exception {
		objshopping.btnsave();
		
	}

	@Then("verify the successful update message")
	public void verify_the_successful_update_message() throws Exception {
		objshopping.verifyupdatemsg();
		
	}

}
