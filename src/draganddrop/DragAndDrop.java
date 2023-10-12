package draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://skpatro.github.io/demo/dragndrop/");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement to = driver.findElement(By.xpath(" //div[@id='droppable']"));
		Thread.sleep(3000);

		Actions a=new Actions(driver);
		
		a.dragAndDrop(from, to).perform();
		Thread.sleep(3000);

	}

}
