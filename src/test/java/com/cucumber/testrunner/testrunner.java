package com.cucumber.testrunner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import com.AdactinPackage.BaseClassUpdated;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\java\\com\\cucumber\\feature\\Adactln.feature",
		glue = "com.cucumber.stepdefenition"
		)
public class testrunner extends BaseClassUpdated{

	@BeforeClass
	public static void browserlaunch() throws Throwable {
		getBrowser("chrome");
		getUrl("http://adactin.com/HotelApp/index.php");
	}
	

	
	@AfterClass
	public static void browserQuit() {
		driver.close();
		driver.quit();
	}
}
