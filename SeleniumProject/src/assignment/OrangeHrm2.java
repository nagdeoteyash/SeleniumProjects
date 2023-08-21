package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm2 {

	void UserNamePassword(WebDriverWait wait) {
		
		WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		username.sendKeys("Admin");

		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		password.sendKeys("admin123");

		WebElement submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));
		submit.click();

	}

	void pim(WebDriverWait wait) {
		WebElement pim = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		pim.click();
	}

	static void AddName(WebDriverWait wait, WebDriver driver) {
		WebElement add = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-header-container']/button")));
		add.click();

		WebElement first = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
		first.sendKeys("yash_" + System.currentTimeMillis());

		WebElement mid = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("middleName")));
		mid.sendKeys("nilesh_"+System.currentTimeMillis());
		
		WebElement last = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastName")));
		last.sendKeys("Nagdeote"+System.currentTimeMillis());
		
	}
	void click(WebDriver driver)
	{
		WebElement addn = driver.findElement(By.xpath("//button[@type='submit']"));
		addn.click();

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //wait
		OrangeHrm2 test = new OrangeHrm2();
		Thread.sleep(1000l);
		test.UserNamePassword(wait);
		
		for (int i = 0; i < 3; i++)
		{
			test.pim(wait);
			AddName(wait, driver);
			Thread.sleep(1000l);
			test.click(driver);
			
		}

	}
}
