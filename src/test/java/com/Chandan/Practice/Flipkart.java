package com.Chandan.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("flipkart");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		//List<WebElement> ele1 = ele;
		for( WebElement data:ele) {
			String ck = data.getAttribute("href");
			String text = data.getText();
		for(int i=0;i<ele.size();i++) {
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(ck);
		}
		}
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/testData.xlsx");
			wb.write(fos);
			wb.close();
			
				
		driver.close();
	}

}
