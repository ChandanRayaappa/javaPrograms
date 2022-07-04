package com.Chandan.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameTest {
	public static void main(String[]args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement switchframe = driver.findElement(By.xpath("//a[.='SwitchTo']"));
		Actions act = new Actions(driver);
		act.moveToElement(switchframe).perform();
		driver.findElement(By.xpath("//a[.='Frames']")).click();
		driver.switchTo().frame("singleframe");
		
	}

}
