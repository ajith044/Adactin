package com.AdactinPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel {

	public WebDriver driver;
	
	public searchHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	
	@FindBy(id="datepick_in")
	private WebElement datePickIn;
	
	@FindBy(id="datepick_out")
	private WebElement datePickOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getBookedItineray() {
		return bookedItineray;
	}

	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id="Reset")
	private WebElement reset;
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement searchHotel;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedItineray;
	
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement changePassword;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	
}
