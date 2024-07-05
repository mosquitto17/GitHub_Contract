package CompanyAdminPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class AdminTestCase
{
	WebDriver driver;
	public  ExtentReports extent;			//Instance created for report file
	public  ExtentTest test;				//Instance created for tests
	private  List<WebElement> elementsList = null;
    public  FileInputStream fis = null;	//File input stream variable
	public  XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public  XSSFSheet sheet = null;		//Sheet variable
	public  XSSFSheet sheet1 = null;		//Sheet variable
	//AdminCriticalTestCase critical=new AdminCriticalTestCase();
	public  XSSFSheet ReadExcel() throws IOException
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
		
		test.log(LogStatus.PASS, "Chrome Browser opened successfully");
		extent.endTest(test);
		extent.flush();
		
		
	}
	
	@Test(priority = 1)

	void Login() throws InterruptedException, IOException
	{
		
		
		test = extent.startTest("Login");
		

		XSSFSheet sheet = ReadExcel();
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		org.apache.poi.ss.usermodel.Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		org.apache.poi.ss.usermodel.Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"admin");		//Method of Login class to login user.
		test.log(LogStatus.PASS, "Company Admin Login successfully done");
		extent.endTest(test);
		extent.flush();
		//AdminLocator.workspacetab(driver).click();
	   	//AdminLocator.contracttab(driver).click();
	}
	
	
		//@Test(priority = 14)
		void contractmaster() throws InterruptedException
		{
			test=extent.startTest("Contract Masters");
			AdminMethod.entitymaster(driver, test);
			AdminMethod.subentitymaster(driver, test);
			AdminMethod.usermasternonadminrole(driver, test);	
			AdminMethod.usermasteradminrole(driver, test);
			AdminMethod.usermastermanagementrole(driver, test);
			AdminMethod.usersearch(driver, test);
			AdminMethod.userdelete(driver, test);
			AdminMethod.vendormaster(driver, test);
			//AdminMethod.vendorsearch(driver, test);
			//AdminMethod.vendordelete(driver, test);
			//AdminMethod.contracttypecreate(driver, test);
			//AdminMethod.contracttypeedit(driver, test);
			//AdminMethod.contractsubtypeoperations(driver, test);
			//AdminMethod.documenttypeoperations(driver, test);
			//AdminMethod.customfieldmaster(driver, test);
			//AdminMethod.contracttemplatemaster(driver, test);
			//AdminMethod.pageauthorisationmaster(driver, test);
			extent.endTest(test);
			extent.flush();
		}
	
	
	@Test(priority = 7)
	void contractadd() throws InterruptedException
	{
		test = extent.startTest("Contract creation");
		//AdminMethod.addnewcontract(driver,workbook, test);
		AdminMethod.addcontract(driver, workbook, test);
		//test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
		
		//AdminMethod.editcontract(driver,workbook);
		//AdminMethod.addcontracttype(driver);
	    //AdminMethod.addcontractsubtype(driver);
		//AdminMethod.addcontractvendor(driver);
		//AdminMethod.addcontractperson(driver,workbook);
		//AdminMethod.linkcontract(driver);
		//AdminMethod.contractdetails(driver, workbook);
		//AdminMethod.contractdocument(driver);
		//AdminMethod.contractdocumentshare(driver, workbook);
		
	}
	
	@Test(priority = 8)
	void contractdetailstab() throws InterruptedException
	{
		test=extent.startTest("Contract Details Tab");
		AdminMethod.contractdetails(driver, workbook, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 14)
	void contractedit() throws InterruptedException
	{
		test = extent.startTest("Contract edit");
		AdminMethod.editcontract(driver,workbook,test);
		test.log(LogStatus.FAIL, "Test Failed");
		extent.endTest(test);
		extent.flush();
		
		
		//AdminMethod.addcontracttype(driver);
	    //AdminMethod.addcontractsubtype(driver);
		//AdminMethod.addcontractvendor(driver);
		//AdminMethod.addcontractperson(driver,workbook);
		//AdminMethod.linkcontract(driver);
		//AdminMethod.contractdetails(driver, workbook);
		//AdminMethod.contractdocument(driver);
		//AdminMethod.contractdocumentshare(driver, workbook);
		
	}
	
	//@Test(priority = 4)
	void contractlink() throws InterruptedException
	{
		test = extent.startTest("Contracts linked successfully");
		AdminMethod.linkcontract(driver,test);
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
		
		
		//AdminMethod.addcontracttype(driver);
	    //AdminMethod.addcontractsubtype(driver);
		//AdminMethod.addcontractvendor(driver);
		//AdminMethod.addcontractperson(driver,workbook);
		//AdminMethod.linkcontract(driver);
		//AdminMethod.contractdetails(driver, workbook);
		//AdminMethod.contractdocument(driver);
		//AdminMethod.contractdocumentshare(driver, workbook);
		
	}
	
	
	//@Test(priority = 4)
	void contracttypeadd() throws InterruptedException
	{
		test = extent.startTest("Contract type creation");
		AdminMethod.addcontracttype(driver,test);
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
		
		
		
	    //AdminMethod.addcontractsubtype(driver);
		//AdminMethod.addcontractvendor(driver);
		//AdminMethod.addcontractperson(driver,workbook);
		//AdminMethod.linkcontract(driver);
		//AdminMethod.contractdetails(driver, workbook);
		//AdminMethod.contractdocument(driver);
		//AdminMethod.contractdocumentshare(driver, workbook);
		
	}
	
	//@Test(priority =5)
	void contractsubtypeadd() throws InterruptedException
	{
		test=extent.startTest("Contract sub-type creation");
		AdminMethod.addcontractsubtype(driver, test);
		test.log(LogStatus.PASS,"Test passed");
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 6)
	void contractvendoradd() throws InterruptedException
	{
		test=extent.startTest("Contract vendor creation");
		AdminMethod.addcontractvendor(driver, test);
		test.log(LogStatus.PASS,"Test passed");
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 7)
	void contractpersonadd() throws InterruptedException
	{
		test=extent.startTest("Contract Person creation");
		AdminMethod.addcontractperson(driver,workbook, test);
		test.log(LogStatus.PASS,"Test passed");
		extent.endTest(test);
		extent.flush();
	}
	
		
		
	    //AdminMethod.addcontractsubtype(driver);
		//AdminMethod.addcontractvendor(driver);
		//AdminMethod.addcontractperson(driver,workbook);
		//AdminMethod.linkcontract(driver);
		//AdminMethod.contractdetails(driver, workbook);
		//AdminMethod.contractdocument(driver);
		//AdminMethod.contractdocumentshare(driver, workbook);
		
	
	
	@Test(priority = 9)
	void contractdocumenttab() throws InterruptedException
	{
		test = extent.startTest("Contract Document Tab");
		AdminMethod.contractdocument(driver,test);
		//test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	    	
	}
	
	//@Test(priority = 10)
	void contracttaskdetails() throws InterruptedException
	{
		test = extent.startTest("Contract Task Tab");
		//AdminMethod.contracttasknew(driver,test,workbook);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 17)
	void contractdocshare() throws InterruptedException
	{
		test = extent.startTest("Contract Document Share");
		AdminMethod.contractdocumentshare(driver, workbook,test);
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 14)
	void doctablinkcontract() throws InterruptedException
	{
		test = extent.startTest("Contract Link from Document Tab");
		AdminMethod.doctabcontractlink(driver,test);
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 18)
	void contractmilestone() throws InterruptedException
	{
		test = extent.startTest("Contract Milestone Page");
		AdminMethod.contractmilestonecreate(driver,test);
		/*Thread.sleep(2000);
		AdminMethod.editmilestone(driver,test);
		Thread.sleep(2000);
		AdminMethod.milestonefilter(driver,test);
		Thread.sleep(2000);*/
		AdminMethod.milestonedelete(driver,test);
		//test.log(LogStatus.FAIL, "Test failed.");
		//test.log(LogStatus.PASS,"Test Passes");
		extent.endTest(test);
		extent.flush();

	}
	
	@Test(priority = 19)
	void contracttask() throws InterruptedException
		{
			test = extent.startTest("Contract Task Page");
			AdminMethod.taskcreate(driver,workbook,test);
			/*Thread.sleep(2000);
			AdminMethod.taskedit(driver,workbook, test);
			Thread.sleep(2000);
			AdminMethod.taskdelete(driver, test);*/
			test.log(LogStatus.PASS,"Test Passed");
			//test.log(LogStatus.FAIL, "Test Failed.");
			extent.endTest(test);
			extent.flush();
		}
	
	
	//@Test(priority = 3)
	void contractagreement() throws InterruptedException
	{
		test=extent.startTest("Contract Agreement");
		//AdminMethod.contractagreement(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority =11)
	void contractdocumentpage() throws InterruptedException
	{
		test=extent.startTest("Contract Document Page");
		AdminMethod.mydocuments(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority =12)
	void contractreport() throws InterruptedException
	{
		test=extent.startTest("Contract Report Page");
		AdminMethod.myreports(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority =3)
	void contractdashboardpresignature() throws InterruptedException
	{
		test=extent.startTest("Contract Dashboard Pre Signature Count Verification");
		AdminMethod.mydashboarddraftcount(driver, test);
		/*AdminMethod.mydashboardreviewcount(driver, test);
		AdminMethod.mydashboardwithvendorcount(driver, test);
		AdminMethod.mydashboardapproval(driver, test);
		AdminMethod.mydashboardrejectedcount(driver, test);
		AdminMethod.mydashboardsignaturecount(driver, test);
		AdminMethod.dashboardpresignatureentitywisegraph1(driver, test);*/
		/*AdminMethod.mydashboardexpiredcount(driver, test);
		AdminMethod.mydashboardmyreviewscount(driver, test);
		AdminMethod.mydashboardterminatedcount(driver, test);*/
		extent.endTest(test);
		extent.flush();
	}
	

	
	//@Test(priority = 4)
	void Contractdashboardpostsignature() throws InterruptedException
	{
		test=extent.startTest("contract Dashboard Post Signature Count Verification");
		AdminMethod.mydashboardactivecount(driver, test);
		AdminMethod.mydashboardexpiredcount(driver, test);
		//AdminMethod.mydashboardnotrenewedcount(driver, test);
		AdminMethod.mydashboardterminatedcount(driver, test);
		//AdminMethod.dashboardpostsignaturegraph(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority =2)
	void contractdashboardgraphs() throws InterruptedException
	{
		test=extent.startTest("Contract Dashboard Pre-Signature Filters Verification");
		//AdminMethod.dashboardpresignatureentitywisegraph1(driver, test);
		//AdminMethod.dashboardpostsignaturegraph(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority =4)
	void contractreviewworkspace() throws InterruptedException
		{
			test=extent.startTest("My Workspace Reviews Page");
			//AdminMethod.myworkspacereviews(driver, test);
			extent.endTest(test);
			extent.flush();
		}
	
	//@Test(priority =5)
	void contractmilestoneworkspace() throws InterruptedException
	{
		test=extent.startTest("My Workspace Milestone Page");
		//AdminMethod.myworkspacemilestone(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority =6)
	void contracttaskworkspace() throws InterruptedException
	{
		test=extent.startTest("My Workspace Task Page");
		//AdminMethod.myworkspacetask(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 22)
	void contractexpiring() throws InterruptedException
	{
		test=extent.startTest("Contracts Expiring In");
		//AdminMethod.contractsexpiring(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority =9)
	void criticaldocument() throws InterruptedException
	{
		test=extent.startTest("Contract Critical Document");
		//AdminMethod.contractcriticaldocument(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority=13)
	void importutility() throws InterruptedException
	{
		test=extent.startTest("Import Utility Page");
		//AdminMethod.importutility(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 15)
	void workspacetasktab() throws InterruptedException
	{
		test=extent.startTest("Workspace Task Page");
		//AdminMethod.taskworkspace(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 16)
	void workspacemilestonetab() throws InterruptedException
	{
		test=extent.startTest("Workspace Milestone Page");
		//AdminMethod.milestoneworkspace(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 3)
	void contractdashboardtasksmilestone() throws InterruptedException
	{
		test=extent.startTest("Contracts Expiring In ");
		//AdminMethod.contractdashboardtaskmilestone(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority=23)
	void editcontract() throws InterruptedException
	{
		test=extent.startTest("Update Contract");
		//AdminMethod.updatecontract(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 9)
	void contractagreementpage() throws InterruptedException
	{	test=extent.startTest("Contract Agreement send for Review Verification");
		AdminMethod.agreementtab(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 10)
	void contractagreementvendorreview() throws InterruptedException
	{
		test=extent.startTest("Contract agreement send for Vendor Review");
		AdminMethod.vendorreview(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 11)
	void contractagreementapproverreview() throws InterruptedException
	{
		test=extent.startTest("Contract agreement send for Approver Review Verification");
		AdminMethod.approverreview(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 12)
	void contractagreementesign() throws InterruptedException
	{
		test=extent.startTest("Contract Esignature Verification");
		//AdminMethod.contractesignature(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 13)
	void contractagreementactivestatus() throws InterruptedException
	{
		test=extent.startTest("Contract Convert to Active Status Verification");
		AdminMethod.converttoactive(driver,test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 14)
	void contractagreementrenew() throws InterruptedException
	{
		test=extent.startTest("Contract Renew Status Verification");
		AdminMethod.contractrenew(driver,test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 12)
	void contractexport() throws InterruptedException
	{
		test=extent.startTest("Contract Agreement Document Export");
		AdminMethod.contractagreementexport(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 20)
	void contractauditlog() throws InterruptedException
	{
		test=extent.startTest("Contract Audit Log");
		AdminMethod.auditlog(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 2)
	public void contractdashboardpresignaturestatuscount() throws InterruptedException
	{
		
		test=extent.startTest("Contract Pre-Signature Dashboard Draft Status Count Verification");
		AdminMethod.mydashboarddraftcount(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Pre-Signature Dashboard Review Status Count Verification");
		//AdminMethod.mydashboardreviewcount(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Pre-Signature Dashboard With Vendor Status Count Verification");
		//AdminMethod.mydashboardwithvendorcount(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Pre-Signature Dashboard Approval Status Count Verification");
		//AdminMethod.mydashboardapproval(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Pre-Signature Dashboard Rejected Status Count Verification");
		//AdminMethod.mydashboardrejectedcount(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Pre-Signature Dashboard Signature Status Count Verification");
		//AdminMethod.mydashboardsignaturecount(driver, test);
		extent.endTest(test);
		extent.flush();
		//AdminMethod.dashboardpresignatureentitywisegraph(driver, test);
		//extent.endTest(test);
		//extent.flush();
	}
	
	//@Test(priority = 3)
	void contractdashboardpresignaturegraphs() throws InterruptedException
	{
		test=extent.startTest("Contract Presignature Dashboard Entitywise Graph Count Verification for Location A VLSPL and status Draft");
		//AdminMethod.dashboardpresignatureentitywisegraph1(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Entitywise Graph Count Verification for Location A VLSPL and status Review");
		//AdminMethod.dashboardpresignatureentitywisegraph2(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Entitywise Graph Count Verification for Location A VLSPL and status Approval");
		//AdminMethod.dashboardpresignatureentitywisegraph3(driver, test);
		//String deptname=AdminLocator.deptgraphname(driver).getText();
		//System.out.println(deptname);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Entitywise Graph Count Verification for Location A VLSPL and status With Vendor");
		//AdminMethod.dashboardpresignatureentitywisegraph4(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Entitywise Graph Count Verification for Location A VLSPL and status Rejected");
		//AdminMethod.dashboardpresignatureentitywisegraph5(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Entitywise Graph Count Verification for Location A VLSPL and status Signature");
		//AdminMethod.dashboardpresignatureentitywisegraph6(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest(" Contract Presignature Dashboard Departmentwise Graph Count Verification for department Compliance Dept and status Draft");
		//AdminMethod.dashboardpresignaturedeptwisegraph1(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Departmentwise Graph Count Verification for department Compliance Dept and status Review");
		//AdminMethod.dashboardpresignaturedeptwisegraph2(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Departmentwise Graph Count Verification for department Compliance Dept and status With Vendor");
		//AdminMethod.dashboardpresignaturedeptwisegraph3(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Departmentwise Graph Count Verification for department Compliance Dept and status Approval");
		//AdminMethod.dashboardpresignaturedeptwisegraph4(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Departmentwise Graph Count Verification for department Compliance Dept and status Rejected");
		//AdminMethod.dashboardpresignaturedeptwisegraph5(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Departmentwise Graph Count Verification for department Compliance Dept and status Signature");
		//AdminMethod.dashboardpresignaturedeptwisegraph6(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contracttypewise Graph Count Verification for contract type agreement and status Draft");
		//AdminMethod.dashboardpresignaturecontacttypewisegraph1(driver,test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contracttypewise Graph Count Verification for contract type agreement and status Review");
		//AdminMethod.dashboardpresignaturecontacttypewisegraph2(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contracttypewise Graph Count Verification for contract type agreement and status With Vendor");
		//AdminMethod.dashboardpresignaturecontacttypewisegraph3(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contracttypewise Graph Count Verification for contract type agreement and status Approval");
		//AdminMethod.dashboardpresignaturecontacttypewisegraph4(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contracttypewise Graph Count Verification for contract type agreement and status Rejected");
		//AdminMethod.dashboardpresignaturecontacttypewisegraph5(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contracttypewise Graph Count Verification for contract type agreement and status Signature");
		//AdminMethod.dashboardpresignaturecontacttypewisegraph6(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contractstatuswise Graph Count Verification for status Approval");
		//AdminMethod.dashboardpresignaturecontractstatuswisegraph1(driver,test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contractstatuswise Graph Count Verification for status Draft");
		//AdminMethod.dashboardpresignaturecontractstatuswisegraph2(driver,test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contractstatuswise Graph Count Verification for status Review");
		//AdminMethod.dashboardpresignaturecontractstatuswisegraph3(driver,test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contractstatuswise Graph Count Verification for status With Vendor");
		//AdminMethod.dashboardpresignaturecontractstatuswisegraph4(driver,test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contractstatuswise Graph Count Verification for status Rejected");
		//AdminMethod.dashboardpresignaturecontractstatuswisegraph5(driver,test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Presignature Dashboard Contractstatuswise Graph Count Verification for status Signature");
		//AdminMethod.dashboardpresignaturecontractstatuswisegraph6(driver,test);
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority = 4)
	void contractdashboardpostsignaturegraph() throws InterruptedException
	{
		//test=extent.startTest("contract Dashboard Post Signature Count Verification");
		test=extent.startTest("Contract Post-Signature Dashboard Active Status Count Verification");
		AdminMethod.mydashboardactivecount(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Post-Signature Dashboard Expired Status Count Verification");
		AdminMethod.mydashboardexpiredcount(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Post-Signature Dashboard Not Renewed Status Count Verification");
		//AdminMethod.mydashboardnotrenewedcount(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Post-Signature Dashboard Terminated Status Count Verification");
		AdminMethod.mydashboardterminatedcount(driver, test);
		extent.endTest(test);
		extent.flush();
		/*test=extent.startTest("Contract Dashboard PostSignature Count Verification");
		AdminMethod.dashboardpostsignaturegraph(driver, test);
		extent.endTest(test);
		extent.flush();*/
		test=extent.startTest("Contract Postsignature Dashboard Entitywise Graph Count Verification for Location A VLSPL and status Active");
		//AdminMethod.dashboardpostsignatureentitywisegraph1(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Entitywise Graph Count Verification for Location  A VLSPL and status Expired");
		//AdminMethod.dashboardpostsignatureentitywisegraph2(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Entitywise Graph Count Verification for Location  A VLSPL and status Not Renewed");
		//AdminMethod.dashboardpostsignatureentitywisegraph3(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Entitywise Graph Count Verification for Location  A VLSPL and status Terminated");
		//AdminMethod.dashboardpostsignatureentitywisegraph4(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Departmentwise Graph Count Verification for Department Compliance Dept and status Active");
		//AdminMethod.dashboardpostsignaturedeptwisegraph1(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Departmentwise Graph Count Verification for Deprtment Compliance Dept and status Expired");
		//AdminMethod.dashboardpostsignaturedeptwisegraph2(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Departmentwise Graph Count Verification for Department Compliance Dept and status Not Renewed");
		//AdminMethod.dashboardpostsignaturedeptwisegraph3(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Departmentwise Graph Count Verification for Department Compliance Dept and status Terminated");
		//AdminMethod.dashboardpostsignaturedeptwisegraph4(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contracttypewise Graph Count Verification for Contract type agreement and status Active");
		//AdminMethod.dashboardpostsignatureconttypewisegraph1(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contracttypewise Graph Count Verification for Contract type agreement and status Expired");
		//AdminMethod.dashboardpostsignatureconttypewisegraph2(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contracttypewise Graph Count Verification for Contract type agreement and status Not Renewed");
		//AdminMethod.dashboardpostsignatureconttypewisegraph3(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contracttypewise Graph Count Verification for Contract type agreement and status Terminated");
		//AdminMethod.dashboardpostsignatureconttypewisegraph4(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contractstatuswise Graph Count Verification for Contract status Active");
		//AdminMethod.dashboardpostsignaturecontstatuswisegraph1(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contractstatuswise Graph Count Verification for Contract status Expired");
		//AdminMethod.dashboardpostsignaturecontstatuswisegraph2(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contractstatuswise Graph Count Verification for Contract status Not Renewed");
		//AdminMethod.dashboardpostsignaturecontstatuswisegraph3(driver, test);
		extent.endTest(test);
		extent.flush();
		test=extent.startTest("Contract Postsignature Dashboard Contractstatuswise Graph Count Verification for Contract status Terminated");
		//AdminMethod.dashboardpostsignaturecontstatuswisegraph4(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 5)
	void contractsexpiringindays() throws InterruptedException
	{
		test=extent.startTest("Contracts Expiring in Days");
		//AdminMethod.dashboardcontractsexpiringin(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority =6)
	void contractdashboardtask() throws InterruptedException
	{
		test=extent.startTest("Contract Dashboard Task");
		//AdminMethod.dashboardtaskedit(driver, test);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 7)
	void contractdashboardmilestone() throws InterruptedException
	{
		test=extent.startTest("Contract Dashboard Milestone");
		//AdminMethod.dashboardmilestoneedit(driver, test);
		extent.endTest(test);
		extent.flush();
	}

	
}

