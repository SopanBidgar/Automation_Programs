package com.practice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathusingContainsAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Sopan");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("Sopan");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

		Thread.sleep(3000);

		driver.close();

	}

}
