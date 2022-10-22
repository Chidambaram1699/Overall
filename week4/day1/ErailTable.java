package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailTable {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions notifi =new ChromeOptions();
	notifi.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://erail.in/");
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.TAB);
	driver.findElement(By.id("txtStationTo")).clear();
	driver.findElement(By.id("txtStationTo")).sendKeys("mdu",Keys.TAB);
	driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	List<WebElement> lstOfTrains = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr/td[2]"));
	List<String> wEle= new ArrayList<String>();	
	for(int i= 0 ; i<lstOfTrains.size();i++) {
		wEle.add(lstOfTrains.get(i).getText());
		//System.out.println(lstOfTrains.get(i).getText());
	}
	Set<String> dup=new HashSet<String>(wEle);
	System.out.println(wEle.size()+" "+dup.size());
	if(wEle.size()==dup.size()) {
		System.out.println("No Duplicates");
	}else {
		System.out.println("Duplicates Present");
	}
	driver.close();
	}

}
