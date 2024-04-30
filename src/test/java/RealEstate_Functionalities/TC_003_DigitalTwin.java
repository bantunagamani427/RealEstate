package RealEstate_Functionalities;

import java.time.Duration;
//import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003_DigitalTwin {
	@Test 
	public void productsTest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://realtyxr.metalok.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(2000);
		WebElement   digitalTwin=driver.findElement(By.xpath("//p[@class=\"JghqhY\"]/../../../../following-sibling::li[2]"));
		digitalTwin.click();
		Thread.sleep(2000);
		//1)Verify that page Title is correct
		String expectedTitle="Home | Metalok";
		String actualTitle=driver.getTitle();
		System.out.println("Expected Title is : "+expectedTitle);
		System.out.println("Actual Title is : "+actualTitle);
		if(expectedTitle.contains(actualTitle)) {
			System.out.println("Page title is verified");
		}
		else {
			System.out.println("Page Title is not verified");
		}
		//2) Verify that page is secure and uses HTTPS encryption
		String currentUrl=driver.getCurrentUrl();
		if(currentUrl.contains("https://")) {
			System.out.println("page is secure");
		}
		else {
			System.out.println("page is insecure");
		}
		Actions act=new Actions(driver);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,3500);");	
		WebElement frames=driver.findElement(By.xpath("//iframe[@class=\"nKphmK\"]"));
		//1st we need to identify the page is how many frames and 
		//capture that element and then switch to that frame
	
		driver.switchTo().frame(frames);	
		List<WebElement> Faqs = driver.findElements(By.xpath("//div[@class=\"sANTb5l\"]"));
		for(WebElement Faq:Faqs) {
		//	Faq.click();
			act.moveToElement(Faq).contextClick().build().perform();
			Thread.sleep(2000);	
		}		
		driver.quit();
	}
}