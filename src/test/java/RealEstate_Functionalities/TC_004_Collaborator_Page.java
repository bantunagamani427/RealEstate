package RealEstate_Functionalities;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC_004_Collaborator_Page {

	@Test 
	public void productsTest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://realtyxr.metalok.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(2000);
		WebElement   digitalTwin=driver.findElement(By.xpath("//div[@class=\"ktxcLB\"]/../../following-sibling::li[3]"));
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
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scrolling to bottom of the page

		Actions act=new Actions(driver);
	List<WebElement> socialLinks = driver.findElements(By.xpath("//ul[@class=\"mpGTIt\"]"));
	for( WebElement socialLink:socialLinks) {
		act.moveToElement(socialLink).click().build().perform();
		Thread.sleep(2000);
    
	}
	}
}