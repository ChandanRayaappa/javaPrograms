package com.Ebusniess.PostFreeAdd;

import org.testng.annotations.Test;

import com.ChandanSDET.GeneralUtiliy.BaseClass;
import com.Ebusiness.ObjectRep.HomePage;

public class CreatePostFreeAddTest extends BaseClass {
	
	@Test
	public void postFreeAdTest() {
		hp=new HomePage(driver);
		hp.postFreeadBtn();
	}

}
