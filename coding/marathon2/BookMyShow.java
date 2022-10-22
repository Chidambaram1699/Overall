package coding.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions noti=new ChromeOptions();
		noti.addArguments("--diasble-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		String url = driver.getCurrentUrl();
		if(url.contains("hyderabad")) {
			System.out.println("The url has loaded with 'hydrabad'");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Search for Movies')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Movies')]")).sendKeys("Ponniyin Selvan");
		driver.findElement(By.xpath("//span[@class='sc-hdPSEv kzaUOq']")).click();
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='2D'])[2]")).click();
		String thename = driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
		System.out.println("Thearter name is "+thename);
		Thread.sleep(5000);
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("//div[@class='info-section']")).click();
		List<WebElement> thFaclty = driver.findElements(By.className("facility-text"));
		for(WebElement i:thFaclty) {
			if(i.getText().contains("Parking")) {
				System.out.println("Yes the thearter has parking facility");
			break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.className("cross-container")).click();
		List<WebElement> grentim = driver.findElements(By.xpath("//div[@class='__details']"));
		for(WebElement j : grentim) {
//			System.out.println(j.getCssValue("color"));
			if(j.getCssValue("color").contains("rgba(74, 189, 93, 1)")){
				j.click();
				break;
			}
		}
		driver.findElement(By.id("btnPopupAccept")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Select Seats')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='_available'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='btnSTotal_reserve']")).click();
		Thread.sleep(10000);
		String stt = driver.findElement(By.id("subTT")).getText();
		System.out.println("The sub total is "+stt);
		Thread.sleep(1000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destin =new File("./snaps/BookMyShow.png");
		FileUtils.copyFile(source, destin);
		driver.close();
	}
}

//13) Choose 1 Seat and Click Select Seats
//14) Choose any available ticket and Click Pay
//15) Print the sub total
//16) Take screenshot and close browser