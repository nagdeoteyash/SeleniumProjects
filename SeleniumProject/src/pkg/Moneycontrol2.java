package pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moneycontrol2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(10000);
		WebElement txt=driver.findElement(By.xpath("//div[@id='in_maNSE']/table/tbody/tr[1]/td[1]/a"));
		txt.getText();
		System.out.println(txt);
		
	}

}
