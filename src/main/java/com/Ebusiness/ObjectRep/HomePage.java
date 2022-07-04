package com.Ebusiness.ObjectRep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[.='Login']")
	private WebElement LoginBtn;
	
	@FindBy(xpath = "//a[.=' Signout ']")
	private WebElement signOutBtn;
	
	@FindBy(xpath = "//li//a[.='Post Free Ads']")
	private WebElement postFreeadBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void LoginBtn() {
		LoginBtn.click();
	}
	
	public void signOutBtn() {
		signOutBtn.click();
	}
	
	public void postFreeadBtn() {
		postFreeadBtn.click();
	}
}

