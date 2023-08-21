package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs {

	void LoginNPassword(WebDriverWait wait) {
		WebElement login = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
		login.sendKeys("standard_user");
		// standard_user

		WebElement pwd = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		pwd.sendKeys("secret_sauce");
		// secret_sauce

		WebElement btn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));
		btn.click();

	}

	void SelectElement(WebDriverWait wait, WebDriver driver) throws InterruptedException {
		WebElement shirt1 = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-sauce-labs-onesie")));
		shirt1.click();

		WebElement shirt2 = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")));
		shirt2.click();
		// id="add-to-cart-sauce-labs-bolt-t-shirt"

		WebElement shirt3 = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
		shirt3.click();

		WebElement shopcart = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("shopping_cart_container")));
		shopcart.click();
		// id="checkout"

		WebElement chkout = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkout")));
		chkout.click();
	}

	void Info(WebDriverWait wait) {
		WebElement fn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name")));
		fn.sendKeys("yash");

		WebElement ln = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("last-name")));
		ln.sendKeys("Nagdeote");

		WebElement zip = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("postal-code")));
		zip.sendKeys("441123");

		WebElement conti = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("continue")));
		conti.click();
	}

	void Price(WebDriverWait wait, WebDriver driver) {

		List<WebElement> getprice = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='item_pricebar']")));

		String s1 = "(//div[@class='inventory_item_price'])[";
		String s2 = "]";
		float sum = 0.0f;
		for (int i = 1; i <= getprice.size(); i++) {
			String pr = null;
			WebElement prices = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(s1 + i + s2)));
			pr = prices.getText();

			float a = 0.0f;
			a = Float.parseFloat(pr.substring(1));
			sum = sum + a;

		}

		WebElement tax = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("summary_tax_label")));
		String txs = tax.getText();
		float tx = Float.parseFloat(txs.substring(6));
		System.out.println("Tax applied =" + tx);
		System.out.println("Total sum of products=" + sum);
		float totp = 0.0f;
		totp = sum + tx;
		System.out.printf("Total price of products with tax =: %.2f", totp);
		System.out.println("");

		// compare

		WebElement ttl = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='summary_info_label summary_total_label']")));
		String txt = ttl.getText();
		float fp = Float.parseFloat(txt.substring(8));
		System.out.println("Actual Price displayed on site " + fp);

		if (fp == totp)
			System.out.println("Actcual price is  matching with calculated price ");
		else
			System.out.println("Actual price is not  matching with calculated price  ");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // wait

		SwagLabs sl1 = new SwagLabs();
		sl1.LoginNPassword(wait);
		Thread.sleep(1000l);
		sl1.SelectElement(wait, driver);
		Thread.sleep(1001);
		sl1.Info(wait);
		Thread.sleep(100l);
		sl1.Price(wait, driver);
	}

}
