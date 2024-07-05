package loginPOM;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class Login 
{
	@Test
	
	public void f() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","F:/Eclipse/chromedriver.exe"); 
		  
		  WebDriver driver=new ChromeDriver();                                    //Created new Chrome driver instance.
		  
		  driver.manage().window().maximize();                                     //Set window size to maximum.
		  
		  driver.get("https://test.avantisregtec.in/pricontract/logout.aspx");     //Set the URL of WebApplication.
		  
		  WebElement userName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		  userName.sendKeys("fe@bitaconsulting.co.in");                              //Sent username to input box 
		  
		  WebElement password=driver.findElement(By.xpath("//*[@id='txtpass']"));
		  password.sendKeys("admin@123");                                            //Sent password to input box
		  
		  WebElement signBtn=driver.findElement(By.xpath("//*[@id='Submit']"));
		  signBtn.click();                                                          //Clicked on Sign-in button
		  
		  WebElement DonotAcc=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		  DonotAcc.click();                                                          //Clicking on QA Link instead of OTP.
		   Thread.sleep(3000);
		  WebElement firstQ=driver.findElement(By.id("txtAnswer1"));
		  firstQ.sendKeys("123");                                            //Sending answer to the input box.
		
		  WebElement secQ=driver.findElement(By.xpath("//*[@id='txtAnswar2']"));
		  secQ.sendKeys("123");                                              //Sending answer to the input box.
		  
		  WebElement validate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		  validate.click();                                        //Clicking on Validate button.
		  
		  WebElement contractbox=driver.findElement(By.xpath("//*[@id=\"dvbtnContract\"]/div[1]/img"));
		  contractbox.click();
		  String status1="draft",status2="pending for review";
		  WebElement draft= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_divDraftCount\"]"));
		  String draftcount=draft.getText();
		  int digits=Integer.parseInt(draftcount);  
		  System.out.println(digits);
		  Thread.sleep(4000);
		  WebElement draftbox=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_divDraftCount\"]"));
		  draftbox.click();
		  Thread.sleep(3000);
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scroll(0,300)");
		  WebElement draftworkspacecount=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_DivRecordsScrum\"]"));
		  String dfcount=draftworkspacecount.getText();
		  //System.out.println(dfcount);
		  //System.out.println(dfcount.charAt(dfcount.length()-1));
		  String scount=dfcount.substring(dfcount.indexOf("f")+1).strip();
		  //System.out.println(scount);
		  
		 // String fcount=scount.strip();
		  int sc=Integer.parseInt(scount);
		  System.out.println(sc);
		  if(digits==sc)
		  {
			  System.out.println("count of contracts of status " +status1+" is matched");
		  }
		  Thread.sleep(3000);
		  WebElement dash1=driver.findElement(By.xpath("//*[@id='leftdashboardmenu']/a"));
		  //WebElement dash2=driver.findElement(By.xpath("//*[@id=\"leftdashboardmenu\"]/a"));
		  dash1.click();
		  WebElement pendingforreview=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divPendingReviewCount']"));
		  String previewcount=pendingforreview.getText();
		  int digits2=Integer.parseInt(previewcount);
		  System.out.println(digits2);
		  WebElement reviewbox=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_pendingReviewCount']/div/div/a/div[2]/div[1]"));
		  reviewbox.click();
		  js.executeScript("window.scroll(0,300)");
		  WebElement reviewworkspacecount=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DivRecordsScrum']"));
		  String rwcount=reviewworkspacecount.getText();
		  String reviewcount=rwcount.substring(rwcount.indexOf("f")+1).strip();
		  int rc=Integer.parseInt(reviewcount);
		  System.out.println(rc);
		  if(digits2==rc)
		  {
			  System.out.println("count of contracts of status " +status2+" is matched");
		  }
		       //driver.navigate().refresh();	
		       Thread.sleep(4000);
		       WebElement dash2=driver.findElement(By.xpath("//*[@id='leftdashboardmenu']/a"));
		       dash2.click();
		       
		  
		  //System.out.println(fcount);
		  //int fc=Integer.parseInt(fcount);
		  //System.out.println(fc);
		  		  //System.out.println(draftct);
		  //System.out.println(t1);
		  //String digits=t1.replaceAll("[^0-9]", "");
		  //System.out.println(digits);
		  //WebElement draftbox=driver.findElement((By.xpath("//*[@id=\"ContentPlaceHolder1_draftCount\"]/div/div/a/div[2]/div[1]")));
		  //draftbox.click();
	  }
	}


