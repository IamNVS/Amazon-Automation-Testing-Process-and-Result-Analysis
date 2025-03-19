package pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestAutomaction {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		// Validate Navigation Menu
		if (driver.findElement(By.id("nav-main")).isDisplayed()) {
			System.out.println("Navigation menu is visible.");
			} 
		else {
			System.out.println("Navigation menu is missing.");
			}
				
		// Verify Categories Dropdown
		driver.findElement(By.id("nav-hamburger-menu")).click();
		if (driver.findElement(By.xpath("//div[contains(text(),'Shop by Category')]")).isDisplayed()) {
			System.out.println("Categories dropdown is accessible.");
			} 
		else {
		    System.out.println("Categories dropdown is missing.");
			}
		driver.findElement(By.id("hmenu-close-button")).click();
						
	
		
//		Searching 1st item
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Le")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator win = handler.iterator();
		String parentchild = (String) win.next();
		String childid = (String) win.next();

//		Adding 1st item				
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[normalize-space()='See all photos']")).click();
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']")).click();
		driver.findElement(By.xpath("//div[@id='inline-twister-row-color_name']//li[2]//span[1]//span[1]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")).click();
		driver.close();
		
//		searching 2nd item
		driver.switchTo().window(parentchild);
		driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Airpods");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple AirPods 4 Wireless Earbuds, Bluetooth Headphones, with Active Noise Cancellation, Adaptive Aud")).click();
		driver.close();
		
		
		Set<String> handler2 = driver.getWindowHandles();
		Iterator win2 = handler.iterator();
		String parentchild2 = (String) win.next();
		String childid2 = (String) win.next();
		
//		Adding 2nd item
		driver.switchTo().window(childid2);
		driver.findElement(By.xpath("//a[normalize-space()='See all photos']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close Button']//i[@class='a-icon a-icon-close']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.id("nav-cart")).click();
		
//		Login Amazon account
		driver.findElement(By.xpath("//span[contains(text(),'Sign in to your account')]")).click();
		driver.findElement(By.id("ap_email_login"));
		element.sendKeys("xyz@xyz.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@value='email']")).click();

//		Login to amazon account(OTP)
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("cvf-input-code"));
		element.sendKeys("1234");
		driver.findElement(By.xpath("//input[@aria-label='Verify OTP Button']")).click();
		
		driver.close();		
		
	}

}
