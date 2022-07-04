package com.Chandan.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://www.makemytrip.com/");
     driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
     driver.findElement(By.id("fromCity")).click();
     driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru");
     Thread.sleep(2000);
     driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
     driver.findElement(By.xpath("//span[.='To']")).click();
     driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
     driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
     driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
     
	}
}
