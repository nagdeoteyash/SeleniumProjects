package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn extends YourAccount {

	static void Info(WebElement driver, WebDriverWait wait)
	{
		WebElement signin = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='nav-flyout-ya-signin']/a")));
		signin.click();
		
		WebElement Email = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		Email.sendKeys("9680573433");

		WebElement conti = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("continue")));
		conti.click();

		WebElement pwd = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		pwd.sendKeys("Yash@2000");

		WebElement signbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("signInSubmit")));
		signbtn.click();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement login = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
		action.moveToElement(login).build().perform();
		
		//calling all the methods in class yourAccount
		Info(null,wait);
		SignIn g1=new SignIn();
		g1.yourAccount(login, wait,action);
		Thread.sleep(1000l);
		g1.yourAccountContent(login, wait, driver);
		Thread.sleep(1000l);
		g1.DigitalCandD(login, wait, driver,action);
		
		
		
	
	}

}
