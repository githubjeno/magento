package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_006_CheckoutSuccess {

	
	
	public POM_006_CheckoutSuccess(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	@FindBy(xpath = "//div[@class=\"checkout-success\"]/p/span")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}
	
}
