package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ashin\\eclipse-workspace\\magento\\src\\test\\java\\com\\feature\\orderingyogequipmen.feature",
                    glue="com.stepdefinition",plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")

public class Testmagentoorderingofproduct {
    @BeforeClass
	public static void browserlaunch() {
		BaseClass.browserLaunch("edge");
	}
	
}
