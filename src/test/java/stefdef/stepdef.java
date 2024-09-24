package stefdef;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdef {
	
	
	static WebDriver driver;
	@Given("^user navigate to demobalze website$")
	public void browser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@When("^user clicks on signup button$")
	public void signupbutton() 
	{
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
	}
	@And("^user enters username1 as\"(.*)\"$")
	public void username(String fnmae) 
	{
		String  name="Rosh"+System.currentTimeMillis();
		
		driver.findElement(By.id("sign-username")).sendKeys(name);
	}
	@And("^user enters password1 as\"(.*)\"$")
	public void pass(String lastname) 
	{
		driver.findElement(By.id("sign-password")).sendKeys(lastname);
	}
	
	@And("^user clicks on signup2 icon$")
	public void Signup() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
	}
	
	@And("^user accept alert1$")
	public void alert() throws InterruptedException 
	{
		driver.switchTo().alert().accept();
	}
	
	@When("^user clicks on the login button$")
	public void login() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	}
	
	
	@And("^user enters username as\"(.*)\"$")
	public void logname(String name) throws InterruptedException 
	{
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(name);
		
	}
	@And("^user enters password as \"(.*)\"$")
	public void passlog(String pass) throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(pass);
	}
	@And("^user clicks on login2 button$")
	public void clicks() 
	{
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}

	

}
