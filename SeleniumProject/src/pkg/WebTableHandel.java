package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandel {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		//String xpath1="//tbody/tr[";
		//String xpath2="]/td[";
		//String xpath3="]\"";
		
		
		String txt=" ";
		for (int i=1;i<=4;i++)
		{
			for (int j=2;j<=4;i++)
			{
				txt =driver.findElement(By.xpath("xpath1"+i+"xpath2"+j+"xpath3")).getText();
				System.out.println(txt +"/t");
			}
			System.out.println("");
		}
		
	}
}
