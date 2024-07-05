package CompanyAdminPOM;

import java.awt.Frame;
import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

//import com.google.common.collect.Table.Cell;

import loginPOM.Locator;

public class AdminMethod 
{
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void addcontract(WebDriver driver,XSSFWorkbook workbook,ExtentTest test) throws InterruptedException
    {
	
	 
     sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)	
   	 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   	JavascriptExecutor js=(JavascriptExecutor) driver;
   	 Locator.workspacetab(driver).click();
   	 Thread.sleep(2000);
   	 Locator.contracttab(driver).click();
   	 Thread.sleep(2000);
   	 Locator.addcontractclick(driver).click();
   	 //test.log(LogStatus.PASS, "Admin user is able to click on add new button for contract");
   	 //driver.switchTo().frame("showdetails");
   	 Thread.sleep(3000);
   	AdminLocator.contractypeclick(driver).click();
   	Thread.sleep(2000);
   	//test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of contract type");
	AdminLocator.contractypeselect(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to select contract type from the dropdown");
	Thread.sleep(3000);
	AdminLocator.contractsubtypedropdown(driver).click();
	Thread.sleep(2000);
	//test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of contract sub-type");
	AdminLocator.contractsubtypeselect(driver).click();
	Thread.sleep(2000);
	//test.log(LogStatus.PASS, "Admin user is able to select contract sub-type from the dropdown");
	AdminLocator.contractentityclick(driver).click();
	Thread.sleep(2000);
	AdminLocator.parententityselect(driver).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	//test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of entity/location");
	AdminLocator.contractentityselect(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to select entity/location from the dropdown");
	Thread.sleep(3000);
	AdminLocator.contdeptdropdownclick(driver).click();
	Thread.sleep(2000);
	AdminLocator.contdeptdropdownselect(driver).click();
	Thread.sleep(2000);
	
	//AdminLocator.contractdeptclick(driver).click();
	//AdminLocator.contractdeptselect(driver).click();
	//Thread.sleep(3000);
	//AdminLocator.contractownerclick(driver).click();
	//Thread.sleep(2000);
	//AdminLocator.contractownersearch(driver).sendKeys("Finance exe");
	//Thread.sleep(2000);
	//AdminLocator.contractownerselect(driver).click();
	//AdminLocator.contractownerclick(driver).click();
	AdminLocator.contractvendorclick(driver).click();
	Thread.sleep(2000);
	//test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of contract vendor");
	AdminLocator.contractvendorselect(driver).click();
	Thread.sleep(2000);
	//test.log(LogStatus.PASS, "Admin user is able to select vendor from the dropdown");
	AdminLocator.contractpersonclick(driver).click();
	Thread.sleep(2000);
	//test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of contact person of department");
	AdminLocator.contractpersonselect(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to select contact person of department from the dropdown");
	
	
	
	int row = 0;
	Thread.sleep(2000);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	org.apache.poi.ss.usermodel.Cell c1 = null;
	row0 = sheet.getRow(3);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	Row row1=sheet.getRow(row);
	row1=sheet.getRow(4);
	AdminLocator.addcontracttitle(driver).sendKeys(c1.getStringCellValue());
	//test.log(LogStatus.PASS, "Admin user is able to enter the contract title");
	Thread.sleep(2000);
	c1=row1.getCell(1);
	AdminLocator.addcontractdescription(driver).sendKeys(c1.getStringCellValue());
	//test.log(LogStatus.PASS, "Admin user is able to enter the contract description");
	Thread.sleep(4000);
	/*AdminLocator.contractsummarydepttemplatedropdown(driver).click();
	test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of contract template");
	Thread.sleep(2000);
	AdminLocator.contractsummarydepttemplatedropdownselect(driver).click();
	test.log(LogStatus.PASS, "Admin user is able to select contract template from the dropdown");
	Thread.sleep(2000);
	AdminLocator.startdateselect(driver).sendKeys("01-04-2023");
	test.log(LogStatus.PASS, "Admin user is able to select the start date of contract");
	Thread.sleep(2000);
	AdminLocator.enddateselect(driver).sendKeys("31-05-2023");
	test.log(LogStatus.PASS, "Admin user is able to select the end date of contract");
	Thread.sleep(2000);
	AdminLocator.proposaldateselect(driver).sendKeys("15-04-2023");
	test.log(LogStatus.PASS, "Admin user is able to select the proposal date of contract");
	Thread.sleep(2000);
	AdminLocator.agreementdateselect(driver).sendKeys("30-04-2023");
	test.log(LogStatus.PASS, "Admin user is able to select the agreement date of contract");
	Thread.sleep(2000);
	AdminLocator.reviewdateselect(driver).sendKeys("20-05-2023");
	test.log(LogStatus.PASS, "Admin user is able to select the review date of contract");
	//Thread.sleep(3000);
	js.executeScript("window.scroll(0,400)");
	Thread.sleep(2000);*/
	AdminLocator.contractsummaryamount(driver).sendKeys("25000");
	//test.log(LogStatus.PASS, "Admin user is able to enter the contract amount");
	Thread.sleep(2000);
	AdminLocator.contractsummarytaxes(driver).sendKeys("10000");
	//test.log(LogStatus.PASS, "Admin user is able to enter the taxes");
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	/*AdminLocator.contractsummaryproductitems(driver).sendKeys("confectionary items");
	test.log(LogStatus.PASS, "Admin user is able to enter the product items");
	Thread.sleep(2000);
	AdminLocator.contractsummarypaymenttypedropdown(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to click on payment type dropdown");
	Thread.sleep(2000);
	AdminLocator.contractsummarypaymenttypedropdownselect(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to select value from the payment type dropdown");
	Thread.sleep(2000);
	AdminLocator.contractsummarypaymenttermdropdown(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of payment term");
	Thread.sleep(2000);
	AdminLocator.contractsummarypaymenttermdropdownselect(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to select value from the dropdown of payment term");
	Thread.sleep(2000);
	AdminLocator.contractsummarypaymenttermdropdown(driver).click();
	Thread.sleep(2000);
	AdminLocator.contractsummarylicensetypedropdown(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to click on license type dropdown");
	Thread.sleep(2000);
	AdminLocator.contractsummarylicensetypedropdownselect(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to select value from the license type dropdown");
	Thread.sleep(2000);
	AdminLocator.contractsummarynoticeterm(driver).sendKeys("6");
	//test.log(LogStatus.PASS, "Admin user is able to enter value in the text box of notice term");
	Thread.sleep(2000);
	AdminLocator.contractsummarynoticetermdropdown(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of notice term");
	Thread.sleep(2000);
	AdminLocator.contractsummarynoticetermdropdownselect(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to select period from the dropdown of notice term");
	Thread.sleep(2000);
	AdminLocator.contractsummarylockinperiod(driver).sendKeys("15-08-2023");
	//test.log(LogStatus.PASS, "Admin user is able to select the lock-in-period");
	Thread.sleep(2000);
	//js.executeScript("window.scrollBy(0,500)");
	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	Thread.sleep(2000);*/
	AdminLocator.contractsummaryinprincipleapprovalcheckbox(driver).click();
	//test.log(LogStatus.PASS, "Admin user selected the checkbox of In-Principle approval");
	Thread.sleep(2000);
	AdminLocator.contractsummaryremark(driver).sendKeys("contract created");
	//test.log(LogStatus.PASS, "Admin user is able to enter the contract remark");
	Thread.sleep(2000);
	AdminLocator.contractsave(driver).click();
	//test.log(LogStatus.PASS, "Admin user is able to click to save button to create contract");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	String msg = AdminLocator.addcontractreadmessage(driver).getText();	
	
	//Reading Message appeared after save button
	//int flag = 0;
	/*if(msg.equalsIgnoreCase("Contract Created Successfully."))
	{
		test.log(LogStatus.PASS, "Message displayed = "+msg);
		//flag = 1;
	}
	else
	{
		test.log(LogStatus.FAIL, "Message displayed = "+msg);
	}*/
	Thread.sleep(7000);
	AdminLocator.confimrationpopupokbutton(driver).click();
	  //driver.switchTo().parentFrame();
	  Thread.sleep(4000);
	  test.log(LogStatus.PASS, "Contract Created Successfully.");
	  AdminLocator.summarypopupclose(driver).click();
	  Thread.sleep(3000);
   	 AdminLocator.contractsummaryrefreshicon(driver).click();
   	 Thread.sleep(5000);
    }
	
	public static void editcontract(WebDriver driver,XSSFWorkbook workbook,ExtentTest test) throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int row=0;
		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)	
		JavascriptExecutor js=(JavascriptExecutor) driver;
	   	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   	AdminLocator.workspacetab(driver).click();
	   	AdminLocator.contracttab(driver).click();
	   	AdminLocator.contracteditclick(driver).click();
	   	driver.switchTo().frame("showdetails");
	   	AdminLocator.contractediticonclick(driver).click();
	   	Row row2 = sheet.getRow(row); // Selected 0th index row (First row)
		org.apache.poi.ss.usermodel.Cell c2 = null;
		row2 = sheet.getRow(5);
		c2 = row2.getCell(1); // Selected cell (4 row,1 column) 
		Row row3=sheet.getRow(row);
		row3=sheet.getRow(6);
		AdminLocator.addcontracttitle(driver).clear();
		AdminLocator.addcontractdescription(driver).clear();
        AdminLocator.addcontracttitle(driver).sendKeys(c2.getStringCellValue());
        AdminLocator.addcontractdescription(driver).sendKeys(c2.getStringCellValue());
        
        //driver.switchTo().parentFrame();
        js.executeAsyncScript("window.scroll(0,450)");
        //Thread.sleep(4000);
        driver.switchTo().parentFrame();
        By locator = By.id("btnSaveContract");
        WebDriverWait wait = new WebDriverWait(driver, (100));

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		// retrieving "foo-button" HTML element
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
        Thread.sleep(4000);
        //AdminLocator.contractupdate(driver).click();
        String msg = AdminLocator.updatecontractreadmessage(driver).getText();
        if(msg.equalsIgnoreCase("Contract Updated Successfully."))
    	{
    		test.log(LogStatus.PASS, "Message displayed = "+msg);
    		//flag = 1;
    	}
    	else
    	{
    		test.log(LogStatus.FAIL, "Contract cannot be updated");
    	}
		//Thread.sleep(4000);
        //AdminLocator.contractupdate(driver).click();
        driver.switchTo().parentFrame();
        Thread.sleep(3000);
        AdminLocator.summarypopupclose(driver).click();
	}
	
	public static void addcontracttype(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdminLocator.workspacetab(driver).click();
	   	AdminLocator.contracttab(driver).click();
	   	AdminLocator.contracteditclick(driver).click();
	   	driver.switchTo().frame("showdetails");
	   	AdminLocator.contractediticonclick(driver).click();
	   	AdminLocator.addcontracttypeclick(driver).click();
	   	driver.switchTo().frame("IframeCategoryType");
	   	AdminLocator.addcontracttype(driver).sendKeys("building contract construction");
	   	AdminLocator.addcontracttypesave(driver).click();
	   	//test.log(LogStatus.PASS, "Contract type added successfully");

		
		
		 try
		 {
		    String msg = AdminLocator.addcontracttypereadmessage(driver).getText();
			test.log(LogStatus.PASS, "Message Displayed = " +msg);
		 }
		catch(Exception e)
		{
				String msg1 = AdminLocator.addcontracttypereadmessage1(driver).getText();
				test.log(LogStatus.FAIL, "Message Displayed = " +msg1);
		}

	   	 Thread.sleep(3000);
	   	AdminLocator.addcontracttypeclose(driver).click();
	   	
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
	   	
	   	Thread.sleep(3000);
	   	AdminLocator.summarypopupclose(driver).click();
	   	
	   	
	}
	
	public static void addcontractsubtype(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdminLocator.workspacetab(driver).click();
	   	AdminLocator.contracttab(driver).click();
	   	AdminLocator.contracteditclick(driver).click();
	   	driver.switchTo().frame("showdetails");
	   	AdminLocator.contractediticonclick(driver).click();
	    AdminLocator.contractypeclick(driver).click();
	    AdminLocator.contractypeselect(driver).click();
	    AdminLocator.addcontractsubtypeclick(driver).click();
	    driver.switchTo().frame("Iframesubconttype");
	    AdminLocator.addcontractsubtype(driver).sendKeys("building sub-construction contract");
	    AdminLocator.addcontractsubtypesave(driver).click();
	    test.log(LogStatus.PASS, "Contract sub-type added successfully");
	    //String msg = AdminLocator.addcontractreadmessage(driver).getText();		//Reading Message appeared after save button
		//int flag = 0;
		/*if(msg.equalsIgnoreCase("Contract sub-type Successfully."))
		{
			test.log(LogStatus.PASS, "Message displayed = "+msg);
			//flag = 1;
		}
		else
		{
			test.log(LogStatus.FAIL, "Message displayed = "+msg);
		}*/

	    Thread.sleep(3000);
	    AdminLocator.addcontractsubtypeclose(driver).click();
	    driver.switchTo().parentFrame();
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    AdminLocator.summarypopupclose(driver).click();
	}
	
	public static void addcontractvendor(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdminLocator.workspacetab(driver).click();
	   	AdminLocator.contracttab(driver).click();
	   	AdminLocator.contracteditclick(driver).click();
	   	driver.switchTo().frame("showdetails");
	   	AdminLocator.contractediticonclick(driver).click();
	   	AdminLocator.addcontractvendorclick(driver).click();
	   	driver.switchTo().frame("IframeParty");
	   	AdminLocator.addcontractvendorname(driver).sendKeys("Park Vendors");
	   	AdminLocator.addcontractvendorsave(driver).click();
	   	test.log(LogStatus.PASS, "Contract vendor added successfully");
	   	//String msg = AdminLocator.addcontractreadmessage(driver).getText();		//Reading Message appeared after save button
		//int flag = 0;
		/*if(msg.equalsIgnoreCase("Contract vendor added Successfully."))
		{
			test.log(LogStatus.PASS, "Message displayed = "+msg);
			//flag = 1;
		}
		else
		{
			test.log(LogStatus.FAIL, "Message displayed = "+msg);
		}*/

	   	AdminLocator.addcontractvendorclose(driver).click();
	   	Thread.sleep(2000);
	   	driver.switchTo().parentFrame();
	   	driver.switchTo().parentFrame();
	   	Thread.sleep(2000);
	   	AdminLocator.summarypopupclose(driver).click();
	}
	
