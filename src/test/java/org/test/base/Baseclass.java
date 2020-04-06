package org.test.base;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	
		public static void lanchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Baseclass\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		screenshot();
		 
	}
		
		
		public static void loadurl(String url ) {
			driver.get(url);
			screenshot();
			}
		public static void type(WebElement element,String value) {
			
		element.sendKeys(value);
		screenshot();
			
		}
		public static void login(WebElement element) {
			element.click();
			screenshot();
			
			
		}
		public static String generateRandomData() {
			
			return new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss").format(new Date()) ;
		}
		public static void screenshot() {
			File s=((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
			File d=new File("C:\\Users\\DELL\\eclipse-workspace\\Juint\\screenshot"
			+ generateRandomData() +".png");
			try {
				FileUtils.copyFile(s, d);
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
		public static void closebrowser() {
			driver.close();
			
		}
		
	}
	
	
		
	
		
	 


