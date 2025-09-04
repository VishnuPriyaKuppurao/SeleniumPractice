import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

import java.time.Duration;
		import java.util.Iterator;
		import java.util.Set;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
		
public class dynamicValues {

	public static void main(String[] args) throws InterruptedException 
		// TODO Auto-generated method stub
		 {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.findElement(By.id("checkBoxOption3")).click();
			String option=driver.findElement(By.id("checkBoxOption3")).findElement(By.xpath("..")).getText();
			System.out.println(option);
//			.. in XPath means "go to the parent element".
//			Here, the parent of <input> is <label>.
//
//			.getText()
//			→ Gets the visible text inside that <label>.
//			The label contains Option3, so Selenium extracts that.
			WebElement a=driver.findElement(By.id("dropdown-class-example"));
			Select sel=new Select(a);
			sel.selectByVisibleText(option);
			driver.findElement(By.id("name")).sendKeys(option);
			Thread.sleep(2000);
			driver.findElement(By.id("alertbtn")).click();
			String actual= driver.switchTo().alert().getText();
			if (actual.contains(option))
			{
				System.out.println("True");
			}
			Thread.sleep(2000);
			driver.quit();
		 
		 
		 }}