package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	RemoteWebDriver driver;
	String excelFile;
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void setup(String BROWSER,String URL,String USERNAME,String PASSWORD) {
	if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}else if(BROWSER.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(USERNAME);
	driver.findElement(By.id("password")).sendKeys(PASSWORD);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}
	@DataProvider(name="fetchData")
	public String[][] getdata() throws IOException {
		String[][] readData = ReadExcel.readData(excelFile);
		return readData;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
