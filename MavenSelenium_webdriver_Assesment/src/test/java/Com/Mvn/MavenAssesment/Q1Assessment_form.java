package Com.Mvn.MavenAssesment;
/*
 * ) URL : https://demoqa.com/automation-practice-form
Task 1 : Write script to fill this form using selenium webdriver.
Task 2 : Write script to take screenshot of filled form
Note : Use Xpath , keyboard event and mouse event
 * 
 * 
 * 
 */



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1Assessment_form {
	
		
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("  https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		 Thread.sleep(2000);
		  
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.findElement(By.id("firstName")).sendKeys("kalpesh");
		 Thread.sleep(1000);
		 driver.findElement(By.id("lastName")).sendKeys("saindane");
		 Thread.sleep(1000);
		 driver.findElement(By.id("userEmail")).sendKeys("kalpeshsaindane319@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		 Thread.sleep(1000);
		 JavascriptExecutor up=(JavascriptExecutor)driver;
		 up.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(1000);
		 driver.findElement(By.id("userNumber")).sendKeys("7878787878");
		 Thread.sleep(1000);
		 driver.findElement(By.id("dateOfBirthInput")).click();
		 Thread.sleep(1000);

		 WebElement WE1= driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
		 WebElement WE2= driver.findElement(By.cssSelector("select.react-datepicker__year-select"));
		 Select s1= new Select(WE1);
		 Select S2= new Select(WE2);
		 s1.selectByVisibleText("February");
		 S2.selectByValue("1996");
		 Thread.sleep(2000);

		 WebElement WE3= driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]"));
		 Actions A = new Actions(driver);
		 A.moveToElement(WE3).click().perform();

		 driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
		 Thread.sleep(1000);

		 WebElement WE4=	driver.findElement(By.id("hobbies-checkbox-1"));
		 A.moveToElement(WE4).click().build().perform();
		 Thread.sleep(1000);
		 WebElement WE5=	driver.findElement(By.id("hobbies-checkbox-3"));
		 A.moveToElement(WE5).click().build().perform();
		 Thread.sleep(1000);


		 driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\kalpesh\\Downloads\\Image.jpg"); //for uploading file
		 //A.moveToElement(WE5).click().build().perform();
		 Thread.sleep(1000);
		 driver.findElement(By.id("currentAddress")).sendKeys("Surat, Gujrat");
		 Thread.sleep(1000);
		 File F1= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(F1, new File("C:\\Users\\kalpesh\\Screenshot\\DemoQAForm.png"));

		 driver.quit();
		 	
		 }
		 }


			
