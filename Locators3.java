import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirishi\\Desktop\\Vishnu\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.getTitle());
		 //Absolute xpath
		 //driver.findElement(By.xpath("/html/body/header/a[2]")).click();
		//sibling traverse-clicking sign up
		 System.out.println(driver.findElement(By.xpath("//body/header/div/button[1]/following-sibling::button[1]")).getText());
		 System.out.println(driver.findElement(By.xpath("//body/header/div/button[1]/following-sibling::button[2]")).getText());
		 //child to parent traverse
		 System.out.println(driver.findElement(By.xpath("//body/div[1]/parent::body/header/div/button[1]")).getText());
		 
		 
		
		 Thread.sleep(3000);
		 
		 driver.close();
	
	}

}
