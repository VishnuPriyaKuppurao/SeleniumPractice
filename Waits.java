import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("label.customradio:nth-child(2)")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(2000);
		WebElement dd=driver.findElement(By.cssSelector("select.form-control"));
		Select sel=new Select(dd);
		sel.selectByValue("consult");
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		// Cast driver to JavascriptExecutor
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
			    "Array.from(document.querySelectorAll('*')).forEach(el => {" +
			    "  if (el.innerText && el.innerText.trim() === 'OK') { el.click(); }" +
			    "});"
			);	
		
		List<WebElement>api=driver.findElements(By.cssSelector(".card-footer.btn-info"));
		
		int i=0;
		for(i=0;i>api.size();i++)
		{
			api.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();


		driver.close();
		

	}

}
