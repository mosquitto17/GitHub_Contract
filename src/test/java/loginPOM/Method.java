package loginPOM;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.IOException;
import java.awt.Window;
import java.sql.Driver;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.apache.poi.hssf.usermodel.HSSFName;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.xml.stream.Location;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.presentationml.x2006.main.SldDocument;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CompanyAdminPOM.AdminLocator;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Method 
{
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;	
	//public static WebDriver driver=null;
    /*public WebDriver driver;
    
	public static void login(ExtentTest test) throws InterruptedException
	{
		  //System.setProperty("webdriver.chrome.driver","F:/Eclipse/chromedriver.exe"); 
		     
		  WebDriverManager.chromedriver().setup();

	      
		  driver=new ChromeDriver();                                    //Created new Chrome driver instance.
		  
		  driver.manage().window().maximize();                                     //Set window size to maximum.
		  
		  driver.get("https://login.teamleaseregtech.com");     //Set the URL of WebApplication.
		  
		  WebElement userName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		  userName.sendKeys("sandeep@bitaconsulting.co.in");                              //Sent username to input box 
		  
		  WebElement password=driver.findElement(By.xpath("//*[@id='txtpass']"));
		  password.sendKeys("admin@123");                                            //Sent password to input box
		  
		  WebElement signBtn=driver.findElement(By.xpath("//*[@id='Submit']"));
		  signBtn.click();                                                          //Clicked on Sign-in button
		  
		  WebElement DonotAcc=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		  DonotAcc.click();                                                          //Clicking on QA Link instead of OTP.
		   Thread.sleep(3000);
		   WebElement que1=driver.findElement(By.xpath("//*[@id=\"lblQuestion1\"]"));
		   WebElement que2=driver.findElement(By.xpath("//*[@id=\"lblQuestion2\"]"));
		   WebElement firstQ=driver.findElement(By.id("txtAnswer1"));
		   WebElement secQ=driver.findElement(By.xpath("//*[@id='txtAnswar2']"));
		   String question1=que1.getText();
		   if(question1.contains("power"))
		   
		  
		  firstQ.sendKeys("power");
		   else if(question1.contains("car"))
			   firstQ.sendKeys("car");
			   
		    
		   else
		   {
			   firstQ.sendKeys("pet");
		   }
		  //Sending answer to the input box.
		
		  String question2=que2.getText();
		  if(question2.contains("power"))
		  secQ.sendKeys("power");                                              //Sending answer to the input box.
		  else if(question2.contains("car"))
			  secQ.sendKeys("car");
		  else
			  secQ.sendKeys("pet");
		                                            //Sending answer to the input box.
		  
		  WebElement validate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		  validate.click();                                        //Clicking on Validate button.
		  
		  WebElement contractbox=driver.findElement(By.xpath("//*[@id=\"dvbtnContract\"]/div[1]/img"));
		  contractbox.click();
		  test.log(LogStatus.PASS, "Login successful");
	}*/
		  /*Locator.doctype(driver).click();
		  Thread.sleep(3000);
		  Locator.setnewdoc(driver).click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(Locator.setnewframe(driver));
		  Thread.sleep(4000);
		  Locator.setdocname(driver).sendKeys("Contract Draft Testament Papers");
		  Thread.sleep(3000);
		  Locator.clicksavedoc(driver).click();
		  Thread.sleep(3000);
		  Locator.clickclose(driver).click();
		  Thread.sleep(3000);
		  Locator.searchdoctype(driver).sendKeys("Contract Draft Testament Papers",Keys.ENTER);
		  Thread.sleep(2000);
		  Locator.editdoctype(driver).click();
		  driver.switchTo().frame(Locator.setnewframe(driver));
		  Locator.setdocname(driver).clear();
		  Thread.sleep(3000);
		  Locator.setdocname(driver).sendKeys("Contract Draft Testament Repository");
		  Thread.sleep(2000);
		  Locator.updatedoctype(driver).click();
		  Thread.sleep(2000);
		  Locator.closedoctype(driver).click();
		  Thread.sleep(3000);
		  Locator.deletedoctype(driver).click();
		  Thread.sleep(2000);
		  driver.switchTo().alert().accept();*/
	
		  public static void usercreate(WebDriver driver,ExtentTest test) throws InterruptedException, IOException
		  {
			  FileInputStream userfile = new FileInputStream("F:\\Contract\\ContractManagement\\TestData\\UserDetails.aspx");
    		  XSSFWorkbook workbook=new XSSFWorkbook(userfile);
    		  sheet=workbook.getSheetAt(0);
			  Thread.sleep(3000);
        	  Locator.mastermenuclick(driver).click();
        	  Thread.sleep(2000);
        	  Locator.usertab(driver).click();
        	  Thread.sleep(2000);
        	  Locator.adduser(driver).click();
        	  Thread.sleep(2000);
        	  
    		  Row row0=sheet.getRow(0);
    		  Cell c1=row0.getCell(1);
    		  String firstname=c1.getStringCellValue();
    		  Locator.fname(driver).sendKeys(firstname);
    		  Thread.sleep(2000);
    		  Row row1=sheet.getRow(1);
    		  Cell c2=row1.getCell(1);
    		  String lastname=c2.getStringCellValue();
    		  Locator.lname(driver).sendKeys(lastname);
    		  Thread.sleep(2000);
    		  Row row2=sheet.getRow(2);
    		  Cell c3=row2.getCell(1);
    		  String designation=c3.getStringCellValue();
    		  Locator.desg(driver).sendKeys(designation);
    		  Thread.sleep(2000);
    		  Row row3=sheet.getRow(3);
    		  Cell c4=row3.getCell(1);
    		  String email=c4.getStringCellValue();
    		  Locator.emailid(driver).sendKeys(email);
    		  Thread.sleep(2000);
    		  Row row4=sheet.getRow(4);
    		  Cell c5=row4.getCell(1);
    		  String contact=c5.getStringCellValue();
    		  Locator.contactno(driver).sendKeys(contact);
    		  Thread.sleep(2000);
    		  Row row5=sheet.getRow(5);
    		  Cell c6=row5.getCell(1);
    		  String address=c6.getStringCellValue();
    		  Locator.address(driver).sendKeys(address);
    		  Thread.sleep(2000);
    		  Select s=new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlDepartment\"]")));
    		  s.selectByIndex(3);
    		  Select r=new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlContractRole\"]")));
    		  r.selectByVisibleText("Non - Admin");
    		  Thread.sleep(5000);
    		  Locator.loc(driver).click();
    		  Thread.sleep(4000);
    		  Locator.ld(driver).click();
    		  Thread.sleep(3000);
    		  Locator.save(driver).click();
    		  test.log(LogStatus.PASS,"User created successfully");
    		  Thread.sleep(3000);
    		  Locator.close(driver).click();
    	}
		  
		  public static void edituser(WebDriver driver,ExtentTest test) throws InterruptedException
		  {
			  Thread.sleep(3000);
			  Locator.mastermenuclick(driver).click();
			  Thread.sleep(2000);
			  Locator.usertab(driver).click();
			  Thread.sleep(2000);
			  Locator.edituserclick(driver).click();
			  Thread.sleep(2000);
			  Locator.desg(driver).clear();
			  Thread.sleep(2000);
			  Locator.desg(driver).sendKeys("research dept");
			  Thread.sleep(2000);
			  Locator.contactno(driver).clear();
			  Thread.sleep(2000);
			  Locator.contactno(driver).sendKeys("9048754825");
			  Thread.sleep(2000);
			  Locator.updateuser(driver).click();
			  test.log(LogStatus.PASS, "User updated successfully");
			  Thread.sleep(2000);
			  
		  }
    
          public static void vendorcreate(WebDriver driver,ExtentTest test) throws InterruptedException
          {
        	  Thread.sleep(3000);
        	  Locator.mastermenuclick(driver).click();
        	  Thread.sleep(2000);
        	  Locator.vendortab(driver).click();
        	  Thread.sleep(3000);
        	  Locator.addnewvendor(driver).click();
        	  Thread.sleep(3000);
        	  driver.switchTo().frame("ContentPlaceHolder1_IframePartyDetial");
        	  Thread.sleep(3000);
        	  Locator.vendorname(driver).sendKeys("Intellodesign Vendors 555");
        	  Thread.sleep(2000);
        	  Locator.vendoraddress(driver).sendKeys("Sangli");
        	  Thread.sleep(2000);
        	  Locator.savevendor(driver).click();
        	
   		   	
  	 
        	 try 
   		  {
        		 Thread.sleep(1000);
   		   String msg=Locator.vendorsuccessmsg(driver).getText();
   	        test.log(LogStatus.PASS,"Message displayed = "+msg );
   	       
   		  }
        	 
   	      catch(Exception  e) 
   		  {
   	    	 Thread.sleep(3000);
   			 String msg1=Locator.vendorfailmsg(driver).getText();
   			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
   			
   		  }
        	 
        	 Locator.closevendor(driver).click();
        	 
        	  /*Thread.sleep(3000);
        	  driver.navigate().refresh();
        	  Thread.sleep(3000);
        	  Locator.vsearchbox(driver).sendKeys("Woodland Vendors",Keys.ENTER);
        	  
        	  //Thread.sleep(3000);
        	  
        	  Thread.sleep(3000);
  	    	Locator.vendoredit(driver).click(); 
  	    	Thread.sleep(3000);
  	    	driver.switchTo().frame("ContentPlaceHolder1_IframePartyDetial");
  	    	Thread.sleep(3000);
  	    	Locator.vedit(driver).clear();
  	    	Thread.sleep(2000);
  	    	Locator.vedit(driver).sendKeys("Mr. Atul Singh");
  	    	Thread.sleep(3000);
  	    	Locator.vendoremail(driver).clear();
  	    	Thread.sleep(2000);
  	    	Locator.vendoremail(driver).sendKeys("atul@tlregtech.in");
  	    	Thread.sleep(3000);
  	    	Locator.vendorcontact(driver).clear();
  	    	Thread.sleep(2000);
  	    	Locator.vendorcontact(driver).sendKeys("9000000000");
  	    	Thread.sleep(3000);
  	    	Locator.vendorupdate(driver).click();
  	    	test.log(LogStatus.PASS, "Vendor detail updated successfully");
  	    	Thread.sleep(2000);
  	    	Locator.vendorclose(driver).click();*/
  	    
  	    

        	  /*WebDriverWait wait = new WebDriverWait(driver,20);
        	  By locator = By.xpath("//*[@class='form-control']");
        	  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        	  		Thread.sleep(4000);
       
        	  		WebElement ViewButton = driver.findElement(locator);	
        	  		Thread.sleep(4000);
        	  		ViewButton.sendKeys("A-One");
        	  Locator.vendoredit(driver).click();*/
        	 
          }
          public static void editvendor(WebDriver driver,ExtentTest test) throws InterruptedException
          {
        	 // Locator.vendoredit(driver).click();
        	    //String w=Locator.vendorfind(driver).getText();
        	    //System.out.println(w);
        	    
        	        Thread.sleep(2000);
        	        Locator.mastermenuclick(driver).click();
        	        Thread.sleep(2000);
        	        Locator.vendortab(driver).click();
        	        Thread.sleep(2000);
        	    	Locator.vendoredit(driver).click(); 
        	    	Thread.sleep(2000);
        	    	driver.switchTo().frame("ContentPlaceHolder1_IframePartyDetial");
        	    	Thread.sleep(2000);
        	    	//Locator.vendoredit(driver).clear();
        	    	//Thread.sleep(2000);
        	    	Locator.vendorcontactperson(driver).clear();
        	    	Thread.sleep(2000);
        	    	Locator.vendorcontactperson(driver).sendKeys("Ankit Singh");
        	    	Thread.sleep(2000);
        	    	Locator.vendoremail(driver).clear();
        	    	Thread.sleep(2000);
        	    	Locator.vendoremail(driver).sendKeys("ankit@tlregtech.in");
        	    	Thread.sleep(2000);
        	    	Locator.vendorcontact(driver).clear();
        	    	Thread.sleep(2000);
        	    	Locator.vendorcontact(driver).sendKeys("9000000123");
        	    	Thread.sleep(3000);
        	    	Locator.vendorupdate(driver).click();
        	    	test.log(LogStatus.PASS, "Vendor detail updated successfully");
        	    	Thread.sleep(2000);
        	    	Locator.vendorclose(driver).click();
        	    
        	    
        	}
           public static void vendordelete(WebDriver driver,ExtentTest test) throws InterruptedException
           {
        	   		Locator.mastermenuclick(driver).click();
        	   		Thread.sleep(3000);
        	   		Locator.vendortab(driver).click();
        	   		Thread.sleep(2000);
        	   		Locator.vendordelete(driver).click();
        	   		Thread.sleep(2000);
        	   		driver.switchTo().alert().accept();
        	   		String msg = Locator.deletevendor(driver).getText();
        		   
        			if(msg.equalsIgnoreCase("Vendor Deleted Successfully"))
        			{
        				test.log(LogStatus.PASS, "Message displayed = "+msg);
        				//flag = 1;
        			}
        			else
        			{
        				test.log(LogStatus.PASS, "Message Displayed="+msg);
        			}

        		   Thread.sleep(2000);
        		   driver.navigate().refresh();
        	   }
           
	  
            public static void contracttypecreate(WebDriver driver,ExtentTest test) throws InterruptedException
            {
            	Thread.sleep(2000);
            	Locator.mastermenuclick(driver).click();
            	Thread.sleep(2000);
            	Locator.contracttypemaster(driver).click();
            	Thread.sleep(2000);
            	Locator.addcontracttype(driver).click();
            	Thread.sleep(2000);            
            	driver.switchTo().frame("ContentPlaceHolder1_IframeCaseType");
            	Thread.sleep(2000);
            	Locator.contracttypename(driver).sendKeys("Lab Design Contract 555");
            	Thread.sleep(2000);
            	Locator.contracttypesave(driver).click();
            	 try 
          		  {
               		 Thread.sleep(1000);
          		   String msg=Locator.contracttypesuccessmsg(driver).getText();
          	        test.log(LogStatus.PASS,"Message displayed = "+msg );
          	       
          		  }
               	 
          	      catch(Exception  e) 
          		  {
          	    	 Thread.sleep(3000);
          			 String msg1=Locator.contracttypefailmsg(driver).getText();
          			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
          			
          		  }
               	 
            	
            	Thread.sleep(2000);
            	Locator.contracttypeclose(driver).click();
            	Thread.sleep(2000);
            	driver.navigate().refresh();
            	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            	//Locator.contracttypesearch(driver).sendKeys("Bilateral Contract",Keys.ENTER);
            	//String c=Locator.contracttypefind(driver).getText();
            	//System.out.println(c);
            	//Select s=new Select(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPageSize']")));
            	//s.selectByIndex(3);
            	//Thread.sleep(2000);
            	//JavascriptExecutor js = (JavascriptExecutor) driver;
            	//js.executeScript("window.scrollBy(0,2000)", "");
            	//Thread.sleep(3000);
            	//Locator.pgdropdown(driver).click();
            	//Thread.sleep(2000);
            	//Locator.selectpage(driver).click();
            	//Thread.sleep(2000);
            	//String ct=Locator.ctypefind(driver).getText();
            	//System.out.println(ct);
            	//Locator.ctypesearch(driver).sendKeys("Bilateral");
            	/*if(ct.contains("Bilateral"))
            	{
                	Locator.typeedit(driver).click();
                	Thread.sleep(3000);
                	driver.switchTo().frame("ContentPlaceHolder1_IframeCaseType");
                	Thread.sleep(2000);
                	Locator.ctypeupdate(driver).clear();
                	Thread.sleep(2000);
                	Locator.ctypeupdate(driver).sendKeys("Bilateral Contract 123");
                	Thread.sleep(2000);
                	Locator.ctypesave(driver).click();
                	Thread.sleep(2000);
                	Locator.ctypeclose(driver).click();
            	}*/
            	
            	/*Locator.ctypedelete(driver).click();
            	Thread.sleep(2000);
            	driver.switchTo().alert().accept();
            	Thread.sleep(2000);
            	driver.navigate().refresh();*/
            	
            }
            
            public static void contracttypeedit(WebDriver driver,ExtentTest test) throws InterruptedException
            {
            	Thread.sleep(2000);
            	Locator.mastermenuclick(driver).click();
            	Thread.sleep(2000);
            	Locator.contracttypemaster(driver).click();
            	Thread.sleep(2000);
            	Locator.contracttypeedit(driver).click();
            	Thread.sleep(2000);
            	driver.switchTo().frame("ContentPlaceHolder1_IframeCaseType");
            	Thread.sleep(2000);
            	Locator.contracttypename(driver).clear();
            	Thread.sleep(2000);
            	Locator.contracttypename(driver).sendKeys("contract for laboratory design 555");
            	Thread.sleep(2000);
            	Locator.contracttypesave(driver).click();
            	Thread.sleep(2000);
            	test.log(LogStatus.PASS, "Contract type updated successfully");
            	Thread.sleep(2000);
            	Locator.contracttypeclose(driver).click();
            	Thread.sleep(2000);
            	driver.navigate().refresh();
            	
            }
            
            public static void contracttypedelete(WebDriver driver,ExtentTest test) throws InterruptedException
            {
            	Thread.sleep(2000);
            	Locator.mastermenuclick(driver).click();
            	Thread.sleep(2000);
            	Locator.contracttypemaster(driver).click();
            	Thread.sleep(2000);
            	Locator.contracttypedelete(driver).click();
            	driver.switchTo().alert().accept();
    	   		/*String msg = Locator.contracttypedelete(driver).getText();
    		   
    			if(msg.equalsIgnoreCase("Vendor Deleted Successfully"))
    			{
    				test.log(LogStatus.PASS, "Message displayed = "+msg);
    				//flag = 1;
    			}
    			else
    			{
    				test.log(LogStatus.FAIL, "Message Displayed="+msg);
    			}
            }*/
            	test.log(LogStatus.PASS,"Contract type deleted successfully");
            	Thread.sleep(2000);
            	driver.navigate().refresh();
            }

            public static void subcontracttypecreate(WebDriver driver,ExtentTest test) throws InterruptedException
            {
            	    //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            		Thread.sleep(2000);
            		Locator.mastermenuclick(driver).click();
            		Thread.sleep(2000);
            		Locator.contracttypemaster(driver).click();
            		Thread.sleep(2000);
            		Locator.subcontracttype(driver).click();
            		Thread.sleep(2000);
            		Locator.addsubcontracttype(driver).click();
            		Thread.sleep(2000);
            		driver.switchTo().frame("ContentPlaceHolder1_Iframesubconttype");
            		Thread.sleep(2000);
            		Locator.subcontracttypetext(driver).sendKeys("sub-lab design contract 555");
            		Thread.sleep(2000);
            		Locator.subcontracttypesave(driver).click();
            		//Locator.subcontracttype(driver).click();
            		try 
            		  {
                 		 Thread.sleep(1000);
            		   String msg=Locator.subcontracttypesuccessmsg(driver).getText();
            	        test.log(LogStatus.PASS,"Message displayed = "+msg );
            	       
            		  }
                 	 
            	      catch(Exception  e) 
            		  {
            	    	 Thread.sleep(3000);
            			 String msg1=Locator.subcontracttypefailmsg(driver).getText();
            			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
            		  }
            		  Thread.sleep(2000);
            		Locator.subcontracttypeclose(driver).click();
            		Thread.sleep(2000);
            		driver.navigate().refresh();
            		//driver.navigate().refresh();
            		/*Locator.subctypeedit(driver).click();
            		//Thread.sleep(3000);
            		driver.switchTo().frame("ContentPlaceHolder1_Iframesubconttype");
            		Locator.subctypetext(driver).clear();
            		Locator.subctypetext(driver).sendKeys("multi-bilateral contract 123");
            		Locator.subctypesave(driver).click();
            		Locator.subctypeclose(driver).click();
            		driver.navigate().refresh();
            		//Thread.sleep(3000);
            		Locator.subctypedelete(driver).click();
            		//Thread.sleep(3000);
            		driver.switchTo().alert().accept();
            		//Thread.sleep(3000);
            		driver.navigate().refresh();
            		Locator.subctypeback(driver).click();*/
            	}
            
             public static void subcontracttypeedit(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(3000);
            	Locator.mastermenuclick(driver).click();
         		Thread.sleep(2000);
         		Locator.contracttypemaster(driver).click();
         		Thread.sleep(2000);
         		Locator.subcontracttype(driver).click();
         		Thread.sleep(2000);
         		Locator.subcontracttypeedit(driver).click();
         		Thread.sleep(2000);
         		driver.switchTo().frame("ContentPlaceHolder1_Iframesubconttype");
         		Thread.sleep(2000);
        		Locator.subcontracttypetext(driver).clear();
        		Thread.sleep(2000);
        		Locator.subcontracttypetext(driver).sendKeys("sub-lab modal contract 555");
        		Thread.sleep(2000);
        		Locator.subcontracttypesave(driver).click();
        		try 
      		  {
           		 Thread.sleep(1000);
      		   String msg=Locator.subcontracttypesuccessmsg(driver).getText();
      	        test.log(LogStatus.PASS,"Message displayed = "+msg );
      	       
      		  }
           	 
      	      catch(Exception  e) 
      		  {
      	    	 Thread.sleep(3000);
      			 String msg1=Locator.subcontracttypefailmsg(driver).getText();
      			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
      		  }

        		Thread.sleep(2000);
        		Locator.subcontracttypeclose(driver).click();
        		Thread.sleep(2000);
        		driver.navigate().refresh();

         		
             }
             
             public static void subcontractypedelete(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 //Thread.sleep(3000);
            	Locator.mastermenuclick(driver).click();
          		Thread.sleep(2000);
          		Locator.contracttypemaster(driver).click();
          		Thread.sleep(2000);
          		Locator.subcontracttype(driver).click();
          		Thread.sleep(2000);
          		Locator.subcontracttypedelete(driver).click();
          		Thread.sleep(2000);
          		driver.switchTo().alert().accept();
          		test.log(LogStatus.PASS, "Contract Sub-Type Deleted Successfully");
          		Thread.sleep(2000);
          		driver.navigate().refresh();
          		
             }
             public static void documenttypecreate(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            	 Thread.sleep(2000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.doctypeclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.doctypeadd(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeDocType");
            	 Thread.sleep(2000);
            	 Locator.doctypetext(driver).sendKeys("contract design document 555");
            	 Thread.sleep(2000);
            	 Locator.doctypesave(driver).click();
            	 try 
         		  {
              		 Thread.sleep(1000);
         		   String msg=Locator.contractdoctypesuccessmsg(driver).getText();
         	        test.log(LogStatus.PASS,"Message displayed = "+msg );
         	       
         		  }
              	 
         	      catch(Exception  e) 
         		  {
         	    	 Thread.sleep(3000);
         			 String msg1=Locator.contractdoctypefailmsg(driver).getText();
         			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
         		  }
            	 Thread.sleep(2000);
            	 Locator.doctypeclose(driver).click();
            	 Thread.sleep(2000);
            	 driver.navigate().refresh();
            	 /*Locator.doctypesearch(driver).sendKeys("Contract draft document",Keys.ENTER);
            	 Locator.doctypedit(driver).click();
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeDocType");
            	 Locator.doctypetext(driver).clear();
            	 Locator.doctypetext(driver).sendKeys("Contract draft document 123");
            	 Locator.doctypesave(driver).click();
            	 Locator.doctypeclose(driver).click();
            	 Locator.doctypedelete(driver).click();
            	 driver.switchTo().alert().accept();
            	 driver.navigate().refresh();*/

             }
             
             public static void documenttypeedit(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(2000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.doctypeclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.doctypedit(driver).click();
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeDocType");
            	 Locator.doctypetext(driver).clear();
            	 Locator.doctypetext(driver).sendKeys("document for contract design 555");
            	 Thread.sleep(2000);
            	 Locator.doctypesave(driver).click();
            	 try 
        		  {
             		 Thread.sleep(1000);
        		   String msg=Locator.contractdoctypeupdatesuccessmsg(driver).getText();
        	        test.log(LogStatus.PASS,"Message displayed = "+msg );
        	       
        		  }
             	 
        	      catch(Exception  e) 
        		  {
        	    	 Thread.sleep(3000);
        			 String msg1=Locator.contractdoctypefailmsg(driver).getText();
        			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
        		  }
            	 Thread.sleep(2000);
            	 Locator.doctypeclose(driver).click();

             }
             
             public static void documenttypedelete(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(2000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.doctypeclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.doctypedelete(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().alert().accept();
            	 test.log(LogStatus.PASS,"Document Type Deleted Successfully");
            	 Thread.sleep(2000);
            	 driver.navigate().refresh();
             }
             
             public static void departmentcreate(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            	 Thread.sleep(2000);
            	Locator.mastermenuclick(driver).click();
            	Thread.sleep(2000);
            	Locator.deptclick(driver).click();
            	Thread.sleep(2000);
            	Locator.contractdeptadd(driver).click();
            	Thread.sleep(2000);
            	driver.switchTo().frame("ContentPlaceHolder1_IframeDocType");
            	Thread.sleep(2000);
            	Locator.contractdeptname(driver).sendKeys("Graphics and Design 555");
            	Thread.sleep(2000);
            	Locator.contractdeptsave(driver).click();
            	try 
      		  {
           		 Thread.sleep(1000);
      		   String msg=Locator.contractdeptsuccessmsg(driver).getText();
      	        test.log(LogStatus.PASS,"Message displayed = "+msg );
      	       
      		  }
           	 
      	      catch(Exception  e) 
      		  {
      	    	 Thread.sleep(3000);
      			 String msg1=Locator.contractdeptfailmsg(driver).getText();
      			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
      		  }
            	
            	Thread.sleep(2000);
            	Locator.contractdeptclose(driver).click();
            	Thread.sleep(2000);
            	//driver.switchTo().parentFrame();
            	Thread.sleep(2000);
            	driver.navigate().refresh();
            	//Locator.deptadd(driver).click();
            	//driver.switchTo().frame("ContentPlaceHolder1_IframeDocType");
            	//Locator.deptname(driver).sendKeys("Contract Management Department");
            	/*if(Locator.deptsave(driver).isEnabled())
                  {
            		Locator.deptsave(driver).click();
                	Locator.deptclose(driver).click();
            	  }
            	else
            	{
            		driver.switchTo().parentFrame();
            		Locator.deptpopupclose(driver).click();
            	}*/
            	
            	/*Thread.sleep(3000);
            	Locator.deptsearch(driver).sendKeys("Logistic");
            	Thread.sleep(4000);
            	Locator.deptsearchapply(driver).click();
            	Thread.sleep(2000);
          	Locator.deptsearchapply(driver).click();
            	Thread.sleep(3000);
            	Locator.deptedit(driver).click();
            	Thread.sleep(3000);
            	driver.switchTo().frame("ContentPlaceHolder1_IframeDocType");
            	Thread.sleep(4000);
            	Locator.deptupdate(driver).clear();
            	Thread.sleep(3000);
            	Locator.deptupdate(driver).sendKeys("Logistic Works Department");
            	Thread.sleep(3000);
            	Locator.deptsavebtn(driver).click();
            	Thread.sleep(3000);
            	Locator.deptclose(driver).click();*/
             }
             
             public static void departmentdelete(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(3000);
             	Locator.mastermenuclick(driver).click();
             	Thread.sleep(2000);
             	Locator.deptclick(driver).click();
             	Thread.sleep(2000);
             	Locator.contractdeptsearch(driver).sendKeys("Graphics and Design 555");
             	Thread.sleep(2000);
             	Locator.contractdeptsearchapply(driver).click();
             	Thread.sleep(2000);
             	Locator.contractdeptdelete(driver).click();
             	//Thread.sleep(2000);
             	driver.switchTo().alert().accept();
             	test.log(LogStatus.PASS,"Department Deleted Successfully.");
             	Thread.sleep(2000);
             	driver.navigate().refresh();
             }
             public static void customfieldadd(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(3000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customadd(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeCustomFields");
            	 Thread.sleep(2000);
            	 Locator.customdropdown(driver).click();
            	 Thread.sleep(2000);
            	 //Select s=new Select(driver.findElement(By.className("multiselect-selected-text")));
            	 //s.selectByIndex(1);
            	 Locator.customdropdowncheck(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customdropdown(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customdropdownfield(driver).sendKeys("contract design parameter 555");
            	 Thread.sleep(2000);
            	 Locator.customdfieldsave(driver).click();
            	 try 
         		  {
              		 Thread.sleep(1000);
         		   String msg=Locator.contractcustomfieldsuccessmsg(driver).getText();
         	        test.log(LogStatus.PASS,"Message displayed = "+msg );
         	       
         		  }
              	 
         	      catch(Exception  e) 
         		  {
         	    	 Thread.sleep(1000);
         			 String msg1=Locator.contractcustomfieldfailmsg(driver).getText();
         			  test.log(LogStatus.FAIL, "Message displayed= " +msg1);
         		  }
            	 Thread.sleep(3000);
            	 Locator.contractcustomfieldclose(driver).click();
            	 //Locator.contractcustomfieldclose(driver).click();
            	 /*Thread.sleep(2000);
            	 Locator.customfieldnamedropdown(driver).click();
            	 Locator.customfieldselect(driver).click();
            	 //driver.navigate().refresh();
            	 //Select s=new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlType")));
            	 //s.selectByIndex(0);
            	 Locator.customdfieldsearch(driver).sendKeys("vendor amount",Keys.ENTER);
            	 //driver.switchTo().frame("ContentPlaceHolder1_IframeCustomFields");
            	 Locator.customfieldedit(driver).click();
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeCustomFields");
            	 Locator.customfieldnameedit(driver).clear();
            	 Locator.customfieldnameedit(driver).sendKeys("vendor draft amount");
                 Locator.customfieldupdate(driver).click();
                 Locator.customfieldclose(driver).click();
                 Locator.customdfieldsearch(driver).clear();
                 Locator.customdfieldsearch(driver).sendKeys("vendor amount",Keys.ENTER);
                 Locator.customfielddelete(driver).click();*/
                 //driver.switchTo().alert().accept();
             }
             
             public static void customfieldedit(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(3000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customfieldedit(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeCustomFields");
            	 Thread.sleep(2000);
            	 Locator.customfieldnameedit(driver).clear();
            	 Thread.sleep(2000);
            	 Locator.customfieldnameedit(driver).sendKeys("contract design parameter 555");
            	 Thread.sleep(2000);
            	 Locator.customfieldupdate(driver).click();
            	 test.log(LogStatus.PASS, "Custom Field Updated Successfully.");
            	 Thread.sleep(2000);
            	 Locator.customdfieldclose(driver).click();
            	 Thread.sleep(2000);
            	 driver.navigate().refresh();
            	 
             }
             
             public static void customdfielddelete(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(3000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.customfielddelete(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().alert().accept();
            	 test.log(LogStatus.PASS,"Custom Field Deleted Successfully");
            	 Thread.sleep(2000);
            	 driver.navigate().refresh();
             }
             
             public static void departmentmappingadd(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            	 Thread.sleep(3000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.deptmappingclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.deptmappingaddnew(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeDocType");
            	 Thread.sleep(2000);
            	 Locator.deptmappinguser(driver).click();
            	 Thread.sleep(2000);
            	 Locator.deptmappingusersearch(driver).sendKeys("finance executive",Keys.ENTER);
            	 Thread.sleep(2000);
            	 Locator.deptmappinguserdeptcheck(driver).click();
            	 Thread.sleep(2000);
            	 Locator.deptmappingusersave(driver).click();
            	 test.log(LogStatus.PASS,"User Department Mapping Saved Successfully.");
            	 Thread.sleep(2000);
            	 Locator.deptmappinguserclose(driver).click();
            	 Thread.sleep(2000);
            	 driver.navigate().refresh();
             } 
             
             public static void departmentmappingdelete(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(3000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.deptmappingclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.contractdeptmapdelete(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().alert().accept();
            	 test.log(LogStatus.PASS, "User Department mapping Deleted Successfully");
            	 Thread.sleep(2000);
            	 driver.navigate().refresh();
            	 
             }
             
             public static void section(WebDriver driver,ExtentTest test) throws InterruptedException 
             {
            	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            	 Locator.mastermenuclick(driver).click();
            	 Locator.templatemenu(driver).click();
            	 Locator.addsection(driver).click();
            	 Locator.addsectionclick(driver).click();
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeTemplateSection");
            	 
            	 
            	 Locator.sectionheader(driver).sendKeys("Contract framing section");
            	 Locator.sectiondept(driver).click();
            	 Locator.chooseDropDownOption(driver).get(4).click();
            	 Locator.headervisibility(driver).click();
            	 Locator.showheader(driver).click();
            	 driver.switchTo().frame("theEditor_contentIframe");
            	 Locator.sectioncontent(driver).sendKeys("contract design section 555");
            	 driver.switchTo().parentFrame();
            	 Locator.sectionsave(driver).click();
            	 Locator.sectionclose(driver).click();
             }
             public static void sectionedit(WebDriver driver,ExtentTest test) throws InterruptedException 
             {
            	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            	 Locator.mastermenuclick(driver).click();
            	 Locator.templatemenu(driver).click();
            	 Locator.addsection(driver).click();
            	 Locator.sectionupdate(driver).click();
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeTemplateSection");
            	 driver.switchTo().frame("theEditor_contentIframe");
            	 Locator.sectioncontent(driver).clear();
                 Locator.sectioncontent(driver).sendKeys("section for design of contract 555");
                 driver.switchTo().parentFrame();
                 Locator.sectionsave(driver).click();
                 Locator.sectionclose(driver).click();
             }
             public static void sectiondelete(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            	 Locator.mastermenuclick(driver).click();
            	 Locator.templatemenu(driver).click();
            	 Locator.addsection(driver).click();
            	 Locator.sectiondelete(driver).click();
            	 Thread.sleep(3000);
            	 driver.switchTo().alert().accept();
             }
             public static void templateadd(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            	 Locator.mastermenuclick(driver).click();
            	 Locator.templatemenu(driver).click();
            	 Locator.templateadd(driver).click();
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeContractTemplate");
            	 Locator.templatename(driver).sendKeys("contract design template 555");
            	 Locator.templatedept(driver).click();
            	 Locator.templatedeptcheckbox(driver).click();
            	 Locator.templatedept(driver).click();
            	 Locator.approverlevel(driver).sendKeys("1");
            	 Locator.sectionorder(driver).sendKeys("1");
            	 Locator.sectionordercheckbox(driver).click();
            	 Locator.sectiondeptdropdown(driver).click();
            	 Locator.sectiondeptdropdownoption(driver).click();
            	 Thread.sleep(3000);
            	 Locator.templatereviewerdropdown(driver).click();
            	 //Locator.templatereviewersearch(driver).sendKeys("finance manager");
            	 Locator.temaplatereviewerselect(driver).click();
            	 Locator.templatesave(driver).click();
            	 driver.switchTo().parentFrame();
            	 Locator.templatepopupclose(driver).click();
             }
             
             public static void templateupdate(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(2000);
            	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            	 Locator.mastermenuclick(driver).click();
            	 Locator.templatemenu(driver).click();
            	 Locator.templatesearch(driver).sendKeys("contract design template 555",Keys.ENTER);
            	 Locator.templateedit(driver).click();
            	 driver.switchTo().frame("ContentPlaceHolder1_IframeContractTemplate");
            	 Locator.templatetwo(driver).click();
            	 driver.switchTo().frame("showdetails");
            	 Locator.templatestatusbox(driver).click();
            	 driver.switchTo().frame("showdetails");
            	 Locator.templatereviewer(driver).click();
            	 Locator.templatereviewerselect(driver).click();
            	 Locator.templatereviewersubmit(driver).click();
            	 driver.switchTo().parentFrame();
            	 Locator.templateexport(driver).click();
            	 Thread.sleep(2000);
            	 driver.switchTo().parentFrame();
            	 Thread.sleep(2000);
            	 Locator.templatepopupclose(driver).click();
             }
             
             public static void pageauthorisation(WebDriver driver,ExtentTest test) throws InterruptedException
             {
            	 Thread.sleep(3000);
            	 Locator.mastermenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.pageauthorisationmenuclick(driver).click();
            	 Thread.sleep(2000);
            	 Locator.pageauthorisationuserdropdown(driver).click();
            	 Thread.sleep(2000);
            	 Locator.pageauthorisationuserselect(driver).click();
            	 Thread.sleep(2000);
            	 Locator.pageauthorisationuserselectcheckbox(driver).click();
            	 Thread.sleep(2000);
            	 Locator.pageauthorisationsave(driver).click();
            	 test.log(LogStatus.PASS, "Page Authorization Value Save Successfully");
            	 Thread.sleep(2000);
            	 driver.navigate().refresh();
             }
             
            /* public static void addcontract(WebDriver driver, ExtentTest test)
             {
            	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            	 Locator.workspacetab(driver).click();
            	 Locator.contracttab(driver).click();
            	 Locator.addcontractclick(driver).click();
            	 driver.switchTo().frame("showdetails");
            	 Locator.contracttypedropdown(driver).click();
             }*/
             
            /* public static void driverclose() 
             {
            	  driver.close();
             }*/
        }

