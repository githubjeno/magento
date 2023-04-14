package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_001_HOME {

	public POM_001_HOME(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	public WebElement getMenu_gear() {
		return menu_gear;
	}


	public WebElement getDropdownfitnessequipment() {
		return dropdownfitnessequipment;
	}


	@FindBy(xpath = "//a[@id=\"ui-id-6\"]/span[2]")
	private WebElement menu_gear;
	
	
	@FindBy(xpath = "//a[@id=\"ui-id-26\"]/span")
	private WebElement dropdownfitnessequipment;
	
	
}
