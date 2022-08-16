package com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Launch_Browser {
	@Test
	
	
	public void launch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	      Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		// System .out.println(driver.getTitle());
		 Thread.sleep(2000);
		 String title = driver.getTitle();
		 System.out.println("The title of the page is :"+title);
		 Thread.sleep(2000);
		 
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("the URL of the page is :"+ currentUrl);
		 Thread.sleep(2000);
		 String pageSource = driver.getPageSource();
		 System.out.println("the source code of the page is :"+ pageSource);
		 Thread.sleep(2000);
		 
		 //Browser Navigations
		 driver.navigate().to("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 String fktitle = driver.getTitle();
		 System.out.println("The title of the page is :"+fktitle);
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		 
		driver.close();
	}
	
	
	//face book login---------------------------
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.name("email")).sendKeys("sonukumar1239@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("sonu1239@");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}
	
	
//Face book signUp-------------------------------------------------
	
@Test
	
	
	public void signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("firstname")).sendKeys("sonu");
		Thread.sleep(2000);
		driver1.findElement(By.name("lastname")).sendKeys("sharma");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_email__")).sendKeys("ss316742@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_email_confirmation__")).sendKeys("ss316742@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_passwd__")).sendKeys("sonu1239");
		Thread.sleep(2000);
		WebElement dateElement= driver1.findElement(By.name("birthday_day"));
		Thread.sleep(2000);
		WebElement monthElement = driver1.findElement(By.name("birthday_month"));
		Thread.sleep(2000);
		WebElement yearElement = driver1.findElement(By.name("birthday_year"));
		Thread.sleep(2000);
		
		Select d_Dropdown = new Select(dateElement); 
		Select m_Dropdown = new Select(monthElement);
		Select y_Dropdown = new Select(yearElement);
		
		d_Dropdown.selectByVisibleText("2");
		m_Dropdown.selectByVisibleText("feb");
		y_Dropdown.selectByVisibleText("2000");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("websubmit")).click();
	}



}
