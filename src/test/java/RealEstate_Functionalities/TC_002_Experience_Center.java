package RealEstate_Functionalities;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC_002_Experience_Center {
	@Test
	public void experienceTest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://realtyxr.metalok.io/products");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		
//	    WebElement experienceCenter=driver.findElement(By.xpath("//p[text()=\"Experience Centre\"]"));
//		experienceCenter.click();		
		
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
		//3)Verify that page heading is correct or not
		String expectedPageHeading="Products  Experience Center  Digital Twin  Collaborator Advantages  About  Contact";
		WebElement pageHeading=driver.findElement(By.id("comp-kpmn9sqkitemsContainer"));
		String actualPageHeading=pageHeading.getText();
		System.out.println("Expected page heading:  "+expectedPageHeading);
		System.out.println("actual Page Heading: "+actualPageHeading);
		if(expectedPageHeading.contains(actualPageHeading)) {
			System.out.println("page heading is verified");
		}
		else {
			System.out.println("Page heading is not verified");
		}
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100);");
		Thread.sleep(2000);

		List<WebElement> allImges = driver.findElements(By.xpath("//div[@class=\"item-hover-flex-container\"]"));
	// //div[@class=\"gallery-item-hover-inner\"]
		
		System.out.println("Number of Images: "+allImges.size());
		for(WebElement eachImage:allImges) {
		eachImage.click();		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		WebElement closeButton=driver.findElement(By.xpath("//button[@aria-label=\"Exit expand mode\"]"));
		closeButton.click();
		jse.executeScript("window.scrollBy(0,50);");
		try {
            Thread.sleep(2000);        
        } catch (InterruptedException e) {
            e.printStackTrace();
        }	
	}	
		driver.close();
	}
}
