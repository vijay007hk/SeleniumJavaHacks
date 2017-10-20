/*Thare are some function we can use in Xpath to identify the abject in above cases.
An XPath expression can return one of four basic XPath data types:

 * String
 * Number
 * Boolean
 * Node-set

XPath Type : Functions
Node set : last(), position(), count(), id(), local-name(), namespace-uri(), name()
String : string(), concat(), starts-with(), contains(), substring-before(), substring-after(), substring(), string-length(), normalize-space(), translate()
Boolean : boolean(), not(), true(), false(), lang()
Number : number(), sum(), floor(), ceiling(), round()*/
/**********************************************************************
XPath Functions


1| Conversion
          boolean( [object] )
          string( [object] )
          number( [object] )

2| Math
          ceiling( number ) 
          floor( number )
          round( decimal )
          sum( node-set )

3| Logic
          true()
          false()
          not( expr )

4| Node
          lang(string)
          name([node-set])
          namespace-uri([node-set])

5| Context
          count(node-set)
          last()
          position()

6| String
          contains( haystack-string needle-string )
          concat( string1 string2 [stringn]* )
          normalize-space( string )
          starts-with(haystack needle) 
          string-length( [string] )
          substring(string start [length]) 
          substring-after(haystack needle) 
          substring-before(haystack needle)
          translate( string abc XYZ)*/


package firstPackage;


