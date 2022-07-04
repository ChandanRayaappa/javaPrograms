package com.Chandan.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BobbibrowncosmeticsTest {
	@Test
	public void bobbibrowncosmeticsTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bobbibrowncosmetics.com");
		List<WebElement> allProducts = driver.findElements(By.xpath("//a[@class='product-brief__headline-link js-spp-link']/h3"));
		for(WebElement product:allProducts) {
			System.out.println(product.getText());
		}
	}

}
