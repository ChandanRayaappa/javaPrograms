package com.Chandan.Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioChandanTest {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.ajio.com");
		driver.findElement(By.xpath("//a[@href='/shop/kids']")).click();
		driver.findElement(By.xpath("//a[@href='/s/khp-ajiomania-offer-02082021']")).click();
		driver.findElement(By.xpath("//span[.='brands']")).click();
		WebElement sortDopDown = driver.findElement(By.xpath("//select"));
		Select s = new Select(sortDopDown);
		s.selectByVisibleText("Price (highest first)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='2K KIDS (1)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-brand facet-linkname-3pin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='5elements By Radhika Gupta (8)']")).click();
		WebElement product = driver.findElement(By.xpath("//span[.='₹3,000']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(product));
		driver.findElement(By.xpath("//span[.='₹3,000']/../../preceding-sibling::div")).click();
		String parentTab= driver.getWindowHandle();
		Set<String> newTab = driver.getWindowHandles();
		newTab.remove(parentTab);
		for(String child:newTab) {
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("5elements-by-radhika-gupta-embellished-slip-on-sandals/p/461853425_multi")) {
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[.='4-5Y']")).click();
		driver.findElement(By.xpath("//span[.='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[.='GO TO BAG']")).click();
		
		
		
	}

}
