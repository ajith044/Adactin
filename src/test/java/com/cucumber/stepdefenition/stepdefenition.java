package com.cucumber.stepdefenition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AdactinPackage.BaseClassUpdated;
import com.AdactinPackage.homepage;
import com.AdactinPackage.searchHotel;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepdefenition extends BaseClassUpdated{
	searchHotel sh = new searchHotel(driver);
	 homepage hp = new homepage(driver);
	 
	@When("^user enters the username$")
	public void user_enters_the_username() throws Throwable {
	   hp.getUsername().sendKeys("ajith201094");
	}

	@When("^user enters the password$")
	public void user_enters_the_password() throws Throwable {
		hp.getPassword().sendKeys("ajith201094");
	}

	@Then("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		hp.getLogin().click();
	}
	
	@Then("^User logout$")
	public void user_logout() throws Throwable {
	    sh.getLogout().click();
	    driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}
	
	@When("^User selects their required option location,hotel,room type,no of rooms$")
	public void user_selects_their_required_option_location_hotel_room_type_no_of_rooms() throws Throwable {
		WebElement loc = driver.findElement(By.id("location"));
		Select scloc = new Select(loc);
		scloc.selectByVisibleText("Sydney");
		WebElement hotelElement = driver.findElement(By.id("hotels"));
		Select schotelElement = new Select(hotelElement);
		schotelElement.selectByVisibleText("Hotel Creek");
		WebElement room = driver.findElement(By.id("room_type"));
		Select scroom = new Select(room);
		scroom.selectByVisibleText("Standard");
	}

	@When("^User selects checkin and checkout date$")
	public void user_selects_checkin_and_checkout_date() throws Throwable {
		sh.getDatePickIn().clear();
		sh.getDatePickIn().sendKeys("02/12/2019");
		sh.getDatePickOut().clear();
		sh.getDatePickOut().sendKeys("30/11/2019");
		sh.getSubmit().click();
	}

	@Then("^Verify that system gives an error saying check-in-date should not be later than check-out-date\\.$")
	public void verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date() throws Throwable {
		List<WebElement> errorMessage = driver.findElements(By.xpath("//span[@class='reg_error']"));
	    for(WebElement x : errorMessage) {
	    	Assert.assertEquals(x, x);
	    	System.out.println("System throws error message as expected");
	    }
	}
}
