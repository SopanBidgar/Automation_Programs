package com.practice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(3000);

	    driver.switchTo().alert();
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\hp\\Desktop\\Intro.txt");
		Thread.sleep(3000);

	}

}
