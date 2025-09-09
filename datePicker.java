import org.openqa.selenium.chrome.ChromeDriver;
		import java.time.Duration;
		import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
		
public class datePicker {

	public static void main(String[] args) throws InterruptedException 
		// TODO Auto-generated method stub
		 {
			String date= "15";
			String month="8";
			String year="2026";
			String[] exp= {month,date,year};
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("button.react-date-picker__calendar-button")).click();
			driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
			driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
			driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
			driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
			//System.out.println(months.size());
			driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();	
			Thread.sleep(4000);
			List<WebElement>dateday=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
			for (int i=0;i<dateday.size();i++)
			{
				System.out.println(dateday.get(i).getAttribute("value"));
				Assert.assertEquals(dateday.get(i).getAttribute("value"),exp[i]);
			}
			driver.close();
			
			
			
			
			
			
		 }
	}