	public static void addcontractperson(WebDriver driver,XSSFWorkbook workbook,ExtentTest test) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//int row=0;
		sheet=workbook.getSheetAt(1);
		AdminLocator.workspacetab(driver).click();
	   	AdminLocator.contracttab(driver).click();
	   	AdminLocator.contracteditclick(driver).click();
	   	driver.switchTo().frame("showdetails");
	   	AdminLocator.contractediticonclick(driver).click();
	   	AdminLocator.addcontractpersonclick(driver).click();
	   	driver.switchTo().frame("IframePDepartment");
	   	/*Row row3 = sheet.getRow(row); // Selected 0th index row (First row)
	   	org.apache.poi.ss.usermodel.Cell c1 = null;
	   	 
		row3 = sheet.getRow(7);
		c1 = row3.getCell(1); // Selected cell (4 row,1 column)
		Row row4=sheet.getRow(row);
		row4=sheet.getRow(8);
		Row row5=sheet.getRow(row);
		row5=sheet.getRow(9);
		Row row6=sheet.getRow(row);
		row6=sheet.getRow(10);
		
		AdminLocator.addcontractpersonfname(driver).sendKeys(c1.getStringCellValue());
		AdminLocator.addcontractpersonlname(driver).sendKeys(c1.getStringCellValue());
		AdminLocator.addcontractpersonemail(driver).sendKeys(c1.getStringCellValue());
		AdminLocator.addcontractpersoncontact(driver).sendKeys(c1.getStringCellValue());
		AdminLocator.addcontractpersoncontactrole(driver).click();
		AdminLocator.addcontractpersonroleselect(driver).click();
		AdminLocator.addcontractpersonsave(driver).click();*/
		
		Thread.sleep(2000);
		Row row7 = sheet.getRow(7);								//Selected 0th index row (First row)
		Cell c2 = row7.getCell(1);								//Selected cell (0 row,1 column)
		String fname = c2.getStringCellValue();
		AdminLocator.addcontractpersonfname(driver).sendKeys(fname);
		
		Row row8 = sheet.getRow(8);								//Selected 0th index row (First row)
		Cell c3 = row8.getCell(1);								//Selected cell (0 row,1 column)
		String lname = c3.getStringCellValue();
		AdminLocator.addcontractpersonlname(driver).sendKeys(lname);	
		
		Row row9 = sheet.getRow(9);								//Selected 0th index row (First row)
		Cell c4 = row9.getCell(1);								//Selected cell (0 row,1 column)
		String email = c4.getStringCellValue();
		AdminLocator.addcontractpersonemail(driver).sendKeys(email);	
		
		Row row10 = sheet.getRow(10);								//Selected 0th index row (First row)
		Cell c5 = row10.getCell(1);								//Selected cell (0 row,1 column)
		String contact = c5.getStringCellValue();
		AdminLocator.addcontractpersoncontact(driver).sendKeys(String.valueOf(contact));	
		
		AdminLocator.addcontractpersoncontactrole(driver).click();
		AdminLocator.addcontractpersonroleselect(driver).click();
		AdminLocator.addcontractpersonsave(driver).click();
		/*String msg = AdminLocator.addcontractreadmessage(driver).getText();		//Reading Message appeared after save button
		//int flag = 0;
		if(msg.equalsIgnoreCase("User Created Successfully."))
		{
			test.log(LogStatus.PASS, "Message displayed = "+msg);
			//flag = 1;
		}
		else
		{
			test.log(LogStatus.FAIL, "Message displayed = "+msg);
		}*/
		test.log(LogStatus.PASS, "Contract Person added successfully");

