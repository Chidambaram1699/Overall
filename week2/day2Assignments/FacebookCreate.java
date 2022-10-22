package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("firstname")).sendKeys("Chidambaram");
		driver.findElement(By.name("lastname")).sendKeys("M D");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Abcdefg@123456");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select tool = new Select(day);
		tool.selectByVisibleText("15");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select tool1 = new Select(month);
		tool1.selectByIndex(2);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select tool2 = new Select(year);
		tool2.selectByVisibleText("1998");
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}
}
