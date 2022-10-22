package week3.day2Assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioBagsList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		List<WebElement> lstOfBags = driver.findElements(By.xpath("//div[@class='nameCls']"));	
		Thread.sleep(5000);
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The count of bags is "+count);
		Thread.sleep(5000);
		System.out.println("The list of Brands :");
		List<WebElement> lstOfBrands =  driver.findElements(By.xpath("//div[@class='brand']"));
		for(WebElement i : lstOfBrands) {
		String text = i.getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
		System.out.println("The list of bags :");
		for(WebElement j : lstOfBags) {
			String text1 = j.getText();
		System.out.println(text1);
		}
		driver.close();
	}

}
