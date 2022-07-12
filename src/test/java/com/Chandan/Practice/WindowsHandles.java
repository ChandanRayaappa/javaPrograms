package com.Chandan.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandles {
	public static void main(String[] args) throws AWTException {
		Set<String> set=null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Robot r = new Robot();
		for(int i=0;i<8;i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			set=driver.getWindowHandles();

		}
		ArrayList<String> list = new ArrayList<String>();
		for(String data:set) {
			list.add(data);
		}
		String wid9 = list.get(8);



		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String wid = it.next();
			driver.switchTo().window(wid);

			if(wid.equals(wid9)) {
				break;
			}

		}
		driver.get("https://www.facebook.com");
	}
}
