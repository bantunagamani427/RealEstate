package RealEstate_Functionalities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_Products {
	@Test 
	public void productsTest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://realtyxr.metalok.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
		Thread.sleep(3000);
	/*
		WebElement bookADemo=driver.findElement(By.xpath("//span[text()=\"Book A Demo\"]"));
		bookADemo.click();
		String singleId=driver.getWindowHandle();
		Set<String> mainId=driver.getWindowHandles();
		for(String windowHandle:mainId) {
			if(!windowHandle.equals(mainId)) {
				driver.switchTo().window(singleId);
				break;
			}
		}		
		WebElement checkAvailability=driver.findElement(By.xpath("//span[text()=\"Check Next Availability\"]"));
		checkAvailability.click();
		Thread.sleep(3000);
		WebElement nextButton=driver.findElement(By.xpath("//span[text()=\"Next\"]"));
		nextButton.click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement name=driver.findElement(By.id("00000000-0000-0000-0000-000000000001-input"));
		act.moveToElement(name).click().build().perform();
		name.sendKeys("Naga for Testing");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.id("00000000-0000-0000-0000-000000000002-input"));
		act.moveToElement(email).click().build().perform();
		email.sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.id("00000000-0000-0000-0000-000000000003-input"));
		act.moveToElement(phone).click().build().perform();
		phone.sendKeys("8897408150");
		WebElement message=driver.findElement(By.id("00000000-0000-0000-0000-000000000008-input"));
		act.moveToElement(message).click().build().perform();
		message.sendKeys("ffyfviouiof6565tghjn87tredfcv");
		Thread.sleep(3000);
		WebElement bookNow=driver.findElement(By.xpath("//span[text()=\"Book Now\"]"));
		bookNow.click();
		
		driver.navigate().back();
		driver.navigate().back();
		*/
	    
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		//1)Interactive Touch Panel
		WebElement  ModelCase=driver.findElement(By.xpath("//span[text()=\"3D Model Showcase\"]"));
		ModelCase.click();
		Thread.sleep(2000);
		
		WebElement Mapping = driver.findElement(By.xpath("//span[text()=\"3D Space Mapping & Amenities\"]"));
		Mapping.click();
		Thread.sleep(2000);
		
		WebElement Mapping_Env=driver.findElement(By.xpath("//span[text()=\"3D Environment Mapping\"]"));
		Mapping_Env.click();
		Thread.sleep(2000);
	
		WebElement RealTime_City=driver.findElement(By.xpath("//span[text()=\"Real Time City View\"]"));
		RealTime_City.click();
		Thread.sleep(2000);
	
		WebElement InteriorSpace=driver.findElement(By.xpath("//span[text()=\"Interior Space experience \"]"));
		InteriorSpace.click();
		Thread.sleep(2000);
	
		WebElement Time_Climate=driver.findElement(By.xpath("//span[text()=\"Time & Climate Simulation\"]"));
		Time_Climate.click();
		Thread.sleep(2000);

		System.out.println("Interactive Touch pannel all modules are clicked");
		
		//2)3D interactive Website
		WebElement interActive = driver.findElement(By.xpath("//span[text()=\"3D Interactive Website\"]"));
		interActive.click();
		Thread.sleep(2000);
		
		WebElement Live_Tour = driver.findElement(By.xpath("//span[text()=\"Live Guided Tour\"]"));
		Live_Tour.click();
		Thread.sleep(2000);
		
		WebElement virtual_Assistant = driver.findElement(By.xpath("//span[text()=\"Virtual Assistant\"]"));
		virtual_Assistant.click();
		Thread.sleep(2000);
		
		WebElement Live_Analytics = driver.findElement(By.xpath("//span[text()=\"Live Analytics of the Tour\"]"));
		Live_Analytics.click();
		Thread.sleep(2000);
		System.out.println("3D Interactive Website all modules are clicked");

		
		//3)Modular Services
		WebElement Modular_Services = driver.findElement(By.xpath("//span[text()=\"Modular Services \"]"));
		Modular_Services.click();
		Thread.sleep(2000);
		
		WebElement Space_Customisers= driver.findElement(By.xpath("//span[text()=\"3D space customisers\"]"));
		Space_Customisers.click();
		Thread.sleep(2000);
		
		WebElement Product_Customisers= driver.findElement(By.xpath("//span[text()=\"3D product customisers\"]"));
		Product_Customisers.click();
		Thread.sleep(2000);
		
		WebElement experiential= driver.findElement(By.xpath("//span[text()=\"Experiential Marketing \"]"));
		experiential.click();
		Thread.sleep(2000);
	
		WebElement exploration= driver.findElement(By.xpath("//span[text()=\"VR Exploration\"]"));
		exploration.click();
		Thread.sleep(2000);
		
		System.out.println("Modular Services all modules are clicked");
		
	    //Checking for Footer social links 
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scrolling to bottom of the page
		
		
	
      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
