package week4Day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions noti=new ChromeOptions();
		noti.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> wHs = driver.getWindowHandles();
		List<String> wHs1=new ArrayList<String>(wHs);
		driver.switchTo().window(wHs1.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(wHs1.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> wHs2 = driver.getWindowHandles();
		List<String> wHs3=new ArrayList<String>(wHs2);
		driver.switchTo().window(wHs3.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.switchTo().window(wHs3.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		String title = driver.getTitle();
		if(title.contains("View Contact")) {
			System.out.println("The contacts merged and title is "+title);
		}
		driver.close();
	}

}
