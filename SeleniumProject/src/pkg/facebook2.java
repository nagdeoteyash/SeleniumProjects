package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook2 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		
		WebElement txt=driver.findElement(By.xpath("//div[@class='separator']/div/div[5]/table/thead/tr[1]/th[2]"));
		txt.getText();
		Thread.sleep(100);
		System.out.println(txt);
		
		
		
	}

}

