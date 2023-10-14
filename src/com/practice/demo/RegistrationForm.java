package com.practice.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://skpatro.github.io/demo/signup/?uname=&datafile=&sgender=select&commit=Submit");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //input[@id='username']")).sendKeys("Mahesh Joshi");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mahesh@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='tel']")).sendKeys("123456");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath(" //input[@id='fax']")).click();
//		driver.findElement(By.xpath(" //input[@id='fax']")).sendKeys("111111");
//		Thread.sleep(3000);
//		 driver.switchTo().alert();
//		driver.findElement(By.xpath(" //input[@name='datafile']")).sendKeys("C:\\Users\\hp\\Sopan.xlsx");
//		Thread.sleep(3000);
	 	
	    WebElement se = driver.findElement(By.xpath("//select[@name='sgender']"));
		Select sl=new Select(se);
		sl.selectByIndex(1);
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//input[@value='one']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[9]//input[1]")).click();
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//option[@value='jmeter']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		String act="Registration Done!";
	if(text.equals(act)) {
		System.out.println("test is passed");
	}else 
	{		System.out.println("test is failed");
    }
	al.accept();
	}
	 
}
