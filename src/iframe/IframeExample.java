package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		// switch focus to Iframe
		// driver.switchTo().frame("iframeResult"); //String iframe id
		// driver.switchTo().frame("iframeResult"); //String iframe name
		// driver.switchTo().frame(0); //String iframe index
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

		Thread.sleep(2000);

		// Click on the click me button present on the iframe
		driver.findElement(By.xpath("//button[@type='button']")).click();

		Thread.sleep(2000);

		// To switch the focus from iframe to main page
		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		// Click on the Run button present on the main page
		driver.findElement(By.xpath("//button[@id='runbtn']")).click();

		Thread.sleep(2000);

		driver.close();

	}

}
