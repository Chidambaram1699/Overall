package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LExpilicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/waits.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //find the element
        WebElement visiblity = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
        visiblity.click();
        //Explicitly wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(visiblity));
        String text = driver.findElement(By.xpath("(//span[text()='I am here'])[1]")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
        WebElement invisi = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
        wait.until(ExpectedConditions.invisibilityOf(invisi));
        String text2 = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
        WebElement click3 = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
        click3.click();
        
        
        
        
        
        
        driver.close();
	}

}
