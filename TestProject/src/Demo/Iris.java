package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iris {

		public static void main(String[] args) throws InterruptedException {
			//	  System.setProperty("webdriver.chrome.driver", "../art/driversExe/chrome97/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();;

			driver.get("https://osa-web.t-cg.co.uk/");
			
	//		WebElement SchoolSearch = driver.findElement(By.xpath("//p[@data-testid='School SearchCurrentPageTitle']"));
		//	SchoolSearch.click();
			
		//	driver.get("https://osa-web.t-cg.co.uk/schoolSearch");
			Actions action = new Actions(driver);

			WebElement SearchBox = driver.findElement(By.id("main"));
			Thread.sleep(2000);
			
			action.moveToElement(SearchBox).pause(2000).click().sendKeys("B16 8PE").pause(2000).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			
			//try-   //*[contains(text(), 'Contact Group')] and //div[@data-testid='activeIcon']
			//*[@data-testid='activeIcon' and ./strong[contains( . , 'Contact Group')]]
			
			
			WebElement ContactGroupActiveButton = driver.findElement(By.xpath("(//div[@data-testid='activeIcon'])[16]"));
			JavascriptExecutor jse=  (JavascriptExecutor)driver ;
			jse.executeScript("arguments[0].scrollIntoView(true);", ContactGroupActiveButton);			
			Thread.sleep(2000);
		//	ContactGroupActiveButton.scr
			
			action.moveToElement(ContactGroupActiveButton).click().build().perform();
			
			driver.navigate().to("https://osa-web.t-cg.co.uk/qatest");
			
			
			System.out.println("Executed script successfully");
		
						
	
}
}