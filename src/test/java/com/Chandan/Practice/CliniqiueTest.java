package com.Chandan.Practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ChandanSDET.GeneralUtiliy.MsExcelUtility;
import com.ChandanSDET.GeneralUtiliy.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CliniqiueTest {
	@Test
	public void cliniquesTest() throws IOException {
		MsExcelUtility excel=new MsExcelUtility();
		excel.openExcel("./src/test/resources/testData.xlsx");
		WebDriverUtility webutil=new WebDriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.clinique.in");
		webutil.explicitlyWait(driver, 10);
		webutil.waitUntilElementVisible(driver.findElement(By.xpath("//a[.='Clinique Minis']")));
		driver.findElement(By.xpath("//a[.='Clinique Minis']")).click();
		webutil.explicitlyWait(driver, 10);
		webutil.waitUntilElementVisible(driver.findElement(By.xpath("//a")));
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		for(WebElement element:elements) {
			System.out.println(element.getText());
		}
	}

}
