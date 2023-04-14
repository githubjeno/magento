package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	
		public static WebDriver driver;
		public static void browserLaunch(String browsername)
		{
			//System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\ashin\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
			if(browsername.contains("chrome"))
			{
			driver= new ChromeDriver();
			}
			if(browsername.equalsIgnoreCase("edge"))
			{
			driver= new EdgeDriver();
			}
			if(browsername.equalsIgnoreCase("firefox"))
			{
			driver= new FirefoxDriver();
			}
			if(browsername.equalsIgnoreCase("ie")||browsername.equalsIgnoreCase("internetexplorer"))
			{
			driver= new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		public static void URL(String url)
		{
			driver.get(url);
		}
		
		public static void select_class(WebElement element, String by, String value) {
			Select sc = new Select(element);

			try {
				if (by.equalsIgnoreCase("byIndex")) {
					int parseInt = Integer.parseInt(value);
					sc.selectByIndex(parseInt);
				} else if (by.equalsIgnoreCase("byValue")) {
					sc.selectByValue(value);
				} else if (by.equalsIgnoreCase("byVisibleText")) {
					sc.selectByVisibleText(value);
				} else {
					System.out.println("Invalid option");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		public static Actions Actionclass() {
			Actions a= new Actions(driver);
			return a;
			
		}
		public static String titleofpage() {
			return driver.getTitle();
		}
		
		public static void alert_withok()
		{
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		
		
		public static void screenshot(String name) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destinateFile = new File(".//screenshot"+name+".jpg");
			FileUtils.copyFileToDirectory(sourceFile, destinateFile);
		}
		public static void movetoelement(WebElement we)
		{
			Actions a= new Actions(driver);
			a.moveToElement(we).perform();;
		}
		public static void clicking(WebElement we)
		{
			Actions a = new Actions(driver);
			a.click(we).perform();
			
		}
}
