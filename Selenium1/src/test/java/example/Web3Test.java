package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web3Test {
  @Test
  public void f() throws InterruptedException {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhasw\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1 = new ChromeDriver();
	  
	  d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account%22);");
	  
	  d1.findElement(By.xpath("//a[@class='sf-with-ul'][normalize-space()='Women']")).click();
	  
	 d1.findElement(By.cssSelector(".replace-2x[src='http://automationpractice.com/img/c/4-medium_default.jpg']")).click();
	 
	
	 
	 d1.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']//img[@title='Faded Short Sleeve T-shirts']")).click();
	 
	 d1.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
	   }
}
