package pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(10001);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1001);
		//firstname
		WebElement txt =driver.findElement(By.xpath("//input[@name='firstname']"));
		txt.sendKeys("yash");
		Thread.sleep(1001);
		
		//lastname
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("nagdeote");
		Thread.sleep(1001);
		
		//number
		WebElement num=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		num.sendKeys("1234567899");
		Thread.sleep(1001);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("yash123");
		Thread.sleep(1001);
		
		WebElement B_day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		B_day.findElement(By.xpath("//select[1]/option[@value='21']")).click();
		Thread.sleep(1001);
		
		WebElement B_mon=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		B_mon.findElement(By.xpath("//select[2]/option[@value='5']")).click();
		Thread.sleep(1001);
		
		WebElement B_year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		B_year.findElement(By.xpath("//select[3]/option[@value='2000']")).click();
		Thread.sleep(1001);
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		Thread.sleep(1001);
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		Thread.sleep(1001);
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).click();
		Thread.sleep(1001);
		
		WebElement custom=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		custom.findElement(By.xpath("//select[@name='preferred_pronoun']/option[@value='1']")).click();
		Thread.sleep(1001);
		custom.findElement(By.xpath("//select[@name='preferred_pronoun']/option[@value='2']")).click();
		Thread.sleep(1001);
		custom.findElement(By.xpath("//select[@name='preferred_pronoun']/option[@value='6']")).click();
		Thread.sleep(1001);
		
		driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("male");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
