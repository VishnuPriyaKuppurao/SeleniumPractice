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
import org.testng.Assert;



public class locatorstwo {

	
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
		String name="contact@rahulshettyacademy.com";
   	    driver.manage().window().maximize();
   	 String pass= password(driver);
		//driver.findElement(By.partialLinkText("Guest mode")).click();
   	    //driver.get("https://www.selenium.dev/selenium/web/web-form.html");
   	     driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys(name);
	    driver.findElement(By.name("inputPassword")).sendKeys(pass);
	   
	    driver.findElement(By.name("chkboxTwo")).click();
	   // cssSelector >>> tagname[attribute='value']
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
   	    System.out.println(driver.getCurrentUrl());
   	    String msg= driver.findElement(By.tagName("p")).getText();
   	    
   	 System.out.println(msg);
     Assert.assertEquals(msg,"You are successfully logged in.");
     Thread.sleep(2000);
     
     Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText(), "Hello "+name+",");
   	 //new xpath -->> //tagname[text[]="actual text"]
     driver.findElement(By.xpath("//button[text()='Log Out']")).click()   ;
     driver.close();
		
	}

	public static String password(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		    //System.out.println(driver.getTitle());
		    String pass= driver.findElement(By.cssSelector("form p")).getText();
		    String[] password1= pass.split("'");
		    String[] password2= password1[1].split("'");
		    return password2[0];
		   
	}
}
