package com.practice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedEx {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		boolean enabled = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
		System.out.println("it is enabled:"+ enabled);
		
		if(enabled==false) {
			System.out.println("element is clickable");
		}else {
			System.out.println("element is not clickable");
			driver.findElement(By.xpath("//input[@type='text']")).click();
		
				
			
		}
		
		
	}

}
