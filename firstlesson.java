import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstlesson {

	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//To run chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirishi\\Desktop\\Vishnu\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//To run firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kirishi\\Desktop\\Vishnu\\SELENIUM\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		// To Run Edge
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Kirishi\\Desktop\\Vishnu\\SELENIUM\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
   	    driver.manage().window().maximize();
		//driver.findElement(By.partialLinkText("Guest mode")).click();
   	    //driver.get("https://www.selenium.dev/selenium/web/web-form.html");
   	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshettyacademy.com");
	    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettacademy");
	    driver.findElement(By.name("chkboxTwo")).click();
	   // cssSelector >>> tagname[attribute='value']
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Vishnu Priya");
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("contact@rahulshettyacademy.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("6380412733");
	       // System.out.print(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    //System.out.println(driver.getTitle());
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.className("go-to-login-btn")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("contact@rahulshettyacademy.com");
	    driver.findElement(By.xpath("//div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
   	    System.out.println(driver.getCurrentUrl());
   	      driver.close();
		
	}

	
}
