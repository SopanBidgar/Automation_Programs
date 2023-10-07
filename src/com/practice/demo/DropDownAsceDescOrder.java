package com.practice.demo;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAsceDescOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(3000);
		WebElement getoption = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select s = new Select(getoption);
	
		List<WebElement> alloptions = s.getOptions();
		
		TreeSet<String> allyear = new TreeSet<String>();
		
		for (WebElement q :alloptions)
		{
			String option = q.getText();
			allyear.add(option);
			
		}
		System.out.println("Ascending order is:");
		for(String aa:allyear) {
			System.out.println(aa);
		}
		System.out.println("Descending order is:");

		Iterator<String> desc = allyear.descendingIterator();
		
		while(desc.hasNext()) {
			System.out.println(desc.next());
		}
	}

}
