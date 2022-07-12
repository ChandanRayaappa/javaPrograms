package com.Chandan.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChethanDynamicXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String mobileName="APPLE iPhone 13 Mini (Midnight, 128 GB)";
		String mobilerate="₹92,999";
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    String rate = driver.findElement(By.xpath("//div[.='APPLE iPhone 11 (Purple, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[.='₹47,999']")).getText();
	    System.out.println(rate);
	    String rate1= driver.findElement(By.xpath("//div[.='"+mobileName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	    System.out.println(rate1);
	    String rate3 = driver.findElement(By.xpath("//div[@class='col col-7-12']/ancestor::div[@class='_3pLy-c row']/descendant::div[.='"+mobilerate+"']")).getText();
	    System.out.println(rate3);
	}
}
