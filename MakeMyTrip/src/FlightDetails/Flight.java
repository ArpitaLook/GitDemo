package FlightDetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flight {
  @Test
  public void oneWay() {
	  System.setProperty("webdriver.chrome.driver", "G:\\DriverInfo\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.makemytrip.com/flights/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//span[contains(@class,'userNameIcon ')]")).click();
	  driver.findElement(By.xpath("//label[text()='Login with Phone/Email']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter email or mobile number']")).sendKeys("cerrikihu-1884@yopmail.com");
	  driver.findElement(By.xpath("//span[text()='Continue']")).click();
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aqwsedrftgyhujikolp12#45");
	  //driver.findElement(By.xpath("//input[@placeholder='From']")).click();
	  
  }
}
