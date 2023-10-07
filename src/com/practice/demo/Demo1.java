package com.practice.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		String exptitle = "Google";
		if (title.equalsIgnoreCase(exptitle) == true) {
			System.out.println("navigated to correct page");
		} else {
			System.out.println("navigated to wrong page");
		}

		String s = driver.getCurrentUrl();
		System.out.println("current url is:" + s);

		driver.manage().window().maximize();
		driver.close();
		
		
		if(title.equals(exptitle)) {
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");

		}
	}

}
