package com.Chandan.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://www.spicejet.com");
		
	}

}
