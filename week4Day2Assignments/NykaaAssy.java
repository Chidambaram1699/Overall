package week4Day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaAssy {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions noti=new ChromeOptions();
		noti.addArguments("--diable-notifications");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.nykaa.com/");
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Thread.sleep(1000);
		Actions builder=new Actions(driver);
		Thread.sleep(1000);
		builder.moveToElement(brands).perform();
		Thread.sleep(1000);
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(1000);
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		Thread.sleep(1000);
		if(title.contains("L'Oreal Paris")) {
			System.out.println("Title verified  : "+title);
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='control control-checkbox'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(1000);
		List<WebElement> filtraply = driver.findElements(By.xpath("//span[@class='filter-value']"));
		for(WebElement i : filtraply) {
			String text = i.getText();
			if((text.contains("Shampoo"))||(text.contains("Color Protection"))) {
				System.out.println(text+" Filter applied ");
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		Thread.sleep(1000);
		Set<String> wH1 = driver.getWindowHandles();
		List<String> wh1=new ArrayList<String>(wH1);
		Thread.sleep(1000);
		driver.switchTo().window(wh1.get(1));
		WebElement drpdwn = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select d1=new Select(drpdwn);
		d1.selectByVisibleText("175ml");
		String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("product price = "+price);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(3000);
		WebElement frm = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		Thread.sleep(1000);
		driver.switchTo().frame(frm);
		Thread.sleep(1000);
		String grndpric = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
		System.out.println("Grand total = "+grndpric);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn full big']")).click();
		Thread.sleep(1000);
		String grndprice = driver.findElement(By.xpath("(//div[text()='Grand Total'])/following-sibling::div")).getText();
		//System.out.println(grndprice);
		if(grndpric.equals(grndprice)) {
			System.out.println("Both the price are same");
		}
		
		driver.quit();
	}

}