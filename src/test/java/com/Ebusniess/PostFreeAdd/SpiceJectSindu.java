package com.Ebusniess.PostFreeAdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJectSindu {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();
		driver.findElement(By.xpath("//div[.='From']//input")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//div[.='To']//input")).clear();
		driver.findElement(By.xpath("//div[.='To']//input")).sendKeys("Delhi");
		Thread.sleep(2000);
		 String bang = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::input")).getText();
		System.out.println(bang);
		 Thread.sleep(2000);
		
	}
}
