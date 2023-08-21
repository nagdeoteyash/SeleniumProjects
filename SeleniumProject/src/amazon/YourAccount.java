package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourAccount 
{
	void yourAccount(WebElement driver, WebDriverWait wait, Actions action) {
		WebElement login = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
		action.moveToElement(login).build().perform();

		WebElement accnt = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//a[@href='/gp/css/homepage.html?ref_=nav_AccountFlyout_ya']")));
		accnt.click();
	}

	public void yourAccountContent(WebElement driver, WebDriverWait wait, WebDriver driver1)
			throws InterruptedException {
		WebElement yourorder = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='YourOrders']")));
		yourorder.click();
		Thread.sleep(10001);
		String url = driver1.getCurrentUrl();
		System.out.println("Current url of your order window" + url);
		Thread.sleep(100l);
		driver1.navigate().back();

		WebElement LoginnSecurity = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='SignInAndSecurity']")));
		LoginnSecurity.click();
		Thread.sleep(1001);
		String lnsurl = driver1.getCurrentUrl();
		System.out.println("Current url of Login and Security window" + lnsurl);
		Thread.sleep(100l);
		driver1.navigate().back();

		WebElement prime = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='Prime']")));
		prime.click();
		Thread.sleep(1001);
		String purl = driver1.getCurrentUrl();
		System.out.println("Current url of Prime" + purl);
		Thread.sleep(100l);
		driver1.navigate().back();

		WebElement youraddrss = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='AddressesAnd1Click']")));
		youraddrss.click();
		Thread.sleep(1001);
		String yaddurl = driver1.getCurrentUrl();
		System.out.println("Current url of your address window" + yaddurl);
		Thread.sleep(100l);
		driver1.navigate().back();

		WebElement paymentopt = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='PaymentOptions']")));
		paymentopt.click();
		Thread.sleep(1001);
		String payopturl = driver1.getCurrentUrl();
		System.out.println("Current url of payment option window" + payopturl);
		Thread.sleep(100l);
		driver1.navigate().back();

		WebElement amaznpay = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='AmazonPay']")));
		amaznpay.click();
		Thread.sleep(1001);
		String amzonpayurl = driver1.getCurrentUrl();
		System.out.println("Current url of amazonpay window" + amzonpayurl);
		Thread.sleep(100l);
		driver1.navigate().back();

		WebElement contact = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='ContactUs']")));
		contact.click();
		Thread.sleep(1001);
		String cnturl = driver1.getCurrentUrl();
		System.out.println("Current url of contact window" + cnturl);
		Thread.sleep(100l);
		driver1.navigate().back();
		Thread.sleep(100l);
		driver1.navigate().back();
	}
	
	public void DigitalCandD(WebElement driver, WebDriverWait wait, WebDriver driver1,Actions action) throws InterruptedException
	{
		WebElement login = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
		action.moveToElement(login).build().perform(); 
		
		yourAccount( driver,  wait,  action);
		
		
		WebElement appnmore = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='DigitalContentAndDevices']//li[1]")));
		appnmore.click();
		Thread.sleep(1001);
		String appnmoreurl = driver1.getCurrentUrl();
		System.out.println("Current url of app and more" + appnmoreurl);
		Thread.sleep(100l);
		//driver1.navigate().back();
		
		
		WebElement contentAndDevice = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-card-identifier='DigitalContentAndDevices']//li[2]")));
		contentAndDevice.click();
		Thread.sleep(1001);
		String contanddevurl = driver1.getCurrentUrl();
		System.out.println("Current url of content and device " + contanddevurl);
		Thread.sleep(100l);
		driver1.navigate().back();
		Thread.sleep(1000l);
				
	}
}
