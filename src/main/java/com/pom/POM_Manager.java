package com.pom;

import org.openqa.selenium.WebDriver;

public class POM_Manager {
      public static WebDriver driver;
	
      public POM_Manager(WebDriver driver1) {
		this.driver = driver1;
	}
private POM_001_HOME p001_HOME ;
private POM_002_FitnessEquipment p002_FitnessEquipment;
private POM_003_yogakitdesc p003_yogakitdesc;
private POM_004_shipping p004_shipping;
private POM_005_payment p005_payment;
private POM_006_CheckoutSuccess p006_CheckoutSuccess;


public POM_001_HOME getP001_HOME() {
	p001_HOME= new POM_001_HOME(driver); 
	return p001_HOME;
}
public POM_002_FitnessEquipment getP002_FitnessEquipment() {
	p002_FitnessEquipment= new POM_002_FitnessEquipment(driver);
	return p002_FitnessEquipment;
}
public POM_003_yogakitdesc getP003_yogakitdesc() {
	p003_yogakitdesc = new POM_003_yogakitdesc(driver);
	return p003_yogakitdesc;
}
public POM_004_shipping getP004_shipping() {
	p004_shipping= new POM_004_shipping(driver);
	return p004_shipping;
}
public POM_005_payment getP005_payment() {
	p005_payment = new   POM_005_payment(driver);
	return p005_payment;
}
public POM_006_CheckoutSuccess getP006_CheckoutSuccess() {
	p006_CheckoutSuccess = new   POM_006_CheckoutSuccess(driver);
	return p006_CheckoutSuccess;
}


	
	
}
