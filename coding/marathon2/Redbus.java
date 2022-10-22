package coding.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions noti=new ChromeOptions();
		noti.addArguments("--diasble-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Chennai",Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Banglore",Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[4]/td[5]")).click();
		Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.id("search_btn"));
		driver.executeScript("arguments[0].click()", click1);
		String nOfBuses = driver.findElement(By.className("f-bold busFound")).getText();
		System.out.println("The number of buses are  "+nOfBuses);
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		String bus2 = driver.findElement(By.xpath("(//div[@class='column-two p-right-10 w-30 fl'])[2]")).getText();
		System.out.println("The second resulting bus is "+bus2);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destin=new File("./snaps/Redbus.png");
		FileUtils.copyFile(source, destin);
		
	}

}

//06) Click Search Buses
//07) Print the number of buses shown as results (104 Buses found)
//08) Choose SLEEPER in the left menu 
//09) Print the name of the second resulting bus 
//10) Click the VIEW SEATS of that bus
//11) Take screenshot and close browser