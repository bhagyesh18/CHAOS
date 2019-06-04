import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

public class LoginSelenium {
	 static WebDriver driver;
	 static Wait<WebDriver> wait;
	
	 
	 public static void main(String[] args){
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	        driver.get("http://52.52.140.5/CHAOS/");
	      
	        WebElement usernameelement = driver.findElement(By.name("username"));
	        WebElement passwordelement = driver.findElement(By.name("password"));
	        WebElement loginelement = driver.findElement(By.name("login-submit"));
	        
	        usernameelement.sendKeys("jhon");
	        passwordelement.sendKeys("jhon123");
	        loginelement.submit();
	        
//	        driver.get("http://52.52.140.5/CHAOS/create-category-form");
//	        WebElement nameelement = driver.findElement(By.name("name"));
//	        WebElement descriptiondelement = driver.findElement(By.name("description"));
//	        WebElement submitelement = driver.findElement(By.name("submit"));
//	        
//	        nameelement.sendKeys("name");
//	        descriptiondelement.sendKeys("description");
//		    submitelement.submit();  
//	      
		    driver.get("http://52.52.140.5/CHAOS/placeOrder");
		    Select dropdown = new Select(driver.findElement(By.id("category")));
		    dropdown.selectByIndex(3);
		    WebElement submit = driver.findElement(By.name("submit"));
		    submit.submit();
		    
	        System.out.println("Page title is: " + driver.getTitle() + " "+ driver.getCurrentUrl());
	     //   driver.quit();
	 }
}	
