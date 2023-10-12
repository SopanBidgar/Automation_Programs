package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
            
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://skpatro.github.io/demo/alerts/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		
		
		String actual = al.getText();
		System.out.println(actual);
		String expe="Have a nice day!!!";
		if(actual.equals(expe)) {
			System.out.println("test has been passed");
		}
		else {
			System.out.println("test has been failed");

		}
		al.accept();
	}

}
