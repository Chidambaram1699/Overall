package week2.session;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPrice{

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for mens");
	driver.findElement(By.id("nav-search-submit-button")).click();
	String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
	System.out.println(text);
	}

}
