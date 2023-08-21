package actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime extends CreateDepartment 
{	  
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.106:81/login.do");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(1000l);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000l);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000l);

		WebElement txt =driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[9]/a"));
		System.out.println("module name-:"+txt.getText());
		txt.click();
		Thread.sleep(1000l);
		
		driver.findElement(By.id("ext-gen32")).click();
		Thread.sleep(1000l);
		driver.findElement(By.id("newGroupInput")).sendKeys("Testing2");
		Thread.sleep(2000l);
		driver.findElement(By.id("addUserGroupButton")).click();
		Thread.sleep(3000l);
		driver.findElement(By.id("closeLightbox")).click();
		
		Thread.sleep(1000l);
		WebElement txt2=driver.findElement(By.xpath("//div[@id='createNewUserButtonDiv']"));
		System.out.println("module name 2 ="+txt2.getText());
		txt2.click();
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("TestManager");
		
		WebElement pwd=driver.findElement(By.name("passwordText"));
		pwd.sendKeys("Test123");
		
		//name="passwordTextRetype"
		
		WebElement repwd=driver.findElement(By.name("passwordTextRetype"));
		repwd.sendKeys("Test123");
		
		WebElement access=driver.findElement(By.xpath("//select[@name='active']/option[1]"));
		access.click();
		System.out.println("the user is with access-:"+access.getText());
		
		WebElement Fname=driver.findElement(By.name("firstName"));
		Fname.sendKeys("Test");
		Thread.sleep(2000l);
		System.out.println("the users first name is -:"+Fname.getText());
		
		//lastName
		WebElement Lname=driver.findElement(By.name("lastName"));
		Lname.sendKeys("Manager");
		Thread.sleep(2000l);
		System.out.println("the user last name is -:"+Lname.getText());
		
		
		WebElement Phn=driver.findElement(By.name("phone"));
		Phn.sendKeys("123324553");
		Thread.sleep(2000l);
		System.out.println("the user phone is -:"+Phn.getText());
		
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("testmanager@cybersuccess.com");
		Thread.sleep(2000l);
		System.out.println("the user email is -:"+email.getText());
		Thread.sleep(20001);
		
		WebElement Assign=driver.findElement(By.xpath("//select[@name='userGroupId']/option[@value='1']"));
		Assign.click();
		Thread.sleep(20001);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
