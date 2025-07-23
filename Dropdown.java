import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//STATIC
		WebElement currency= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(currency);
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<9)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//DYNAMIC
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"marketCityPair_1\"]/div/div[2] //*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]")).click();
		driver.close();
		
	
	
	
	
	}

}
