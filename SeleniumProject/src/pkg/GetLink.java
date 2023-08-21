package pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://dista.ai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Fining out the element and giving its size 
		
		//String one="//div[@data-id='619cfd44']/div/ul/li";
		
		WebElement box=driver.findElement(By.xpath("//div[@data-id='619cfd44']/div/ul"));
		List<WebElement> txt= box.findElements(By.xpath("//div[@data-id='619cfd44']/div/ul//a"));
		System.out.println("txt.size : " + txt.size());
		int cnt = 1;
		for(int i=0;i<=txt.size()-1;i++)
		{
			System.out.println(cnt++ + " " + txt.get(i).getText());
			String href = txt.get(i).getAttribute("href");
			System.out.println(href);
		}
		
		
	}

}
