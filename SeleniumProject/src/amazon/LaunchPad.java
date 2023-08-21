package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPad {
	void ClickOn(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();

		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']"))
		.click();
	}
	void AmazonL(WebDriver driver)
	{
		driver.findElement(By.xpath("//div[@href='/gp/bestsellers/boost/ref=zg_bs_nav_0']")).click();
	}
	
	void InsideAmazonL(WebDriver driver)
	{
		String s1="(//div[@role='treeitem'])[";
		String s2="]";
		for (int i =3 ; i<9 ; i++)
		{
		WebElement find=driver.findElement(By.xpath(s1+i+s2));
		find.click();
		}
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		LaunchPad l1 = new LaunchPad();
		l1.ClickOn(driver);
		l1.AmazonL(driver);
		l1.InsideAmazonL(driver);
	}

}
