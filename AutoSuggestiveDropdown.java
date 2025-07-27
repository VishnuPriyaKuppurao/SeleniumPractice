import org.openqa.selenium.chrome.ChromeDriver;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirishi\\Desktop\\Vishnu\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options= driver.findElements(By.cssSelector("li.ui-menu-item"));
		for (WebElement option : options)
		{
			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase("India"))
				
			{
				option.click();
				break;
			}
			
		}
		//driver.findElement(By.className("ui-state-default ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
		{
			System.out.println("Its disabled");
			//Assert.assertTrue(true);
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
