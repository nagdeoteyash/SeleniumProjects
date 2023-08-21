package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // wait

		WebElement username = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
		WebElement password = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
		
		WebElement submit = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.tagName("button")));
		submit.click();
		
		
		WebElement pim = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		pim.click();
		
		
		
		
		WebElement add = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-header-container']/button")));
		add.click();
		
	
		WebElement first = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.name("firstName")));
		first.sendKeys("Yash");
		
		WebElement mid = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.name("middleName")));
		mid.sendKeys("nilesh");
		
		
		WebElement last = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.name("lastName")));
		last.sendKeys("Nagdeote");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
	

	}
}
