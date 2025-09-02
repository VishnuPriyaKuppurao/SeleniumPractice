import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		//mouse
//		Actions a = new Actions(driver);
//		WebElement acc= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		a.moveToElement(acc).build().perform();
//		WebElement box=driver.findElement(By.id("twotabsearchtextbox"));
//		a.moveToElement(box).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
//		//windowhandles
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.get("https://rahulshettyacademy.com/documents-request");
		driver.manage().window().maximize();
		driver.findElement(By.className("blinkingText")).click();
		Set<String>win=driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
        String mailid= driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys(mailid);
        Thread.sleep(2000);
        driver.quit();
        
	}

}
