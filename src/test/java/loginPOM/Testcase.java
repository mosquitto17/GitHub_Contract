package loginPOM;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CompanyAdminPOM.AdminLocator;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class Testcase 
{

	public WebDriver driver;
	public static ExtentReports extent1;			//Instance created for report file
	public static ExtentTest test1;				//Instance created for tests
	private static List<WebElement> elementsList = null;
    public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static XSSFSheet sheet1 = null;		//Sheet variable
	
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;
	//public WebDriver driver=null;
	public static XSSFSheet ReadExcel() throws IOException
	{
		//String workingDir = System.getProperty("user.dir");
		fis = new FileInputStream("F:\\Contract\\ContractManagement\\TestData\\loginsheet.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(1);					//Retrieving first sheet of Workbook
		return sheet;
	}  
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("F:\\Contract\\ContractManagement\\Report\\Companyadmin.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		org.apache.poi.ss.usermodel.Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
		
		
	}
	@Test(priority = 1)

	void Login() throws InterruptedException, IOException
	{
		
		
		test = extent.startTest("Company Admin");
		

		XSSFSheet sheet = ReadExcel();
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		org.apache.poi.ss.usermodel.Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		org.apache.poi.ss.usermodel.Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"admin");		//Method of Login class to login user.
		
		test.log(LogStatus.PASS, "Test Case Passed.");
		//extent.endTest(test);
		//extent.flush();
//		AdminLocator.workspacetab(driver).click();
//	   	AdminLocator.contracttab(driver).click();
	}
	
	@Test(priority = 2)
	void usermaster() throws InterruptedException, IOException
	{
		test=extent.startTest("User Master");
		Method.usercreate(driver, test);
		Method.edituser(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 3)
	 void vendormaster() throws InterruptedException
	 {
		 test = extent.startTest("Vendor Master");
		 //test.log(LogStatus.INFO, "Vendor Creation");
		 Method.vendorcreate(driver, test);
		 
		 Thread.sleep(2000);
		 //test.log(LogStatus.INFO,"Vendor Update");
		 Method.editvendor(driver,test);
		 
		 Thread.sleep(2000);
		 //test.log(LogStatus.INFO, "Vendor Delete");
		 Method.vendordelete(driver,test);
		 
		 extent.endTest(test);
		extent.flush();

	 }
	 
	 @Test(priority = 4)
	 void contracttypemaster() throws InterruptedException
	 {
		 test = extent.startTest("Contract Type Master");
		 Method.contracttypecreate(driver,test);
		 Thread.sleep(2000);
		 Method.contracttypeedit(driver, test);
		 Thread.sleep(2000);
		 Method.contracttypedelete(driver, test);
		 
		 //Method.subcontracttype(driver,test);
		 extent.endTest(test);
		 extent.flush();
	 }
	 
	 @Test(priority = 5)
	 void subcontracttypemaster() throws InterruptedException
	 {
		 test=extent.startTest(" Contract sub-type master");
		 Method.subcontracttypecreate(driver, test);
		 Thread.sleep(3000);
		 Method.subcontracttypeedit(driver, test);
		 Thread.sleep(3000);
		 Method.subcontractypedelete(driver, test);
		 extent.endTest(test);
		 extent.flush();
	 }
	 
	 @Test(priority = 6)
	 void doctypemaster() throws InterruptedException
	 {
		 test=extent.startTest(" Contract document type master");
		 Method.documenttypecreate(driver,test);
		 Thread.sleep(2000);
		 Method.documenttypeedit(driver, test);
		 Thread.sleep(2000);
		 Method.documenttypedelete(driver, test);
		 extent.endTest(test);
		 extent.flush();
	 }
	 
	 @Test(priority = 7)
	 void departmentmaster() throws InterruptedException 
	 {
		 test=extent.startTest("Contract Department master");
		 Method.departmentcreate(driver,test);
		 Method.departmentdelete(driver, test);
		 extent.endTest(test);
		 extent.flush();
	 }
	
	 @Test(priority = 8)
	 void custommaster() throws InterruptedException
	 {
		 test=extent.startTest("Contract Custom field master");
		 Method.customfieldadd(driver,test);
		 //Method.customfieldedit(driver, test);
		// Method.customdfielddelete(driver, test);
		 extent.endTest(test);
		 extent.flush();
	 }
	 
	 @Test(priority = 9)
	 void deptmappingmaster() throws InterruptedException 
	 {
		 test=extent.startTest("Contract Department Mapping master");
		 Method.departmentmappingadd(driver,test);
		 Method.departmentmappingdelete(driver, test);
		 extent.endTest(test);
		 extent.flush();

	 }
	 
	 @Test(priority = 10)
	  void sectionmaster() throws InterruptedException
	  {
		  Method.section(driver,test);
		  Method.sectionedit(driver,test);
		  Method.sectiondelete(driver,test);
	  }
	  
	  @Test(priority = 11)
	 void templatemaster() throws InterruptedException
	 {
		 Method.templateadd(driver,test);
		 //Method.templateupdate(driver,test);
	 }
	  
	 @Test(priority = 12)
	  void pageauthorisationmaster() throws InterruptedException
	  {	
		  test=extent.startTest("Contract Page Authorisation Master");
		  Method.pageauthorisation(driver,test);
		  extent.endTest(test);
		  extent.flush();
	  }
	 
	  //@Test(priority = 11) 
	  /*void contractadd()
	  {
		  Method.addcontract(driver,test);
	  }*/
	 
	// @AfterTest
	 
		/*void close() throws InterruptedException
		 {
		   Method.driverclose();
		 }*/
}
