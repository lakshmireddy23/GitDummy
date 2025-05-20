package rama.sita;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataP {
	
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test(dataProvider="dp")
	void testlogin(String email,String pwd) throws InterruptedException {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("")).isDisplayed();
		
		if (status = true) {
			
			
		}
	}
	
	
	
	
	@DataProvider(name="dp")
	Object[][] loginData() {
		Object data[][]= {
				{
					"fdfgfdg@gmail.com", "jfhjdsf"
				},
				{
					"fdfgfdg@gmail.com", "jfhjdsf"
				},
				{
					"fdfgfdg@gmail.com", "jfhjdsf"
				},
				{
					"motukatla.rdx0248@gmail.com", "Qwertyyou@23"
				}
		};  return data;
	}
		


}
