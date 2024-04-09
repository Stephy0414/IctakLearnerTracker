package com.learner.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclsictak {
	WebDriver driver;
	@BeforeTest

	public void ltracker()
	{
		driver=new ChromeDriver();
		driver.get("https://learnertracker.netlify.app");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		
	}

}
