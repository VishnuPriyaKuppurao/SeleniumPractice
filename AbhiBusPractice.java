	import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.time.Duration;
import java.util.List;

public class AbhiBusPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kirishi\\\\Desktop\\\\Vishnu\\\\SELENIUM\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	

		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // Maximize browser window
		        driver.manage().window().maximize();

		        // Open Redbus website
		        driver.get("https://www.abhibus.com/");

		        // Enter 'From' city
		        WebElement fromInput = driver.findElement(By.cssSelector("input[placeholder='Leaving From']"));
		        fromInput.click();
		        fromInput.sendKeys("Thiruverkadu");
		        Thread.sleep(2000);
		        List<WebElement> fromcity= driver.findElements(By.className("auto-complete-drop-down"));
		        //System.out.println(fromcity.get(0).getText());
		        
		        for(WebElement option : fromcity)
		        {
		        	 
		        	System.out.println(option.getText());
		        	if(option.getText().contains("Thiruverkadu (Chennai)"))
		        		
		        	{
		        		Thread.sleep(1000);
		        		option.click();
		        		break;
		        		
		        	}
		        	
		        }
		       // driver.findElement(By.className("tonalWrap___f5ad04")).click();
		        

		        Thread.sleep(1000); // Wait for dropdown to load
//		        driver.findElement(By.cssSelector(".autoFill>li")).click();
//
//		        // Enter 'To' city
//		        WebElement toInput = driver.findElement(By.id("dest"));
//		        toInput.sendKeys("Bangalore");
//
//		        Thread.sleep(2000);
//		        driver.findElement(By.cssSelector(".autoFill>li")).click();
//
//		        // Click date picker and select a date
//		        driver.findElement(By.id("onward_cal")).click();
//		        driver.findElement(By.cssSelector(".rb-calendar td.current.day")).click(); // Select today's date
//
//		        // Click on Search Buses
//		        driver.findElement(By.id("search_btn")).click();

		        // Optional: Wait and close browser
		        Thread.sleep(5000);
		        driver.quit();
		    }}