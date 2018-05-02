package com.bobbleKeyboard.pageObjectlib;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import com.bobbleKeyboard.Generic.BaseLibrary;
import com.bobbleKeyboard.Generic.Constantlib;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.Connection;

public class BobblePage extends BaseLibrary
{
	public void importantDisclosure() 
	{
		if(ad.findElement(By.id(Constantlib.allowPage1)).isDisplayed())
		{
			ad.findElement(By.id(Constantlib.allowButton1)).click();
			logger.log(LogStatus.INFO, "Clicking on Allow button ");
		}
		else
		{
			System.out.println("Important Disclosure Not displayed");
		}
	}

	public void permitToAccessDevice() 
	{
		if(ad.findElement(By.id(Constantlib.allowPage2)).isDisplayed())
		{
			ad.findElement(By.id(Constantlib.allowButton2)).click();
			logger.log(LogStatus.INFO, "Allow application to access device");
		}
		else
		{
			System.out.println("Couldn't allow application to access device ");
		}
	}
	public void permitToAccessContacts() 
	{
		if(ad.findElement(By.id(Constantlib.allowPage2)).isDisplayed())
		{
			ad.findElement(By.id(Constantlib.allowButton2)).click();
			logger.log(LogStatus.INFO, "Allow application to access contacts");
		}
		else
		{
			System.out.println("Couldn't allow application to access contacts");
		}

	}

	public void permitToSendSMS()
	{
		if(ad.findElement(By.id(Constantlib.allowPage2)).isDisplayed())
		{
			ad.findElement(By.id(Constantlib.allowButton2)).click();
			logger.log(LogStatus.INFO, "Allow application to send sms ");
		}
		else
		{
			System.out.println("Couldn't allow application to send sms");
		}

	}	

	public void clickOnButton(double x_offset,double y_offset) 
	{
		Dimension dsize =ad.manage().window().getSize();
		int x =(int)(dsize.width*x_offset);
		int y=(int)(dsize.height*y_offset);
		ad.tap(1,x,y,30);
	}
	public void swiping(double x_offset,double y_offset,double x1_offset,double y1_offset) 
	{
		Dimension dsize =ad.manage().window().getSize();
		int x =(int)(dsize.width*x_offset);
		int y=(int)(dsize.height*y_offset);
		int x1 =(int)(dsize.width*x1_offset);
		int y1=(int)(dsize.height*y1_offset);
		ad.swipe(x,y, x1,y1, 3000);
	}

	public void loginPage() 
	{
	        clickOnButton(.89,.09);
			logger.log(LogStatus.INFO, "Entered Login page ");
	
	}
	public void selectBobbleKeyboard() 
	{
		
			ad.findElement(By.xpath("(//android.widget.RadioButton)[2]")).click();
			logger.log(LogStatus.INFO, "selected  Bobble keyboard ");

	}

	public void welcomePage() 
	{
		if(ad.findElement(By.xpath(Constantlib.welcomePage)).getText().contains("Welcome!"))
		{
			ad.findElement(By.id(Constantlib.continueButton)).click();
			logger.log(LogStatus.INFO, "Continue to home Page ");
		}
		else
		{
			System.out.println("Welcome page not displayed");
		}
	}
	public void permitToAccessLocation() 
	{
		if(ad.findElement(By.xpath(Constantlib.access1)).getText().contains("location"))
		{
			ad.findElement(By.id(Constantlib.allowButton2)).click();
			logger.log(LogStatus.INFO, "allow application to access location ");
		}
		else
		{
			System.out.println("Couldn't allow application to access location ");
		}
	}

	public void selectTheme() 
	{
		
		swiping(.73,.192,.33,.189);
		ad.tap(1, 400,150,300);
		}
	public void selectKeyboard() 
	{
		
			ad.tap(1,353,429,300);
	
		}

	public void testKeyboard() throws InterruptedException 
	{
		
             ad.tap(1, 213, 596,300);
             Thread.sleep(1000);
             ad.tap(1, 123, 596,300);
             Thread.sleep(1000);
             ad.tap(1, 101, 665,300);
             Thread.sleep(1000);
             ad.tap(1, 213,596,300);
             Thread.sleep(1000);
		
			
			logger.log(LogStatus.INFO, "Testing selected theme");
		}
	
	public void selectLanguageTab() 
	{
		
		ad.tap(1, 400,150,300);
		
	}
public void addLanguage1() throws InterruptedException {
	
	Thread.sleep(4000);
	ad.swipe(211,715,211,50,3000);
	
}
	
	
	public void closeApp1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		ad.closeApp();
	}

}
