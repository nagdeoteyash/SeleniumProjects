package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl
{
		public static void main(String[] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			driver.manage().window().maximize();
			String txt="";
			
			
			//div[@dir='ltr']/table[@id='customers']/tbody/tr[2]/td[1]
			String xpath1="//div[@dir='ltr']/table[@id='customers']/tbody/tr[";
			String xpath2="]/td[";
			String xpath3="]";
			for(int row=2 ; row<=6 ; row++)
			{
				for (int col=1 ; col<=3 ; col++)
				{
					txt= driver.findElement(By.xpath(xpath1 + row + xpath2 + col + xpath3)).getText();
				    System.out.print(txt + "\t");
				}
				System.out.println();

			}
			
		}
}
