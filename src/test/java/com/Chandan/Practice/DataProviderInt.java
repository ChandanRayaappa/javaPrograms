package com.Chandan.Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInt {
		@Test(dataProvider = "loginData")
		
		public void practiceTest(int userName,int password) {
			Reporter.log(userName+" -->"+password,true);
			
		}
		
		@DataProvider
		public Object[][] loginData() throws IOException{
			FileInputStream fisExcel= new FileInputStream("./src/test/resources/testData.xlsx");
			Workbook wb = WorkbookFactory.create(fisExcel);
			Sheet sh = wb.getSheet("Date");
				
				Object[][] arr=new Object[sh.getLastRowNum()+1][sh.getRow(0).getLastCellNum()];
				
				for(int i=0;i<=sh.getLastRowNum();i++) {
					Row row = sh.getRow(i);
					for(int  j=0;j<sh.getRow(i).getLastCellNum();j++) {
						
						
						
						arr[i][j]=(int)row.getCell(j).getNumericCellValue();
					}
				}
				return arr;
			}


	}



