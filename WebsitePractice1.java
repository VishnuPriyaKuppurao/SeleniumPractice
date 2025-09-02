import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsitePractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("cart-icon")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		driver.findElement(By.cssSelector("div.action-block")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
	
	
	}

}
