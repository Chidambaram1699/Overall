package week4Day2Assignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NewOne {
	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions noti=new ChromeOptions();
	 noti.addArguments("--disable-notifications");
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 driver.get("https://www.snapdeal.com/");
	 WebElement mens = driver.findElement(By.xpath("//span[@class='catText']"));
	 Actions builder=new Actions(driver);
	 builder.moveToElement(mens).perform();
	 driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
	 String contOfShos = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	 System.out.println("Total sports shoes ="+contOfShos);
	 driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	 driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
	 driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
	 driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
	 driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900",Keys.ENTER);
	 driver.findElement(By.xpath("//input[@name='toVal']")).clear();
	 driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200",Keys.ENTER);
	 driver.findElement(By.xpath("//a[text()=' Yellow']")).click();
	 
	}
}
//6. Sort by Low to High
//7. Check if the items displayed are sorted correctly
//8.Select the price range (900-1200)
//9.Filter with color yellow
//10 verify the all applied filters 
//11. Mouse Hover on first resulting Training shoes
//12. click QuickView button
//13. Print the cost and the discount percentage
//14. Take the snapshot of the shoes.
//15. Close the current window
//16. Close the main window