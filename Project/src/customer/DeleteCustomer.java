package customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testbase.TestBase;

public class DeleteCustomer extends TestBase{
  @Test
  public void deleteCustomer() {
	  //System.out.println("Delete Customer");
	  driver.findElement(By.id("container_tasks")).click();
	  String del_name=xlib.getData("DeleteCust", 1, 0);
	  driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(del_name);
	  List<WebElement> cust_names=driver.findElements(By.xpath("(//div[@class='itemsContainer'])[2]//div[@class='text']//span"));
	  for(int i=0;i<cust_names.size();i++)
	  {
		  if(cust_names.get(i).getText().contains(del_name))
		  {
			  System.out.println(cust_names.get(i).getText());
			  cust_names.get(i).click();
			  break;
		  }
	  }
	  driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']//div[@class='editButton']")).click();
	  driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
	  driver.findElement(By.xpath("(//div[@class='deleteButton'])[1]")).click();
	  driver.findElement(By.xpath("//div[@class='buttonIcon']//span[text()='Delete permanently']")).click();
  }
}
