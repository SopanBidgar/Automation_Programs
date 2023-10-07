package com.practice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours//");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);

		String exptitle = "Login: Mercury Tours";
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		driver.close();

		if (exptitle.equals(acttitle) == true) {
			System.out.println("test is passed");
		} else {
			System.out.println("test is failed");

		}
	}
}
