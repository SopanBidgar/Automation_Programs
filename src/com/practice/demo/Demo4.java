package com.practice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']/div[@class='orangehrm-login-container']/div[@class='orangehrm-login-slot-wrapper']/div[@class='orangehrm-login-slot']/div[@class='orangehrm-login-form']/form[@class='oxd-form']/div[@class='oxd-form-actions orangehrm-login-action']/button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-navigation']/aside[@class='oxd-sidepanel']/nav[@class='oxd-navbar-nav']/div[@class='oxd-sidepanel-body']/ul[@class='oxd-main-menu']/li[@class='oxd-main-menu-item-wrapper'][1]/a[@class='oxd-main-menu-item active']/span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-navigation']/header[@class='oxd-topbar']/div[@class='oxd-topbar-header']/div[@class='oxd-topbar-header-title']/span[@class='oxd-topbar-header-breadcrumb']/h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']")).click();

		
	}

}
