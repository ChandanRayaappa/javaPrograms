package com.Chandan.Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripCity {
	@Test(dataProvider ="getMultipleDataFromExcel")
	public void test(String from,String To ) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.makemytrip.com/");
	     driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	     driver.findElement(By.id("fromCity")).click();
	     driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(from);
	     Thread.sleep(2000);
	     driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
	     driver.findElement(By.xpath("//span[.='To']")).click();
	     driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(To);
	     Thread.sleep(2000);
	     driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
	     driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
	     
	     
	}
	@DataProvider
	public  Object[][] getMultipleDataFromExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fisExcel= new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		Sheet sh = wb.getSheet("makemyTrip");
			
			Object[][] arr=new Object[sh.getLastRowNum()+1][sh.getRow(0).getLastCellNum()];
			
			for(int i=0;i<=sh.getLastRowNum();i++) {
				
				for(int  j=0;j<sh.getRow(i).getLastCellNum();j++) {
					 
					
					
					arr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				}
			}
			return arr;
		}

}
