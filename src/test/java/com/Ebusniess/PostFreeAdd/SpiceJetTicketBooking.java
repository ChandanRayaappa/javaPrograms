package com.Ebusniess.PostFreeAdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetTicketBooking {
public static void main(String[]args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com");
	driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
	driver.findElement(By.xpath("//div[.='From']//input")).sendKeys("Bengaluru");
	driver.findElement(By.xpath("//div[.='To']//input")).clear();
	driver.findElement(By.xpath("//div[.='To']//input")).sendKeys("Delhi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='20']")).click();
	driver.findElement(By.xpath("//div[@data-testid='undefined-month-June-2022']//div[.='20']")).click();
	driver.findElement(By.xpath("//div[.='Passengers']")).click();
	//WebElement passangerDropDown = driver.findElement(By.xpath("//div[.='Passengers']"));
	//Select select=new Select(passangerDropDown);
	//List<WebElement> opt = select.getOptions();
	//System.out.println(opt);
	driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
	driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	//List<WebElement> spicemax = driver.findElements(By.xpath("//div[.='Direct']/../../..//div[@data-testid='spicemax-flight-select-radio-button-3']"));
	//TreeSet<String> t = new TreeSet<String>();
   // ArrayList<String> l = new ArrayList<String>();
	/*for(WebElement we:spicemax) {
		we.getSize();
		}*/
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='list-results-section-0']//div[@data-testid='spiceflex-flight-select-radio-button-2']")).click();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@id='list-results-section-1']//div[@data-testid='spicemax-flight-select-radio-button-3+-']")).click();
    //driver.findElement(By.xpath("//div[.='SG 537']/../../../..//div[@data-testid='spicemax-flight-select-radio-button-3']")).click();
	//driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
	Thread.sleep(1000);
   driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("Chandan");
	driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("kumar");
	//WebElement mobileNumberDropDown = driver.findElement(By.xpath("//div[@data-testid='contact-number-country-selection']"));
	//Select select=new Select(mobileNumberDropDown);
	//select.selectByVisibleText("+91");
	driver.findElement(By.xpath("//div[@data-testid='contact-number-country-selection']")).click();
	driver.findElement(By.xpath("//div[@data-testid='contact-number-country-selection']")).sendKeys("+91");
	driver.findElement(By.xpath("//div[@data-testid='contact-number-country-selection']")).click();
	
	driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("7848755641");
	driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("ck@gmail.com");
	driver.findElement(By.xpath("//div[.='I prefer not to receive future communication and newsletter from SpiceJet over text, WhatsApp or e-mail.']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='I am flying as the primary passenger']")).click();
	
	
	
}

}
