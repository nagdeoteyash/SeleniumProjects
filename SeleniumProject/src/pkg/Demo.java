package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("bmwradio")).click();
		
		driver.findElement(By.id("benzradio")).click();
		
		driver.findElement(By.id("hondaradio")).click();
		
		
		
		driver.findElement(By.id("bmwcheck")).click();
		
		driver.findElement(By.id("benzcheck")).click();
	
		driver.findElement(By.id("hondacheck")).click();

		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(10001);
		driver.findElement(By.xpath("//a[@href='/home']")).click();
		
	}

}
