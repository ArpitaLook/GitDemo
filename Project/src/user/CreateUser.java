package user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testbase.TestBase;

public class CreateUser extends TestBase {
  @Test
  public void createUser() throws InterruptedException {
	  driver.findElement(By.id("container_users")).click();
	  driver.findElement(By.xpath("//div[text()='New User']")).click();
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("(//input[contains(@id,'firstNameField')])[2]")).sendKeys("Arpita");
	  driver.findElement(By.xpath("(//input[@placeholder='MI'])[2]")).sendKeys("C");
	  driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys("Look");
	  driver.findElement(By.xpath("(//input[contains(@id,'emailField')])[2]")).sendKeys("lookarpu@gmail.com");
	  driver.findElement(By.xpath("(//div[text()='-- department not assigned --'])[1]")).click();
  }
}
