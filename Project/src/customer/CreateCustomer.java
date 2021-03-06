package customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testbase.TestBase;

public class CreateCustomer extends TestBase {
  @Test
  public void createCustomer() {
	  //System.out.println("Create Customer");
	  driver.findElement(By.id("container_tasks")).click();
	  driver.findElement(By.xpath("//div[text()='Add New']")).click();
	  List<WebElement> menu=driver.findElements(By.xpath("//div[contains(@class,'addNewMenu')]//div"));
	  for(int i=0;i<menu.size();i++)
	  {
		  if(menu.get(i).getText().contains("+ New Customer"))
		  {
			  menu.get(i).click();
		  }
	  }
	  String cust_name=xlib.getData("CreateCust", 1, 0);
	  String desc=xlib.getData("CreateCust", 1, 1);
	  String cec=xlib.getData("CreateCust", 1, 2);
	  driver.findElement(By.xpath("(//input[contains(@placeholder,'Customer Name')])[2]")).sendKeys(cust_name);
	  driver.findElement(By.xpath("//textarea[contains(@placeholder,'Customer Description')]")).sendKeys(desc);
	  driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
	  List<WebElement> existing_cust=driver.findElements(By.xpath("(//div[@class='searchItemList'])[15]//div"));
	  for(int i=0;i<existing_cust.size();i++)
	  {
		  if(existing_cust.get(i).getText().contains(cec))
		  {
			  existing_cust.get(i).click();
		  }
	  }
	  driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	  
  }
}