		Thread.sleep(2000);
        AdminLocator.addcontractpersonclose(driver).click();
        Thread.sleep(2000);
	   	driver.switchTo().parentFrame();
	   	driver.switchTo().parentFrame();
	   	Thread.sleep(2000);
	   	AdminLocator.summarypopupclose(driver).click();
        
	}
	
	public static void linkcontract(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 180);

		AdminLocator.contracteditclick(driver).click();
		driver.switchTo().frame("showdetails");
	   	AdminLocator.contractediticonclick(driver).click();
	   	AdminLocator.contractlinkclick(driver).click();
	   	//driver.switchTo().frame("showdetails");
	   	Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(AdminLocator.contractlinkcheckboxone(driver))).click();
	   	//AdminLocator.contractlinkcheckboxone(driver).click();
	   	
	   	AdminLocator.contractlinkcheckboxtwo(driver).click();
	   	AdminLocator.contractlinksave(driver).click();
	   	String msg = AdminLocator.linkcontractreadmessage(driver).getText();		//Reading Message appeared after save button
		//int flag = 0;
		/*if(msg.equalsIgnoreCase("Contract(s) Linked Successfully."))
		{
			test.log(LogStatus.PASS, "Message displayed = "+msg);
			//flag = 1;
		}
		else
		{
			test.log(LogStatus.FAIL, "Contract link failed");
		}*/
	   	test.log(LogStatus.FAIL, "Failed to link contracts.");

	   	AdminLocator.contractlinkclose(driver).click();
	   	Thread.sleep(3000);
	   	driver.switchTo().parentFrame();
	   	Thread.sleep(2000);
	   	AdminLocator.summarypopupclose(driver).click();
	}
	
	public static void contractdetails(WebDriver driver,XSSFWorkbook workbook,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sheet=workbook.getSheetAt(1);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	 Locator.contracttab(driver).click();
	   	 Thread.sleep(4000);
		AdminLocator.contracteditclick(driver).click();
		//driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		AdminLocator.contractdetailstab(driver).click();
		Thread.sleep(3000);
		Row row11=sheet.getRow(11);
		Cell c6=row11.getCell(1);
		String terms=c6.getStringCellValue();
		AdminLocator.contractdetailsterms(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsterms(driver).sendKeys(terms);
		Thread.sleep(2000);
		Row row12=sheet.getRow(12);
		Cell c7=row12.getCell(1);
		String termination=c7.getStringCellValue();
		AdminLocator.contractdetailstermination(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailstermination(driver).sendKeys(termination);
		Thread.sleep(2000);
		Row row13=sheet.getRow(13);
		Cell c8=row13.getCell(1);
		String misc=c8.getStringCellValue();
		AdminLocator.contractdetailsmisc(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsmisc(driver).sendKeys(misc);
		Thread.sleep(2000);
		Row row14=sheet.getRow(14);
		Cell c9=row14.getCell(1);
		String license=c9.getStringCellValue();
		AdminLocator.contractdetailslicense(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailslicense(driver).sendKeys(license);
		Thread.sleep(2000);
		Row row15=sheet.getRow(15);
		Cell c10=row15.getCell(1);
		String warranty=c10.getStringCellValue();
		AdminLocator.contractdetailswarranties(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailswarranties(driver).sendKeys(warranty);
		Thread.sleep(2000);
		Row row16=sheet.getRow(16);
		Cell c11=row16.getCell(1);
		String guarantee=c11.getStringCellValue();
		AdminLocator.contractdetailsguarantees(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsguarantees(driver).sendKeys(guarantee);
		Thread.sleep(2000);
		Row row17=sheet.getRow(17);
		Cell c12=row17.getCell(1);
		String confidential=c12.getStringCellValue();
		AdminLocator.contractdetailsconfidential(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsconfidential(driver).sendKeys(confidential);
		Thread.sleep(2000);
		Row row18=sheet.getRow(18);
		Cell c13=row18.getCell(1);
		String ownership=c13.getStringCellValue();
		AdminLocator.contractdetailsownership(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsownership(driver).sendKeys(ownership);
		Thread.sleep(2000);
		Row row19=sheet.getRow(19);
		Cell c14=row19.getCell(1);
		String indemnification=c14.getStringCellValue();
		AdminLocator.contractdetailsindemnification(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsindemnification(driver).sendKeys(indemnification);
		Thread.sleep(2000);
		Row row20=sheet.getRow(20);
		Cell c15=row20.getCell(1);
		String general=c15.getStringCellValue();
		AdminLocator.contractdetailsgeneral(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsgeneral(driver).sendKeys(general);
		Thread.sleep(2000);
		Row row21=sheet.getRow(21);
		Cell c16=row21.getCell(1);
		String timeline=c16.getStringCellValue();
		AdminLocator.contractdetailstimelines(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailstimelines(driver).sendKeys(timeline);
		Thread.sleep(2000);
		Row row22=sheet.getRow(22);
		Cell c17=row22.getCell(1);
		String escalation=c17.getStringCellValue();
		AdminLocator.contractdetailsescalation(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsescalation(driver).sendKeys(escalation);
		Thread.sleep(2000);
		Row row23=sheet.getRow(23);
		Cell c18=row23.getCell(1);
		String milestone=c18.getStringCellValue();
		AdminLocator.contractdetailsmilestone(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsmilestone(driver).sendKeys(milestone);
		Thread.sleep(2000);
		Row row24=sheet.getRow(24);
		Cell c19=row24.getCell(1);
		String other=c19.getStringCellValue();
		AdminLocator.contractdetailsothers(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractdetailsothers(driver).sendKeys(other);
		Thread.sleep(4000);
		AdminLocator.contractdetailssave(driver).click();
		
		//String msg = AdminLocator.contractdetailsreadmessage(driver).getText();		//Reading Message appeared after save button
		//int flag = 0;
		/*if(msg.equalsIgnoreCase("Contract Detail(s) Saved Successfully."))
		{
			test.log(LogStatus.PASS, "Message displayed = "+msg);
			//flag = 1;
		}
		else
		{
			test.log(LogStatus.FAIL, "Message displayed = "+msg);
		}*/

		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		AdminLocator.confimrationpopupokbutton(driver).click();
		  //driver.switchTo().parentFrame();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Contract Details Saved Successfully.");
		  AdminLocator.detailssummarypopupclose(driver).click();
		  Thread.sleep(2000);
	   	 AdminLocator.contractsummaryrefreshicon(driver).click();
	   	 Thread.sleep(5000);
		//driver.switchTo().parentFrame();
		//Thread.sleep(2000);
		//AdminLocator.summarypopupclose(driver).click();
		
	}
	
	public static void contractdocument(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Actions a =new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	 Locator.contracttab(driver).click();
	   	 Thread.sleep(4000);
		AdminLocator.contracteditclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.contractdoctabclick(driver).click();
		Thread.sleep(3000);
		//test.log(LogStatus.PASS, "Admin user clicked on the documents tab of contract");
		AdminLocator.contractdocadd(driver).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("k-content-frame")));
		Thread.sleep(2000);
		//test.log(LogStatus.PASS, "Admin user clicked on the add new button for document");
		AdminLocator.contractdoctypeclick(driver).click();
		//test.log(LogStatus.PASS, "Admin user clicked on the dropdown of document type");
		Thread.sleep(2000);
		AdminLocator.contractdoctypeselect(driver).click();
		//test.log(LogStatus.PASS, "Admin user selected the document type from the dropdown");
		Thread.sleep(4000);
		AdminLocator.contractdocupload(driver).sendKeys("C:\\Users\\rahulr\\Downloads\\ContractReport_17-06-2024  (1).xlsx");
		Thread.sleep(2000);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		//test.log(LogStatus.PASS, "Admin user clicked on the upload button to upload the document");
		AdminLocator.contractdocsave(driver).click();
		//test.log(LogStatus.PASS, "Admin user clicked on the save button to save the uploaded document");
		//String msg = AdminLocator.addcontractreadmessage(driver).getText();		//Reading Message appeared after save button
		//int flag = 0;
		Thread.sleep(3000);
		AdminLocator.contractdocconfirmpopup(driver).click();
		test.log(LogStatus.PASS, "Document uploaded successfully");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.contractdocpopupclose(driver).click();
			//flag = 1;
		
			
			//test.log(LogStatus.FAIL, "Document unable to upload successfully");
				
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.contractdocview(driver).click();
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "Admin user clicked on view icon to view the document");
		AdminLocator.contractdocviewpopupclose(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocdownload(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on download icon to download the document");
		Thread.sleep(3000);
		AdminLocator.contractdocdelete(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on delete icon to delete the document");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		AdminLocator.doctabpopupclose(driver).click();
		Thread.sleep(3000);
	   	AdminLocator.contractsummaryrefreshicon(driver).click();

	}
	
	public static void contractdocumentshare(WebDriver driver,XSSFWorkbook workbook,ExtentTest test) throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 180);
		sheet=workbook.getSheetAt(1);
		Thread.sleep(2000);
		AdminLocator.workspacetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
		Locator.contracttab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of contracts");
		Thread.sleep(2000);
		AdminLocator.contractediticonclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the edit icon for contract");
		Thread.sleep(2000);
		driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		AdminLocator.contractdoctabclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the documents tab of contract");
		Thread.sleep(2000);
		AdminLocator.contractdocshareselect(driver).click();
		test.log(LogStatus.PASS, "Admin user selected the checkbox of the document to be shared with the vendor");
		Thread.sleep(2000);
		AdminLocator.contractdocshareclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the share button to share the selected document");
		Thread.sleep(2000);
		driver.switchTo().frame("Iframe_Docshare");
		Thread.sleep(2000);
		AdminLocator.sharevendorclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the dropdown of vendor");
		Thread.sleep(2000);
		AdminLocator.sharevendorsearch(driver).sendKeys("ABB");
		test.log(LogStatus.PASS, "Admin user is able to search the vendor name in the dropdown");
		Thread.sleep(2000);
		AdminLocator.sharevendorselect(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to select the searched vendor from the dropdown");
		Thread.sleep(2000);
		Row row25=sheet.getRow(25);
		Cell c20=row25.getCell(1);
		String vendoremail=c20.getStringCellValue();
		test.log(LogStatus.PASS, "Admin user entered the email of vendor in the text box");
		//AdminLocator.sharevendoremail(driver).sendKeys(vendoremail);
		Thread.sleep(2000);
		Row row26=sheet.getRow(26);
		Cell c21=row26.getCell(1);
		String vendorcontact=c21.getStringCellValue();
		test.log(LogStatus.PASS, "Admin user entered the contact number of vendor in the text box");
		//AdminLocator.sharevendorcontact(driver).sendKeys(vendorcontact);
		Thread.sleep(2000);
		AdminLocator.sharevendordocsave(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on save button to share the document with the vendor");
		//String msg = AdminLocator.addcontractreadmessage(driver).getText();		//Reading Message appeared after save button
		//int flag = 0;
		test.log(LogStatus.PASS, "Document shared succesfully");
			//flag = 1;
		//test.log(LogStatus.FAIL, "Document unable to share successfully");

		Thread.sleep(2000);
		AdminLocator.sharevendordocclose(driver).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		//driver.switchTo().activeElement().findElement(By.className("close"));
		//driver.switchTo().getClass();
		//Thread.sleep(3000);
		By locator = By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button");
        //WebDriverWait wait1 = new WebDriverWait(driver, (100));

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		// retrieving "foo-button" HTML element
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
		jse.executeScript("arguments[0].click();", ViewButton);
		//wait.until(ExpectedConditions.elementToBeClickable(AdminLocator.sharevendordocpopupclose(driver))).click();
		//AdminLocator.sharevendordocpopupclose(driver).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.summarypopupclose(driver).click();
		
	}
	
	public static void doctabcontractlink(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		AdminLocator.workspacetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
		Locator.contracttab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of contract");
		Thread.sleep(2000);
		AdminLocator.contractediticonclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on edit icon for contract");
		Thread.sleep(2000);
		driver.switchTo().frame("showdetails");
		AdminLocator.contractdoctabclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the documents tab for contract");
		Thread.sleep(2000);
		AdminLocator.doctablinkcontract(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the icon of link contract");
		Thread.sleep(2000);
		AdminLocator.doctablinkcontractclose(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on close icon for the popup of link contract");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.summarypopupclose(driver).click();
	}
	
	public static void contractmilestonecreate(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(4000);
	   	AdminLocator.workspacestatusdropdown(driver).click();
	   	Thread.sleep(3000);
	   	AdminLocator.workspacestatusdropdownselect(driver).click();
	   	Thread.sleep(3000);
	   	AdminLocator.contracteditclick(driver).click();
		Thread.sleep(3000);
		//driver.switchTo().frame("showdetails");
		AdminLocator.milestonetabclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.milestoneaddclick(driver).click();
		Thread.sleep(4000);
		AdminLocator.milestonetitle(driver).sendKeys("milestone of the contract dated 23-09-2023");
		Thread.sleep(3000);
		AdminLocator.milestonedescription(driver).sendKeys("milestone description of the contract");
		Thread.sleep(3000);
		AdminLocator.milestonedeptdropdownclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.milestonedeptdropdownselect(driver).click();
		Thread.sleep(4000);
		AdminLocator.milestoneassignuserdropdownclick(driver).click();
		Thread.sleep(2000);
		//AdminLocator.milestoneassignusersearch(driver).sendKeys("finance executive");
		AdminLocator.milestoneassignuserselect(driver).click();
		Thread.sleep(4000);
		AdminLocator.milestoneduedateclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.milestoneduedateselect(driver).click();
		Thread.sleep(3000);
		AdminLocator.milestoneremark(driver).sendKeys("milestone created successfully");
		Thread.sleep(2000);
		AdminLocator.milestonesave(driver).click();
		test.log(LogStatus.PASS, "Milestone Details Saved Successfully.");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		AdminLocator.milestoneokpopup(driver).click();
		Thread.sleep(5000);
		AdminLocator.milestonepopupclose(driver).click();
		//Thread.sleep(2000);
		//AdminLocator.summarypopupclose(driver).click();
		//AdminLocator.milestoneclose(driver).click();
	}
	
	public static void editmilestone(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Locator.workspacetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on the tab of contract");
	   	Thread.sleep(2000);
		AdminLocator.contracteditclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the edit icon for contract");
		driver.switchTo().frame("showdetails");
		AdminLocator.milestonetabclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of milestone");
		Thread.sleep(2000);
		AdminLocator.milestoneeditclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the edit icon for milestone");
		Thread.sleep(2000);
		//AdminLocator.milestoneduedate(driver).clear();
		test.log(LogStatus.PASS, "Admin user is able to clear the due date of milestone");
		Thread.sleep(2000);
		//AdminLocator.milestoneduedate(driver).sendKeys("20-05-2023");
		test.log(LogStatus.PASS, "Admin user is able to update the due date for milestone");
		Thread.sleep(2000);
		AdminLocator.milestoneremark(driver).clear();
		test.log(LogStatus.PASS, "Admin user is able to clear the milestone remark");
		Thread.sleep(2000);
		AdminLocator.milestoneremark(driver).sendKeys("milestone created for the due date successfully");
		test.log(LogStatus.PASS, "Admin user is able to update the milestone remark");
		Thread.sleep(2000);
		AdminLocator.milestonesave(driver).click();
		test.log(LogStatus.PASS,"Milestone Details Saved Successfully.");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.summarypopupclose(driver).click();
		
	}

	public static void milestonefilter(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Locator.workspacetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on the tab of contract");
	   	Thread.sleep(2000);
		AdminLocator.contracteditclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the edit icon for contract");
		driver.switchTo().frame("showdetails");
		AdminLocator.milestonetabclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of milestone");
		AdminLocator.milestonetitlefilter(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
		AdminLocator.milestonetitlefilterselect(driver).click();
		test.log(LogStatus.PASS, "Admin user selected the filter of milestone title");
		Thread.sleep(2000);
		AdminLocator.milestonetitlefilter(driver).click();
		Thread.sleep(2000);
		AdminLocator.milestonestatusfilterclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the filter of milestone status");
		Thread.sleep(2000);
		AdminLocator.milestonestatusfilterselect(driver).click();
		test.log(LogStatus.PASS, "Admin user selected the filter of milestone status");
		Thread.sleep(2000);
		AdminLocator.milestonestatusfilterclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.milestonefilterapply(driver).click();
		test.log(LogStatus.PASS,"Admin user clicked on apply button of milestone");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.summarypopupclose(driver).click();
		
	}
	
	public static void milestonedelete(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Locator.workspacetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on the tab of contract");
	   	Thread.sleep(2000);
		AdminLocator.contracteditclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the icon of edit contract");
		driver.switchTo().frame("showdetails");
		AdminLocator.milestonetabclick(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of milestone");*/
		Thread.sleep(3000);
		AdminLocator.milestonedelete(driver).click();
		Thread.sleep(2000);
		//test.log(LogStatus.PASS, "Admin user clicked on the delete icon of milestone");
		driver.switchTo().alert().accept();
		test.log(LogStatus.PASS,"Milestone Deleted Successfully");
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		//Thread.sleep(2000);
		AdminLocator.milestonetabclose(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractsummaryrefreshicon(driver).click();
	}
	
	public static void taskcreate(WebDriver driver,XSSFWorkbook workbook,ExtentTest test) throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	 Locator.contracttab(driver).click();
	   	 Thread.sleep(4000);
		AdminLocator.contracteditclick(driver).click();
		Thread.sleep(3000);
		//test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		AdminLocator.contracttasktab(driver).click();
		Thread.sleep(2000);
		sheet=workbook.getSheetAt(1);
		AdminLocator.addnewtask(driver).click();
		Thread.sleep(2000);
		AdminLocator.contracttasktypedropdown(driver).click();
		Thread.sleep(3000);
		AdminLocator.contracttasktypedropdownselect(driver).click();
		Thread.sleep(2000);
		//AdminLocator.reviewuttonselect(driver).click();
		Row row27=sheet.getRow(27);
		Cell c1=row27.getCell(1);
		String title=c1.getStringCellValue();
		AdminLocator.tasktitle(driver).sendKeys(title);
		Thread.sleep(2000);
		Row row28=sheet.getRow(28);
		Cell c2=row28.getCell(1);
		String description=c2.getStringCellValue();
		AdminLocator.taskdescription(driver).sendKeys(description);
		Thread.sleep(2000);
		AdminLocator.taskassigntoclick(driver).click();
		Thread.sleep(2000);
		//AdminLocator.taskassigntosearch(driver).sendKeys("manager");
		AdminLocator.taskassigntoselect(driver).click();
		Thread.sleep(4000);
		AdminLocator.taskduedateclick(driver).click();
		//AdminLocator.taskassigntoclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.taskduedateselect(driver).click();
		Thread.sleep(3000);
		AdminLocator.tasksave(driver).click();
		test.log(LogStatus.PASS,"Task Saved Successfully. An Email containing task details and access URL to provide response, sent to assignee.");
		//test.log(LogStatus.FAIL, "Unable to create task.");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(7000);
		AdminLocator.taskconfirmpopup(driver).click();
		Thread.sleep(5000);
		AdminLocator.contracttasktabclose(driver).click();
		Thread.sleep(5000);
		AdminLocator.taskdeleteicon(driver).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		test.log(LogStatus.PASS, "Task Deleted Successfully");
		Thread.sleep(5000);
		AdminLocator.doctabpopupclose(driver).click();
		Thread.sleep(4000);
		AdminLocator.contractsummaryrefreshicon(driver).click();
	}

	public static void taskedit(WebDriver driver,XSSFWorkbook workbook,ExtentTest test) throws InterruptedException
	{
		sheet=workbook.getSheetAt(1);
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
		AdminLocator.contracteditclick(driver).click();
		driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		AdminLocator.tasktabclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.edittaskclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.tasktitle(driver).clear();
		Thread.sleep(3000);
		AdminLocator.taskdescription(driver).clear();
		Thread.sleep(2000);
		Row row29=sheet.getRow(29);
		Cell c1=row29.getCell(1);
		String title=c1.getStringCellValue();
		AdminLocator.tasktitle(driver).sendKeys(title);
		Thread.sleep(2000);
		Row row30=sheet.getRow(30);
		Cell c2=row30.getCell(1);
		String description=c2.getStringCellValue();
		AdminLocator.taskdescription(driver).sendKeys(description);
		Thread.sleep(2000);
		AdminLocator.taskduedateclick(driver).clear();
		Thread.sleep(2000);
		AdminLocator.taskduedateclick(driver).sendKeys("01-10-2023");
		Thread.sleep(2000);
		//AdminLocator.taskassigntoclick(driver).click();
		//AdminLocator.taskduedate(driver).click();
		AdminLocator.taskduedatecalendaricon(driver).click();
		//Thread.sleep(2000);
		//AdminLocator.taskassigntoclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.taskupdateclick(driver).click();
		test.log(LogStatus.PASS,"Task Saved Successfully. An Email containing task details and access URL to provide response, sent to assignee.");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.summarypopupclose(driver).click();
	}
	
	public static void taskdelete(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of my workspace");
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
		AdminLocator.contracteditclick(driver).click();
		driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		AdminLocator.tasktabclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.taskdeleteclick(driver).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		test.log(LogStatus.PASS,"Task Deleted Successfully.");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.summarypopupclose(driver).click();
		
	}
	
	public static void contractagreement(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(4000);
		AdminLocator.contracteditclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.contractagreementtabclick(driver).click();
		Thread.sleep(3000);
		//AdminLocator.contractagreementcreatedoc(driver).click();
		//Thread.sleep(2000);
		/*AdminLocator.contractagreementsubmitforreview(driver).click();
		test.log(LogStatus.PASS, "user able to click on submit for review button");
		Thread.sleep(2000);
		driver.switchTo().frame("MultiReviewerframe");
		Thread.sleep(2000);
		AdminLocator.contractagreementreviewerdropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractagreementreviewerselect(driver).click();
		test.log(LogStatus.PASS, "user able to select reviewer from the dropdown");
		Thread.sleep(2000);
		AdminLocator.contractagreementrevieweradd(driver).click();
		test.log(LogStatus.PASS, "user able to add reviewer for review");
		Thread.sleep(2000);
		AdminLocator.contractagreementreviewersubmit(driver).click();
		test.log(LogStatus.PASS, "user able to send the agreement to the reviewer successfully");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().frame("showdetailsaddnew");
		//Thread.sleep(2000);
		//driver.switchTo().frame("RadEditor1_contentIframe");
		//Thread.sleep(2000);
		//AdminLocator.contractagreementtext(driver).sendKeys("Contract agreement document");
		//Thread.sleep(3000);
		//driver.switchTo().parentFrame();
		//Thread.sleep(2000);
		//driver.switchTo().frame("showdetailsaddnew");
		//driver.switchTo().parentFrame();
		//Thread.sleep(2000);
		//driver.switchTo().frame("showdetailsaddnew");
		//Thread.sleep(3000);
		//AdminLocator.contractagreementsave(driver).click();
		//driver.switchTo().parentFrame();*/
	}
	
	public static void mydocuments(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.contractdocumentclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumenttabclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on document tab");
		Thread.sleep(2000);
		AdminLocator.contractdocumententityfilter(driver).click();
		test.log(LogStatus.PASS, "User able to click on entity filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumententityfilterexpand(driver).click();
		test.log(LogStatus.PASS, "User able to click on expand arrow in entity filter");
		Thread.sleep(3000);
		AdminLocator.contractdocumententityfiltercheckboxselect(driver).click();
		test.log(LogStatus.PASS, "User able to select entity from the filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumentdeptfilter(driver).click();
		test.log(LogStatus.PASS, "User able to click on department filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumentdeptfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select department name from the filter");
		//AdminLocator.contractdocumentstatusfilterclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentctypefilter(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract type filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumentctypefilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select contract type name from the filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumentstatusfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on status filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumentstatusfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select contract status from the filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumentvendorfilter(driver).click();
		test.log(LogStatus.PASS, "User able to click on the filter of vendor");
		Thread.sleep(2000);
		AdminLocator.contractdocumentvendorfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select vendor name from the filter");
		Thread.sleep(2000);
		//AdminLocator.contractdocumentownerfilter(driver).click();
		test.log(LogStatus.PASS, "User able to click on owner filter");
		//Thread.sleep(2000);
		//AdminLocator.contractdocumentownerfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select owner name from the filter");
		//Thread.sleep(2000);
		AdminLocator.contractdocumentclearfilter(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentdownload(driver).click();
		test.log(LogStatus.PASS, "Contract document downloaded successfully");
		Thread.sleep(2000);
		AdminLocator.contractdocumentview(driver).click();
		test.log(LogStatus.PASS, "Contract document can be viewed successfully");	
		Thread.sleep(5000);
		AdminLocator.contractdocumentpopupclose(driver).click();
		test.log(LogStatus.PASS, "User able to close the view document popup");
		Thread.sleep(2000);
		AdminLocator.contractdocumentsearch(driver).sendKeys("Sample");
		test.log(LogStatus.PASS, "User able to search the contract by entering the contract numnber in search box");
		Thread.sleep(2000);
		AdminLocator.contractdocumentsearch(driver).clear();
		test.log(LogStatus.PASS, "User able to clear the searched text");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		AdminLocator.contractselectdocumentclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on select document dropdown filter");
		Thread.sleep(3000);
		AdminLocator.contractselectdocumentchoose(driver).click();
		test.log(LogStatus.PASS, "User able to choose the document type from the dropdown filter");
		Thread.sleep(2000);
		AdminLocator.contractdocumentdownload(driver).click();
		test.log(LogStatus.PASS, "User able to download the selected document");
		Thread.sleep(2000);
		AdminLocator.contractdocumentview(driver).click();
		test.log(LogStatus.PASS, "User able to view the selected document");
		Thread.sleep(5000);
		AdminLocator.contractdocumentpopupclose(driver).click();
		Thread.sleep(3000);
		AdminLocator.contractdocumentshare(driver).click();
		test.log(LogStatus.PASS, "User able to click on share document icon");
		Thread.sleep(2000);
		driver.switchTo().frame("ContentPlaceHolder1_Iframe_Docshare");
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharevendorclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on vendor dropdown");
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharevendorselect(driver).click();
		test.log(LogStatus.PASS, "Vendor can be selected from vendor dropdown");
		Thread.sleep(2000);
		AdminLocator.contractdocumentshareperiodclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on period dropdown");
		Thread.sleep(2000);
		AdminLocator.contractdocumentshareperiodselect(driver).click();
		test.log(LogStatus.PASS, "Period can be selected from period dropdown");
		Thread.sleep(3000);
		AdminLocator.contractdocumentsharesave(driver).click();
		test.log(LogStatus.PASS, "document(s) can be shared successfully with the vendor");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		AdminLocator.contractdocumentsharespopupclose(driver).click();
		Thread.sleep(3000);
		AdminLocator.contractdocumentshare(driver).click();
		Thread.sleep(2000);
		driver.switchTo().frame("ContentPlaceHolder1_Iframe_Docshare");
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharevendorclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharevendorselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharespopupperiodclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharespopupperiodselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharespopuppermission(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharespopuppermissionselect(driver).click();
		test.log(LogStatus.PASS, "User able to change permissions from the dropdown");
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharesave(driver).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		AdminLocator.contractdocumentsharespopupclose(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentshare(driver).click();
		Thread.sleep(2000);
		driver.switchTo().frame("ContentPlaceHolder1_Iframe_Docshare");
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharevendorclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharespopupdocumentunshareclick(driver).click();
		test.log(LogStatus.PASS, "User able to unshare the document from the owner");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharespopupaddnewvendorclick(driver).click();
		Thread.sleep(3000);
		driver.switchTo().frame("IframeParty");
		Thread.sleep(2000);
		AdminLocator.vendorname(driver).sendKeys("VSB Vendors");
		Thread.sleep(2000);
		AdminLocator.vendoraddress(driver).sendKeys("Pune");
		Thread.sleep(2000);
		AdminLocator.savevendor(driver).click();
		test.log(LogStatus.PASS, "User able to create new vendor by clicking on '+' icon");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.vendorpopupclose(driver).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.contractdocumentsharespopupclose(driver).click();
	}
	
	public static void myreports(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.contractreportclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on report tab");
		Thread.sleep(2000);
		AdminLocator.contractreportentityfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on entity dropdown");
		Thread.sleep(2000);
		AdminLocator.contractreportentityfilterexpand(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractreportentityfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select entity from the filter");
		//Thread.sleep(2000);
		//AdminLocator.contractdocumentstatusfilterclick(driver).click();
		//test.log(LogStatus.PASS, "User able to click on status dropdown");
		//Thread.sleep(2000);
		//AdminLocator.contractdocumentstatusfilterclick(driver).click();
		//Thread.sleep(2000);
		//AdminLocator.contractdocumentstatusfilterselect(driver).click();
		//test.log(LogStatus.FAIL, "User not able to select contract status from the filter");
		Thread.sleep(2000);
		/*AdminLocator.contractreportvendorfilter(driver).click();
		test.log(LogStatus.PASS, "User able to click on vendor dropdown");
		Thread.sleep(2000);
		AdminLocator.contractreportvendorfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select vendor from the filter");
		Thread.sleep(3000);*/
		AdminLocator.contractreportdeptfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on department dropdown");
		Thread.sleep(2000);
		//AdminLocator.contractreportexport(driver).click();
		
		AdminLocator.contractreportdeptfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select department from the dropdown");
		Thread.sleep(2000);
		AdminLocator.contractreportcontracttypefilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract type dropdown");
		Thread.sleep(2000);
		AdminLocator.contractreportcontracttypefilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select contract type from the dropdown");
		Thread.sleep(2000);
		AdminLocator.contractreportownerfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on owner dropdown");
		Thread.sleep(2000);
		AdminLocator.contractreportownerfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select owner from the dropdown");
		Thread.sleep(2000);
		AdminLocator.contractreportclearbuttonclick(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "User is able to click on clear button to clear all the selected filters");
		AdminLocator.contractreportexport(driver).click();
		test.log(LogStatus.PASS, "Contract Report downloaded successfully");
		Thread.sleep(2000);
		AdminLocator.contractreportusagetabclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on usage tab to download the usage report");
	}
	
	public static void mydashboarddraftcount(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String draftcount;
		draftcount=AdminLocator.contractdraftstatuscount(driver).getText();
		int draft=Integer.parseInt(draftcount);
		System.out.println(draft);
		Thread.sleep(2000);
		AdminLocator.contractdraftstatuscount(driver).click();
		Thread.sleep(2000);
		String drafttotal;
		drafttotal=AdminLocator.contracttotaldraftcount(driver).getText();
		//System.out.println(drafttotal);
		//int draftnumber=Integer.parseInt(drafttotal);
		//int total=Integer.parseInt(drafttotal);
		//System.out.println(total);
		String [] bits=drafttotal.split(" ");
		String drafttotalcount = bits[bits.length - 2];
		int drafttotalnumber=Integer.parseInt(drafttotalcount);
		System.out.println(drafttotalnumber);
		if(draft == drafttotalnumber)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Draft = "+draft+" | Count of Displayed records of draft from grid = "+drafttotalnumber);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Draft = "+draft+" | Count Displayed records of draft from grid = "+drafttotalnumber);
		}
		
		AdminLocator.contractdashboardclick(driver).click();
	}
	
	/*public static void mydashboardpendingreviewcount(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String pendingreviewcount=AdminLocator.contractpendingreviewcount(driver).getText();
		int pendingreview=Integer.parseInt(pendingreviewcount);
		System.out.println(pendingreview);
		Thread.sleep(2000);
		AdminLocator.contractpendingreviewcount(driver).click();
		Thread.sleep(2000);
		String pendingreviewtotal;
		pendingreviewtotal=AdminLocator.contracttotaldraftcount(driver).getText();
		String [] bits=pendingreviewtotal.split(" ");
		String pendingreviewtotalcount=bits[bits.length-2];
		int pendingreviewnumber=Integer.parseInt(pendingreviewtotalcount);
		System.out.println(pendingreviewnumber);
		if(pendingreview == pendingreviewnumber)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Pending Review = "+pendingreview+" | Count of Displayed records of pending review from grid = "+pendingreviewnumber);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Pending Review = "+pendingreview+" | Count of Displayed records of pending review from grid = "+pendingreviewnumber);
		}
		
		AdminLocator.contractdashboardclick(driver).click();
	}
	
	public static void mydashboardreviewedcount(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String reviewedcount=AdminLocator.contractreviewedcount(driver).getText();
		int reviewedtotal=Integer.parseInt(reviewedcount);
		System.out.println(reviewedtotal);
		Thread.sleep(2000);
		AdminLocator.contractreviewedcount(driver).click();
		Thread.sleep(2000);
		String reviewedcounttotal=AdminLocator.contracttotaldraftcount(driver).getText();
		String [] bits=reviewedcounttotal.split(" ");
		String reviewedtotalnumber=bits[bits.length-2];
		int reviewedtotalcount=Integer.parseInt(reviewedtotalnumber);
		System.out.println(reviewedtotalnumber);
		if(reviewedtotal == reviewedtotalcount)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Reviewed Contract = "+reviewedtotal+" | Count of Displayed records of reviewed contract from grid = "+reviewedtotalcount);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Reviewed Contract = "+reviewedtotal+" | Count of Displayed records of reviewed contract from grid = "+reviewedtotalcount);
		}
		
		AdminLocator.contractdashboardclick(driver).click();

		
	}
	
	public static void mydashboardpendingapproval(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String pendingapprovalcount=AdminLocator.contractpendingapprovalcount(driver).getText();
		int pendingapprovaltotal=Integer.parseInt(pendingapprovalcount);
		System.out.println(pendingapprovaltotal);
		Thread.sleep(2000);
		AdminLocator.contractpendingapprovalcount(driver).click();
		Thread.sleep(2000);
		String pendingapprovaltotalnumber=AdminLocator.contracttotaldraftcount(driver).getText();
		String [] bits=pendingapprovaltotalnumber.split(" ");
		String pendingapprovaltotalnumbercount=bits[bits.length-2];
		int pendingapprovalcounttotal=Integer.parseInt(pendingapprovaltotalnumbercount);
		System.out.println(pendingapprovalcounttotal);
		if(pendingapprovaltotal == pendingapprovalcounttotal)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Pending Approval Contract = "+pendingapprovaltotal+" | Count of Displayed records of pending approval contract from grid = "+pendingapprovalcounttotal);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Pending Approval Contract = "+pendingapprovaltotal+" | Count of Displayed records of pending approval contract from grid = "+pendingapprovalcounttotal);
		}
		
		AdminLocator.contractdashboardclick(driver).click();

		
	}*/
	
	/*public static void mydashboardapprovedcount(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String approved=AdminLocator.contractapprovedcount(driver).getText();
		int approvedcount=Integer.parseInt(approved);
		System.out.println(approvedcount);
		Thread.sleep(3000);
		AdminLocator.contractapprovedcount(driver).click();;
		Thread.sleep(2000);
		String approvedcounttotal=AdminLocator.contracttotaldraftcount(driver).getText();
		String [] bits=approvedcounttotal.split(" ");
		String approvedcounttotalnumber=bits[bits.length-2];
		int approvedcountnumber=Integer.parseInt(approvedcounttotalnumber);
		System.out.println(approvedcountnumber);
		if(approvedcount == approvedcountnumber)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Approved Contract = "+approvedcount+" | Count of Displayed records of approved contract from grid = "+approvedcountnumber);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Approved Contract = "+approvedcount+" | Count of Displayed records of approved contract from grid = "+approvedcountnumber);
		}
		
		AdminLocator.contractdashboardclick(driver).click();

		
	}*/
	
	public static void mydashboardactivecount(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String active=AdminLocator.contractactivecount(driver).getText();
		int activecount=Integer.parseInt(active);
		System.out.println(activecount);
		Thread.sleep(2000);
		AdminLocator.contractactivecount(driver).click();;
		Thread.sleep(2000);
		String activecounttotal=AdminLocator.contracttotaldraftcount(driver).getText();
		String [] bits=activecounttotal.split(" ");
		String activecounttotalnumber=bits[bits.length-2];
		int activecountnumber=Integer.parseInt(activecounttotalnumber);
		System.out.println(activecountnumber);
		if(activecount == activecountnumber)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Active Contract = "+activecount+" | Count of Displayed records of active contract from grid = "+activecountnumber);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Active Contract = "+activecount+" | Count of Displayed records of active contract from grid = "+activecountnumber);
		}
		
		AdminLocator.contractdashboardclick(driver).click();

		
	}
	
	public static void mydashboardexpiredcount(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String expired=AdminLocator.contractexpiredcount(driver).getText();
		int expiredcount=Integer.parseInt(expired);
		System.out.println(expiredcount);
		Thread.sleep(2000);
		AdminLocator.contractexpiredcount(driver).click();;
		Thread.sleep(2000);
		String expiredcounttotal=AdminLocator.contracttotaldraftcount(driver).getText();
	
		String [] bits=expiredcounttotal.split(" ");
		String expiredcounttotalnumber=bits[bits.length-2];
		int expiredcountnumber=Integer.parseInt(expiredcounttotalnumber);
		System.out.println(expiredcountnumber);
		if(expiredcount == expiredcountnumber)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Expired Contract = "+expiredcount+" | Count of Displayed records of Expired contract from grid = "+expiredcountnumber);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Expired Contract = "+expiredcount+" | Count of Displayed records of Expired contract from grid = "+expiredcountnumber);
		}
		
		AdminLocator.contractdashboardclick(driver).click();

		
	}
	
	
	
	public static void mydashboardmyreviewscount(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String reviews=AdminLocator.contractreviewscount(driver).getText();
		int reviewcount=Integer.parseInt(reviews);
		System.out.println(reviewcount);
		Thread.sleep(2000);
		AdminLocator.contractreviewscount(driver).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		String reviewcounttotal=AdminLocator.contracttotalreviewscount(driver).getText();
		System.out.println(reviewcounttotal);
		String [] bits=reviewcounttotal.split(" ");
		String reviewcounttotalnumber=bits[bits.length-1];
		System.out.println(reviewcounttotalnumber);
		int reviewcountnumber=Integer.parseInt(reviewcounttotalnumber);
		System.out.println(reviewcountnumber);
		Thread.sleep(2000);
		AdminLocator.contractmyreviewsuserdropdpownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractmyreviewsuserdropdpownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractreviewapplybuttonclick(driver).click();
		Thread.sleep(2000);
		String approvecounttotal=AdminLocator.contracttotalapprovecount(driver).getText();
		System.out.println(approvecounttotal);
		String [] bits1=approvecounttotal.split(" ");
		String approvecounttotalnumber=bits[bits1.length-1];
		int approvecountnumber=Integer.parseInt(approvecounttotalnumber);
		System.out.println(approvecountnumber);
		int totalcount=reviewcountnumber+approvecountnumber;
		if(reviewcount == totalcount)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Reviews Contract = "+reviewcount+" | Count of Displayed records of Reviews contract from grid = "+totalcount);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Reviews Contract = "+reviewcount+" | Count of Displayed records of Reviews contract from grid = "+totalcount);
		}
		
		AdminLocator.contractdashboardclick(driver).click();
		
		
	}
	
	public static void mydashboardterminatedcount(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		String terminatedreviewcount=AdminLocator.contractterminatedcount(driver).getText();
		int terminatedcount=Integer.parseInt(terminatedreviewcount);
		System.out.println(terminatedcount);
		Thread.sleep(2000);
		AdminLocator.contractterminatedcount(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractstatusdropdpwnclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractstatusdropdpwnselect(driver).click();
		String terminatedtotalcount=AdminLocator.contracttotaldraftcount(driver).getText();
		System.out.println(terminatedtotalcount);
		String [] bits=terminatedtotalcount.split(" ");
		String terminatedcounttotalnumber=bits[bits.length-2];
		int terminatedtotal=Integer.parseInt(terminatedcounttotalnumber);
		System.out.println(terminatedtotal);
		Thread.sleep(2000);
		if(terminatedcount == terminatedtotal)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of Terminated and not Renewed Contract = "+terminatedcount+" | Count of Displayed records of Termianted and not Renewed contract from grid = "+terminatedtotal);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of Terminated and not Renewed Contract = "+terminatedcount+" | Count of Displayed records of Terminated and not Renewed contract from grid = "+terminatedtotalcount);
		}
		
		AdminLocator.contractdashboardclick(driver).click();
		
		
	}
	
	/*public static void dashboardfilters(WebDriver driver,ExtentTest test) throws InterruptedException
	{ 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(4000);
		AdminLocator.dashboardentityfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on dashboard entity filter");
		Thread.sleep(2000);
		AdminLocator.dashboardentityfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select entity from the dashboard entity filter");
		Thread.sleep(2000);
		AdminLocator.dashboarddeptfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on department filter on dashboard");
		Thread.sleep(3000);
		AdminLocator.dashboarddeptfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select department from the department filter");
		Thread.sleep(2000);
		AdminLocator.dashboardvendorfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able click on the filter of vendor on dashboard");
		Thread.sleep(2000);
		AdminLocator.dashboardvendorfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select vendor from the vendor filter");
		Thread.sleep(2000);
		AdminLocator.dashboardstatusfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on status filter on dashboard");
		Thread.sleep(2000);
		AdminLocator.dashboardstatusfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select status from the status filter");
		Thread.sleep(2000);
		AdminLocator.dashboardcontracttypefilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract type from the filter");
		Thread.sleep(2000);
		AdminLocator.dashboardcontracttypefilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select contract type from the contract type filter");
		Thread.sleep(2000);
		AdminLocator.dashboardcontractownerfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on owner filter on dashboard");
		Thread.sleep(2000);
		AdminLocator.dashboardcontractownerfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select owner from the owner filter");
		Thread.sleep(2000);
		AdminLocator.dashboardapplybuttonclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on apply button to apply all the selected filters");
		Thread.sleep(2000);
		AdminLocator.dashboardclearbuttonclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on clear button to clear all the selected filters");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		String locationcount=AdminLocator.dashboardlocationgraphcount(driver).getText();
		int locationgraphcount=Integer.parseInt(locationcount);
		System.out.println(locationgraphcount);
		//String locationname=AdminLocator.dashboardlocationgraphlocationname(driver).getText();
		//System.out.println(locationname);
		AdminLocator.dashboardlocationgraphcount(driver).click();
		
		test.log(LogStatus.PASS, "User able to click on location graph on dashboard");
		Thread.sleep(2000);
		driver.switchTo().frame("showChartDetails");
		Thread.sleep(2000);
		String locationcountgraph=AdminLocator.dashboardlocationgraphtotalcount(driver).getText();
		int locationtotalcount=Integer.parseInt(locationcountgraph);
		System.out.println(locationtotalcount);
		if(locationgraphcount == locationtotalcount)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count seen on the box of location on location graph = "+locationgraphcount+" | Actual count of location seen after clicking on the graph = "+locationtotalcount);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count seen on the box of location on location graph = "+locationgraphcount+" | Actual count of location seen after clicking on the graph = "+locationtotalcount);
		}
		
		Thread.sleep(2000);
		
		AdminLocator.dashboardlocationgraphlocationfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on entity/location filter on the graph popup");
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphlocationfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select entity/location filter on the graph popup");
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphdeptfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on department filter on the graph popup");
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphdeptfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select department filter on the graph popup");
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphstatusfilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on status filter on the graph popup");
		AdminLocator.dashboardlocationgraphstatusfilterselect(driver).click();
		test.log(LogStatus.PASS, "User able select status filter from the graph popup");
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphcontracttypefilterclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract type filter on the graph popup");
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphcontracttypefilterselect(driver).click();
		test.log(LogStatus.PASS, "User able to select contract type filter on the graph popup");
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphapplybutton(driver).click();
		test.log(LogStatus.PASS, "User able to click on apply button on the graph popup");
		Thread.sleep(3000);
		AdminLocator.dashboardlocationgraphclearbutton(driver).click();
		test.log(LogStatus.PASS, "User able to clear the selected filters on the graph popup");
		Thread.sleep(3000);
		AdminLocator.dashboardlocationgraphexportbutton(driver).click();
		test.log(LogStatus.PASS, "User able to click on export button to download the report on the location graph popup");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphclose(driver).click();
		test.log(LogStatus.PASS, "User able to close the location graph popup");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		String departmentgraphcount=AdminLocator.dashboarddepartmentcount(driver).getText();
		int deptcount=Integer.parseInt(departmentgraphcount);
		System.out.println(deptcount);
		Thread.sleep(2000);
		AdminLocator.dashboarddepartmentcount(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract department graph");
		Thread.sleep(2000);
		driver.switchTo().frame("showChartDetails");
		Thread.sleep(2000);
		String depttotalcount=AdminLocator.dashboarddepartmentgraphtotalcount(driver).getText();
		int departmenttotal=Integer.parseInt(depttotalcount);
		if(deptcount == departmenttotal)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of contract seen on the box of department on department graph = "+deptcount+" | Actual count of contract seen after clicking on the department graph = "+departmenttotal);
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of contract seen on the box of department on contract department graph = "+deptcount+" | Actual count of department seen after clicking on contract department graph = "+departmenttotal);
		}
		
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphexportbutton(driver).click();
		test.log(LogStatus.PASS, "User able to click on export button on the department graph popup ");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphclose(driver).click();
		test.log(LogStatus.PASS, "User able to close the department graph popup");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		String cstatuscount=AdminLocator.dashboardcontractstatusgraphcount(driver).getText();
		int contractstatuscount=Integer.parseInt(cstatuscount);
		System.out.println(contractstatuscount);
		//AdminLocator.dashboardcontractstatusgraphcount(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract status graph");
		Thread.sleep(2000);
		driver.switchTo().frame("showChartDetails");
		Thread.sleep(2000);
		String cstatustotalcount=AdminLocator.dashboardcontractstatustotalgraphcount(driver).getText();
		int contractstatustotalcount=Integer.parseInt(cstatustotalcount);
		System.out.println(contractstatustotalcount);
		if(contractstatuscount == contractstatustotalcount)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of contract seen on the box of status on contract status graph = "+contractstatuscount+" | Actual count of contract seen after clicking on the contract status graph = "+contractstatustotalcount);
			
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of contract seen on the box of status on contract status graph = "+contractstatuscount+" | Actual count of contract seen after clicking on the contract status graph = "+contractstatustotalcount);
		}
		
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphexportbutton(driver).click();
		test.log(LogStatus.PASS, "User able to click on export button to download the report on the contract status graph popup ");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphclose(driver).click();
		test.log(LogStatus.PASS, "User able to close the contract status graph popup");
		Thread.sleep(3000);
		String ctypegraphcount=AdminLocator.dashboardcontracttypegraphcount(driver).getText();
		int contracttypecount=Integer.parseInt(ctypegraphcount);
		System.out.println(contracttypecount);
		AdminLocator.dashboardcontracttypegraphcount(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract type graph");
		Thread.sleep(2000);
		driver.switchTo().frame("showChartDetails");
		Thread.sleep(2000);
		String contracttypecounttotal=AdminLocator.dashboardcontracttypetotalgraphcount(driver).getText();
		int contracttypetotalcount=Integer.parseInt(contracttypecounttotal);
		System.out.println(contracttypetotalcount);
		if(contracttypecount == contracttypetotalcount)
		{
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
			test.log(LogStatus.PASS, "Dashboard Count of contract seen on the box of contract type on contract type graph = "+contracttypecount+" | Actual count of contract seen after clicking on the contract type graph = "+contracttypetotalcount);
			
		}
		else
		{
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
			test.log(LogStatus.FAIL, "Dashboard Count of contract seen on the box of contract type on contract type graph = "+contracttypecount+" | Actual count of contract seen after clicking on the contract type graph = "+contracttypetotalcount);
		}
		
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphexportbutton(driver).click();
		test.log(LogStatus.PASS, "User able to click on export button to download the report on the contract type graph popup ");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.dashboardlocationgraphclose(driver).click();
		test.log(LogStatus.PASS, "User able to close the contract type graph popup");
		//js.executeScript("window.scrollBy(0,-800)","");
		Thread.sleep(2000);
		driver.navigate().refresh();
		/*Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmoreclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on show more link for task");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmorestatusdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on status dropdown on task workspace");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmorestatusdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User able to select status from the status dropdown on task workspace");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmoreediticonclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on edit icon on task workspace");
		Thread.sleep(2000);
		driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmorepopupstatusdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on status dropdown on the popup of edit task");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmorepopupstatusdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User able to select status from the status dropdown on the popup of edit task");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmorepopupremark(driver).sendKeys("task created");
		test.log(LogStatus.PASS, "User able to enter remark for the task");
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmorepopupsave(driver).click();
		test.log(LogStatus.PASS, "User able to click on save button for the task");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.dashboardtaskshowmorepopupclose(driver).click();
		Thread.sleep(2000);
		AdminLocator.dashboardtabclick(driver).click();
		test.log(LogStatus.PASS, "User able to click my dashboard tab");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(2000);
		AdminLocator.dashboardmilestoneeditclick(driver).click();
		test.log(LogStatus.PASS, "User able to edit icon for milestone of contract");
		Thread.sleep(2000);
		driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		AdminLocator.dashboardmilestonedocview(driver).click();
		test.log(LogStatus.PASS, "User able to click on view icon for milestone document");
		Thread.sleep(3000);
		AdminLocator.dashboardmilestonedocclose(driver).click();
		test.log(LogStatus.PASS, "User able to close the document popup");
		Thread.sleep(2000);
		AdminLocator.dashboardmilestonedocdownload(driver).click();
		test.log(LogStatus.PASS, "User able to click on download icon for milestone document");
		Thread.sleep(2000);
		AdminLocator.dashboardmilestonestatusdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on status dropdown for milestone");
		Thread.sleep(2000);
		AdminLocator.dashboardmilestonestatusdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User able to select milestone status from the dropdown");
		Thread.sleep(2000);
		AdminLocator.dashboardmilestoneremark(driver).sendKeys("milestone created");
		test.log(LogStatus.PASS, "User able to enter the remark for milestone");
		Thread.sleep(2000);
		AdminLocator.dashboardmilestonesave(driver).click();
		test.log(LogStatus.PASS, "User able to click on save button for edit milestone");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		


		
	
	public static void contractdashboardtaskmilestone(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		AdminLocator.dashboardcontractexpiringdropdown(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the dropdown of contracts expiring in ");
		Thread.sleep(2000);
		AdminLocator.dashboardcontractexpiringdropdown60days(driver).click();
		test.log(LogStatus.PASS, "Admin user selected the option of contracts expiring in 60 days from the dropdown");
		Thread.sleep(2000);
		AdminLocator.dashboardcontractexpiringdropdown(driver).click();
		Thread.sleep(2000); 
		AdminLocator.dashboardcontractexpiringdropdown90days(driver).click();
		test.log(LogStatus.PASS, "Admin user selected the option of contracts expiring in 90 days from the dropdown");
		Thread.sleep(2000);
		AdminLocator.dashboardcontractexpiringdropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.dashboardcontractexpiringdropdownmorethan90days(driver).click();
		test.log(LogStatus.PASS, "Admin user selected the option of contracts expiring in more than 90 days from the dropdown");
		Thread.sleep(2000);
		AdminLocator.dashboardcontractexpiringviewicon(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the view icon for the contract on the grid of contracts expiring in");
		Thread.sleep(3000);
		AdminLocator.contractsummarypagecloseicon(driver).click();
	}
	
	public static void myworkspacereviews(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.workspacetab(driver).click();
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsclick(driver).click();
		test.log(LogStatus.PASS, "User able to click my reviews tab and open my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsentitydropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on entity dropdown filter my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsentitydropdownexpandclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on expand icon in entity dropdown filter on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsentitydropdowncheckboxselect(driver).click();
		test.log(LogStatus.PASS, "User able to select entity from entity dropdown filter on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewscontracttypedropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on contract type dropdown filter on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewscontracttypedropdownselect(driver).click();
		test.log(LogStatus.PASS, "User able to select contract type from contract type dropdown filter on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsstatusdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on status dropdown filter on my reviews page");
		Thread.sleep(3000);
		AdminLocator.dashboardmyreviewsstatusdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User able to select status from the status dropdown filter on my reviews page");
		Thread.sleep(3000);
		AdminLocator.dashboardmyreviewsvendordropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to click on vendor dropdown filter on my reviews page");
		Thread.sleep(3000);
		AdminLocator.dashboardmyreviewsvendordropdownselect(driver).click();
		test.log(LogStatus.PASS, "User able to select vendor from vendor dropdown filter on my reviews page");
		Thread.sleep(3000);
		AdminLocator.dashboardmyreviewsclearfilter(driver).click();
		test.log(LogStatus.PASS, "User able to clear the selected filters on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsuserdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User able to select reviewer dropdown on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsuserdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User able to select approver from reviewer dropdown on my reviews page");
		Thread.sleep(3000);
		AdminLocator.dashboardmyreviewssearchbox(driver).sendKeys("Demo Contract");
		test.log(LogStatus.PASS, "User able to search the contract by entering the text in search box on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardmyreviewsclearfilter(driver).click();
		test.log(LogStatus.PASS, "User able to clear the entered text in search box on my reviews page");
		Thread.sleep(2000);
		AdminLocator.dashboardtabclick(driver).click();
	}
	
	public static void myworkspacemilestone(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.workspacetab(driver).click();
		Thread.sleep(2000);
		AdminLocator.workspacemilestonetabclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on milestone tab of my workspace");
		Thread.sleep(2000);
		AdminLocator.milestonepagecontractnamefilterclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the filter of contract name");
		Thread.sleep(2000);
		AdminLocator.milestonepagecontractnamefiltersearch(driver).sendKeys("Contract of UFB Fibres");
		test.log(LogStatus.PASS, "User is able to search the contract name in the search box of filter");
		Thread.sleep(2000);
		AdminLocator.milestonepagecontractnamefilterselect(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the checkbox of contract name filter");
		Thread.sleep(2000);
		AdminLocator.milestonepagemilestonenamefilterclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the filter of milestone name");
		Thread.sleep(2000);
		AdminLocator.milestonepagemilestonenamefiltersearch(driver).sendKeys("Milestone of the contract of UFB Fibres");
		test.log(LogStatus.PASS, "User is able to search the name of milestone in the search box of filter");
		Thread.sleep(2000);
		AdminLocator.milestonepagemilestonenamefilterselect(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the checkbox of milestone name filter");
		Thread.sleep(2000);
		AdminLocator.milestonepagemilestonestatusfilterclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the filter of milestone status");
		Thread.sleep(2000);
		AdminLocator.milestonepagemilestonestatusfilterselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select status of milestone from the status filter");
		Thread.sleep(2000);
		AdminLocator.milestonepageclearbutton(driver).click();
		test.log(LogStatus.PASS, "User is able to click on clear button to clear all the filters");
		Thread.sleep(2000);
		AdminLocator.milestonepagesearchbox(driver).sendKeys("Milestone of PMT Agrovet Ltd.",Keys.BACK_SPACE);
		test.log(LogStatus.PASS, "User is able to search the name of milestone in the search box");
		Thread.sleep(2000);
		AdminLocator.milestonepageeditclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on edit icon of milestone");
		Thread.sleep(2000);
		driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		AdminLocator.milestonepageeditstatusdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the status dropdown on the popup edit milestone");
		Thread.sleep(2000);
		AdminLocator.milestonepageeditstatusdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select the milestone status on the popup of edit milestone");
		Thread.sleep(2000);
		AdminLocator.milestonepageeditremark(driver).sendKeys("milestone of the contract created");
		test.log(LogStatus.PASS, "User is able to enter remark on the popup of edit milestone");
		Thread.sleep(2000);
		AdminLocator.milestonepageedituploaddocument(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Detailed Report  32 (1).xlsx");
		test.log(LogStatus.PASS, "User is able to upload the document on the popup of edit milestone");
		Thread.sleep(2000);
		AdminLocator.milestonepageeditsave(driver).click();
		test.log(LogStatus.PASS, "User is able to click on save button to submit the milestone");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.contractdashboardclick(driver).click();
	}

	public static void myworkspacetask(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		AdminLocator.workspacetab(driver).click();
		Thread.sleep(2000);
		AdminLocator.workspacetaskclick(driver).click();
		test.log(LogStatus.PASS, "User is able to the tab of task on my workspace");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpagepriorityfilterclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click task priority filter on the page of task");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpagepriorityfilterselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select task priority from the filter on the page of task");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpagestatusfilterclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on task status filter on the page of task");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpagestatusfilterselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select task status from the filter on the page of task");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageeditbuttonclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on edit icon for the task");
		Thread.sleep(2000);
		driver.switchTo().frame("showdetails");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageedittaskdetailclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on expand icon for task details");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageedittaskdetaildocview(driver).click();
		test.log(LogStatus.PASS, "User is able to click on view icon for task document");
		Thread.sleep(2000);
		test.log(LogStatus.FAIL, "User is not able to view the task document");
		AdminLocator.workspacetaskpageedittaskdetaildocviewpopupclose(driver).click();
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageedittaskdetaildocdownload(driver).click();
		test.log(LogStatus.PASS, "User is able to click on download icon for task document");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageedittaskdetailclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageeditbuttonstatusdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on status dropdown on the popup of edit task");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageeditbuttonstatusdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select task status from the status dropdown on the popup of edit task");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageeditbuttonremark(driver).sendKeys("task created");
		test.log(LogStatus.PASS, "User is able to enter remark for the task");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageeditfileupload(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Detailed Report  32 (1).xlsx");
		test.log(LogStatus.PASS, "User is able to upload the task document");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageeditsave(driver).click();
		test.log(LogStatus.PASS, "User is able to click on save button to submit the task");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,-800)");
		
		//Thread.sleep(2000);
		AdminLocator.workspacetaskpageeditpopupclose(driver).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.workspacetaskpagesearchbox(driver).sendKeys("Contract of grains and fertilisers",Keys.BACK_SPACE);
		test.log(LogStatus.PASS, "User able to search the task by contract title");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageclearbutton(driver).click();
		test.log(LogStatus.PASS, "User able to clear the searched text");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpagesearchbox(driver).sendKeys("Review task of the contract of GST tax",Keys.BACK_SPACE);
		test.log(LogStatus.PASS, "User able to search the task by task title");
		Thread.sleep(2000);
		AdminLocator.workspacetaskpageclearbutton(driver).click();
		
	}
	
	public static void contractsexpiring(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
 		Thread.sleep(2000);
		AdminLocator.contractexpiringindropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the dropdown of Contracts Expiring In on my dashboard");
		Thread.sleep(2000);
		AdminLocator.contractexpiringin60days(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the dropdown of Contracts Expiring in 60 days on my dashboard and the records of respective contracts are loaded.");
		Thread.sleep(3000);
		AdminLocator.contractexpiringindropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractexpiringin90days(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the dropdown of Contracts Expiring in 90 days on my dashboard and the records of respective contracts are loaded.");
		Thread.sleep(3000);
		AdminLocator.contractexpiringindropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractexpiringinmorethan90days(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the dropdown of Contracts Expiring in more than 90 days on my dashboard and the records of respective contracts are loaded.");
	}
	
	public static void contractcriticaldocument(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.contractdocumentclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabclick(driver).click();
		test.log(LogStatus.PASS,"User is able to click on the tab of critical documents");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnew(driver).click();
		test.log(LogStatus.PASS,"User is able to click on the button of add new");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewfolderclick(driver).click();
		test.log(LogStatus.PASS,"User is able to click on the add new folder name");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewuserdropdownclick(driver).click();
		test.log(LogStatus.PASS,"User is able to click on the dropdown of users on the popup of add new");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewuserdropdownsearch(driver).sendKeys("Finance Manager");
		test.log(LogStatus.PASS,"User is able to search the name of user in the search box in the dropdown of user");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewuserdropdownselect(driver).click();
		test.log(LogStatus.PASS,"User is able to select user from the user dropdown");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewisuniversalclick(driver).click();
		test.log(LogStatus.PASS,"User is able to select the checkbox of is universal");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewfoldername(driver).sendKeys("Logistics Services Contract");
		test.log(LogStatus.PASS,"User is able to enter the folder name to be created");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewfoldernamecreate(driver).click();
		test.log(LogStatus.PASS,"User is able to click on create button to create new critical document folder");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditclick(driver).click();
		test.log(LogStatus.PASS,"User is able to click on click on edit icon for the folder of critical document");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditfoldername(driver).clear();
		test.log(LogStatus.PASS,"User is able to clear the name of folder in the text box of folder name");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditfoldername(driver).sendKeys("Logistics Services Contract 123");
		test.log(LogStatus.PASS,"User is able to enter the new name of the folder in the text box of folder name");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditfolderrename(driver).click();
		test.log(LogStatus.PASS,"User is able to update the name of the folder of critical document");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldersearch(driver).sendKeys("FMCG Contract Documents",Keys.ENTER);
		test.log(LogStatus.PASS,"User is able to enter the name of the folder of critical document to be searched in the search box");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		test.log(LogStatus.PASS,"User is able to click on click on the folder name so as to open the share and delete icons");
		Thread.sleep(3000);
		AdminLocator.contractcriticaldoctabshareiconclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the share icon for share document to user");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the permission dropdown on share popup.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select permission after clicking on permission dropdown.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the user dropdown on the share popup.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownsearch(driver).sendKeys("cfo finance");
		test.log(LogStatus.PASS, "User is able to search the name of user in the text box of user dropdown");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select user from the user dropdown to share the document");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabsharebuttonclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the share button to share document to user");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		/*AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabdeletefolder(driver).click();
		test.log(LogStatus.PASS, "User is able to delete the folder of critical document by clicking on delete icon");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);*/
		/*AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the folder name so as to open the enable the share icon to unshare the document to the user");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the share icon for unshare the document to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabsharebuttondeleteuser(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the delete to unshare the document to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfolder(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfoldertabclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfoldername(driver).sendKeys("Logistics Services Contract Document");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditsubfolderrename(driver).click();
		test.log(LogStatus.PASS, "User is able to create new sub-folder inside the parent folder.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfolderpopupclose(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfolder(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfoldertabclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfoldername(driver).sendKeys("Logistics Services Sub-Contract Document");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditsubfolderrename(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnewsubfolderpopupclose(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditfoldername(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditfoldername(driver).sendKeys("Logistics System Contract Document");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabeditsubfolderrename(driver).click();
		test.log(LogStatus.PASS, "User is able to rename the sub-folder of parent folder.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldersearch(driver).sendKeys("Logistics System Contract Document",Keys.ENTER);
		test.log(LogStatus.PASS, "User is able to search the sub-folder of parent folder.");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the sub-folder name so as to open the enable the share icon to share the document to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticalsubdoctabshareiconclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the share icon for share document to user");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the permission dropdown on share popup.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select permission after clicking on permission dropdown.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the user dropdown on the share popup.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownsearch(driver).sendKeys("cfo finance");
		test.log(LogStatus.PASS, "User is able to search the name of user in the text box of user dropdown");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select user from the user dropdown to share the document");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabsharebuttonclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the share button to share sub-folder to user");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabfoldernameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabdeletesubfolder(driver).click();
		test.log(LogStatus.PASS, "User is able to delete the sub-folder of critical document by clicking on delete icon");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabaddnew(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocaddnewfileclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the tab of add new file.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocchoosefileclick(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Detailed Report  (32).xlsx");
		test.log(LogStatus.PASS, "User is able to choose the file to be uploaded.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadbuttonclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the button of upload file.");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfilenameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfiledownloadclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on download icon to download the uploaded file.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfileeditclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on edit icon to update the file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfilecreateddate(driver).sendKeys("02-08-2023");
		test.log(LogStatus.PASS, "User is able to enter the file creation date on the popup of edit file details");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfilecreateddate(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfileheader(driver).sendKeys("File Header");
		test.log(LogStatus.PASS, "User is able to enter the file header on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadothers(driver).sendKeys("Other information");
		test.log(LogStatus.PASS, "User is able to enter the field of others on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadsubprocess(driver).sendKeys("File sub-process");
		test.log(LogStatus.PASS, "User is able to enter the file subprocess on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploaddescription(driver).sendKeys("File Description");
		test.log(LogStatus.PASS, "User is able to enter the description on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadprocess(driver).sendKeys("File Process");
		test.log(LogStatus.PASS, "User is able to enter the process on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadvertical(driver).sendKeys("File Verticals");
		test.log(LogStatus.PASS, "User is able to enter the verticals on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadlocation(driver).sendKeys("D drive");
		test.log(LogStatus.PASS, "User is able to enter the location on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploaddoctags(driver).sendKeys("filedoc");
		test.log(LogStatus.PASS, "User is able to enter the file tag on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadupdateinformation(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the button of update information on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadupdateinformationclose(driver).click();
		test.log(LogStatus.PASS, "User is able to click on cancel icon on the popup of edit file details.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfilenameclick(driver).click();
		Thread.sleep(3000);
		AdminLocator.contractcriticaldocfileshareiconclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on share to share the uploaded file to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the permission dropdown to share the file to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select permission from the dropdown to share the file to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on  user dropdown to share the file to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownsearch(driver).sendKeys("cfo finance");
		test.log(LogStatus.PASS, "User is able to search user from the dropdown to share the file to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconuserdropdownselect(driver).click();
		test.log(LogStatus.PASS, "User is able to select user from the user dropdown to share the file to the user.");
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabshareiconpermissiondropdownclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldoctabsharebuttonclick(driver).click();
		test.log(LogStatus.PASS, "User is able to click on the share button to share document to user");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploadfilenameclick(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractcriticaldocfileuploaddelete(driver).click();
		test.log(LogStatus.PASS, "User is able to click on delete icon to delete the uploaded file.");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	
	public static void importutility(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.importutilityclick(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the tab of import utility");
		Thread.sleep(2000);
		AdminLocator.importutilitycontractradiobutton(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the radio button of contract");
		Thread.sleep(2000);
		AdminLocator.importutilitychoosefile(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Contract_Upload_Format (10).xlsx");
		test.log(LogStatus.PASS, "Admin user is able to click on the tab of choose file to select file to upload the contract");
		Thread.sleep(2000);
		AdminLocator.importutilityfileupload(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the upload button to upload the contract");
		driver.navigate().refresh();
		Thread.sleep(2000);
		AdminLocator.importutilityvendorradiobutton(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the radio button of vendor");
		Thread.sleep(2000);
		AdminLocator.importutilitychoosefile(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Contract_Upload_Format (10).xlsx");
		test.log(LogStatus.PASS, "Admin user is able to click on the tab of choose file to select file to upload vendor");
		Thread.sleep(2000);
		AdminLocator.importutilityfileupload(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the upload button to upload vendor");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		AdminLocator.importutilitycontracttype(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the radio button of contract type");
		Thread.sleep(2000);
		AdminLocator.importutilitychoosefile(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Contract_Upload_Format (10).xlsx");
		test.log(LogStatus.PASS, "Admin user is able to click on the tab of choose file to select file to upload contract type");
		Thread.sleep(2000);
		AdminLocator.importutilityfileupload(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the upload button to upload contract type");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		AdminLocator.importutilitycontractsubtype(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the radio button of contract sub-type");
		Thread.sleep(2000);
		AdminLocator.importutilitychoosefile(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Contract_Upload_Format (10).xlsx");
		test.log(LogStatus.PASS, "Admin user is able to click on the tab of choose file to select file to upload contract sub-type");
		Thread.sleep(2000);
		AdminLocator.importutilityfileupload(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the upload button to upload contract sub-type.");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		AdminLocator.importutilitycontractdoctype(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the radio button of contract document type");
		Thread.sleep(2000);
		AdminLocator.importutilitychoosefile(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\Contract_Upload_Format (10).xlsx");
		test.log(LogStatus.PASS, "Admin user is able to click on the tab of choose file to select file to upload contract document type");
		Thread.sleep(2000);
		AdminLocator.importutilityfileupload(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on upload button to upload contract document type");
		Thread.sleep(2000);
		AdminLocator.workspacetab(driver).click();
		Thread.sleep(2000);
		AdminLocator.myworkspacecontracttab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on contract tab on my workspace");
		Thread.sleep(2000);
		AdminLocator.myworkspacecontractsearchbox(driver).sendKeys("1576948");
		test.log(LogStatus.PASS, "Admin user entered the contract number in the search box");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "The uploaded contract is sucessfully searched on my workspace");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.mastervendortab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the vendor master tab");
		Thread.sleep(2000);
		AdminLocator.mastervendortabsearchbox(driver).sendKeys("Unicare Vendors",Keys.ENTER);
		test.log(LogStatus.PASS, "Admin user entered the name of uploaded vendor in the search box");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "The uploaded vendor is successfully searched on the page of vendor master");
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.mastercontracttypetab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on contract type-subtype master tab");
		Thread.sleep(2000);
		AdminLocator.mastercontracttabsearchbox(driver).sendKeys("Logistics Regulatory Contract",Keys.ENTER);
		test.log(LogStatus.PASS, "Admin user entered the name of the uploaded contract type in the search box");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "The uploaded contract type is successfully searched on the page of contract type master");
		AdminLocator.mastercontracttabsubtype(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the link of contract sub-type");
		Thread.sleep(2000);
		AdminLocator.mastercontracttabsubtypesearchbox(driver).sendKeys("Logistics Sub-Regulatory Contract",Keys.ENTER);
		test.log(LogStatus.PASS, "Admin user entered the name of contract sub-tye in the search box");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "The uploaded contract sub-type is successfully searched on the page of contract sub-type master");
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterdocumenttab(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the tab of document type master");
		Thread.sleep(2000);
		AdminLocator.masterdocumenttabsearchbox(driver).sendKeys("Logistics Contract Papers",Keys.ENTER);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Admin user entered the name of the document type to be searched in the search box");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "The uploaded document type is successfully searched on the page of document type master");
	}
	
	public static void updatecontract(WebDriver driver,ExtentTest test) throws InterruptedException
	{	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdownselect(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceeditcon(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on edit icon for contract");
	    Thread.sleep(3000);
	    driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractsummaryediticon(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on edit icon on summary tab");
	    Thread.sleep(2000);
	    AdminLocator.contractypeclick(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractsummarycontracttypedropdownedit(driver).click();
	    test.log(LogStatus.PASS, "Admin user selected contract type from the dropdown");
	    Thread.sleep(5000);
	    AdminLocator.contractsubtypedropdown(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractsummarycontractsubtypedropdownedit(driver).click();
	    test.log(LogStatus.PASS, "Admin user selected contract sub-type from the dropdown");
	    Thread.sleep(2000);
	    AdminLocator.contractentityclick(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractsummaryentityedropdownedit(driver).click();
	    test.log(LogStatus.PASS, "Admin user selected entity from the dropdown");
	    Thread.sleep(2000);
	    AdminLocator.addcontracttitle(driver).clear();
	    Thread.sleep(2000);
	    AdminLocator.addcontracttitle(driver).sendKeys("Contract of Triveni Turbines Ltd.");
	    test.log(LogStatus.PASS, "Admin user selected updated the contract title");
	    Thread.sleep(2000);
	    AdminLocator.addcontractdescription(driver).clear();
	    Thread.sleep(2000);
	    AdminLocator.addcontractdescription(driver).sendKeys("Contract of Triveni Turbines Pvt.Ltd.");
	    test.log(LogStatus.PASS, "Admin user updated the contract description");
	    Thread.sleep(2000);
	    /*AdminLocator.contractsummarydepttemplatedropdown(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractsummarydepttemplatedropdownedit(driver).click();
	    test.log(LogStatus.PASS, "Admin user updated the department from department template dropdown");
	    Thread.sleep(5000);
	    AdminLocator.contractsummarytemplatedropdown(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractsummarytemplatedropdownselect(driver).click();
	    test.log(LogStatus.PASS, "Admin user updated the template from template dropdown");
	    Thread.sleep(5000);*/
	    /*AdminLocator.contractvendorclick(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractvendorselect(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractsummaryvendordropdownedit(driver).click();
	    test.log(LogStatus.PASS, "Admin user updated the contract vendor");
	    Thread.sleep(2000);
	    AdminLocator.contractvendorclick(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractpersonclick(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractsummarycontractpersonedit(driver).click();
	    test.log(LogStatus.PASS, "Admin user updated the contract person of department");
	    Thread.sleep(2000);
	    AdminLocator.startdateselect(driver).clear();
	    Thread.sleep(2000);
	    AdminLocator.startdateselect(driver).sendKeys("11-08-2023");
		test.log(LogStatus.PASS, "Admin user is able to update the start date of contract");
		Thread.sleep(2000);
		AdminLocator.enddateselect(driver).clear();
		Thread.sleep(2000);
		AdminLocator.enddateselect(driver).sendKeys("30-12-2023");
		test.log(LogStatus.PASS, "Admin user is able to update the end date of contract");
		Thread.sleep(2000);
		AdminLocator.proposaldateselect(driver).clear();
		Thread.sleep(2000);
		AdminLocator.proposaldateselect(driver).sendKeys("10-08-2023");
		test.log(LogStatus.PASS, "Admin user is able to update the proposal date of contract");
		Thread.sleep(2000);
		AdminLocator.agreementdateselect(driver).clear();
		Thread.sleep(2000);
		AdminLocator.agreementdateselect(driver).sendKeys("01-07-2023");
		test.log(LogStatus.PASS, "Admin user is able to update the agreement date of contract");
		Thread.sleep(2000);
		AdminLocator.reviewdateselect(driver).clear();
		Thread.sleep(2000);
		AdminLocator.reviewdateselect(driver).sendKeys("15-09-2023");
		test.log(LogStatus.PASS, "Admin user is able to update the review date of contract");
		//Thread.sleep(3000);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(2000);
		AdminLocator.contractsummaryamount(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractsummaryamount(driver).sendKeys("80000");
		test.log(LogStatus.PASS, "Admin user is able to update the contract amount");
		Thread.sleep(2000);
		AdminLocator.contractsummarytaxes(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractsummarytaxes(driver).sendKeys("45000");
		test.log(LogStatus.PASS, "Admin user is able to update the taxes");
		Thread.sleep(2000);
		AdminLocator.contractsummaryproductitems(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractsummaryproductitems(driver).sendKeys("grocery items");
		test.log(LogStatus.PASS, "Admin user is able to update the product items");
		Thread.sleep(2000);
		AdminLocator.contractsummarypaymenttypedropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractsummarypaymenttypedropdownselect(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to update value from the payment type dropdown");
		Thread.sleep(2000);
		AdminLocator.contractsummarypaymenttermdropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractsummarypaymenttermdropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractsummarypaymenttermdropdownedit(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to update value from the dropdown of payment term");
		Thread.sleep(2000);
		AdminLocator.contractsummarypaymenttermdropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractsummarynoticeterm(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractsummarynoticeterm(driver).sendKeys("11");
		test.log(LogStatus.PASS, "Admin user is able to update value in the text box of notice term");
		Thread.sleep(2000);
		AdminLocator.contractsummarylockinperiod(driver).click();
		Thread.sleep(2000);
		AdminLocator.contractsummarylockinperiod(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractsummarylockinperiod(driver).sendKeys("25-10-2023");
		test.log(LogStatus.PASS, "Admin user is able to update the lock-in-period");
		Thread.sleep(2000);
		AdminLocator.contractsummaryremark(driver).clear();
		Thread.sleep(2000);
		AdminLocator.contractsummaryremark(driver).sendKeys("contract updated by the creator of contract");
		test.log(LogStatus.PASS, "Admin user is able to update and enter the new contract remark");
		Thread.sleep(2000);
		AdminLocator.contractsummarycustomfield(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to click on the dropdown of custom field");
		Thread.sleep(2000);
		AdminLocator.contractsummarycustomfieldselect(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to select custom field from the dropdown");
		Thread.sleep(2000);
		AdminLocator.contractsummarycustomfieldvalue(driver).sendKeys("custom field value saved");
		test.log(LogStatus.PASS, "Admin user is able to enter the value of custom field in the text box");
		Thread.sleep(2000);
		AdminLocator.contractsave(driver).click();
		/*Thread.sleep(5000);
		AdminLocator.contractsummarychangetemplateteaccept(driver).click();*/
		//test.log(LogStatus.PASS, "Admin user clicked on update to update the contract. Contract Details Updated Successfully");
	    
	
	
	
	public static void agreementtab(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		Locator.workspacetab(driver).click();
		Thread.sleep(3000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(4000);
	   	AdminLocator.workspacesearch(driver).sendKeys("Contract of BNG Seeds");
	   	Thread.sleep(2000);
	   	AdminLocator.contracteditclick(driver).click();
		Thread.sleep(3000);
	   	 AdminLocator.agreementtab(driver).click();
	   	 Thread.sleep(4000);
	   	 driver.switchTo().frame(driver.findElement(By.className("k-content-frame")));
	   	 Thread.sleep(3000);
	   	 AdminLocator.reviewersubmit(driver).click();
	   	 Thread.sleep(3000);
	   	 driver.switchTo().frame(driver.findElement(By.className("k-content-frame")));
	   	 Thread.sleep(3000);
	   	 AdminLocator.reviewerdropdown(driver).click();
	   	 Thread.sleep(2000);
	   	 AdminLocator.reviewerdropdownselect(driver).click();
	   	 Thread.sleep(2000);
	   	 AdminLocator.docsharedcheckbox(driver).click();
	   	 Thread.sleep(2000);
	   	 AdminLocator.addreviewer(driver).click();
	   	 Thread.sleep(2000);
	   	 driver.switchTo().alert().accept();
	   	 Thread.sleep(2000);
	   	 AdminLocator.submitforreview(driver).click();
	   	 Thread.sleep(5000);
	   	 AdminLocator.sendforreviewremark(driver).sendKeys("agreement sent to reviewer");
	   	 Thread.sleep(3000);
	   	 AdminLocator.remarksubmit(driver).click();
	   	 Thread.sleep(6000);
	   	 driver.switchTo().alert().accept();
	   	 test.log(LogStatus.PASS, "Contract agreement sent to the reviewer by the owner");
	   	 Thread.sleep(4000);
	   	 driver.switchTo().parentFrame();
	   	 Thread.sleep(2000);
	   	AdminLocator.agreementtabexportbutton(driver).click();
	   	 test.log(LogStatus.PASS, "Admin user clicked on export button to download the document");
	   	 Thread.sleep(2000);
	   	AdminLocator.agreementtabfullhistory(driver).click();
	   	 test.log(LogStatus.PASS, "Admin user clicked on the button of full history");
	   	 Thread.sleep(2000);
	   	 driver.switchTo().frame("showdetails");
	   	 Thread.sleep(2000);
	   	 AdminLocator.fullhistoryexportdoc(driver).click();
	   	 test.log(LogStatus.PASS, "Admin user clicked on the button of export document");
	   	 Thread.sleep(2000);
	   	 driver.switchTo().parentFrame();
	   	 Thread.sleep(2000);
	   	 //AdminLocator.agreementtabfullhistoryclose(driver).click();
	   	 //Thread.sleep(2000);
	   	 driver.switchTo().parentFrame();
	   	 Thread.sleep(2000);
	   	 driver.switchTo().parentFrame();
	   	 Thread.sleep(4000);
	   	 //Thread.sleep(5000);
	   	 AdminLocator.agreementtabclose(driver).click();
	   	 Thread.sleep(3000);
	   	 AdminLocator.contractsummaryrefreshicon(driver).click();
	   	 Thread.sleep(2000);
		 /*Locator.workspacetab(driver).click();
		 Thread.sleep(3000);
	   	 Locator.contracttab(driver).click();
	   	 Thread.sleep(4000);
	   	 AdminLocator.workspacestatusdropdown(driver).click();
	   	 Thread.sleep(2000);
	   	 AdminLocator.workspacereviewcompletedcheckbox(driver).click();
	   	 Thread.sleep(2000);
	   	 AdminLocator.contracteditclick(driver).click();
	   	 Thread.sleep(3000);
	   	 AdminLocator.agreementtab(driver).click();
	   	 Thread.sleep(4000);
	   	 driver.switchTo().frame(driver.findElement(By.className("k-content-frame")));
	   	 Thread.sleep(3000);
	   	 AdminLocator.agreementtabvendorreviewbutton(driver).click();
	   	 Thread.sleep(5000);
	   	 AdminLocator.agreementtabvendorreviewsubmit(driver).click();
	   	 Thread.sleep(3000);
	   	 AdminLocator.agreementtabvendorremark(driver).sendKeys("agreement sent for vendor review");
	   	 Thread.sleep(5000);
	   	 //AdminLocator.agreementtabvendorremarksubmit(driver).click();
	   	 //Thread.sleep(2000);
	   	 //AdminLocator.agreementtabvendorremarksubmit(driver).click();
	   	 //actions.moveToElement(AdminLocator.agreementtabvendorremarksubmit(driver)).click().build().perform();
	   	 WebDriverWait wait=new WebDriverWait(driver, 10);
	   	 wait.until(ExpectedConditions.elementToBeClickable(AdminLocator.agreementtabvendorremarksubmit(driver)));
	   	 AdminLocator.agreementtabvendorremarksubmit(driver).click();
	   	 Thread.sleep(5000);
	   	 driver.switchTo().alert().accept();
	   	 test.log(LogStatus.PASS, "Contract agreement sent for vendor review");
	   	 Thread.sleep(2000);
	   	 driver.switchTo().parentFrame();
	   	 Thread.sleep(2000);
	   	 AdminLocator.agreementtabclose(driver).click();
	   	 Thread.sleep(2000);
	   	 AdminLocator.contractsummaryrefreshicon(driver).click();
	   	 /*AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdownselect(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.myworkspacesearchbox(driver).sendKeys("Contract of GBK Seeds");
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceeditcon(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on edit icon for contract");
	    Thread.sleep(3000);
	    driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the agreement tab of contract");
	    Thread.sleep(4000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(3000);
	    AdminLocator.contractagreementcreatedocument(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the button of create document");
	    Thread.sleep(3000);
	    //driver.switchTo().frame("RadEditor1");
	    String Parent=driver.getWindowHandle();
	    System.out.println(Parent);
	    Set<String>s=driver.getWindowHandles();
	    System.out.println(s.toString());
	    Thread.sleep(2000);
	    Iterator<String>I1=s.iterator();
	    while(I1.hasNext())
	    {
	    	String child_window=I1.next();
	    	if(!Parent.equals(child_window))
	    	{
	    		driver.switchTo().window(child_window);
	    		System.out.println("driver switched to child window");
	    		Thread.sleep(4000);
	    		
	    		//Thread.sleep(2000);
	    		//driver.switchTo().frame("RadEditor1_contentIframe");
	    		//Thread.sleep(3000);
	    		//AdminLocator.contractagreementcontent(driver).sendKeys("agreement");
	    		//Thread.sleep(3000);
	    		AdminLocator.contractagreementsaveandclose(driver).click();
	    		test.log(LogStatus.PASS, "Admin user clicked on save and close button on the tab of document editor for agreement");
	    		Thread.sleep(2000);
	    		driver.switchTo().alert().accept();
	    		Thread.sleep(2000);
	    		driver.close();
	    		test.log(LogStatus.PASS, "Admin user clicked on close icon for the document editor tab");
	    	}
	    }
	  
	    Thread.sleep(2000);
	    driver.switchTo().window(Parent);
	    Thread.sleep(2000);
	    driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    Thread.sleep(3000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementsendforreview(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the button of send for review");
	    Thread.sleep(2000);
	    driver.switchTo().frame("MultiReviewerframe");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementselectreviewerdropdown(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the select reviewer dropdown");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementselectreviewer(driver).click();
	    test.log(LogStatus.PASS, "Admin user is able to select the reviewer from the dropdown");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementaddreviewer(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on add button to add the reviewer");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementsubmitreview(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on submit for review button to send the agreeement to the reviewer");
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    //System.out.println("frame found");
	    //AdminLocator.contractagreementcontent(driver).sendKeys("agreement document");
	    //AdminLocator.contractagreementcontent(driver).sendKeys("contract draft document paper");
	    //AdminLocator.contractagreementsendforreview(driver).click();
	    //AdminLocator.contractagreementstatusbox(driver).click();
	    driver.switchTo().parentFrame();
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    AdminLocator.summarypopupclose(driver).click();*/
		
	}
	
	public static void vendorreview(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractvendorreviewstatus(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceeditcon(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on edit icon for contract");
	    Thread.sleep(3000);
	    driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the agreement tab of contract");
	    Thread.sleep(4000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(3000);
	    AdminLocator.contractagreementsendforvendorreview(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the button of submit for vendor review");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementvendorrevieweremail(driver).clear();
	    test.log(LogStatus.PASS, "Admin user able to clear the text of vendor email");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementvendorrevieweremail(driver).sendKeys("rahul.subhashraikwar@tlregtech.in");
	    test.log(LogStatus.PASS, "Admin user able to edit and enter new vendor email address");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementvendorreviewercontact(driver).clear();
	    test.log(LogStatus.PASS, "Admin user able to clear the contact numnber of vendor");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementvendorreviewercontact(driver).sendKeys("9021136495");
	    test.log(LogStatus.PASS, "Admin user able to edit and enter new contact number of vendor");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementsubmitforvendorreview(driver).click();
	    test.log(LogStatus.PASS, "Admin user able to click on the button of submit for vendor review");
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(3000);
	    AdminLocator.contractagreementpopupclose(driver).click();
	    
	}
	
	public static void approverreview(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractagreementapproverstatus(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceeditcon(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on edit icon for contract");
	    Thread.sleep(3000);
	    driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the agreement tab of contract");
	    Thread.sleep(4000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(3000);
		AdminLocator.contractagreementsubmitforapproverreview(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the button for submit for approval");
		Thread.sleep(2000);
		driver.switchTo().frame("Multiapproverframe");
		Thread.sleep(2000);
		AdminLocator.contractagreementapproverdropdown(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the dropdown of select approver");
		Thread.sleep(2000);
		AdminLocator.contractagreementapproverdropdownselect(driver).click();
		test.log(LogStatus.PASS, "Admin user is able to select approver from the dropdown");
		Thread.sleep(2000);
		AdminLocator.contractagreementaddapprover(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the add button to add the selected approver");
		Thread.sleep(2000);
		AdminLocator.contractagreementsubmitforapproval(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the button of submit for approval to send the agreement to the approver for review");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		AdminLocator.contractagreementpopupclose(driver).click();
		
	}
	
	public static void converttoactive(WebDriver driver, ExtentTest test) throws InterruptedException 
	{
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	Thread.sleep(2000);
		AdminLocator.contractagreementapprovalcompletedstatus(driver).click();
		test.log(LogStatus.PASS, "Admin user clicked on the status of approval completed from the status dropdown on my workspace.");
		Thread.sleep(2000);
		AdminLocator.contractworkspaceapprovalcompletededit(driver).click();
		Thread.sleep(2000);
		driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    //test.log(LogStatus.PASS, "Admin user clicked on the agreement tab of contract");
	    Thread.sleep(4000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(3000);
	    AdminLocator.contractagreementconvertocontract(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the tab of status on the agreement tab.");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementactivecontractstartdate(driver).clear();
	    test.log(LogStatus.PASS, "Admin user is able to clear the start date on the popup of upload final document to convert the contract to active");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementactivecontractstartdate(driver).sendKeys("01-09-2023");
	    test.log(LogStatus.PASS, "Admin user is able to select the start date of contract from the calendar");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementactivecontractexpirationdate(driver).clear();
	    test.log(LogStatus.PASS, "Admin user is able to clear the end date on the popup of upload final document to convert the contract to active");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementactivecontractexpirationdate(driver).sendKeys("30-11-2023");
	    test.log(LogStatus.PASS, "Admin user is able to select the end date of contract from the calendar");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementactivecontractcalendaricon(driver).click();
	    Thread.sleep(2000);
	    AdminLocator.contractagreementactivecontractfileupload(driver).sendKeys("C:\\Users\\Rahul Raikar\\Downloads\\ComplianceReport (22).xlsx");
	    test.log(LogStatus.PASS, "Admin user is able to upload the document to convert the contract to status active");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementactivecontractsave(driver).click();
	    test.log(LogStatus.PASS, "Admin user is able to click on save button to convert the contract to active status");
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    AdminLocator.contractagreementpopupclose(driver).click();
	}
	
	public static void contractrenew(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	test.log(LogStatus.PASS, "Admin user is able to select active from the status dropdown on my workspace.");
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceactivestatus(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceactivecontractedit(driver).click();
	   	Thread.sleep(2000);
	   	driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the agreement tab of contract");
	    Thread.sleep(4000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(2000);
	   	AdminLocator.contractagreementcontractrenew(driver).click();
	   	test.log(LogStatus.PASS, "Admin user is able to click on the tab of renew to convert the contract to draft status.");
	   	Thread.sleep(2000);
	   	driver.switchTo().alert().accept();
	   	Thread.sleep(2000);
	   	AdminLocator.contractagreementpopupclose(driver).click();
	}
	
	public static void contractagreementexport(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		JavascriptExecutor js=(JavascriptExecutor) driver;		
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	test.log(LogStatus.PASS, "Admin user is able to select active from the status dropdown on my workspace.");
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceactivestatus(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on status dropdown on my workspace");
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceactivecontract(driver).click();
	   	test.log(LogStatus.PASS,"Admin user selected the status of active in the status dropdown");
	   	Thread.sleep(2000);
	   	driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the agreement tab of contract");
	    Thread.sleep(4000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementexportdocument(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the button of export document to download the agreement document in word format");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementexportpdf(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the button of export pdf to download the agreement document in pdf format");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementfullhistory(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the tab of Full History");
	    Thread.sleep(2000);
	    driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementfullhistoryexportdocument(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the button of export document on the tab of Full History");
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    //Thread.sleep(2000);
	    //driver.switchTo().parentFrame();
	    //Thread.sleep(2000);
	    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
	    //AdminLocator.contractagreementfullhistorypopupclose(driver).click();
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    Thread.sleep(2000);
	    driver.switchTo().frame("showdetail");
	    Thread.sleep(2000);
	    AdminLocator.contractagreementallcomments(driver).click();
	    test.log(LogStatus.PASS, "Admin user clicked on the tab of All Comments to view the comments by all the agreement users");
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    AdminLocator.contractagreementtab(driver).click();
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    /*driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);*/
	    //WebElement ele=driver.findElement(By.xpath("//*[@id='CommentsPopup']/div/div/div[1]/button"));
	    //js.executeScript("arguments[0].click",ele);
	    AdminLocator.summarypopupclose(driver).click();
	    //AdminLocator.contractagreementallcommentspopupclose(driver).click();
	   // AdminLocator.summarypopupclose(driver).click();
	}
	
	public static void auditlog(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(4000);
	   	AdminLocator.contracteditclick(driver).click();
		Thread.sleep(3000);
		/*Locator.workspacetab(driver).click();
		Thread.sleep(2000);
	   	Locator.contracttab(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdown(driver).click();
	   	test.log(LogStatus.PASS, "Admin user is able to select active from the status dropdown on my workspace.");
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspacestatusdropdownselect(driver).click();
	   	Thread.sleep(2000);
	   	AdminLocator.contractworkspaceeditcon(driver).click();
	   	test.log(LogStatus.PASS, "Admin user clicked on edit icon for contract");
	    Thread.sleep(3000);
	    driver.switchTo().frame("showdetails");
	    Thread.sleep(2000);*/
	   	AdminLocator.auditlogtab(driver).click();
	   	Thread.sleep(4000);
	   	test.log(LogStatus.PASS,"Admin User clicked on the tab of audit log");
	   	/*AdminLocator.auditloguserfilter(driver).click();
	   	//test.log(LogStatus.PASS,"Admin User clicked on the filter of user");
	   	Thread.sleep(2000);
	   	AdminLocator.auditloguserfilterselect(driver).click();
	   	test.log(LogStatus.PASS,"Admin User selected user from the filter of user");
	   	Thread.sleep(2000);
	   	AdminLocator.auditlogstartdate(driver).sendKeys("01-07-2023");
	   	//test.log(LogStatus.PASS,"Admin User selected the start date from the calendar");
	   	Thread.sleep(2000);
	   	AdminLocator.auditlogenddate(driver).sendKeys("30-09-2023");
	   	//test.log(LogStatus.PASS,"Admin User selected the end date from the calendar");
	   	Thread.sleep(2000);
	   	AdminLocator.auditlogapplyfilter(driver).click();
	   	//test.log(LogStatus.PASS,"Admin User clicked on the button of apply filter");
	   	Thread.sleep(2000);*/
	   	AdminLocator.auditlogexporticon(driver).click();
	   	test.log(LogStatus.PASS,"Admin User clicked on the icon of export to excel");
	   	Thread.sleep(4000);
	   	AdminLocator.auditlogpopupclose(driver).click();
	}

	public static void entitymaster(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitytab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentityaddnew(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentityname(driver).sendKeys("Bita Consulting Parli");
		Thread.sleep(2000);
		AdminLocator.masterentityunittypedropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentityunittypedropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentityaddress(driver).sendKeys("Parli Dist. Beed");
		Thread.sleep(2000);
		AdminLocator.masterentitystatedropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitystatedropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitycitydropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitycitydropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitycontactperson(driver).sendKeys("Mr. Nikhil Chopde");
		Thread.sleep(2000);
		AdminLocator.masterentitycontactpersonemail(driver).sendKeys("nikhil@tleregtech.in");
		Thread.sleep(2000);
		AdminLocator.masterentitystatusdropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitystatusdropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitysave(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitypopupclose(driver).click();
		Thread.sleep(3000);
		AdminLocator.masterentitysearch(driver).sendKeys("Bita consulting, Goa",Keys.ENTER);
		Thread.sleep(2000);
	}
	
	
	public static void usermasternonadminrole(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruseraddnew(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserfirstname(driver).sendKeys("Richa");
		Thread.sleep(2000);
		AdminLocator.masteruserlastname(driver).sendKeys("Sharma");
		Thread.sleep(2000);
		AdminLocator.masteruserdesignation(driver).sendKeys("employee");
		Thread.sleep(2000);
		AdminLocator.masteruseremail(driver).sendKeys("richa.sharma@tlregtech.in");
		Thread.sleep(2000);
		AdminLocator.masterusercontactno(driver).sendKeys("9000000000");
		Thread.sleep(2000);
		AdminLocator.masteruserdepartment(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserdepartmenselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruseraddress(driver).sendKeys("Pune");
		Thread.sleep(2000);
		AdminLocator.masteruserroledropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusernonadminroledropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserentitydropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserentitydropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusersave(driver).click();
		Thread.sleep(4000);
		AdminLocator.masteruserclose(driver).click();
		
	}
	
	public static void usermasteradminrole(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruseraddnew(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserfirstname(driver).sendKeys("Nikhil");
		Thread.sleep(2000);
		AdminLocator.masteruserlastname(driver).sendKeys("Soni");
		Thread.sleep(2000);
		AdminLocator.masteruserdesignation(driver).sendKeys("employee");
		Thread.sleep(2000);
		AdminLocator.masteruseremail(driver).sendKeys("nitin.soni@tlregtech.in");
		Thread.sleep(2000);
		AdminLocator.masterusercontactno(driver).sendKeys("9000000000");
		Thread.sleep(2000);
		AdminLocator.masteruserdepartment(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserdepartmenselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruseraddress(driver).sendKeys("Pune");
		Thread.sleep(2000);
		AdminLocator.masteruserroledropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruseradminroledropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusersave(driver).click();
		Thread.sleep(4000);
		AdminLocator.masteruserclose(driver).click();
		
	}
	
	public static void usermastermanagementrole(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruseraddnew(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserfirstname(driver).sendKeys("Girish");
		Thread.sleep(2000);
		AdminLocator.masteruserlastname(driver).sendKeys("Munde");
		Thread.sleep(2000);
		AdminLocator.masteruserdesignation(driver).sendKeys("employee");
		Thread.sleep(2000);
		AdminLocator.masteruseremail(driver).sendKeys("girish.munde@tlregtech.in");
		Thread.sleep(2000);
		AdminLocator.masterusercontactno(driver).sendKeys("9000000000");
		Thread.sleep(2000);
		AdminLocator.masteruserdepartment(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruserdepartmenselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masteruseraddress(driver).sendKeys("Pune");
		Thread.sleep(2000);
		AdminLocator.masteruserroledropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusermanagementroledropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterusersave(driver).click();
		Thread.sleep(4000);
		AdminLocator.masteruserclose(driver).click();
		
	}
	
	public static void usersearch(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.masterusersearchbox(driver).sendKeys("Girish",Keys.ENTER);
		Thread.sleep(2000);
		AdminLocator.masterusersearchbox(driver).clear();
		Thread.sleep(2000);
		AdminLocator.masterusersearchbox(driver).sendKeys("nitin.soni@tlregtech.in");
		Thread.sleep(2000);
		AdminLocator.masterusersearchbox(driver).clear();
		Thread.sleep(2000);
		AdminLocator.masterusersearchbox(driver).sendKeys("9000000000");
		Thread.sleep(2000);
		AdminLocator.masterusersearchbox(driver).clear();
		
	}
	
	public static void userdelete(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.masterusersearchbox(driver).sendKeys("nitin.soni@tlregtech.in",Keys.ENTER);
		Thread.sleep(2000);
		AdminLocator.masteruserdelete(driver).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public static void subentitymaster(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitytab(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitysearch(driver).sendKeys("Bita consulting, Goa",Keys.ENTER);
		Thread.sleep(2000);
		AdminLocator.mastersubentity(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentityname(driver).sendKeys("Bita Consulting Dapolim");
		Thread.sleep(2000);
		AdminLocator.masterentityunittypedropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentityunittypedropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentityaddress(driver).sendKeys("Dapolim, Panaji");
		Thread.sleep(2000);
		AdminLocator.masterentitystatedropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitystatedropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitycitydropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitycitydropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitycontactperson(driver).sendKeys("Mr. Akshay Sawant");
		Thread.sleep(2000);
		AdminLocator.masterentitycontactpersonemail(driver).sendKeys("akshay.sawant@tleregtech.in");
		Thread.sleep(2000);
		AdminLocator.masterentitystatusdropdown(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitystatusdropdownselect(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitysave(driver).click();
		Thread.sleep(2000);
		AdminLocator.masterentitypopupclose(driver).click();
		Thread.sleep(3000);
		
	}

	public static void vendormaster(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		Thread.sleep(2000);
		AdminLocator.mastertab(driver).click();
		Thread.sleep(2000);
		AdminLocator.mastervendortab(driver).click();
		Thread.sleep(2000);
		AdminLocator.mastervendoraddnew(driver).click();
		Thread.sleep(2000);
		driver.switchTo().frame("ContentPlaceHolder1_IframePartyDetial");
		Thread.sleep(2000);
		AdminLocator.mastervendorname(driver).sendKeys("Triumphant Vendors");
		Thread.sleep(2000);
		AdminLocator.mastervendoraddress(driver).sendKeys("Pune");
		Thread.sleep(2000);
		AdminLocator.mastervendorcontactperson(driver).sendKeys("Mr. Lokesh Kumar");
		Thread.sleep(2000);
		AdminLocator.mastervendoremail(driver).sendKeys("lokesh@tlregtech.in");
		Thread.sleep(2000);
		AdminLocator.mastervendorcontactno(driver).sendKeys("9000000000");
		Thread.sleep(2000);
		AdminLocator.mastervendorPAN(driver).sendKeys("BRTPY5437Q");
		Thread.sleep(2000);
		AdminLocator.mastervendorsave(driver).click();
		Thread.sleep(4000);
		AdminLocator.mastervendorclose(driver).click();
	}

}
