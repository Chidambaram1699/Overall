package coding.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions noti=new ChromeOptions();
		noti.addArguments("--diasble-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		Thread.sleep(3000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		for(WebElement i : autosugg) {
			if (i.getText().contains("for boys")) {
					i.click();
					break;
			}
}
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		int a =Integer.parseInt((text.substring(13, 19)).replaceAll("\\D", ""));
		System.out.println(a);
		driver.findElement(By.xpath("//span[text()='American Tourister']/preceding-sibling::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Generic']/preceding-sibling::div")).click();
		Thread.sleep(1000);
		String text1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		int b =Integer.parseInt((text1.substring(13, 19)).replaceAll("\\D", ""));
		System.out.println(b);
		if(a>b) {
			System.out.println("Filters applied");
		}
		driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement nam = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]"));
		System.out.println(nam.getText());
		nam.click();
		Thread.sleep(3000);
		Set<String> wH = driver.getWindowHandles();
		List<String> wH1=new ArrayList<String>(wH);
		driver.switchTo().window(wH1.get(1));
		Thread.sleep(3000);
		String pric = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']")).getText();
		System.out.println(pric);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destin =new File("./snaps/amazon.png");
		FileUtils.copyFile(source, destin);
		driver.close();
	}

}