package com.practice.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.navigate().to("https://www.instagram.com/");

		Thread.sleep(3000);

		String a = driver.getTitle();
		System.out.println("your current title is:" + a);

		Thread.sleep(3000);

		String s = driver.getCurrentUrl();
		System.out.println("your current URL is:" + s);

		Thread.sleep(3000);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.manage().window().minimize();

		Thread.sleep(3000);

		driver.manage().window().fullscreen();

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(3000);

		Dimension p = new Dimension(500, 800);
		driver.manage().window().setSize(p);
		Thread.sleep(3000);

		Point w = new Point(200, 100);
		driver.manage().window().setPosition(w);
		Thread.sleep(3000);

		driver.close();

	}

}
