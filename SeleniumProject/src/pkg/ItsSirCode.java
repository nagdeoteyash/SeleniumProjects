package pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItsSirCode 
{
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://dista.ai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement box = driver.findElement(By.xpath("//section[@data-id='473efe5e']"));
		
		List<WebElement> low = box.findElements(By.xpath("//div[@data-id='619cfd44']/div/ul//a"));
		System.out.println("low.size : " + low.size());
		
		
		int cnt = 1;
		for(int i=1;i<=low.size();i++)
		{
			System.out.println(cnt++ + " " + low.get(i).getText());
			String href = low.get(i).getAttribute("href");
			low.get(i).click();
			
			String cUrl = driver.getCurrentUrl();
			System.out.println("url : " + cUrl);
			System.out.println(href);
				
			driver.navigate().back();
			
		}
		
}
}