package SampleProject.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new ChromeDriver();
	}
  @Test
  public void Test1() {
     
    driver.get("https://google.com");
    Assert.assertEquals("Google",driver.getTitle());   
  
  }
  
  @Test
  public void Test2() {
	    Assert.assertEquals(true, true);
  }
  
  @Test
  public void Test3() {
	    Assert.assertEquals(true, true);
  }
  
  @AfterMethod
  public void tearDown()
  {
	driver.quit();  
  }
}
