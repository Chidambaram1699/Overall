package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod  {
	@BeforeMethod
	public void excelName() {
		excelFile="EditLead";
	}
	@Test(dataProvider="fetchData")
	public void runEditLead(String PHNO,String CMPNYNAME) throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PHNO);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(CMPNYNAME);
		driver.findElement(By.name("submitButton")).click();
		
}
}






