package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://skpatro.github.io/demo/links/\r\n");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@name='NewWindow']")).click();
		Thread.sleep(3000);
		
		
		Set<String> handle = driver.getWindowHandles();

		ArrayList<String> al=new ArrayList<String> (handle);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		driver.switchTo().window(al.get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();
		Thread.sleep(3000);

		driver.close();
		
		driver.switchTo().window(al.get(0));
		Thread.sleep(3000);

		driver.findElement(By.xpath(" //input[@name='NewTab']")).click();
		Thread.sleep(3000);
		
		
	}

}