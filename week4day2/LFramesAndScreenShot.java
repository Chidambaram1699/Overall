package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LFramesAndScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println("Alert message :  "+text);
		alert1.accept();
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("The output text \" "+text2+" \"");
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destin = new File("./snaps/Screenshot.png");
		FileUtils.copyFile(source, destin);
		driver.close();
	}

}
