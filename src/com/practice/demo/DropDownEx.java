package com.practice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sopan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bidgar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sopanbidgar9@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sopanbidgar9@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sopan@123");
		Thread.sleep(3000);

		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(date);
		s.selectByIndex(15);
		Thread.sleep(3000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select q = new Select(month);
		q.selectByIndex(0);
		Thread.sleep(3000);
	

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select p = new Select(year);

		p.selectByIndex(5);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		Thread.sleep(3000);

		String actualtite = driver.findElement(By.xpath("//h2[contains(text(),'F')]")).getText();
		System.out.println("actual fb title is:" + actualtite);

		String exptitle = "Facebook helps you connect and share with the people in your life.";

		if (actualtite.equals(exptitle) == true) {
			System.out.println("test is passed");
		} else {
			System.out.println("test is failed");
		}
	}

}
