package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_004_shipping {
 
	

	
	public POM_004_shipping(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	@FindBy(xpath ="//div[@class='control _with-tooltip']/input[1]")
	private WebElement emailaddress;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@name='street[0]']")
	private WebElement streetaddressline1;
	
	@FindBy(xpath = "//input[@name='street[1]']")
	private WebElement streetaddressline2;
	
	@FindBy(xpath = "//input[@name='street[2]']")
	private WebElement streetaddressline3;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement cityname;
	
	@FindBy(xpath = "//select[@name='region_id']")
	private WebElement stateorprovince_select;
	
	@FindBy(xpath = "//input[@name=\"postcode\"]")
	private WebElement postalcode;
	
	@FindBy(xpath = "//select[@name=\"country_id\"]")
	private WebElement country_select;
	
	@FindBy(xpath = "//input[@name=\"telephone\"]")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//button[@data-role='opc-continue']")
	private WebElement next_button;

	public WebElement getEmailaddress() {
		return emailaddress;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getStreetaddressline1() {
		return streetaddressline1;
	}

	public WebElement getStreetaddressline2() {
		return streetaddressline2;
	}

	public WebElement getStreetaddressline3() {
		return streetaddressline3;
	}

	public WebElement getCityname() {
		return cityname;
	}

	public WebElement getStateorprovince_select() {
		return stateorprovince_select;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getCountry_select() {
		return country_select;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getNext_button() {
		return next_button;
	}
	
	
	
}
