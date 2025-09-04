import org.openqa.selenium.chrome.ChromeDriver;
		import java.time.Duration;
		import java.util.Iterator;
		import java.util.Set;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
		
public class tagnameRealtime {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		 {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			//count no.of links
			System.out.println(driver.findElements(By.tagName("a")).size());
			//count no.of.links in specific section
			WebElement footer = driver.findElement(By.id("gf-BIG"));
			System.out.println(footer.findElements(By.tagName("a")).size());
			//count no.of links in one column
			WebElement firstcol=footer.findElement(By.tagName("ul"));
			int size=firstcol.findElements(By.tagName("a")).size();
			System.out.println(size);
			
			for(int i=1;i<size;i++)
			{
				firstcol.findElements(By.tagName("a")).get(i).click();
				
			}
			driver.quit();
		 
		 
		 }}