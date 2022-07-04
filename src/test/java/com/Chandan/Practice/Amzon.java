package com.Chandan.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amzon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[.='64 GB']")).click();
		driver.findElement(By.xpath("//div[@class='colorsprite aok-float-left']")).click();
		
		List<WebElement> text = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement data:text) {
			System.out.println(data.getText());
		}
		List<WebElement> prize = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement prizes:prize) {
			System.out.println(prizes.getText());
		}
	}
	

}
