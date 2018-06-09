package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ominaodilova/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.ebay.com");
		
		WebDriver driver1= new ChromeDriver();
		driver.get("http://www.google.com");

	}

}

