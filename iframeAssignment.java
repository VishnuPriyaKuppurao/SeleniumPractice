import org.openqa.selenium.chrome.ChromeDriver;
		import java.time.Duration;
		import java.util.Iterator;
		import java.util.Set;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		
public class iframeAssignment {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		 {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Nested Frames")).click();
			driver.switchTo().frame(driver.findElement(By.name("frame-top")));
			//driver.switchTo().frame(
			//driver.switchTo().frame(driver.findElement(By.name("frameset-middle")));
			System.out.println(driver.findElements(By.tagName("frame")).size());
			driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
			System.out.println(driver.findElement(By.id("content")).getText());
			driver.close();

	}}
