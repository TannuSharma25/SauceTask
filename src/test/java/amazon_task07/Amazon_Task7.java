package amazon_task07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_Task7 {
	
	WebDriver driver;
	
 @BeforeMethod
  public void setup() {
	  driver=operations.Browser.start("chrome");
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();

  }

//      @Test 
//       public void test(String scenerio )  {
//	    driver.findElement(By.id("nav-hamburger-menu")).click();	
//	    driver.findElement(By.xpath("//ul[@class=\"hmenu hmenu-visible\"]//li//a[contains(.,\"Amazon Prime Video\")]")).click();
//	    driver.findElement(By.linkText("Movies")).click();
//		Reporter.log("The test method executed successfully");
//  }	
@Test
public void test2() {
    driver.findElement(By.id("nav-hamburger-menu")).click();
    driver.findElement(By.xpath("//ul[@class=\"hmenu hmenu-visible\"]//li//a[contains(.,\"Amazon Prime Video\")]")).click();
	driver.findElement(By.linkText("All Videos")).click();
   Reporter.log("The test2 method executed successfully");
}
@AfterMethod
        public void shutdown() {
	    driver.close();
  }
}
