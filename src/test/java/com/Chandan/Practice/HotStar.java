package com.Chandan.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotStar {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/list/latest-trending/t-7071_25_2");

		Thread.sleep(2000);
		List<WebElement> movieTitles = driver.findElements(By.xpath("//article/a[@href]"));
		Thread.sleep(2000);
		for(int i=0;i<movieTitles.size();i++) {
			
			WebElement movieName = movieTitles.get(i);
			String names = movieName.getAttribute("to");
			String name = names.replace("/", " ");
			String[] str = name.split(" ");
			String movieNames = str[3].replace("-", " ");
			System.out.println(movieNames);


		}

	}

}
