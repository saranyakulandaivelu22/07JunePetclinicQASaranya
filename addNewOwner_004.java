package petClinic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class addNewOwner_004 {

	WebDriver driver;
	@Test
	@Parameters({"launch"})
	public void newOwnerPet(String launch) throws InterruptedException {
		// TODO Auto-generated method stub
		//Navigate to find owner tab
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get(launch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@title='find owners']")).click();
		Thread.sleep(3000);
		//click on Add Owner button
		driver.findElement(By.xpath("//a[text()='Add Owner']")).click();
		driver.findElement(By.id("firstName")).sendKeys("SARANYA NEW USER ABUDHABI");
		driver.findElement(By.id("lastName")).sendKeys("KULANDAIVELU ABUDHABI");
		driver.findElement(By.id("address")).sendKeys("A11 LIWA CENTRE,HAMDAN STREET,ABUDHABI");
		driver.findElement(By.id("city")).sendKeys("ABUDHABI");
		driver.findElement(By.id("telephone")).sendKeys("12212112");
		driver.findElement(By.xpath("//button[text()='Add Owner']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'New Pet')]")).click();
		driver.findElement(By.id("name")).sendKeys("PETBIRD");
		driver.findElement(By.id("birthDate")).sendKeys("01/24/2019");
		driver.findElement(By.id("type")).sendKeys("cat");
		driver.findElement(By.xpath("//button[text()='Add Pet']")).click();
	}

}
