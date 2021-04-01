package testbase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestBase  {
	public WebDriver driver;
	public ExcelLibrary xlib;
	@BeforeClass
	 public void openBrowser() {
		  //System.out.println("Open Browser");
		
		System.setProperty("webdriver.chrome.driver", "G:\\DriverInfo\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
	  }
  
  @BeforeMethod
  public void login() {
	  xlib=new ExcelLibrary();
	  String un= xlib.getData("Login", 1, 0);
	  String pwd=xlib.getData("Login", 1, 1);
	  driver.findElement(By.id("username")).sendKeys(un);
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
  }

  @AfterMethod
  public void logout() {
	 // System.out.println("Logout");
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
  }

 

  @AfterClass
  public void closeBrowser() {
	  //System.out.println("Close Browser");
	  driver.close();
  }
  

}
