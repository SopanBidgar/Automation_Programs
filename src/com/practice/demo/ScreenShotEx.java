package com.practice.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEx {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sopan@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sopan123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);

		File destination = new File("C:\\Users\\hp\\Desktop\\Automation Testing\\ScreenShot\\Demo.png");
		Thread.sleep(3000);

		FileHandler.copy(src, destination);
		Thread.sleep(3000);

	}

}
