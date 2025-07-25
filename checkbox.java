import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirishi\\Desktop\\Vishnu\\SELENIUM\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("c_bs_1")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("c_bs_1")).isSelected());
				Assert.assertEquals(false, null);
		//System.out.println(driver.findElements((By.className("main_ul"))).size());
		Thread.sleep(3000);
		driver.close();
	}

}
