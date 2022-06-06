package petClinic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class findVeterinarians_002 {
@Test
@Parameters({"launch"})
	public  void runAllveteri(String launch) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get(launch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@title='veterinarians']")).click();
		int sizeVeterin = driver.findElements(By.xpath("//table[@id='vets']//tr/td")).size();
		System.out.println(sizeVeterin);
		
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < sizeVeterin; i=i+2) {
			
			List<WebElement> displayVeterin = driver.findElements(By.xpath("(//table[@id='vets']//tr/td)["+ i+"]"));
			
			//driver.findElements(By.xpath("//table[@id='vets']//tr/td"))
		}
		
		//(//table[@id='vets']//tr/td)[5]
	}

}