import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.seleniumhq.jetty9.util.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass {

	static DesiredCapabilities ds = DesiredCapabilities.firefox();
	
	 static{System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");}
	 static FirefoxDriver idriver = new FirefoxDriver(ds);
	 static {System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");}
	 static ChromeDriver cdriver = new ChromeDriver();
	 public static void main(String[] args) throws InterruptedException, WebDriverException, IOException, NoAlertPresentException {
		ds.setCapability(FirefoxDriver.PROFILE, false);
		ds.setPlatform(Platform.ANY);
		ds.setVersion("");
				
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		
		String url = "http://www.facebook.com";

		//idriver.INITIAL_BROWSER_URL.replaceAll(".*", "www.facebook.com");
		Wait wait = new FluentWait<FirefoxDriver>(idriver).withTimeout(15, TimeUnit.SECONDS).
				pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		idriver.manage().timeouts().implicitlyWait(10L, java.util.concurrent.TimeUnit.SECONDS);
		idriver.manage().timeouts().implicitlyWait(10L, java.util.concurrent.TimeUnit.SECONDS);
		
		//ChromeDriver idriver = new ChromeDriver();
		idriver.get(url);
		cdriver.get("file:///C:/Users/VIJAY%20HK/Desktop/chkbox.html");
		idriver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		//idriver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);

		java_Script();
		title_navigate();
		xpath_Functions();
		xpath_Axes();
		check_alignments();
        Set cookie = idriver.manage().getCookies();
        Iterator cit = cookie.iterator();
        while(cit.hasNext()){
        	System.out.println("Cookies : " + cit.next());
        }
		cdriver.quit();
		idriver.quit();
	}

	//*************************************************
	public static void xpath_Functions(){
		///
		/// xpath functions
		///
		
		try{
			WebElement last = cdriver.findElement(By.xpath("//input[@type='checkbox'][last()]"));
			WebElement lastbut3 = cdriver.findElement(By.xpath("//input[@type='checkbox'][last()-3]"));
			WebElement position3 = cdriver.findElement(By.xpath("//input[@type='checkbox'][position()=4]"));
			WebElement countelm = cdriver.findElement(By.xpath("//input[@type='checkbox'][count(//input[@name='chk'])]"));
			System.out.println("Xpathname() "+By.xpath("name(/input)"));
			WebElement predicate2 = cdriver.findElement(By.xpath("//input[@type='checkbox'][2]"));
			WebElement textbox = cdriver.findElement(By.xpath("//input[substring(@id, string-length(@id)-3)='pdr0']"));
			WebElement textbox2 = cdriver.findElement(By.xpath("//input[substring-after(@id, 'p1:pdr0')]"));
			WebElement textbox3 = cdriver.findElement(By.xpath("//input[substring-before(@id, 'blahblahblah')]"));
			WebElement textbox4 = cdriver.findElement(By.xpath("//input[substring(@id, string-length(@id)-8)=':p1:pdr0:']"));
			textbox.sendKeys("Substring");
			textbox2.sendKeys("Substring2");
			textbox3.sendKeys("Substring3");
			textbox4.sendKeys("Substring4");
			last.click();
			lastbut3.click();
			position3.click();
			countelm.click();
			predicate2.click();
			System.out.println("Count is :"+countelm.toString());
		}catch(Exception e){
			System.out.println("POSITION function" + e);
		}
		try{
			WebElement nextelm = cdriver.findElement(By.xpath("//a[starts-with(@title,'Click for')]"));
			WebElement credio = cdriver.findElement(By.xpath("//input[contains(@id,'fixed')]"));
			nextelm.click();
			credio.click();
			Thread.sleep(4000);

		}catch(Exception e){
			System.out.println("Surname input box: "+e);
		}
	}
	public static void xpath_Axes(){
		///
		/// xpath axes
		///
		
		try{
			List<WebElement> children = idriver.findElements(By.xpath("//span[@class='_5k_2 _5dba']/child::*"));
			List<WebElement> desc = idriver.findElements(By.xpath("//span[@id='u_0_u']/descendant::*"));
			WebElement prevelem = idriver.findElement(By.xpath("//select[@id='year']/preceding-sibling::select[1]"));
			WebElement nextelm = idriver.findElement(By.xpath("//select[@id='month']/following-sibling::select"));
			Select month = new Select(prevelem);
			Select year = new Select(nextelm);
			month.selectByIndex(4);
			month.selectByVisibleText("Jan");
			year.selectByIndex(4);
			System.out.println("Children count :"+ children.size());
			System.out.println("Descendants count :"+ desc.size());
			System.out.println("Years "+year.getOptions().size());
			for(int i=0; i<children.size(); i++){
				System.out.println("Children are "+children.get(i).getText());
				children.get(2).click();
			}
			//children.sendKeys("Jan");
			Thread.sleep(4000);
			//idriver.navigate().back();
		}catch(Exception e){
			System.out.println("sibling: "+e);
		}
	}

	public static void java_Script() throws InterruptedException{
		
		try
		{
			((JavascriptExecutor)idriver).executeScript("alert('Welcome to Facebook');"
					+ "window.scrollBy(0,600);window.scrollBy(600,0);");
			Alert key =  idriver.switchTo().alert();
			key.accept();
			Thread.sleep(4000);
			WebElement termslink = idriver.findElementByLinkText("Terms");
			WebElement globeimg = idriver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div/img"));
			((JavascriptExecutor)idriver).executeScript("arguments[0].click()", termslink);
			Thread.sleep(4000);
			Boolean imglded = (Boolean)((JavascriptExecutor)idriver).executeScript("return typeof arguments[0].naturalWidth!=\"undefined\" && arguments[0].naturalWidth>0"  , globeimg);
			System.out.println("9. Image loaded = " + imglded);
		}catch(UnhandledAlertException e){System.out.println("Alert Error :"+e);}
	}

	public static void title_navigate(){
		String expectedTitle = "Facebook .* log in or sign up";
		
		String actualTitle = idriver.getTitle();
		try{
			if(actualTitle.matches(expectedTitle)) {

				System.out.println("PASSED");
			}
			else {
				System.out.println("FAILED");
			}
			try{
				WebElement linksdiv = idriver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a[contains(text(),'account?')]"));
				linksdiv.click();
				idriver.navigate().back();
				Thread.sleep(4000);

			}catch(Exception e){
				System.out.println("Instagram link Error :"+e);
			}
			
			idriver.switchTo().window(actualTitle);
			if(idriver.findElementByLinkText("Terms").isDisplayed())
				System.out.println("Terms found" );
			else
				System.out.println("Terms not found");
		}catch(Exception e){

		}
	}
	
	public static void check_alignments(){
		//Position/alignment/attributes...
		
		WebElement email = idriver.findElement(By.id("email"));
		WebElement emailLabel = idriver.findElement
				(By.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[1]/label"));
		
		System.out.println("1. Email's value attribute is :" + email.getAttribute("class"));
		System.out.println("2. Email Label's cssValue : " + emailLabel.getCssValue("text-align"));
		System.out.println("3. Email's locations is :" + email.getLocation());
		System.out.println("4. Email labels size : " + emailLabel.getSize());
		System.out.println("5. Email labels tagname: " + emailLabel.getTagName());
		System.out.println("6. Email labels color :" + emailLabel.getCssValue("color"));
		System.out.println("7. Email labels font family :" + emailLabel.getCssValue("font-family"));
		System.out.println("8. Email labels font size :" + emailLabel.getCssValue("font-size"));
		//globeimg.getScreenshotAs(OutputType.FILE).createTempFile("globe", "image.jpg");
		
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
	}

}
