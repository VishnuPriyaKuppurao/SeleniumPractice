import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class tableHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Scroll down
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//Scroll up
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		List<WebElement>rows=driver.findElement(By.xpath("//table[@id='product']/tbody")).findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=2;i<rows.size();i++)
		{
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			System.out.println(columns.size());
			for (int j=0;j<columns.size();j++)
			{
				if(i==2)
					{
						System.out.println(columns.get(j).getText());
						
					}	
			}		
			break;
		}
		//System.out.println("fine");
		
		driver.close();

	}

}
