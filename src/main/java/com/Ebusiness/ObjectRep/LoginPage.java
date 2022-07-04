package com.Ebusiness.ObjectRep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	private WebElement userNameTxt;
	 
	@FindBy(id="password")
	private WebElement passWordTxt;
	
	@FindBy(xpath = "//button[.=' Login ']")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void  loginAction(String userName,String password) {
		userNameTxt.sendKeys(userName);
		passWordTxt.sendKeys(password);
		LoginBtn.click();
	}
	
	
	
	


}
