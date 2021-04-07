package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome version\\cv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.id("userName"));
        
        if(username.isEnabled())
        {
        	//It basically clears the data that is previously available
        	username.clear();
        	username.sendKeys("chaitrika");
        }
        if(username.isDisplayed())
        {
        	 WebElement password=driver.findElement(By.id("password"));
        	 password.clear();
        	 password.sendKeys("chaitrika123");
        	 driver.findElement(By.id("Submit")).click();
        	 Thread.sleep(3000);
        }
        	 
        
        
		
	}

}
