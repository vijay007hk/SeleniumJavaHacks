package firstPackage;


import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.seleniumhq.jetty9.util.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass {
	
	static DesiredCapabilities ds = DesiredCapabilities.firefox();
	
	public static void main(String[] vijay) throws InterruptedException, WebDriverException, IOException, NoAlertPresentException {
	ds.setCapability(FirefoxDriver.PROFILE, false);
	ds.setPlatform(Platform.ANY);
	ds.setVersion("");
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
	//System.setProperty("webdriver.ie.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	String url = "http://www.facebook.com";
	FirefoxDriver idriver = new FirefoxDriver(ds);
	//idriver.INITIAL_BROWSER_URL.replaceAll(".*", "www.facebook.com");
	Wait wait = new FluentWait<FirefoxDriver>(idriver).withTimeout(15, TimeUnit.SECONDS).
			pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	idriver.manage().timeouts().implicitlyWait(10L, java.util.concurrent.TimeUnit.SECONDS);
	//ChromeDriver cdriver = new ChromeDriver();
	idriver.get(url);
	idriver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
	String expectedTitle = "Facebook .* log in or sign up";
	  
	String actualTitle = idriver.getTitle();
	try{
	if(actualTitle.matches(expectedTitle)) {
		  
		  System.out.println("PASSED");
	  }
	  else {
		  System.out.println("FAILED");
	  }
	WebElement termslink = idriver.findElementByLinkText("Terms");
	((JavascriptExecutor)idriver).executeScript("arguments[0].click()", termslink);
	Thread.sleep(4000);
	idriver.switchTo().window(actualTitle);
	if(idriver.findElementByLinkText("Terms").isDisplayed())
		System.out.println("Terms found" );
	else
		System.out.println("Terms not found");
	}catch(Exception e){
		
	}
	  
	//Position/alignment/attributes...
	WebElement email = idriver.findElement(By.id("email"));
	WebElement emailLabel = idriver.findElement
			(By.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[1]/label"));
	WebElement globeimg = idriver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div/img"));
	System.out.println("1. Email's value attribute is :" + email.getAttribute("class"));
	System.out.println("2. Email Label's cssValue : " + emailLabel.getCssValue("text-align"));
	System.out.println("3. Email's locations is :" + email.getLocation());
	System.out.println("4. Email labels size : " + emailLabel.getSize());
	System.out.println("5. Email labels tagname: " + emailLabel.getTagName());
	System.out.println("6. Email labels color :" + emailLabel.getCssValue("color"));
	System.out.println("7. Email labels font family :" + emailLabel.getCssValue("font-family"));
	System.out.println("8. Email labels font size :" + emailLabel.getCssValue("font-size"));
	//globeimg.getScreenshotAs(OutputType.FILE).createTempFile("globe", "image.jpg");
	Boolean imglded = (Boolean)((JavascriptExecutor)idriver).executeScript("return typeof arguments[0].naturalWidth!=\"undefined\" && arguments[0].naturalWidth>0"  , globeimg);
	System.out.println("9. Image loaded = " + imglded);
	try
	{
		((JavascriptExecutor)idriver).executeScript("alert('Welcome to Facebook');"
				+ "window.scrollBy(0,600);window.scrollBy(600,0);");
		 Alert key =  idriver.switchTo().alert();
		 key.accept();
		 Thread.sleep(4000);
	}catch(UnhandledAlertException e){}
	
	
	idriver.findElement(By.id("email")).sendKeys("vijay007hk@gmail.com");
	  Logger.getLogger("Entered Email Id");
	  Log.setLog(Log.getLog());
	  idriver.findElement(By.id("pass")).sendKeys("murrary1234");
	  idriver.findElement(By.id("pass")).clear();
	  try{
		  Thread.sleep(4000);
	      idriver.findElement(By.xpath("//*[@id='u_0_r']")).click();
	      idriver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div[1]/div/div/h1/a/i")).click();
		  idriver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		  idriver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).click();
		  Thread.sleep(4000);
	  	  idriver.findElementByName("websubmit").click();
	  }catch(Throwable t) {
		  System.out.println("Error :" + t);
	  }
	  
	  //idriver.close();
	  idriver.quit();
   }
  
}
