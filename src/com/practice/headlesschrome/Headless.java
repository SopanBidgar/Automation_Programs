package com.practice.headlesschrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

		//ChromeOptions options = new ChromeOptions();
		// options.setHeadless(true);
		//options.addArguments("--headless");
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		String s = driver.getTitle();
		System.out.println("Current title is: " + s);
		String q = driver.getCurrentUrl();
		System.out.println("Current url is: " + q);
	}

}
