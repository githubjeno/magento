package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_005_payment {

	
	
	public POM_005_payment(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	@FindBy(xpath = "//button[@class='action primary checkout']")
	private WebElement placeorder_button;

	public WebElement getPlaceorder_button() {
		return placeorder_button;
	}
	
}
