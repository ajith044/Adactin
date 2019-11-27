package com.AdactinPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	public static WebDriver driver;
	
	public homepage(WebDriver ldriver) {
		homepage.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	
	
}
