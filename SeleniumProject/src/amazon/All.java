package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All {
	void BestSeller(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']")).click();

		Thread.sleep(1000l);

		String a1 = "//div[@role='group']/div[";
		String b1 = "]/a";

		for (int i = 1; i <= 31; i++) {
			WebElement xyz = driver.findElement(By.xpath(a1 + i + b1));
			System.out.println(xyz.getText());
			xyz.click();
			Thread.sleep(100l);
			driver.navigate().back();
			Thread.sleep(100l);
		}

	}

	void FindingElement(WebDriver driver) {
		String c1 = "(//div[@role='treeitem'])[";
		String d1 = "]";
		for (int i = 0; i <= 10; i++) {
			WebElement abc = driver.findElement(By.xpath(c1 + i + d1));
			abc.click();
			driver.navigate().back();

		}

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		All a1 = new All();
		a1.BestSeller(driver);

	}

}
