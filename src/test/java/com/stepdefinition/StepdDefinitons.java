package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import com.baseclass.BaseClass;
import com.helper.File_Reader;
import com.pom.POM_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdDefinitons extends BaseClass{
	POM_Manager pom= new POM_Manager(driver);
	
	@Given("user enter the url")
	public void user_enter_the_url() throws IOException {
	   URL(File_Reader.getInstance().geturl());
	   
	}

	@When("user hover over Gear menu and clicks fitness equipment")
	public void user_hover_over_gear_menu_and_clicks_fitness_equipment() {
	     
		movetoelement(pom.getP001_HOME().getMenu_gear());
		clicking(pom.getP001_HOME().getDropdownfitnessequipment());
	   
	}

	@When("selects yoga companion kit")
	public void selects_yoga_companion_kit() {
	    
	   clicking(pom.getP002_FitnessEquipment().getYogacompanionkit());
	}

	@When("user clicks on Customize and add to cart")
	public void user_clicks_on_customize_and_add_to_cart() {
	    pom.getP003_yogakitdesc().getCustomizeandaddtocart().click();
	    
	   
	}

	@When("user changes according to his customizaton if required and click Add to cart")
	public void user_changes_according_to_his_customizaton_if_required_and_click_add_to_cart() throws InterruptedException {
		Thread.sleep(777);
		pom.getP003_yogakitdesc().getAddtocart().click();
	    Thread.sleep(5555);
	}

	@When("user clicks on cart icon and clicks on proceed to checkout")
	public void user_clicks_on_cart_icon_and_clicks_on_proceed_to_checkout() {
	    
	   pom.getP003_yogakitdesc().getShowcarticon().click();
	   pom.getP003_yogakitdesc().getProceedtocheckout().click();
	}

	@When("enters the valid emailaddress {string}")
	public void enters_the_valid_emailaddress(String string) throws InterruptedException {
	    
	     Thread.sleep(6666);
		pom.getP004_shipping().getEmailaddress().sendKeys(string);
	}

	@When("entesr his firstname {string} and lastname {string}")
	public void entesr_his_firstname_and_lastname(String string, String string2) {
	    
	   pom.getP004_shipping().getFirstname().sendKeys(string);
	   pom.getP004_shipping().getLastname().sendKeys(string2);
	}

	@When("company name {string}")
	public void company_name(String string) {
	    pom.getP004_shipping().getCompany().sendKeys(string); 
	   
	}

	@When("streeaddress line1 {string} line2 {string} line3 {string}")
	public void streeaddress_line1_line2_line3(String string, String string2, String string3) {
	    pom.getP004_shipping().getStreetaddressline1().sendKeys(string);
	    pom.getP004_shipping().getStreetaddressline2().sendKeys(string2);
	    pom.getP004_shipping().getStreetaddressline3().sendKeys(string3);
	    
	   
	}

	@When("city {string}")
	public void city(String string) {
	    pom.getP004_shipping().getCityname().sendKeys(string);
	   
	}

	@When("selects country {string}")
	public void selects_country(String string) {
	   select_class(pom.getP004_shipping().getCountry_select(),"byvisibletext","India"); 
	   
	}

	@When("selects state {string}")
	public void selects_state(String string) {
	    
	   select_class(pom.getP004_shipping().getStateorprovince_select(),"byvisibletext","Tamil Nadu");
	}

	@When("enters his postalcode")
	public void enters_his_postalcode() {
	    pom.getP004_shipping().getPostalcode().sendKeys("123478");
	   
	}

	@When("enters his phoneno")
	public void enters_his_phoneno() {
	    
	   pom.getP004_shipping().getPhonenumber().sendKeys("1234567890");
	}

	@When("clicks on next icon")
	public void clicks_on_next_icon() throws InterruptedException {
	    Thread.sleep(4444);
		pom.getP004_shipping().getNext_button().click();
	   
	}

	@When("user reviews the order placed and clicks on place order")
	public void user_reviews_the_order_placed_and_clicks_on_place_order() throws InterruptedException {
	     Thread.sleep(3333);
		pom.getP005_payment().getPlaceorder_button().click();
	   
	}

	@Then("get the order no and print it")
	public void get_the_order_no_and_print_it() {
	   System.out.println(pom.getP006_CheckoutSuccess().getOrderno().getText());
	   
	}
}
