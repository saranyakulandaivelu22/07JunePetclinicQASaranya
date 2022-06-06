package petClinic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class imageValidation_01 {
	
	WebDriver driver;
	@Test
	@Parameters({"launch"})
	public  void runImageValidate(String launch) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get(launch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		boolean imagVerify = driver.findElement(By.xpath("//img[@src='/resources/images/pets.png']")).isDisplayed();
		
	if(imagVerify) {
		System.out.println("IS DISPLAYED");
	}
	else
		System.out.println("IS NOT DISPLAYED");
	}
		


	}
