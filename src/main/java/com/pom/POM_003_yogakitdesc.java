package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_003_yogakitdesc {
	
	public POM_003_yogakitdesc(WebDriver driver) {
	PageFactory.initElements( driver,this);	
	}


	public WebElement getCustomizeandaddtocart() {
		return customizeandaddtocart;
	}


	public WebElement getAddtocart() {
		return Addtocart;
	}


	public WebElement getShowcarticon() {
		return showcarticon;
	}


	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}


	@FindBy(xpath = "//button[@id='bundle-slide']")
	private WebElement customizeandaddtocart;
	
	
	
	@FindBy(xpath = "//button[@id=\"product-addtocart-button\"]")
	private WebElement Addtocart;
	
	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement showcarticon;
	
	
	@FindBy(xpath = "//button[@title='Proceed to Checkout']")
	private WebElement proceedtocheckout;
}
