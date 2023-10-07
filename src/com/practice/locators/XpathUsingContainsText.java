package com.practice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContainsText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/minitv?mtv_pt=external&refMarker=AVOD_gs_mw_BRND_EDU_GS_TXT_AD2&gclid=Cj0KCQjwx5qoBhDyARIsAPbMagCeCu_e48zwqHXNe1fmtV4KmEvJImDIlvn3Mk14E2YoPNdpPAEMXjYaAql0EALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=' AppNavbar_navItem___QI5L']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@alt='Aspirants - Season 1 - Watch Free']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//button[@class=' Button_button__PjVhE Button_large__SfptJ Button_primary___XGO6 DescriptionCard_playButton__biyKw']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Aspirants - Season 1 - Watch Free']")).click();
		Thread.sleep(3000);
		

	}

}
