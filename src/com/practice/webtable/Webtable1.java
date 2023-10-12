package com.practice.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/hp/Desktop/HTML/webpage4.html");
		driver.manage().window().maximize();
		int a=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println(a);
	
		int b=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		System.out.println(b);
		
		for(int i=2;i<=a;i++) 
		{
			for(int j=1;j<=b;j++)	
			{
				System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+a+"]/th["+b+"]")).getText());
		    }
			System.out.println();

			
	    }
	}

}
