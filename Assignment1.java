import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Riyanth");
		driver.findElement(By.name("email")).sendKeys("vishnup@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(2000);
		WebElement ss= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dd=new Select(ss);
		dd.selectByVisibleText("Female");
		Thread.sleep(2000);
		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("bday")).click();
		driver.findElement(By.name("bday")).sendKeys("11081998");
		Thread.sleep(2000);
		driver.findElement(By.className("btn-success")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("alert-success")).getText());
		driver.close();
		
		
		
	}
		
		

	}

