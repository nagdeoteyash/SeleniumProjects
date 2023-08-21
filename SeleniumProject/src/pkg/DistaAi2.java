package pkg;

//explicit way 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DistaAi2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dista.ai");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver; // declaration of JavascriptExecutor
		Actions actions = new Actions(driver); // object of action class and giving driver as parameter
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // wait
		WebElement element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@id='ekit-megamenu-main-menu']//li[@id='menu-item-25']")));
		actions.moveToElement(element).build().perform(); // mover ourr cursor to element

		Thread.sleep(100l);

		// Xpath used here -> absolute Xpath
		WebElement dstp = driver
				.findElement(By.xpath("//div[@data-id='ff2be55']//div[@class='elementor-widget-container']"
						+ "/div[@class='ekit-wid-con']/div[@class='elementor-icon-list-items ']"
						+ "/div[4]/a[@class='elementor-repeater-item-be963db ekit_badge_left']")); // finds element
																									// doorstep

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 10px solid blue;');", dstp);
		dstp.click(); // highlight the corresponding element
		Thread.sleep(100l);

		WebElement doorstp = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-id='fdeacfe']/div/h1")));
		System.out.println(doorstp.getText()); // prints the headline of page

		js.executeScript("window.scrollBy(0,10000);", ""); // Scroll down from top to bottom
		// For printing the content at the bottom of doorstep page

		String xp1 = "//div[@data-id='2a9d4626']//div/div/div/ul/li[";
		String xp2 = "]";
		int i = 1;
		while (i <= 4) {
			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xp1 + i + xp2)));
			Thread.sleep(100l);
			System.out.println(ele.getText());
			i++;

		}
		System.out.println("____________________");
		Thread.sleep(100l);
		String XP = "//div[@data-id='fccd1f9']//div/ul/li[";
		String XP2 = "]";
		for (int j = 1; j < 5; j++) {

			WebElement txt = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(XP + j + XP2)));
			System.out.println(txt.getText());
		}

		System.out.println("____________________");
		Thread.sleep(100l);
		String A = "//div[@data-id='3f7058b6']//ul/li[";
		String B = "]";
		for (int k = 1; k <= 5; k++) {
			WebElement txt = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(A + k + B)));
			System.out.println(txt.getText());
		}
		Thread.sleep(100l);

		System.out.println("____________________");

		// for printing links of corresponding content

		WebElement box = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-id='619cfd44']/div/ul")));
		List<WebElement> txt = box.findElements(By.xpath("//div[@data-id='619cfd44']/div/ul//a"));
		System.out.println("txt.size : " + txt.size());
		int cnt = 1;
		for (int l = 0; l <= txt.size() - 1; l++) {
			System.out.println(cnt++ + " " + txt.get(l).getText());
			String href = txt.get(l).getAttribute("href");
			Thread.sleep(100l);
			System.out.println(href);
		}
		System.out.println("__________________");

		// for printing link of 2nd content list

		WebElement box2 = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-id='277bdfa6']//ul")));
		List<WebElement> txt2 = box2.findElements(By.xpath("//div[@data-id='277bdfa6']//ul//a"));
		System.out.println("txt.size : " + txt.size());
		int cnt2 = 1;
		for (int m = 0; m <= txt2.size() - 1; m++) {
			System.out.println(cnt2++ + " " + txt2.get(m).getText());
			String href = txt2.get(m).getAttribute("href");
			Thread.sleep(100l);
			System.out.println(href);
		}
		System.out.println("__________________");

		// for printing link of 3rdd list

		WebElement box3 = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-id='3003c07']//ul")));
		List<WebElement> txt3 = box3.findElements(By.xpath("//div[@data-id='3003c07']//ul//a"));
		System.out.println("txt.size : " + txt3.size());
		int cnt3 = 1;
		for (int n = 0; n <= txt3.size() - 1; n++) {
			System.out.println(cnt3++ + " " + txt3.get(n).getText());
			String href = txt3.get(n).getAttribute("href");
			Thread.sleep(100l);
			System.out.println(href);

		}
	}

}
