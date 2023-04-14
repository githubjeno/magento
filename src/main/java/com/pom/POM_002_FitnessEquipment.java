package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_002_FitnessEquipment {

	
	
	
	public POM_002_FitnessEquipment(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getYogacompanionkit() {
		return yogacompanionkit;
	}

	@FindBy(xpath = "//strong[@class='product name product-item-name']/a")
	private WebElement yogacompanionkit;
	
	
	
}
