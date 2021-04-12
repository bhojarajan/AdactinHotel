package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.loginpage.LoginPojo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class libGloble 
{
	public static WebDriver driver;
//	static Actions ac  = new Actions(driver);
//	static Robot   rob ;
//	static Alert al;
	static JavascriptExecutor js;
	
	
	//Selenium wedriver set system property  ------------1
	public static void loadUrl() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	//Launch Url                             ------------2
	public static void loadUrl(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
    
	//Remove All Cookies
	public static void removeAllCookies(String url) 
	{
		driver.manage().deleteAllCookies();
	}

	//Get current url                       ------------3
	public static String currentUrl() 
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url ="+ currentUrl);
		return currentUrl;
		
	}
	
	//to get current title of the wepage     ------------4
	public static String toGetTitle() 
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	//To Close the current Window             ------------5
	public static void toCloseWindow() 
	{
		driver.close();
	}
	
	//To close all windows                   ------------6
	public static void toQuitWindow() 
	{
		driver.quit();
	}
	
	//Passing values to perticular text box  ------------7
	public static void toType(WebElement ele,String value) 
	{
		ele.sendKeys(value);
	}
	
	//To click button                       ------------8
	public static void toClick(WebElement ele) 
	{
		ele.click();
	}
	
	//thread sleep method                   ------------9
	public static void mSleep(int a) throws InterruptedException 
	{
		Thread.sleep(a);
	}
	
	//find WebElement by using XPATH           ------------10
	public static WebElement findXpath(String s) 
	{
	  WebElement findElement = driver.findElement(By.xpath(s));
	  return findElement;
	}
	
	//find WebElement by using XPATH           ------------
	public static List<WebElement> findXpathList(String s) 
	{
	  List<WebElement> findElements = driver.findElements(By.xpath(s));
	  return findElements;
	}
	
	//find Web Element by id                   ------------11
	public static WebElement findId(String s) 
	{
	    WebElement eleId = driver.findElement(By.id(s));
	    return eleId;
	}
	
	
	//find Web Element by Class Name           ------------12     
	public static WebElement findClass(String s) 
	{
	    WebElement eleClass = driver.findElement(By.className(s));
	    return eleClass;
	}
	
	//to get webelement text                  ------------13
	public static void toGetText(WebElement ele) 
	{
	    System.out.println(ele.getText());
	}
	
	
	//to get attribute value of webelement      ------------14
	public static void toGetAttribute(WebElement ele,String val) 
	{
	    System.out.println(ele.getAttribute(val)); 
	}
	
	//Action functions ----------------------------------------------------------------------------------------
	
	//Move to element in Actions      ------------15
//	public static void moveTo(WebElement ele) 
//	{
//	    ac.moveToElement(ele).perform();
//	}
//	
//	
//	//Drag And Drop method in Actions      ------------16
//	public static void toDragDrop(WebElement source,WebElement target) 
//	{
//	    ac.dragAndDrop(source, target).perform();
//	}
//	
//	//Keyup and keydownin Actions                     ------------17
//	public static void toKeyUpDown(String s) 
//	{
//	   ac.keyDown(Keys.SHIFT).sendKeys(s).keyUp(Keys.SHIFT).build().perform();
//	}
//	
//	//Double click in Actions                     ------------18
//	public static void toDoubleClick(WebElement ele) 
//	{
//	   ac.doubleClick(ele).perform();
//	}
//
//	
//	//Right click (contextClickin) in  Actions                     ------------19
//	public static void toRightClick(WebElement ele) 
//	{
//	   ac.contextClick(ele).perform();
//	}
	
	
	//Robot Functions ----------------------------------------------------------------------------------------------
	
	//Right click (contextClickin) in  Actions                     ------------20
	//create Robot Functions
//    public static void createRobot() throws AWTException 
//    {
//    	 rob = new Robot();
//	} 
	
    
	                   
	//passing arguments not working in keypress Event              ------------21 
//	public static void keyRobot(char c) 
//	{
//
//		String s = "KeyEvent.VK_";
//		String ss=Character.toString(c);
//		
//		
//		//String keyEve = s.concat(ss);
//		String ab="KeyEvent.VK_A";
//		
//	    //rob.keyPress(KeyEvent.VK_A);
//		rob.keyPress(ab);
//	}

    
    //Alert ------------------------------------------------------------------------
    //Alert creation                                             ------------22 
//	public static void popUpClose() 
//	{
//	   al = driver.switchTo().alert();
//	}
	
	
	
	// to click OK button  in Alert pop up                        ------------23
//	public static void popUpOk(String s) 
//	{
//		al.accept();
//	}
//	
//	// to click cancel button in Alert pop up                    ------------24
//	public static void popUpCancle(String s) 
//	{
//		al.dismiss();
//	}

	
	// To handel Text  Alert pop up                              ------------25
//	public static void popUpText(String s) 
//	{
//	    System.out.println(al.getText());
//	    al.sendKeys("Hellow");
//	    al.accept();		  		
//	}

	
	//JAVA SCRIPT EXECUTOR----------------------------------------------------------------------------
	
	//Java Script Executor creation               ---------------------- 26
	public static void jsScript() 
	{
	   js = (JavascriptExecutor)driver;	   
	}
	
	//scroll up  using javaScriptExecutor         ---------------------- 27 
	public static void jsScrollUp(WebElement ele) 
	{
	   js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	
	//scroll up  using javaScriptExecutor         ---------------------- 28
	public static void jsScrollDown(WebElement ele) 
	{
	   js.executeScript("arguments[0].scrollIntoView(false)", ele);
	}
	
	
	// SendKeys using javaScriptExecutor             ---------------------- 29
	public static void jsTypeValue(WebElement ele,String s) 
	{
	   js.executeScript("arguments[0].setAttribute('value','s')", ele);
	}
	
	
	// get the value from text box using javaScriptExecutor       ---------- 30
	public static void jsGeteValue(WebElement ele) 
	{
	   js.executeScript("return arguments[0].getAttribute('value')", ele);
	}
	
	// get the value from webElement using javaScriptExecutor     ---------- 31
	public static void jsClick(WebElement ele) 
	{
	   js.executeScript("arguments[0].click()", ele);
	}

	
	
	//Take Screen Shot -Interface     -------------------------------------------------
	

	// Save Screen Shot                                                ---------- 32
	public static void screenShot(String fileName) throws IOException 
	{
		//String s ------->screenshot file name & extension
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   //Merging with user input
	   String path1 = "E:\\API_AUTO_V1\\CucumberAdactin\\ScreenShot\\";
	   String path2 = path1.concat(fileName+".png");
	   
	   
	   
	   //File creation and destination path setup
	   File destFile = new File(path2);
	   
	   //to get screenshot 
	   File srcFile = ts.getScreenshotAs(OutputType.FILE);
	   
	   //copy screenshot file
	   FileUtils.copyFile(srcFile, destFile);   
	}
	
	

	// Frames switch using ID                                         ---------- 33
	public static void framesIdNam(String s)  
	{
		driver.switchTo().frame(s);
	}

    
	// Frames switch using index                                      ---------- 34
	public static void framesIndex(int index)  
	{
		driver.switchTo().frame(index);
	}
	
	// Frames switch using WebElement                                 ---------- 35
	public static void framesEle(WebElement ele)  
	{
		driver.switchTo().frame(ele);
	}

	// Switch from inner frames to its outer frame(parent frame)   --------------36
	public static void framesParent()                                 
	{
		driver.switchTo().parentFrame();
	}


	// Switch frame any frames to main html                        --------------37
	public static void framesMain()  
	{
		driver.switchTo().defaultContent();
	}
	
	
	//Windows Handeling ---------------------------------------------------------------
	// Get current window ID                                       --------------38
	public static String currWidowId()                             
	{
		String currentWindow = driver.getWindowHandle();
		System.out.println("Current window id"+currentWindow);
		return currentWindow;
	}

	// Get all windows ID opened                                   --------------39
	public static void widowsId()                           
	{
		 Set<String> allWindowId = driver.getWindowHandles();
		 System.out.println("All windows ID");
		 for (String s : allWindowId) 
		 {
			 System.out.println(s);
	     }
	}
	
	
	
	// Switch to given ID window                                   --------------40
	public static void widowsSwitch(String s)                           
	{
		 driver.switchTo().window(s);
	}
	

	// Convert Set to List in Window Handeling & get the particular window by index
	public static void toSwitchList(Set<String> allWindowId,int index)                           
	{
		 List<String> listOfAllWindowId = new ArrayList();
		 listOfAllWindowId.addAll(listOfAllWindowId);
		 driver.switchTo().window(listOfAllWindowId.get(index));
	}

	//Drop Down "Select" method---------------------------------------------------------------------------

	// to select perticular index by index select method             ----------------41
	public static void toSelectIndex(WebElement ele,int expMonth)                           
	{
		Select sel = new Select(ele);
		sel.selectByIndex(expMonth);
	}


	// to select perticular index by value select method             ----------------42
	public static void toSelectVal(WebElement ele,String val)                           
	{
		Select sel = new Select(ele);
		sel.selectByValue(val);
	}
	
    
	// to select perticular index by visible text select method      ----------------43
	public static void toSelectText(WebElement ele,String val)                           
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(val);
	}
    
	
	// to deselect perticular index by index method                  ----------------44
	public static void toDeSelectInde(WebElement ele,int index)                           
	{
		Select sel = new Select(ele);
		sel.deselectByIndex(index);
	}
	
	// to deselect  perticular index by value method                  ----------------45
	public static void toDeSelectVal(WebElement ele,String val)                           
	{
		Select sel = new Select(ele);
		sel.deselectByValue(val);
	}
	
	// to deselect  perticular index by visibleText method          ----------------46
	public static void toDeSelectText(WebElement ele,String text)                           
	{
		Select sel = new Select(ele);
		sel.deselectByVisibleText(text);
	}


	// to deselect  all  options                                    ----------------47
	public static void toDeSelectAll(WebElement ele)                           
	{
		Select sel = new Select(ele);
		sel.deselectAll();
	}
	
	// to select  all options  in dropDown                          ----------------48
	public static void toSelectAll(WebElement ele)                           
	{
		Select sel = new Select(ele);
		List<WebElement> allList = sel.getOptions();
		
		for (int i = 0; i < allList.size(); i++) 
		{
			sel.selectByIndex(i);
		}
	}

	
	// to print given we element is Multiple option or not         ----------------49
	public static void dropMultiCheck(WebElement ele)               
	{
		Select sel = new Select(ele);
		System.out.println(sel.isMultiple());		
	}

	
	// to print all values in drop down menu                       ----------------50
	public static void getListDrop(WebElement ele)               
	{
		Select sel = new Select(ele);
		List<WebElement> listOption = sel.getOptions();
		System.out.println("List of values in DroupDown");
		for (WebElement w : listOption) 
		{
			System.out.println(w);	
		}
				
	}
	
	
	// to get number of list in drop down menu                     ----------------54
	public static int getSizeDrop(WebElement ele)               
	{
		Select sel = new Select(ele);
		List<WebElement> listOption = sel.getOptions();
		int sizeOfDD = listOption.size();
		return  sizeOfDD;				
	}
	
	
	// to print given we element is Multiple option or not         ----------------55
	public static void dropGetList(WebElement ele)               
	{
		Select sel = new Select(ele);
		List<WebElement> listOption = sel.getOptions();
		System.out.println("List of values in DroupDown");
		for (WebElement w : listOption) 
		{
			System.out.println(w);	
		}
				
	}
	
	
	// to print given we element is Multiple option or not         ----------------56
	public static void toGetselectedList(WebElement ele)               
	{
		Select sel = new Select(ele);
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		for (WebElement w : allSelectedOptions) 
		{
			System.out.println(w);
		}
	}
	
	
	// to print given we element is Multiple option or not         ----------------57
	public static void toGetFirstSelected(WebElement ele)               
	{
		Select sel = new Select(ele);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}


	// WEBTABLE --------------------------------------------------------------------------
 
	// to get table value by index                                  ----------------58
	public static void getTableIndexValue(List<WebElement> eles,int index)               
	{
		WebElement tableValue = eles.get(index);
		for (WebElement w : eles) 
		{
			System.out.println(w.getText());
		}
	}


	// WebElement Methods check --------------------------------------------------------------------------
	 
	// to check given webelement is enabled or not                 ----------------59
	public static void toCheckElementEnable(WebElement ele)               
	{
		System.out.println("The Web Element is Enable?  =  "+ele.isEnabled());
	}

	// to check given webelement is Displayed or not               ----------------60
	public static void toCheckElementDisplay(WebElement ele)                
	{
		System.out.println("The Web Element is Displayed?  =  "+ele.isDisplayed());
	}
	
	// to check given webelement is selected or not
	public static void toCheckElementSelected(WebElement ele)               	
	{
		System.out.println("The Web Element is Selected?  =  "+ele.isSelected());
		int s= 232;
	}
	
	
	
	//WAITS ----------------------------------------------------------------------------------------
	
	// Implicit waits in seconds                                  ----------------61
	public static void waitImplicit(int n)                                  	
	{
		driver.manage().timeouts().implicitlyWait(n, TimeUnit.SECONDS);
	}

	
	

}
