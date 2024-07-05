package CompanyAdminPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLocator 
{
	public WebDriver driver;
	private static WebElement workspace=null;
	private static WebElement reviews=null;
	private static WebElement contract=null;
	private static WebElement contracttitle=null;
	private static WebElement contractype=null;
	private static WebElement contractsubtype=null;
	private static WebElement contractentity=null;
	private static WebElement contractdept=null;
	private static WebElement contractowner=null;
	private static WebElement contractvendor=null;
	private static WebElement contractperson=null;
	private static WebElement contractsave=null;
	private static WebElement contractclose=null;
	private static WebElement contractedit=null;
	private static WebElement contractupdate=null;
	private static WebElement contractlink=null;
	private static WebElement contractdetails=null;
	private static WebElement contractdocument=null;
	private static WebElement contractdate=null;
	private static WebElement milestone=null;
	private static WebElement task=null;
	private static WebElement agreement=null;
	private static WebElement document=null;
	private static WebElement report=null;
	private static WebElement vendor=null;
	private static WebElement dashboard=null;
	private static WebElement utility=null;
	
	public static WebElement workspacetab(WebDriver driver)
    {
 	   workspace=driver.findElement(By.xpath("//*[@id='leftworkspacemenu']/a/span[1]"));
 	   return workspace;
    }
    
    public static WebElement contracttab(WebDriver driver)
    {
 	   workspace=driver.findElement(By.xpath("//*[@id='Contractlistmenu']/a"));
 	   return workspace;
    }

    public static WebElement addcontractclick(WebDriver driver)
    {
 	   contract=driver.findElement(By.id("btnAddContract"));
 	   return contract;
    }
 
    public static WebElement addcontracttitle(WebDriver driver)
    {
 	   contract=driver.findElement(By.id("txtTitle"));
 	   return contract;
    }
    
    public static WebElement contractypeclick(WebDriver driver)
    {
 	   contractype=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[1]/span[1]/span/span[2]"));
 	   return contractype;
    }
    
    public static WebElement contractypeselect(WebDriver driver)
    {
 	   contractype=driver.findElement(By.xpath("//*[@id='ddlContractType_listbox']/li[6]"));
 	   return contractype;
    }

    public static WebElement addcontractdescription(WebDriver driver)
    {
 	   contract=driver.findElement(By.id("tbxDescription"));
 	   return contract;
    }
 
    public static WebElement contractsubtypedropdown(WebDriver driver)
    {
 	   contractsubtype=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[1]/span[2]/span/span[2]"));
 	   return contractsubtype;
    }
    
    public static WebElement contractsubtypeselect(WebDriver driver)
    {
 	   contractsubtype=driver.findElement(By.xpath("//*[@id='ddlContractSubType_listbox']/li[2]"));
 	   return contractsubtype;
    }
    
    public static WebElement contractentityclick(WebDriver driver)
    {
 	   contractentity=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[2]/span[1]/span/span[3]"));
 	   return contractentity;
    }
    
    public static WebElement parententityselect(WebDriver driver)
    {
 	   contractentity=driver.findElement(By.xpath("(//li[@class='k-item k-first k-last'])[2]"));
 	   return contractentity;
    }
    
    public static WebElement contractentityselect(WebDriver driver)
    {
 	   contractentity=driver.findElement(By.xpath("(//span[@class='k-in'])[536]"));
 	   return contractentity;
    }
    
    public static WebElement contractdeptclick(WebDriver driver)
    {
 	   contractentity=driver.findElement(By.id("ddlDepartment_chosen"));
 	   return contractentity;
    }

    public static WebElement contractdeptselect(WebDriver driver)
    {
 	   contractdept=driver.findElement(By.xpath("//*[@id='ddlDepartment_chosen']/div/ul/li[11]"));
 	   return contractdept;
    }
    
    public static WebElement contractownerclick(WebDriver driver)
    {
 	   contractowner=driver.findElement(By.xpath("//*[@id='UpdatePanel6']/div[1]/div[2]/span[1]/div/button"));
 	   return contractowner;
    }
    
    public static WebElement contractownersearch(WebDriver driver)
    {
 	   contractowner=driver.findElement(By.xpath("//*[@id='UpdatePanel6']/div[1]/div[2]/span[1]/div/ul/li[1]/div/input"));
 	   return contractowner;
    }

    public static WebElement contractownerselect(WebDriver driver)
    {
 	   contractowner=driver.findElement(By.xpath("//*[@id='UpdatePanel6']/div[1]/div[2]/span[1]/div/ul/li[3]/a/label/input"));
 	   return contractowner;
    }
    
    public static WebElement contractvendorclick(WebDriver driver)
    {
 	   contractvendor=driver.findElement(By.xpath("//*[@id='divVendotList']/div"));
 	   return contractvendor;
    }
    
    public static WebElement contractvendorselect(WebDriver driver)
    {
 	   contractvendor=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[639]"));
 	   return contractvendor;
    }
    
    public static WebElement contractpersonclick(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[9]/span/span/span[2]"));
 	   return contractperson;
    }
    
    public static WebElement contractpersonselect(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.xpath("//*[@id='drpContractContactPerson_listbox']/li[2]"));
 	   return contractperson;
    }
    
    public static WebElement contractsave(WebDriver driver)
    {
 	   contractsave=driver.findElement(By.id("btnSaveContract"));
 	   return contractsave;
    }

    public static WebElement contractclose(WebDriver driver)
    {
 	   contractsave=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
 	   return contractsave;
    }
    
    public static WebElement contracteditclick(WebDriver driver)
    {
    	//WebDriverWait wait=new WebDriverWait(driver,30);
 	   //return contractedit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gridDashContract']/div[2]/table/tbody/tr[1]/td[14]/a[1]")));
    	contract=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[1]"));
    	return contract;
    }

    public static WebElement contractediticonclick(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[2]"));
 	   return contractedit;
    }
    
    public static WebElement contractupdate(WebDriver driver)
    {
    	WebDriverWait wait=new WebDriverWait(driver,30);
 	   	contractupdate=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSaveContract")));
 	   	return contractupdate;
    }
    
    public static WebElement addcontracttypeclick(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.xpath("//*[@id='lnkAddNewContractTypeModal']"));
 	   return contractedit;
    }

    public static WebElement addcontracttype(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.id("tbxContType"));
 	   return contractedit;
    }
    
    public static WebElement addcontracttypesave(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.id("btnSave"));
 	   return contractedit;
    }
    
    public static WebElement addcontracttypeclose(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.id("btnCancel"));
 	   return contractedit;
    }

    public static WebElement addcontractsubtypeclick(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.id("lnkAddNewContractSubTypeModal"));
 	   return contractedit;
    }
    
    public static WebElement addcontractsubtype(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.id("tbxSubContType"));
 	   return contractedit;
    }
    
    public static WebElement addcontractsubtypesave(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.id("btnSave"));
 	   return contractedit;
    }

    public static WebElement addcontractsubtypeclose(WebDriver driver)
    {
 	   contractedit=driver.findElement(By.id("btnCancel"));
 	   return contractedit;
    }

    public static WebElement addcontractvendorclick(WebDriver driver)
    {
 	   contractvendor=driver.findElement(By.id("lnkShowAddNewVendorModal"));
 	   return contractvendor;
    }
    
    public static WebElement addcontractvendorname(WebDriver driver)
    {
 	   contractvendor=driver.findElement(By.xpath("//*[@id='tbxName']"));
 	   return contractvendor;
    }
    
    public static WebElement addcontractvendorsave(WebDriver driver)
    {
 	   contractvendor=driver.findElement(By.id("btnSave"));
 	   return contractvendor;
    }
    
    public static WebElement addcontractvendorclose(WebDriver driver)
    {
 	   contractvendor=driver.findElement(By.id("btnCancel"));
 	   return contractvendor;
    }
    
    public static WebElement addcontractpersonclick(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("lnkAddNewPDepartmentModal"));
 	   return contractperson;
    }
    
    public static WebElement addcontractpersonfname(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("tbxFirstName"));
 	   return contractperson;
    }
    
    public static WebElement addcontractpersonlname(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("tbxLastName"));
 	   return contractperson;
    }
    
    public static WebElement addcontractpersonemail(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("tbxEmail"));
 	   return contractperson;
    }
    
    public static WebElement addcontractpersoncontact(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("tbxContactNo"));
 	   return contractperson;
    }
    
    public static WebElement addcontractpersoncontactrole(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("ddlContractRole"));
 	   return contractperson;
    }

    public static WebElement addcontractpersonroleselect(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.xpath("//*[@id='ddlContractRole']/option[4]"));
 	   return contractperson;
    }

    public static WebElement addcontractpersonsave(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("btnSave"));
 	   return contractperson;
    }

    public static WebElement addcontractpersonclose(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.id("btnCancel"));
 	   return contractperson;
    }

    public static WebElement contractlinkclick(WebDriver driver)
    {
 	   contractlink=driver.findElement(By.id("lnkLinkContract"));
 	   return contractlink;
    }
    
    public static WebElement contractlinkcheckboxone(WebDriver driver)
    {
 	   contractlink=driver.findElement(By.xpath("//*[@id='grdContractList_LinkContract_chkRowLinkContracts_0']"));
 	   return contractlink;
    }
    
    public static WebElement contractlinkcheckboxtwo(WebDriver driver)
    {
 	   contractlink=driver.findElement(By.id("grdContractList_LinkContract_chkRowLinkContracts_1"));
 	   return contractlink;
    }
    
    public static WebElement contractlinksave(WebDriver driver)
    {
 	   contractlink=driver.findElement(By.id("btnSaveLinkContract"));
 	   return contractlink;
    }

    public static WebElement contractlinkclose(WebDriver driver)
    {
 	   contractlink=driver.findElement(By.xpath("//*[@id='divLinkContractPopup']/div/div/div[1]/button"));
 	   return contractlink;
    }

    public static WebElement contractdetailsclick(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.xpath("//*[@id='LnkBtnContractDetails']"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailsterms(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtTerms"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailstermination(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtTermination"));
 	   return contractdetails;
    }

    public static WebElement contractdetailsmisc(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtMisc"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailslicense(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtLicense"));
 	   return contractdetails;
    }

    public static WebElement contractdetailswarranties(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtWarranties"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailsguarantees(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtGuarantees"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailsconfidential(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtConfidential"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailsownership(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtOwnership"));
 	   return contractdetails;
    }

    public static WebElement contractdetailsindemnification(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtIndemnification"));
 	   return contractdetails;
    }

    public static WebElement contractdetailsgeneral(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtGeneral"));
 	   return contractdetails;
    }

    public static WebElement contractdetailstimelines(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtTimelines"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailsescalation(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtEscalation"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailsmilestone(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtMilestones"));
 	   return contractdetails;
    }

    public static WebElement contractdetailsothers(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("txtOthers"));
 	   return contractdetails;
    }
    
    public static WebElement contractdetailssave(WebDriver driver)
    {
 	   contractdetails=driver.findElement(By.id("btnCreateContractDetails"));
 	   return contractdetails;
    }

    public static WebElement contractdoctabclick(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='tabstripMain']/ul/li[4]"));
 	   return contractdocument;
    }

    public static WebElement contractdocadd(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("btnAddDocuments"));
 	   return contractdocument;
    }
    
    public static WebElement adddoctypeframe(WebDriver driver)
    {
    	contractdocument=driver.findElement(By.xpath("//iframe[@title='Add Documents']"));
    	return contractdocument;
    }
    
    public static WebElement contractdoctypeclick(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='divDocumentswindow']/div[1]/span"));
 	   return contractdocument;
    }

    public static WebElement contractdoctypeselect(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='drpDocumentsType_listbox']/li[1]"));
 	   return contractdocument;
    }

    public static WebElement contractdocupload(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='DocUploadTab']"));
 	   return contractdocument;
    }

    public static WebElement contractdocsave(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("btnDOCSave"));
 	   return contractdocument;
    }
    
    public static WebElement contractdocpopupclose(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
 	   return contractdocument;
    }
    
    
    public static WebElement contractdocshareselect(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("grdContractDocuments_chkRow_0"));
 	   return contractdocument;
    }
    
    public static WebElement contractdocshareclick(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("lnkBtnShareDocument"));
 	   return contractdocument;
    }
    
    public static WebElement startdateselect(WebDriver driver)
    {
 	   contractdate=driver.findElement(By.id("txtEffectiveDate"));
 	   return contractdate;
    }
    
    public static WebElement enddateselect(WebDriver driver)
    {
 	   contractdate=driver.findElement(By.id("txtExpirationDate"));
 	   return contractdate;
    }
    
    public static WebElement proposaldateselect(WebDriver driver)
    {
 	   contractdate=driver.findElement(By.id("txtProposalDate"));
 	   return contractdate;
    }
    
    public static WebElement agreementdateselect(WebDriver driver)
    {
 	   contractdate=driver.findElement(By.id("txtAgreementDate"));
 	   return contractdate;
    }

    public static WebElement reviewdateselect(WebDriver driver)
    {
 	   contractdate=driver.findElement(By.id("txtReviewDate"));
 	   return contractdate;
    }
    
    public static WebElement sharevendorclick(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("ddlVendor_chosen"));
 	   return contractdocument;
    }
    
    public static WebElement sharevendorsearch(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='ddlVendor_chosen']/div/div/input"));
 	   return contractdocument;
    }
    
    public static WebElement sharevendorselect(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='ddlVendor_chosen']/div/ul"));
 	   return contractdocument;
    }

    public static WebElement sharevendoremail(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("txtEmail"));
 	   return contractdocument;
    }
    
    public static WebElement sharevendorcontact(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("txtcontactNum"));
 	   return contractdocument;
    }
    
    public static WebElement contractshareperioddropdown(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("ddlPeriod_chosen"));
 	   return contractdocument;
    }
    
    public static WebElement contractshareperioddropdownselect(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='ddlPeriod_chosen']/div/ul/li[3]"));
 	   return contractdocument;
    }

    public static WebElement sharevendordocsave(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("btnUpdateDocInfo"));
 	   return contractdocument;
    }
    
    public static WebElement sharevendordocclose(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("btnCancel"));
 	   return contractdocument;
    }
    
    public static WebElement sharevendordocpopupclose(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
 	   return contractdocument;
    }

    public static WebElement addcontractreadmessage(WebDriver driver)
    {
 	   contract=driver.findElement(By.id("confirmboxContract"));
 	   return contract;
    }

    public static WebElement updatecontractreadmessage(WebDriver driver)
    {
 	   contract=driver.findElement(By.id("vsAddUserContract"));
 	   return contract;
    }
    
    public static WebElement doctablinkcontract(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.id("lnkLinkContractDoc"));
 	   return contractdocument;
    }
    
    public static WebElement doctablinkcontractclose(WebDriver driver)
    {
 	   contractdocument=driver.findElement(By.xpath("//*[@id='divLinkContractPopup']/div/div/div[1]/button"));
 	   return contractdocument;
    }

    public static WebElement milestonetabclick(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='tabstripMain']/ul/li[5]"));
 	   return milestone;
    }
    
    public static WebElement milestoneaddclick(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("btnAddMilestone"));
 	   return milestone;
    }

    public static WebElement milestonetitle(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("txtboxMilestonetitle"));
 	   return milestone;
    }
    
    public static WebElement milestonedescription(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("txtboxMilestonedescription"));
 	   return milestone;
    }

    public static WebElement milestonedeptdropdownclick(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='dvMilestonewindow']/div[3]/span[1]/span/span[2]"));
 	   return milestone;
    }
    
    public static WebElement milestonedeptdropdownselect(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='drpMilestoneDepartment_listbox']/li[2]"));
 	   return milestone;
    }
    
    public static WebElement milestoneassignuserdropdownclick(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='dvMilestonewindow']/div[3]/span[2]/span/span[2]"));
 	   return milestone;
    }
    
    public static WebElement milestoneassignusersearch(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='drpmilestoneDepartmentUser_chosen']/div/div"));
 	   return milestone;
    }
    
    public static WebElement milestoneassignuserselect(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='drpMilestoneDepartmentUser_listbox']/li[40]"));
 	   return milestone;
    }
    
    public static WebElement milestoneduedateclick(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='dvOnetimeTask']/span[2]/span/span[2]"));
 	   return milestone;
    }
    
    public static WebElement milestoneduedateselect(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("(//a[@class='k-link'])[56]"));
 	   return milestone;
    }
    
    public static WebElement milestoneremark(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("txbRemark"));
 	   return milestone;
    }
    
    public static WebElement milestonesave(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("btnCreateMilestone"));
 	   return milestone;
    }
    
    public static WebElement milestoneokpopup(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("(//button[@class='k-button k-primary'])[1]"));
 	   return milestone;
    }

    public static WebElement milestonepopupclose(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
 	   return milestone;
    }
    
    public static WebElement milestonetabclose(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));
 	   return milestone;
    }
    
    public static WebElement editcontract(WebDriver driver)
    {
 	   contract=driver.findElement(By.id("btnEditContractDetail"));
 	   return contract;
    }
    
    public static WebElement addcontracttypereadmessage(WebDriver driver)
    {
 	   contract=driver.findElement(By.xpath("//*[@id='divsuccessmsgaCType']"));
 	   return contract;
    }
    
    public static WebElement addcontracttypereadmessage1(WebDriver driver)
    {
 	   contract=driver.findElement(By.xpath("//*[@id='vsAddEditContractType']/ul/li"));
 	   return contract;
    }

    public static WebElement linkcontractreadmessage(WebDriver driver)
    {
 	   contract=driver.findElement(By.xpath("//*[@id='vsLinkContract']/ul/li"));
 	   return contract;
    }
    
    public static WebElement contractdetailsreadmessage(WebDriver driver)
    {
 	   contract=driver.findElement(By.xpath("//*[@id='vsContractDetails']/ul/li"));
 	   return contract;
    }
    
    public static WebElement milestoneeditclick(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("gridMilestone_lnkBtnEditMileStoneDoc_0"));
 	   return milestone;
    }
    
    public static WebElement milestonetitlefilter(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("drpdownmilestone"));
 	   return milestone;
    }
    
    public static WebElement milestonetitlefilterselect(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='drpdownmilestone']/option[2]"));
 	   return milestone;
    }
    
    public static WebElement milestonestatusfilterclick(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("dropmilestonestatus"));
 	   return milestone;
    }
    
    public static WebElement milestonestatusfilterselect(WebDriver driver)
    {
 	   milestone=driver.findElement(By.xpath("//*[@id='dropmilestonestatus']/option[2]"));
 	   return milestone;
    }
    
    public static WebElement milestonefilterapply(WebDriver driver)
    {
 	   milestone=driver.findElement(By.id("btnapplymilestone"));
 	   return milestone;
    }
    
    public static WebElement milestonedelete(WebDriver driver)
    {
 	   contract=driver.findElement(By.xpath("//*[@id='gridMilestone']/div[2]/table/tbody/tr/td[9]/a[2]"));
 	   return contract;
    }

    public static WebElement summarypopupclose(WebDriver driver)
    {
 	   contract=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));
 	   return contract;
    }
    
    public static WebElement detailssummarypopupclose(WebDriver driver)
    {
 	   contract=driver.findElement(By.xpath("/html/body/div[14]/div[1]/div/a"));
 	   return contract;
    }
    
    public static WebElement tasktabclick(WebDriver driver)
    {
 	   task=driver.findElement(By.id("lnkBtnTask"));
 	   return task;
    }
    
    public static WebElement addnewtask(WebDriver driver)
    {
 	   task=driver.findElement(By.id("btnAddCont_Task"));
 	   return task;
    }
    
    public static WebElement reviewuttonselect(WebDriver driver)
    {
 	   task=driver.findElement(By.id("rbTaskType_0"));
 	   return task;
    }
    
    public static WebElement tasktitle(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='tbxTaskTitle']"));
 	   return task;
    }
    
    public static WebElement taskdescription(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='tbxTaskDesc']"));
 	   return task;
    }
    
    public static WebElement taskduedateclick(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='dvAddTaskwindow']/div[5]/span[2]/span/span[2]/span"));
 	   return task;
    }
    
    public static WebElement taskassigntoclick(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='dvAddTaskwindow']/div[4]/span[2]/span/span[2]"));
 	   return task;
    }
    
    public static WebElement taskassigntosearch(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='divTaskAssignTo']/div[2]/div[1]/span/div/ul/li[1]/div/input"));
 	   return task;
    }
    
    
    public static WebElement taskassigntoselect(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='lstBoxTaskUser_listbox']/li[38]"));
 	   return task;
    }
    
    public static WebElement taskduedatecalendaricon(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='pnlAddNewTask']/div[1]/div[3]/div/div[3]/div/span"));
 	   return task;
    }

    public static WebElement tasksave(WebDriver driver)
    {
 	   task=driver.findElement(By.id("btnSaveTask"));
 	   return task;
    }

    public static WebElement edittaskclick(WebDriver driver)
    {
 	   task=driver.findElement(By.id("grdTaskActivity_lnkBtnEditTaskDoc_0"));
 	   return task;
    }

    public static WebElement taskupdateclick(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='btnTaskSave']"));
 	   return task;
    }
    
    public static WebElement taskdeleteclick(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='grdTaskActivity_lnkBtnResDeleteTask_0']"));
 	   return task;
    }
    
    public static WebElement taskcreatesuccessmsg(WebDriver driver)
    {
 	   task=driver.findElement(By.xpath("//*[@id='vsTaskTab']/ul/li/text()"));
 	   return task;
    }

    public static WebElement contractagreementtabclick(WebDriver driver)
    {
 	   agreement=driver.findElement(By.id("liContractTransaction"));
 	   return agreement;
    }

    public static WebElement contractagreementcreatedoc(WebDriver driver)
    {
 	   agreement=driver.findElement(By.xpath("//*[@id='Btnaddupload1']"));
 	   return agreement;
    }
    
    public static WebElement contractagreementtext(WebDriver driver)
    {
 	   agreement=driver.findElement(By.xpath("/html/body"));
 	   return agreement;
    }
    
    public static WebElement contractagreementsave(WebDriver driver)
    {
 	   agreement=driver.findElement(By.xpath("//*[@id='btn_autosave']"));
 	   return agreement;
    }

    public static WebElement contractagreementsubmitforreview(WebDriver driver)
    {
 	   agreement=driver.findElement(By.id("btnReviwer"));
 	   return agreement;
    }
    
    public static WebElement contractagreementreviewerdropdown(WebDriver driver)
    {
 	   agreement=driver.findElement(By.id("ddlUser"));
 	   return agreement;
    }
    
    public static WebElement contractagreementreviewerselect(WebDriver driver)
    {
 	   agreement=driver.findElement(By.xpath("//*[@id='ddlUser']/option[22]"));
 	   return agreement;
    }

    public static WebElement contractagreementreviewersubmit(WebDriver driver)
    {
 	   agreement=driver.findElement(By.id("btnsubmitforrev"));
 	   return agreement;
    }
    
    public static WebElement contractagreementrevieweradd(WebDriver driver)
    {
 	   agreement=driver.findElement(By.id("btnAdd"));
 	   return agreement;
    }
    
    public static WebElement contractdocumentclick(WebDriver driver)
    {
 	   document=driver.findElement(By.id("leftdocumentsmenu"));
 	   return document;
    }
    
    public static WebElement contractdocumenttabclick(WebDriver driver)
    {
 	   document=driver.findElement(By.id("DocumentShareListNew"));
 	   return document;
    }
    
    public static WebElement contractdocumententityfilter(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[1]/div/span[1]"));
 	   return document;
    }

    public static WebElement contractdocumententityfilterexpand(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//span [@class='k-icon k-i-expand']"));
 	   return document;
    }
    
    public static WebElement contractdocumententityfiltercheckboxselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("(//span [@class='k-checkbox-label checkbox-span'])[5]"));
 	   return document;
    }
    
    public static WebElement contractdocumentstatusfilterclick(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[4]/div"));
 	   return document;
    }
    
    public static WebElement contractdocumentstatusfilterselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[183]"));
 	   return document;
    }

    public static WebElement contractdocumentdownload(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr[1]/td[7]/a[1]"));
 	   return document;
    }
    
    public static WebElement contractdocumentview(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr[1]/td[7]/a[2]"));
 	   return document;
    }
    
    public static WebElement contractdocumentpopupclose(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='divDocumentViewer']/div/div/div[1]/button"));
 	   return document;
    }
    
    public static WebElement contractreportclick(WebDriver driver)
    {
 	   report=driver.findElement(By.xpath("//*[@id='leftreportsmenu']"));
 	   return report;
    }
    
    public static WebElement contractreportentityfilterclick(WebDriver driver)
    {
 	   report=driver.findElement(By.xpath("//*[@id='tabstripContractLog-1']/div[1]/div[1]"));
 	   return report;
    }

    public static WebElement contractreportentityfilterexpand(WebDriver driver)
    {
 	   report=driver.findElement(By.xpath("//span [@class='k-icon k-i-expand'][1]"));
 	   return report;
    }

    public static WebElement contractreportentityfilterselect(WebDriver driver)
    {
 	   report=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[5]"));
 	   return report;
    }
    
    public static WebElement contractreportvendorclick(WebDriver driver)
    {
 	   report=driver.findElement(By.xpath("//*[@id='childrow']/div/div/div[3]/div[5]"));
 	   return report;
    }
    
    public static WebElement contractreportvendorselect(WebDriver driver)
    {
 	   report=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[263]"));
 	   return report;
    }

    public static WebElement contractreportexport(WebDriver driver)
    {
 	   report=driver.findElement(By.id("exportAdvanced"));
 	   return report;
    }

    public static WebElement contractdocumentdeptfilter(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[2]/div"));
 	   return document;
    }
    
    public static WebElement contractdocumentdeptfilterselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("(//span [@class='k-checkbox-label checkbox-span'])[48]"));
 	   return document;
    }
    
    public static WebElement contractdocumentctypefilter(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[3]/div"));
 	   return document;
    }

    public static WebElement contractdocumentctypefilterselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[72]"));
 	   return document;
    }
    
    public static WebElement contractdocumentvendorfilter(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[2]/div[1]"));
 	   return document;
    }
    
    public static WebElement contractdocumentvendorfilterselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[304]"));
 	   return document;
    }
    
    public static WebElement contractdocumentownerfilter(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[2]/div[2]/div"));
 	   return document;
    }
    
    public static WebElement contractdocumentownerfilterselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("(//span [@class='k-checkbox-label checkbox-span'])[205]"));
 	   return document;
    }
    
    public static WebElement contractdocumentclearfilter(WebDriver driver)
    {
 	   document=driver.findElement(By.id("ClearfilterMain"));
 	   return document;
    }
    
    public static WebElement contractdocumentsearch(WebDriver driver)
    {
 	   document=driver.findElement(By.id("txtSearch"));
 	   return document;
    }
    
    public static WebElement contractselectdocumentclick(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr[1]/td[6]/span"));
 	   return document;
    }
    
    public static WebElement contractselectdocumentchoose(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("/html/body/div[12]/div/div[3]/ul/li[1]"));
 	   return document;
    }
    
    public static WebElement contractdocumentshare(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr[1]/td[7]/a[3]"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharevendorclick(WebDriver driver)
    {
 	   document=driver.findElement(By.id("ddlVendor_chosen"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharevendorselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='ddlVendor_chosen']/div/ul/li[1]"));
 	   return document;
    }
    
    public static WebElement contractdocumentshareperiodclick(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='ddlPeriod_chosen']"));
 	   return document;
    }
    
    public static WebElement contractdocumentshareperiodselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='ddlPeriod_chosen']/div/ul/li[2]"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharesave(WebDriver driver)
    {
 	   document=driver.findElement(By.id("btnUpdateDocInfo"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharespopupclose(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='divDocumentsharePopup']/div/div/div[1]/button"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharespopupperiodclick(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//div[@id='ddlPeriod_chosen']"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharespopupperiodselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='ddlPeriod_chosen']/div/ul/li[3]"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharespopuppermission(WebDriver driver)
    {
 	   document=driver.findElement(By.id("ddlPermission1_chosen"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharespopuppermissionselect(WebDriver driver)
    {
 	   document=driver.findElement(By.xpath("//*[@id='ddlPermission1_chosen']/div/ul/li[2]"));
 	   return document;
    }
    
    public static WebElement contractdocumentsharespopupdocumentunshareclick(WebDriver driver)
    {
 	   document=driver.findElement(By.id("grdContractDocuments_lnkBtnDeleteContractDoc_0"));
 	   return document;
    }

    public static WebElement contractdocumentsharespopupaddnewvendorclick(WebDriver driver)
    {
 	   document=driver.findElement(By.id("lnkShowAddNewVendorModal"));
 	   return document;
    }

    public static WebElement vendorname(WebDriver driver)
    {
   	 vendor=driver.findElement(By.xpath("//*[@id='tbxName']"));
   	 return vendor;
    }
    
    public static WebElement vendoraddress(WebDriver driver)
    {
   	 vendor=driver.findElement(By.xpath("//*[@id='tbxAddress']"));
   	 return vendor;
    }
    
    public static WebElement savevendor(WebDriver driver)
    {
   	 vendor=driver.findElement(By.xpath("//*[@id='btnSave']"));
   	 return vendor;
    }
    
    public static WebElement vendorpopupclose(WebDriver driver)
    {
   	 vendor=driver.findElement(By.xpath("//*[@id='AddVendorPopUp']/div/div/div[1]/button"));
   	 return vendor;
    }
    
    public static WebElement contractreportdeptfilterclick(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("//*[@id='tabstripContractLog-1']/div[1]/div[2]"));
   	 return report;
    }
    
    public static WebElement contractreportdeptfilterselect(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[48]"));
   	 return report;
    }
    
    public static WebElement contractreportcontracttypefilterclick(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("//*[@id='tabstripContractLog-1']/div[1]/div[3]"));
   	 return report;
    }
    
    public static WebElement contractreportcontracttypefilterselect(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("(//span [@class='k-checkbox-label checkbox-span'])[69]"));
   	 return report;
    }
    
    public static WebElement contractreportcontractstatusfilterclick(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("//*[@id='tabstripContractLog-1']/div[1]/div[4]"));
   	 return report;
    }
    
    public static WebElement contractreportcontractstatusfilterselect(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[69]"));
   	 return report;
    }
    
    public static WebElement contractreportvendorfilterclick(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("//*[@id='tabstripContractLog-1']/div[2]/div"));
   	 return report;
    }
    
    public static WebElement contractreportvendorfilterselect(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[227]"));
   	 return report;
    }
    
    public static WebElement contractreportownerfilterclick(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("//*[@id='tabstripContractLog-1']/div[2]/div"));
   	 return report;
    }
    
    public static WebElement contractreportownerfilterselect(WebDriver driver)
    {
   	 report=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[289]"));
   	 return report;
    }
    
    public static WebElement contractreportclearbuttonclick(WebDriver driver)
    {
   	 report=driver.findElement(By.id("ClearfilterMain"));
   	 return report;
    }
    
    public static WebElement contractreportusagetabclick(WebDriver driver)
    {
   	 report=driver.findElement(By.id("exportReport2"));
   	 return report;
    }
    
    public static WebElement contractdraftstatuscount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divDraftCount"));
   	 return dashboard;
    }
    
    public static WebElement contracttotaldraftcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//span[@class='k-pager-info k-label']"));
   	 return dashboard;
    }
    
    public static WebElement contractdashboardclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("leftdashboardmenu"));
   	 return dashboard;
    }
    
    public static WebElement contractreviewcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divReviewCount"));
   	 return dashboard;
    }
    
    public static WebElement contractvendorcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divvendorCount"));
   	 return dashboard;
    }
    
    public static WebElement contractapprovalcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divApprovalCount"));
   	 return dashboard;
    }
    
    public static WebElement contractrejectedcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divRejectedCount"));
   	 return dashboard;
    }
    
    public static WebElement contractsignaturecount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divSignatureCount"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturelink(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_lnkPostSignature"));
   	 return dashboard;
    }
    
    public static WebElement contractactivecount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divActiveCount"));
   	 return dashboard;
    }
    
    public static WebElement contractreviewscount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divReviwesCount"));
   	 return dashboard;
    }
    
    public static WebElement contracttotalreviewscount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//span[@class='k-pager-info k-label'][1]"));
   	 return dashboard;
    }
    
    public static WebElement contractuserdropdpownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[2]/span"));
   	 return dashboard;
    }
    
    public static WebElement contractmyreviewsuserdropdpownclick(WebDriver driver)
    {
   	 reviews=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[2]/span"));
   	 return reviews;
    }
    
    public static WebElement contractmyreviewsuserdropdpownselect(WebDriver driver)
    {
   	 reviews=driver.findElement(By.xpath("//*[@id='ddlContractReviewer_listbox']/li[2]"));
   	 return reviews;
    }
    
    public static WebElement contractuserdropdpownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ddlContractReviewer_listbox']/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement contractreviewapplybuttonclick(WebDriver driver)
    {
   	 reviews=driver.findElement(By.id("ContentPlaceHolder1_lnkBtnApplyFilter"));
   	 return reviews;
    }
    
    public static WebElement contracttotalapprovecount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='gridContract']/div[3]/span[2]"));
   	 return dashboard;
    }
    
    public static WebElement contractterminatedcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divTerminatedCount"));
   	 return dashboard;
    }
    
    public static WebElement contractstatusdropdpwnclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[4]"));
   	 return dashboard;
    }
    
    public static WebElement contractstatusdropdpwnselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[207]"));
   	 return dashboard;
    }
    
    public static WebElement contractnotreneweddropdpwnselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[188]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardentityfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_ddlLocation_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardentityfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_tvFilterLocationn3CheckBox"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddeptfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_ddlDeptPage_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddeptfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDeptPage_chosen']/div/ul/li[5]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardvendorfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_ddlVendorPage_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardvendorfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVendorPage_chosen']/div/ul/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardstatusfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_ddlContractStatus_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardstatusfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractStatus_chosen']/div/ul/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypefilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_ddlContractType_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypefilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractType_chosen']/div/ul/li[7]"));
   	 return dashboard;
    }

    public static WebElement dashboardcontractownerfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_DropDownListOwner_chosen"));
   	 return dashboard;
    }

    public static WebElement dashboardcontractownerfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListOwner_chosen']/div/ul/li[22]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardapplybuttonclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_btnFilter"));
   	 return dashboard;
    }
    
    public static WebElement dashboardclearbuttonclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_btnClearFilter"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocgraphstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-column-series.highcharts-color-undefined.highcharts-tracker > rect:nth-child(2)"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddeptgraphstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-column-series.highcharts-color-undefined.highcharts-tracker > rect:nth-child(2)"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphtotalcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='gridViewContract']/div[3]/span[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphcount1(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[41]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphcount2(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[119]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphcount3(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[80]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphcount4(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[158]"));
   	 return dashboard;
    }

    public static WebElement dashboardlocationgraphcount5(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[197]"));
   	 return dashboard;
    }

    public static WebElement dashboardlocationgraphclose(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//a[@class='k-button k-bare k-button-icon k-window-action'][1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphlocationname(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='highcharts-4']/svg/g[10]/text[3]"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddepartmentcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[240]"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddepartmentcount1(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[251]"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddepartmentcount2(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[262]"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddepartmentcount3(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[273]"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddepartmentcount4(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[284]"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddepartmentcount5(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[295]"));
   	 return dashboard;
    }
    
    public static WebElement dashboarddepartmentgraphtotalcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='gridViewContract']/div[3]/span[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractapprovalstatusgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-3 '])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractdraftstatusgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractreviewstatusgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractwithvendorstatusgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 '])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractrejectedstatusgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-4 '])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractsignaturestatusgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-5 '])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractstatustotalgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='gridViewContract']/div[3]/span[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypegraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[301]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypegraphcount1(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[331]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypegraphcount2(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[361]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypegraphcount3(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[391]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypegraphcount4(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[421]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypegraphcount5(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[451]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypestatuscount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-column-series.highcharts-color-undefined.highcharts-tracker > rect:nth-child(2)"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontractstatuscount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-pie-series.highcharts-color-undefined.highcharts-tracker > path.highcharts-point.highcharts-color-3"));
   	 return dashboard;
    }
    
    public static WebElement dashboardcontracttypetotalgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='gridViewContract']/div[3]/span[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignatureentitygraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignatureentitygraphcount1(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[28]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignatureentitygraphcount2(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[54]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignatureentitygraphcount3(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[80]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedeptgraphcount1(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[110]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedeptgraphcount2(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[121]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedeptgraphcount3(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[132]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedeptgraphcount4(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[143]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontgraphcount1(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[149]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontgraphcount2(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[179]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontgraphcount3(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[209]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontgraphcount4(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[239]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontstatusgraphcount1(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontstatusgraphcount2(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class= 'highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontstatusgraphcount3(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class= 'highcharts-label highcharts-data-label highcharts-data-label-color-2 '])[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontstatusgraphcount4(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class= 'highcharts-label highcharts-data-label highcharts-data-label-color-3 '])[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturelocationname(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(2)"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedeptname(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(3)"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturecontractname(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(1)"));
   	 return dashboard;
    }
    
    public static WebElement locpostsigngraphactivestatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > text"));
   	 return dashboard;
    }
    
    public static WebElement locpostsigngraphexpiredstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-1 > text"));
   	 return dashboard;
    }
    
    public static WebElement locpostsigngraphnotrenewedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-2 > text"));
   	 return dashboard;
    }
    
    public static WebElement locpostsigngraphterminatedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-3 > text"));
   	 return dashboard;
    }
    
    public static WebElement deptpostsigngraphactivestatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > text"));
   	 return dashboard;
    }
    
    public static WebElement deptpostsigngraphexpiredstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-1 > text"));
   	 return dashboard;
    }
    
    public static WebElement deptpostsigngraphnotrenewedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-2 > text"));
   	 return dashboard;
    }
    
    public static WebElement deptpostsigngraphterminatedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-3 > text"));
   	 return dashboard;
    }
    
    public static WebElement contpostsigngraphactivestatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > text"));
   	 return dashboard;
    }
    
    public static WebElement contpostsigngraphexpiredstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-1 > text"));
   	 return dashboard;
    }
    
    public static WebElement contpostsigngraphnotrenewedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-2 > text"));
   	 return dashboard;
    }
    
    public static WebElement contpostsigngraphterminatedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-3 > text"));
   	 return dashboard;
    }
    
    public static WebElement contstatuspostsigngraphactivestatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-2 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-0 > text"));
   	 return dashboard;
    }
    
    public static WebElement contstatuspostsigngraphexpiredtatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-2 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-1 > text"));
   	 return dashboard;
    }
    
    public static WebElement contstatuspostsigngraphnotrenewedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-2 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-2 > text"));
   	 return dashboard;
    }
    
    public static WebElement contstatuspostsigngraphterminatedstatus(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.cssSelector("#highcharts-2 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-3 > text"));
   	 return dashboard;
    }


    
    public static WebElement dashboardpostsignatureentitygraphtotal(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='gridViewContract']/div[3]/span[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedeptgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[37]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedctypegraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[90]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardpostsignaturedcstatusgraphcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[2]"));
   	 return dashboard;
    }
    
     public static WebElement dashboardtaskshowmoreclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_lnkShowDetailTask"));
   	 return dashboard;
    }
    
    public static WebElement dashboardtabclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("leftdashboardmenu"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestoneeditclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_GrdMilestone_lnkBtnMilestoneResponse_0"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestonedocview(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("grdmilestonekResponseLog_lnkBtnViewTaskResDoc_0"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestonedocclose(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='DocumentViewerPopup']/div/div/div[1]/button"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestonedocdownload(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("grdmilestonekResponseLog_lnkBtnDownloadTaskResDoc_0"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestonestatusdropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("drpmilestonestatus"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestonestatusdropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='drpmilestonestatus']/option[3]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestoneremark(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("tbxremarkmilestone"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmilestonesave(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("btnSaveMilestone"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphlocationfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("tbxFilterLocation"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphlocationfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='tvFilterLocationt4']"));
   	 return dashboard;
    }


    public static WebElement dashboardlocationgraphdeptfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ddlDeptPage_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphdeptfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ddlDeptPage_chosen']/div/ul/li[2]"));
   	 return dashboard;
    }

    public static WebElement dashboardlocationgraphvendorfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ddlVendorPage_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphvendorfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ddlVendorPage_chosen']/div/ul/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphstatusfilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ddlContractStatus_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphstatusfilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ddlContractStatus_chosen']/div/ul/li[5]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphcontracttypefilterclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ddlContractType_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphcontracttypefilterselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ddlContractType_chosen']/div/ul/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphapplybutton(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("btnFilter"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphclearbutton(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("btnClearFilter"));
   	 return dashboard;
    }
    
    public static WebElement dashboardlocationgraphexportbutton(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("exportAdvanced"));
   	 return dashboard;
    }

    public static WebElement dashboardtaskshowmorestatusdropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardtaskshowmorestatusdropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-wrapper'])[5]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardtaskshowmoreediticonclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='grdTaskActivity']/div[2]/table/tbody/tr[1]/td[10]/a"));
   	 return dashboard;
    }
    
    public static WebElement dashboardtaskshowmorepopupstatusdropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ddlStatus_chosen"));
   	 return dashboard;
    }
    
    public static WebElement dashboardtaskshowmorepopupstatusdropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ddlStatus_chosen']/div/ul/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardtaskshowmorepopupremark(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("tbxTaskResComment"));
   	 return dashboard;
    }

    public static WebElement dashboardtaskshowmorepopupsave(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("btnSaveTaskResponse"));
   	 return dashboard;
    }
    
    public static WebElement dashboardtaskshowmorepopupclose(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContractMyreviewmenu"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsentitydropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[1]"));
   	 return dashboard;
    }

    public static WebElement dashboardmyreviewsentitydropdownexpandclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsentitydropdowncheckboxselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[7]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsdeptdropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsdeptdropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[49]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewscontracttypedropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[3]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewscontracttypedropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[76]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsvendordropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[2]/div"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsvendordropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class=\"k-checkbox-label checkbox-span\"])[205]"));
   	 return dashboard;
    }

    public static WebElement dashboardmyreviewsclearfilter(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ClearfilterMain']"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsuserdropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[2]/span"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsuserdropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ddlContractReviewer_listbox']/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewssearchbox(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("txtSearch"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsstatusdropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[4]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsstatusdropdownselect(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[186]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsediticonclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[1]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsapprovertabclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='tabstripContractLog']/ul/li[2]"));
   	 return dashboard;
    }
    
    public static WebElement dashboardmyreviewsapprovertabediticonclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='gridApprovalContracts']/div[2]/table/tbody/tr[1]/td[8]"));
   	 return dashboard;
    }
    
    public static WebElement workspacemilestonetabclick(WebDriver driver)
    {
   	 milestone=driver.findElement(By.id("milestonelistmenu"));
   	 return milestone;
    }
    
    public static WebElement milestonepagecontractnamefilterclick(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[1]"));
   	 return milestone;
    }
    
    public static WebElement milestonepagecontractnamefiltersearch(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("/html/body/div[2]/div/span/input"));
   	 return milestone;
    }
    
    public static WebElement milestonepagecontractnamefilterselect(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("(//span[@class=\"k-checkbox-label checkbox-span\"])[1]"));
   	 return milestone;
    }
    
    public static WebElement milestonepagemilestonenamefilterclick(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[2]"));
   	 return milestone;
    }
    
    public static WebElement milestonepagemilestonenamefiltersearch(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("/html/body/div[3]/div/span/input"));
   	 return milestone;
    }
    
    public static WebElement milestonepagemilestonenamefilterselect(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[2]"));
   	 return milestone;
    }
    
    public static WebElement milestonepagemilestonestatusfilterclick(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/span"));
   	 return milestone;
    }
    
    public static WebElement milestonepagemilestonestatusfilterselect(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("//*[@id='ddlContractStatus_listbox']/li[2]"));
   	 return milestone;
    }
    
    public static WebElement milestonepagesearchbox(WebDriver driver)
    {
   	 milestone=driver.findElement(By.id("txtSearch"));
   	 return milestone;
    }
    
    public static WebElement milestonepageclearbutton(WebDriver driver)
    {
   	 milestone=driver.findElement(By.id("ClearfilterMain"));
   	 return milestone;
    }

    public static WebElement milestonepageeditclick(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr/td[10]"));
   	 return milestone;
    }

    public static WebElement milestonepageeditstatusdropdownclick(WebDriver driver)
    {
   	 milestone=driver.findElement(By.id("drpmilestonestatus"));
   	 return milestone;
    }
    
    public static WebElement milestonepageeditstatusdropdownselect(WebDriver driver)
    {
   	 milestone=driver.findElement(By.xpath("//*[@id='drpmilestonestatus']/option[3]"));
   	 return milestone;
    }

    public static WebElement milestonepageeditremark(WebDriver driver)
    {
   	 milestone=driver.findElement(By.id("tbxremarkmilestone"));
   	 return milestone;
    }

    public static WebElement milestonepageedituploaddocument(WebDriver driver)
    {
   	 milestone=driver.findElement(By.id("fuTaskResponseDocUpload"));
   	 return milestone;
    }

    public static WebElement milestonepageeditsave(WebDriver driver)
    {
   	 milestone=driver.findElement(By.id("btnSaveMilestone"));
   	 return milestone;
    }
    
    public static WebElement workspacetaskclick(WebDriver driver)
    {
   	 task=driver.findElement(By.id("Tasklistmenu"));
   	 return task;
    }
    
    public static WebElement workspacetaskpagepriorityfilterclick(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[1]"));
   	 return task;
    }
    
    public static WebElement workspacetaskpagepriorityfilterselect(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[1]"));
   	 return task;
    }

    public static WebElement workspacetaskpagestatusfilterclick(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]"));
   	 return task;
    }
    
    public static WebElement workspacetaskpagestatusfilterselect(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[5]"));
   	 return task;
    }
    
    public static WebElement workspacetaskpageeditbuttonclick(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//*[@id='grdTaskActivity']/div[2]/table/tbody/tr[1]/td[10]"));
   	 return task;
    }
    
    public static WebElement workspacetaskpageeditbuttonstatusdropdownclick(WebDriver driver)
    {
   	 task=driver.findElement(By.id("ddlStatus_chosen"));
   	 return task;
    }
    
    public static WebElement workspacetaskpageeditbuttonstatusdropdownselect(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//*[@id='ddlStatus_chosen']/div/ul/li[2]"));
   	 return task;
    }
    
    public static WebElement workspacetaskpageeditbuttonremark(WebDriver driver)
    {
   	 task=driver.findElement(By.id("tbxTaskResComment"));
   	 return task;
    }
    
    public static WebElement workspacetaskpageeditfileupload(WebDriver driver)
    {
   	 task=driver.findElement(By.id("fuTaskResponseDocUpload"));
   	 return task;
    }
    
    public static WebElement workspacetaskpageeditsave(WebDriver driver)
    {
   	 task=driver.findElement(By.id("btnSaveTaskResponse"));
   	 return task;
   	}
    
    public static WebElement workspacetaskpageeditpopupclose(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//button[@class='close']"));
   	 return task;
   	}
    
    public static WebElement workspacetaskpageedittaskdetailclick(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//*[@id='panelTaskDetail']/div/div[4]/div/div/div[1]/div/div/a"));
   	 return task;
   	}
    
    public static WebElement workspacetaskpageedittaskdetaildocview(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//*[@id='grdTaskContractDocuments_lnkBtnViewTaskDoc_0']"));
   	 return task;
   	}
    
    public static WebElement workspacetaskpageedittaskdetaildocdownload(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//*[@id='grdTaskContractDocuments_lnkBtnDownloadTaskDoc_0']"));
   	 return task;
   	}
    
    public static WebElement workspacetaskpageedittaskdetaildocviewpopupclose(WebDriver driver)
    {
   	 task=driver.findElement(By.xpath("//*[@id='DocumentViewerPopup']/div/div/div[1]/button"));
   	 return task;
   	}
    
    public static WebElement workspacetaskpagesearchbox(WebDriver driver)
    {
   	 task=driver.findElement(By.id("txtSearch"));
   	 return task;
   	}
    
    public static WebElement workspacetaskpageclearbutton(WebDriver driver)
    {
   	 task=driver.findElement(By.id("ClearfilterMain"));
   	 return task;
   	}
    
    public static WebElement contractexpiredcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divExpiredCount"));
   	 return dashboard;
   	}
    
    public static WebElement contractnotrenewedcount(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_divNotRenewedCount"));
   	 return dashboard;
   	}
    
    public static WebElement contractexpiringindropdownclick(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.id("ContentPlaceHolder1_ddlContractExpiry_chosen"));
   	 return dashboard;
   	}
    
    public static WebElement contractexpiringin60days(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractExpiry_chosen']/div/ul/li[2]"));
   	 return dashboard;
   	}
    
    public static WebElement contractexpiringin90days(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractExpiry_chosen']/div/ul/li[3]"));
   	 return dashboard;
   	}
    
    public static WebElement contractexpiringinmorethan90days(WebDriver driver)
    {
   	 dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractExpiry_chosen']/div/ul/li[4]"));
   	 return dashboard;
   	}

    public static WebElement contractcriticaldoctabclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("(//div[@class='Iconspriteleft'])[6]"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnew(WebDriver driver)
    {
   	 document=driver.findElement(By.id("menu1"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewfolderclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_lnkAddNewFolder"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewuserdropdownclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_universediv']/div/span/div/button"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewuserdropdownsearch(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_universediv']/div/span/div/ul/li[1]/div/input"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewuserdropdownselect(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_universediv']/div/span/div/ul/li[91]/a/label/input"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewfoldername(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_txtFolderName"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewfoldernamecreate(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_btnCreateFolder1"));
   	 return document;
   	}

    public static WebElement contractcriticaldoctabaddnewisuniversalclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_chkIsUnivers"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabeditclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_grdFolderDetail_lnkEditFolder_0"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabeditfoldername(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_txtFolderName"));
   	 return document;
   	}

    public static WebElement contractcriticaldoctabeditfolderrename(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_btnCreateFolder1"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabfoldersearch(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
   	 return document;
   	}

    public static WebElement contractcriticaldoctabfoldernameclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdFolderDetail']/tbody/tr[2]/td[2]"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabdeletefolder(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/div/section/div[2]/div[2]/img[3]"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabshareiconclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/div/section/div[2]/div[2]/img[1]"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabshareiconpermissiondropdownclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_ddlPermission1_chosen"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabshareiconpermissiondropdownselect(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPermission1_chosen']/div/ul/li[2]"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabshareiconuserdropdownclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='divOpenPermissionPopup']/div/div/div[2]/div[3]/div/span/div/button"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabshareiconuserdropdownsearch(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='divOpenPermissionPopup']/div/div/div[2]/div[3]/div/span/div/ul/li[1]/div/input"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabshareiconuserdropdownselect(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='divOpenPermissionPopup']/div/div/div[2]/div[3]/div/span/div/ul/li[61]/a/label/input"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabsharebuttonclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_btnPermission"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabsharebuttondeleteuser(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_myRepeater_LnkDeletShare_0"));
   	 return document;
   	}

    public static WebElement contractcriticaldoctabaddnewsubfolder(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='menu1']"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewsubfoldertabclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_lnkAddNewFolder"));
   	 return document;
   	}
    
    public static WebElement contractcriticaldoctabaddnewsubfoldername(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_txtFolderName"));
   	 return document;
   	}

    public static WebElement contractcriticaldoctabaddnewsubfoldercreate(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_btnCreateFolder"));
   	 return document;
   	}
 
    public static WebElement contractcriticaldoctabaddnewsubfolderpopupclose(WebDriver driver)
    {
   	 document=driver.findElement(By.className("close"));
   	 return document;
   	}

    public static WebElement contractcriticaldoctabeditsubfolderrename(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_btnCreateFolder"));
   	 return document;
   	}

    public static WebElement contractcriticaldoctabdeletesubfolder(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/section/div[3]/div/div[2]/img[5]"));
   	 return document;
   	}

    public static WebElement contractcriticalsubdoctabshareiconclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/section/div[3]/div/div[2]/img[1]"));
   	 return document;
   	}

    public static WebElement contractcriticaldocaddnewfileclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_lnkAddNewDocument"));
   	 return document;
   	}    

    public static WebElement contractcriticaldocchoosefileclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_ContractFileUpload"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadbuttonclick(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_btnUploadDoc"));
   	 return document;
   	} 

    public static WebElement contractcriticaldocfileuploadfilenameclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdFolderDetail']/tbody/tr[2]/td[2]"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadfiledownloadclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/section/div[3]/div/div[2]/img[2]"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadfileeditclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/section/div[3]/div/div[2]/img[4]"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadfilecreateddate(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtBxFileCreated"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadfileheader(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtDocHeader"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadothers(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtOthers"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadsubprocess(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtSubProcess"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploaddescription(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtDescription"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadprocess(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtProcess"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadvertical(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtVertical"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadlocation(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_TxtLocation"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploaddoctags(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_UpdatePanel3']/div[8]/div/div[2]/div/input"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploadupdateinformation(WebDriver driver)
    {
   	 document=driver.findElement(By.id("ContentPlaceHolder1_btnUpdateInfo"));
   	 return document;
   	} 
  
    public static WebElement contractcriticaldocfileuploadupdateinformationclose(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='divOpenNewInformationPopup']/div/div/div[1]/button"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileuploaddelete(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/section/div[3]/div/div[2]/img[5]"));
   	 return document;
   	} 
    
    public static WebElement contractcriticaldocfileshareiconclick(WebDriver driver)
    {
   	 document=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upPromotorList']/div/div/section/div[3]/div/div[2]/img[1]"));
   	 return document;
   	} 
    
    public static WebElement importutilityclick(WebDriver driver)
    {
    	utility=driver.findElement(By.id("leftuploadmenu"));
    	return utility;
    }
    
    public static WebElement importutilitycontractradiobutton(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_rdoBtn_Contract"));
    	return utility;
    }
    
    public static WebElement importutilitychoosefile(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_MasterFileUpload"));
    	return utility;
    }
    
    public static WebElement importutilityfileupload(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_btnUploadFile"));
    	return utility;
    }
    
    public static WebElement importutilityvendorradiobutton(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_rdoBtn_Vendor"));
    	return utility;
    }
    
    public static WebElement importutilitycontracttype(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_rdoBtn_ContractType"));
    	return utility;
    }

    public static WebElement importutilitycontractsubtype(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_rdoBtn_ContractSubType"));
    	return utility;
    }

    public static WebElement importutilitycontractdoctype(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_rdoBtn_DocType"));
    	return utility;
    }

    public static WebElement myworkspacecontracttab(WebDriver driver)
    {
    	utility=driver.findElement(By.xpath("//*[@id='Contractlistmenu']/a"));
    	return utility;
    }
    
    public static WebElement myworkspacecontractsearchbox(WebDriver driver)
    {
    	utility=driver.findElement(By.id("txtSearch"));
    	return utility;
    }
    
    public static WebElement mastertab(WebDriver driver)
    {
    	contract=driver.findElement(By.id("leftmastermenu"));
    	return contract;
    }
    
    public static WebElement mastervendortab(WebDriver driver)
    {
    	utility=driver.findElement(By.linkText("Vendor"));
    	return utility;
    }
   
    public static WebElement mastervendortabsearchbox(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_tbxtypeTofilter"));
    	return utility;
    }
    
    public static WebElement mastercontracttypetab(WebDriver driver)
    {
    	utility=driver.findElement(By.linkText("Contract Type-Sub Type"));
    	return utility;
    }
    
    public static WebElement mastercontracttabsearchbox(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return utility;
    }
    
    public static WebElement mastercontracttabsubtype(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_grdContractType_lblSubConttype_0"));
    	return utility;
    }

    public static WebElement mastercontracttabsubtypesearchbox(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_tbxtypeTofilter"));
    	return utility;
    }

    public static WebElement masterdocumenttab(WebDriver driver)
    {
    	utility=driver.findElement(By.linkText("Document Type"));
    	return utility;
    }
    
    public static WebElement masterdocumenttabsearchbox(WebDriver driver)
    {
    	utility=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return utility;
    }
    
    public static WebElement dashboardcontractexpiringdropdown(WebDriver driver)
    {
    	utility=driver.findElement(By.xpath("//*[@id='divDashContract']/div/div/div/div[1]/span/span/span[2]"));
    	return utility;
    }
    
    public static WebElement dashboardcontractexpiringdropdown60days(WebDriver driver)
    {
    	utility=driver.findElement(By.xpath("//*[@id='ddlContractExpiry_listbox']/li[2]"));
    	return utility;
    }
    
    public static WebElement dashboardcontractexpiringdropdown90days(WebDriver driver)
    {
    	utility=driver.findElement(By.xpath("//*[@id='ddlContractExpiry_listbox']/li[3]"));
    	return utility;
    }
    
    public static WebElement dashboardcontractexpiringdropdownmorethan90days(WebDriver driver)
    {
    	utility=driver.findElement(By.xpath("//*[@id='ddlContractExpiry_listbox']/li[4]"));
    	return utility;
    }
    
    public static WebElement dashboardcontractexpiringviewicon(WebDriver driver)
    {
    	utility=driver.findElement(By.xpath("//*[@id='gridDashContract']/div[2]/table/tbody/tr[1]/td[6]"));
    	return utility;
    }
    
    public static WebElement contractsummarypagecloseicon(WebDriver driver)
    {
    	utility=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
    	return utility;
    }
    
    public static WebElement contractsummarydepttemplatedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlDepartmenttemplate_chosen"));
    	return contract;
    }
    
    public static WebElement contractsummarydepttemplatedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlDepartmenttemplate_chosen']/div/ul/li[5]"));
    	return contract;
    }
    
    public static WebElement contractsummaryamount(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxContractAmt"));
    	return contract;
    }
    
    public static WebElement contractsummarytaxes(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxTaxes"));
    	return contract;
    }
    
    public static WebElement contractsummaryproductitems(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtBoxProduct"));
    	return contract;
    }
    
    public static WebElement contractsummarypaymenttypedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlPaymentType_chosen"));
    	return contract;
    }
    
    public static WebElement contractsummarypaymenttypedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlPaymentType_chosen']/div/ul/li[2]"));
    	return contract;
    }

    public static WebElement contractsummarylockinperiod(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtlockinperiodDate"));
    	return contract;
    }
    
    public static WebElement contractsummaryremark(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxAddNewClause"));
    	return contract;
    }
    
    public static WebElement contractsummarypaymenttermdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='pnlContract']/div/div[6]/div[2]/span/div/button"));
    	return contract;
    }

    public static WebElement contractsummarypaymenttermdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='pnlContract']/div/div[6]/div[2]/span/div/ul/li[7]/a/label/input"));
    	return contract;
    }
    
    public static WebElement contractsummarylicensetypedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlLicenseType_chosen"));
    	return contract;
    }
    
    public static WebElement contractsummarylicensetypedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlLicenseType_chosen']/div/ul/li[2]"));
    	return contract;
    }
    
    public static WebElement contractsummarynoticeterm(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtNoticeTerm"));
    	return contract;
    }
    
    public static WebElement contractsummarynoticetermdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlNoticeTerm"));
    	return contract;
    }
    
    public static WebElement contractsummarynoticetermdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlNoticeTerm']/option[3]"));
    	return contract;
    }
    
    public static WebElement contractworkspacestatusdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[4]"));
    	return contract;
    }
    
    public static WebElement contractworkspacestatusdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[164]"));
    	return contract;
    }

    public static WebElement contractworkspaceeditcon(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridDashContract']/div[2]/table/tbody/tr[1]/td[13]/a[1]"));
    	return contract;
    }
    
    public static WebElement contractsummaryediticon(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnEditContractDetail"));
    	return contract;
    }
    
    public static WebElement contractsummarycontracttypedropdownedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlContractType_chosen']/div/ul/li[6]"));
    	return contract;
    }

    public static WebElement contractsummarycontractsubtypedropdownedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlContractSubType_chosen']/div/ul/li[2]"));
    	return contract;
    }
    
    public static WebElement contractsummaryentityedropdownedit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tvBranchest2"));
    	return contract;
    }

    public static WebElement contractsummaryvendordropdownedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='UpdatePanel6']/div[5]/div[1]/div[1]/span[1]/div/ul/li[4]/a/label/input"));
    	return contract;
    }

    public static WebElement contractsummarycontractpersonedit(WebDriver driver)
    {
 	   contractperson=driver.findElement(By.xpath("//*[@id='ddlCPDepartment_chosen']/div/ul/li[2]"));
 	   return contractperson;
    }
    
    public static WebElement contractsummarypaymenttypedropdownedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlPaymentType_chosen']/div/ul/li[3]"));
    	return contract;
    }
    
    public static WebElement contractsummarypaymenttermdropdownedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='pnlContract']/div[1]/div[7]/div[2]/span/div/ul/li[8]/a/label/input"));
    	return contract;
    }

    public static WebElement contractsummarydepttemplatedropdownedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlDepartmenttemplate_chosen']/div/ul/li[11]"));
    	return contract;
    }
    
    public static WebElement contractsummarytemplatedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("drdTemplateID_chosen"));
    	return contract;
    }
    
    public static WebElement contractsummarytemplatedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='drdTemplateID_chosen']/div/ul/li[2]"));
    	return contract;
    }
    
    public static WebElement contractsummarychangetemplateteaccept(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Button3']"));
    	return contract;
    }
    
    public static WebElement contractsummarycustomfield(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdCustomField_ddlFieldName_Footer_chosen"));
    	return contract;
    }
    

    public static WebElement contractsummarycustomfieldselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='grdCustomField_ddlFieldName_Footer_chosen']/div/ul/li[1]"));
    	return contract;
    }
    
    public static WebElement contractsummarycustomfieldvalue(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdCustomField_txtFieldValue_Footer"));
    	return contract;
    }
    
    public static WebElement contractagreementtab(WebDriver driver)
    {
    	contract=driver.findElement(By.id("lnkContractTransaction"));
    	return contract;
    }
    
    public static WebElement contractagreementcreatedocument(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//input[@id='Btnaddupload1']"));
    	return contract;
    }
    
    public static WebElement contractagreementsendforreview(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnReviwer"));
    	return contract;
    }
    
    public static WebElement contractagreementstatusbox(WebDriver driver)
    {
    	contract=driver.findElement(By.id("rptComplianceVersionView_lblDocumentVersionView_0"));
    	return contract;
    }
    
    public static WebElement contractagreementcontent(WebDriver driver)
    {
    	contract=driver.findElement(By.id("RadEditor1"));
    	return contract;
    }

    public static WebElement contractagreementsaveandclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btn_autosave"));
    	return contract;
    }
    
    public static WebElement contractagreementselectreviewerdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlUser"));
    	return contract;
    }
    
    public static WebElement contractagreementselectreviewer(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlUser']/option[4]"));
    	return contract;
    }
    
    public static WebElement contractagreementaddreviewer(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnAdd"));
    	return contract;
    }
    
    public static WebElement contractagreementsubmitreview(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnsubmitforrev"));
    	return contract;
    }
    
    public static WebElement contractvendorreviewstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[166]"));
    	return contract;
    }
    
    public static WebElement contractagreementsendforvendorreview(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnVendor"));
    	return contract;
    }

    public static WebElement contractagreementvendorrevieweremail(WebDriver driver)
    {
    	contract=driver.findElement(By.id("EmailTxt"));
    	return contract;
    }

    public static WebElement contractagreementvendorreviewercontact(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtContactNum"));
    	return contract;
    }

    public static WebElement contractagreementsubmitforvendorreview(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnvendr"));
    	return contract;
    }
    
    public static WebElement contractagreementpopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
    	return contract;
    }
    
    public static WebElement contractagreementapproverstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[176]"));
    	return contract;
    }
    
    public static WebElement contractagreementsubmitforapproverreview(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnApprover"));
    	return contract;
    }
    
    public static WebElement contractagreementapproverdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlUser"));
    	return contract;
    }
    
    public static WebElement contractagreementapproverdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlUser']/option[3]"));
    	return contract;
    }

    public static WebElement contractagreementaddapprover(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnAdd"));
    	return contract;
    }
    
    public static WebElement contractagreementsubmitforapproval(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnsubmitforrev"));
    	return contract;
    }
    
    public static WebElement contractagreementapprovalcompletededit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridDashContract']/div[2]/table/tbody/tr[1]/td[13]/a[1]"));
    	return contract;
    }
    
    public static WebElement contractagreementesignbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("BtnESign"));
    	return contract;
    }
    
    public static WebElement contractagreementesigndocupload(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ESignFileupload"));
    	return contract;
    }
    
    public static WebElement contractagreementesignokbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("/html/body/div[7]/div[3]"));
    	return contract;
    }
    
    public static WebElement contractagreementesigninternalsigner(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='dvSigner']/div[1]/div"));
    	return contract;
    }
    
    public static WebElement contractagreementesigninternalsignersearch(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("/html/body/div[2]/div/span/input"));
    	return contract;
    }
    
    public static WebElement contractagreementesigninternalsignerselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[1]"));
    	return contract;
    }
    
    public static WebElement contractagreementesigninternalsignersave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnAddSigner"));
    	return contract;
    }
    
    public static WebElement contractagreementesigninternalsignerokbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("/html/body/div[8]/div[3]"));
    	return contract;
    }
    
    public static WebElement contractagreementesignexternalsignerokbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("/html/body/div[9]/div[3]"));
    	return contract;
    }
    
    public static WebElement contractagreementsendforesignokbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("/html/body/div[10]/div[3]/button"));
    	return contract;
    }
    
    public static WebElement contractagreementesignexternalsignername(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtExternalUser"));
    	return contract;
    }
    
    public static WebElement contractagreementesignexternalsigneremail(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtExternalEmail"));
    	return contract;
    }
    
    public static WebElement contractagreementesignexternalsignercontact(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtExternalContact"));
    	return contract;
    }
    
    public static WebElement contractagreementesignexternalsignersave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnAddExternalSigner"));
    	return contract;
    }
    
    public static WebElement contractagreementsendforesign(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnSendESign"));
    	return contract;
    }
    
    
    public static WebElement contractagreementapprovalcompletedstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[168]"));
    	return contract;
    }
    
    public static WebElement contractworkspaceapprovalcompletededit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr[1]/td[9]/a[1]"));
    	return contract;
    }
    
    public static WebElement contractagreementconvertocontract(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='btnconvertcontract']"));
    	return contract;
    }
    
    public static WebElement contractagreementactivecontractstartdate(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtEffectiveDate"));
    	return contract;
    }

    public static WebElement contractagreementactivecontractexpirationdate(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtExpirationDate"));
    	return contract;
    }

    public static WebElement contractagreementactivecontractfileupload(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContractFileUpload"));
    	return contract;
    }
 
    public static WebElement contractagreementactivecontractsave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("lnkDocumentUpload"));
    	return contract;
    }

    public static WebElement contractagreementactivecontractcalendaricon(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Converttocontractpopup']/div/div/div[2]/div[3]/div/span"));
    	return contract;
    }
    
    public static WebElement contractagreementcontractrenew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnrenew"));
    	return contract;
    }
    
    public static WebElement contractworkspaceactivestatus(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[170]"));
    	return contract;
    }
    
    public static WebElement contractworkspaceactivecontractedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr[1]/td[9]/a[1]"));
    	return contract;
    }
    
    public static WebElement contractworkspaceactivecontract(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridContract']/div[2]/table/tbody/tr[3]/td[9]/a[1]"));
    	return contract;
    }
    
    public static WebElement contractworkspacependingreview(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[163]"));
    	return contract;
    }
    
    public static WebElement contractagreementexportdocument(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnExportDocReport"));
    	return contract;
    }

    public static WebElement contractagreementexportpdf(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnExportPdfReport"));
    	return contract;
    }
    
    public static WebElement contractagreementfullhistory(WebDriver driver)
    {
    	contract=driver.findElement(By.id("BtnFullHistory"));
    	return contract;
    }
    
    public static WebElement contractagreementfullhistoryexportdocument(WebDriver driver)
    {
    	contract=driver.findElement(By.id("BtnExportDocument"));
    	return contract;
    }
    
    public static WebElement contractagreementfullhistorypopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='TemplateHistroySectionPopup']/div/div/div[1]/button"));
    	return contract;
    }
    
    public static WebElement contractagreementallcomments(WebDriver driver)
    {
    	contract=driver.findElement(By.id("OpenComments"));
    	return contract;
    }

    public static WebElement contractagreementallcommentspopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='CommentsPopup']/div/div/div[1]/button"));
    	return contract;
    }
    
    public static WebElement contractsummaryinprincipleapprovalcheckbox(WebDriver driver)
    {
    	contract=driver.findElement(By.id("chkInprincipleApproval"));
    	return contract;
    }

    public static WebElement myworkspacesearchbox(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtSearch"));
    	return contract;
    }

    public static WebElement auditlogtab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='tabstripMain']/ul/li[7]"));
    	return contract;
    }
    
    public static WebElement auditloguserfilter(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlUsers_AuditLog_chosen"));
    	return contract;
    }
    
    public static WebElement auditloguserfilterselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id=\"ddlUsers_AuditLog_chosen\"]/div/ul/li[80]"));
    	return contract;
    }

    public static WebElement auditlogstartdate(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtFromDate_AuditLog"));
    	return contract;
    }
    
    public static WebElement auditlogenddate(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtToDate_AuditLog"));
    	return contract;
    }
    
    public static WebElement auditlogapplyfilter(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnApplyFilter_AuditLog"));
    	return contract;
    }
    
    public static WebElement auditlogexporticon(WebDriver driver)
    {
    	contract=driver.findElement(By.id("exportContractLog"));
    	return contract;
    }
    
    public static WebElement auditlogpopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));
    	return contract;
    }
    
    public static WebElement masterentitytab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[1]/a"));
    	return contract;
    }

    public static WebElement masterentityaddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddCustomerBranch"));
    	return contract;
    }
    
    public static WebElement masterentityname(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxName"));
    	return contract;
    }
    
    public static WebElement masterentityunittypedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_ddlType"));
    	return contract;
    }
    
    public static WebElement masterentityunittypedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']/option[3]"));
    	return contract;
    }
    
    public static WebElement masterentityaddress(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxAddressLine1"));
    	return contract;
    }
    
    public static WebElement masterentitystatedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_ddlState"));
    	return contract;
    }
    
    public static WebElement masterentitystatedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlState\"]/option[93]"));
    	return contract;
    }

    public static WebElement masterentitycitydropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_ddlCity"));
    	return contract;
    }

    public static WebElement masterentitycitydropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']/option[16]"));
    	return contract;
    }
    
    public static WebElement masterentitycontactperson(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxContactPerson"));
    	return contract;
    }
    
    public static WebElement masterentitycontactpersonemail(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxEmail"));
    	return contract;
    }
    
    public static WebElement masterentitystatusdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_ddlCustomerStatus"));
    	return contract;
    }

    public static WebElement masterentitystatusdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']/option[2]"));
    	return contract;
    }

    public static WebElement masterentitysave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
    	return contract;
    }

    public static WebElement masterentitypopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnCancel"));
    	return contract;
    }

    public static WebElement masterentitysearch(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return contract;
    }

    public static WebElement masterusertab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[2]/a"));
    	return contract;
    }
    
    public static WebElement masteruseraddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddUser"));
    	return contract;
    }
    
    public static WebElement masteruserfirstname(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFirstName"));
    	return contract;
    }

    public static WebElement masteruserlastname(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxLastName"));
    	return contract;
    }
    
    public static WebElement masteruserdesignation(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxDesignation"));
    	return contract;
    }
    
    public static WebElement masteruseremail(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxEmail"));
    	return contract;
    }

    public static WebElement masterusercontactno(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxContactNo"));
    	return contract;
    }

    public static WebElement masteruserdepartment(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_ddlDepartment"));
    	return contract;
    }

    public static WebElement masteruserdepartmenselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartment']/option[3]"));
    	return contract;
    }
    
    public static WebElement masteruseraddress(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxAddress"));
    	return contract;
    }
    
    public static WebElement masteruserroledropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_ddlContractRole"));
    	return contract;
    }
    
    public static WebElement masterusernonadminroledropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractRole']/option[5]"));
    	return contract;
    }
    
    public static WebElement masteruseradminroledropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractRole']/option[2]"));
    	return contract;
    }
    
    public static WebElement masterusermanagementroledropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlContractRole']/option[4]"));
    	return contract;
    }


    public static WebElement masterusersave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
    	return contract;
    }

    public static WebElement masteruserclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnCancel"));
    	return contract;
    }

    public static WebElement masteruserentitydropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxBranch"));
    	return contract;
    }

    public static WebElement masteruserentitydropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tvBranchest0"));
    	return contract;
    }
    
    public static WebElement masterusersearchbox(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return contract;
    }
    
    public static WebElement masteruserdelete(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdUser_lbtnDelete_0"));
    	return contract;
    }
    
    public static WebElement mastersubentity(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch']/tbody/tr[2]/td[9]/a"));
    	return contract;
    }

    public static WebElement mastervendoraddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	return contract;
    }

    public static WebElement mastervendorname(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxName"));
    	return contract;
    }
    
    public static WebElement mastervendoraddress(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxAddress"));
    	return contract;
    }
    
    public static WebElement mastervendorcontactperson(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxContactPerson"));
    	return contract;
    }
    
    public static WebElement mastervendoremail(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxEmail"));
    	return contract;
    }
    
    public static WebElement mastervendorcontactno(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxContactNo"));
    	return contract;
    }

    public static WebElement mastervendorPAN(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxPAN"));
    	return contract;
    }
    
    public static WebElement mastervendorsave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnSave"));
    	return contract;
    }
    
    public static WebElement mastervendorclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnCancel"));
    	return contract;
    }
    
    public static WebElement mastervendorsearch(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxtypeTofilter"));
    	return contract;
    }
    
    public static WebElement mastervendoredit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdVendor_LinkButton1_0"));
    	return contract;
    }
    
    public static WebElement mastervendordelete(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdVendor_LinkButton2_0"));
    	return contract;
    }

    public static WebElement masterconttypetab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[4]/a"));
    	return contract;
    }
    
    public static WebElement masterconttypeaddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	return contract;
    }
    
    public static WebElement mastersubconttypeaddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddSubType"));
    	return contract;
    }
    
    public static WebElement masterconttypeaddnewtext(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxContType"));
    	return contract;
    }
    
    public static WebElement mastersubconttypeaddnewtext(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxSubContType"));
    	return contract;
    }


    public static WebElement masterconttypesave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnSave"));
    	return contract;
    }

    public static WebElement masterconttypeclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnCancel"));
    	return contract;
    }
    
    public static WebElement masterconttypesearch(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return contract;
    }
    
    public static WebElement masterconttypeedit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdContractType_lnkEditContractType_0"));
    	return contract;
    }
    
    public static WebElement mastersubconttypeedit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdSubConType_LinkButton1_0"));
    	return contract;
    }
    
    public static WebElement myworkspacesearchtext(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtSearch"));
    	return contract;
    }
    
    public static WebElement subcontracttypecreate(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdContractType_lblSubConttype_0"));
    	return contract;
    }

    public static WebElement contracttypedelete(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//img[@alt='Delete']"));
    	return contract;
    }

    public static WebElement contracttypebackbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_lnkBackToContractType"));
    	return contract;
    }
    
    public static WebElement documenttypetab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[5]/a"));
    	return contract;
    }
    
    public static WebElement documenttypeaddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	return contract;
    }
    
    public static WebElement documenttypeaddnewtext(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxDocumentType"));
    	return contract;
    }
    
    public static WebElement documenttypesave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnSave"));
    	return contract;
    }
    
    public static WebElement documenttypeclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnCancel"));
    	return contract;
    }
    
    public static WebElement documenttypesearch(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return contract;
    }

    public static WebElement documenttypeedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//img[@alt='Edit']"));
    	return contract;
    }

    public static WebElement documenttypedelete(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdContDoctType_lnkDeleteContractDocType_0"));
    	return contract;
    }
    
    public static WebElement customfieldtab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[7]/a"));
    	return contract;
    }
    
    public static WebElement customfieldaddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddCustomFields"));
    	return contract;
    }
    
    public static WebElement customfieldcontracttypedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='upContCustomField']/div/div[2]/div/span[1]/div/button"));
    	return contract;
    }
    
    public static WebElement customfieldcontracttypedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
    	return contract;
    }
    
    public static WebElement customfielddisplayfieldname(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxLableName"));
    	return contract;
    }
    
    public static WebElement customfieldsave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnSave"));
    	return contract;
    }
    
    public static WebElement customfieldclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnCancel"));
    	return contract;
    }
    
    public static WebElement customfieldpagecontracttypedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_ddlType_chosen"));
    	return contract;
    }
    
    public static WebElement customfieldpagecontracttypedropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType_chosen']/div/ul/li[3]"));
    	return contract;
    }
    
    public static WebElement customfieldpagesearch(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return contract;
    }
    
    public static WebElement customfieldpageediticon(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//img[@alt='Edit']"));
    	return contract;
    }
    
    public static WebElement customfielddelete(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//img[@alt='Delete']"));
    	return contract;
    }
    
    public static WebElement customfieldeditclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//input[@id='btnCancel']"));
    	return contract;
    }
    
    public static WebElement readlegalmsg(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_valcustomerbranch']/ul/li"));
    	return contract;
    }
    
    public static WebElement contracttemplatetab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[9]/a"));
    	return contract;
    }
    
    public static WebElement contractsectionicon(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnSection"));
    	return contract;
    }
    
    public static WebElement contractsectionaddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	return contract;
    }
    
    public static WebElement contractsectionaddheader(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxHeader"));
    	return contract;
    }
    
    public static WebElement contractsectiondept(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlDeptPage_chosen"));
    	return contract;
    }
    
    public static WebElement contractsectiondeptselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlDeptPage_chosen']/div/ul/li[3]"));
    	return contract;
    }
    
    public static WebElement contractsectioncontent(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='theEditorCenter']"));
    	return contract;
    }
    
    public static WebElement contractsectionheadervisibility(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ddlVisibilitySectionHeader"));
    	return contract;
    }
    
    public static WebElement contractsectionheadervisibilityselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlVisibilitySectionHeader']/option[1]"));
    	return contract;
    }
    
    public static WebElement contractsectionsearch(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return contract;
    }
    
    public static WebElement contractsectionedit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdTemplateSections_lnkEditSection_0"));
    	return contract;
    }
    
    public static WebElement contractsectionsave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnSave"));
    	return contract;
    }
    
    public static WebElement sectioneditmsg(WebDriver driver)
    {
    	contract=driver.findElement(By.id("divsuccessmsgaCTemSec"));
    	return contract;
    }
    
    public static WebElement sectionpopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnCancel"));
    	return contract;
    }
    
    public static WebElement sectionbackbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_lnkbtnPrevious"));
    	return contract;
    }
    
    public static WebElement sectiondelete(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdTemplateSections_lnkDeleteSection_0"));
    	return contract;
    }
    
    public static WebElement templateaddnew(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	return contract;
    }
    
    public static WebElement templatename(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxTemplateName"));
    	return contract;
    }
    
    public static WebElement templatedepartment(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='lstBoxDepartment']/option[10]"));
    	return contract;
    }
    
    public static WebElement templateapproverlevel(WebDriver driver)
    {
    	contract=driver.findElement(By.id("tbxApprover"));
    	return contract;
    }
    
    public static WebElement templateorder(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdTemplateSection_txtOrder_0"));
    	return contract;
    }
    
    public static WebElement templateorderselect(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdTemplateSection_chkRow_0"));
    	return contract;
    }
    
    public static WebElement templateheaderdept(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdTemplateSection_ddldpetsection_0_chosen"));
    	return contract;
    }
    
    public static WebElement templateheaderdeptselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='grdTemplateSection_ddldpetsection_0_chosen']/div/ul/li[9]"));
    	return contract;
    }
    
    public static WebElement templatereviewerdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdTemplateSection_ddlReviewer_0_chosen"));
    	return contract;
    }
    
    public static WebElement templatereviewerselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='grdTemplateSection_ddlReviewer_0_chosen']/div/ul/li[2]"));
    	return contract;
    }
    
    public static WebElement templatesave(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnSaveSections"));
    	return contract;
    }
    
    public static WebElement templatepopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ContractTemplatePopup']/div/div/div[1]/button"));
    	return contract;
    }
    
    public static WebElement templatesearchbox(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	return contract;
    }
    
    public static WebElement templateedit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdContractTemplates_lnkEditTemplate_0"));
    	return contract;
    }
    
    public static WebElement templatedelete(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ContentPlaceHolder1_grdContractTemplates_lnkDeleteTemplate_0"));
    	return contract;
    }
    
    public static WebElement customfieldparameter(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='grdCustomField_ddlFieldName_Footer_chosen']"));
    	return contract;
    }
    
    public static WebElement customfieldparameterselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='grdCustomField_ddlFieldName_Footer_chosen']/div/ul/li"));
    	return contract;
    }
    
    public static WebElement customfieldparametervalue(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdCustomField_txtFieldValue_Footer"));
    	return contract;
    }
    
    public static WebElement customfieldparameteradd(WebDriver driver)
    {
    	contract=driver.findElement(By.id("grdCustomField_lnkBtnAddCustomField"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogtab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='tabstripContractLog']/ul/li[2]/span[2]"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogstartdate(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtStartDate"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogenddate(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtEnddate"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogdeptdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[2]"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogdeptdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//li[@class='k-item'])[471]"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogsearchbox(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtSearchinAuditlog"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogclearbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("ClearfilterContractlog"));
    	return contract;
    }
    
    public static WebElement myreportsauditlogexportbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("exportContractLog"));
    	return contract;
    }
    
    public static WebElement locationgraphname1(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(2) > tspan"));
    	return contract;
    }
    
    public static WebElement locationgraphname2(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(2)"));
    	return contract;
    }
    
    public static WebElement locationgraphname3(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(5)"));
    	return contract;
    }
    
    public static WebElement deptgraphname(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(3)"));
    	return contract;
    }
    
    public static WebElement locgraphdraftstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > text"));
    	return contract;
    }
    
    public static WebElement locgraphrejectedstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-4 > text"));
    	return contract;
    }
    
    public static WebElement locgraphsignaturestatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-5 > text"));
    	return contract;
    }
    
    public static WebElement deptgraphdraftstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > text"));
    	return contract;
    }
    
   
    public static WebElement deptgraphreviewstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-1 > text"));
    	return contract;
    }
    
    public static WebElement deptgraphapprovalstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-3 > text"));
    	return contract;
    }
    
    public static WebElement deptgraphrejectedstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-4 > text"));
    	return contract;
    }
    
    public static WebElement deptgraphsignaturestatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-5 > text"));
    	return contract;
    }
    
    public static WebElement locgraphreviewstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-1 > text"));
    	return contract;
    }
    
    public static WebElement locgraphwithvendorstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-2 > text"));
    	return contract;
    }
    
    public static WebElement deptgraphwithvendorstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-2 > text"));
    	return contract;
    }
    
    public static WebElement locgraphapprovalstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-6 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-3 > text"));
    	return contract;
    }

    
    public static WebElement deptgraphname1(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-4 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(1)"));
    	return contract;
    }
    
    public static WebElement ctypegraphname(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(1)"));
    	return contract;
    }
    
    public static WebElement ctypedraftstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > text"));
    	return contract;
    }
    
    public static WebElement ctypereviewstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-1 > text"));
    	return contract;
    }
    
    public static WebElement ctypewithvendorstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-2 > text"));
    	return contract;
    }
    
    public static WebElement ctypewithapprovalstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-3 > text"));
    	return contract;
    }
    
    public static WebElement ctyperejectedstatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-4 > text"));
    	return contract;
    }
    
    public static WebElement ctypesignaturestatus(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-8 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-5 > text"));
    	return contract;
    }
    
    public static WebElement contractstatus1(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-3 > text"));
    	return contract;
    }
    
    public static WebElement contractstatus2(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-0 > text"));
    	return contract;
    }
    
    public static WebElement contractstatus3(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-1 > text"));
    	return contract;
    }
    
    public static WebElement contractstatus4(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-2 > text"));
    	return contract;
    }

    public static WebElement contractstatus5(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-4 > text"));
    	return contract;
    }
    
    public static WebElement contractstatus6(WebDriver driver)
    {
    	contract=driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-pie-series.highcharts-color-5 > text"));
    	return contract;
    }
    
    public static WebElement contractexpiringedit(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridDashContract']/div[2]/table/tbody/tr[1]/td[6]"));
    	return contract;
    }
    
    public static WebElement contractpopuplcose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
    	return contract;
    }
    
    public static WebElement dashboardtaskediticon(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='grdTaskActivity']/div[2]/table/tbody/tr[1]/td[8]"));
    	return contract;
    }
    
    public static WebElement dashboardtaskeditpopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
    	return contract;
    }
    
    public static WebElement dashboardmilestoneediticon(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='grdMilestone']/div[2]/table/tbody/tr[1]/td[8]"));
    	return contract;
    }
    
    public static WebElement dashboardmilestoneeditpopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//button[@onclick='javascript:reloadTaskList();']"));
    	return contract;
    }
    
    public static WebElement contractaddnewbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnAddContract"));
    	return contract;
    }
    
    public static WebElement contracttypedropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[1]/span[1]/span/span[2]"));
    	return contract;
    }

    public static WebElement contracttypeselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlContractType_listbox']/li[6]"));
    	return contract;
    }
    
    public static WebElement contractsubtypedropdown1(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[1]/span[2]/span/span[2]"));
    	return contract;
    }
    
    public static WebElement contractsubtypeselect1(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlContractSubType_listbox']/li[2]"));
    	return contract;
    }

    public static WebElement contractentitydropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[2]/span[1]/span/span[3]"));
    	return dashboard;
    }
    
    public static WebElement contractentityexpandicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[10]"));
    	return dashboard;
    }
    
    public static WebElement contractentitydropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-in'])[544]"));
    	return dashboard;
    }
    
    public static WebElement deptdropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[2]/span[2]/span/span[2]"));
    	return dashboard;
    }
    
    public static WebElement deptdropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='ddlDepartment_listbox']/li[2]"));
    	return dashboard;
    }
    
    public static WebElement contracttitle(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("txtTitle"));
    	return dashboard;
    }
    
    public static WebElement contractdescription(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("tbxDescription"));
    	return dashboard;
    }
    
    public static WebElement contractvendordropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divVendotList']/div"));
    	return dashboard;
    }
    
    public static WebElement contractvendordropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[625]"));
    	return dashboard;
    }
    
    public static WebElement contractpersondropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[9]/span"));
    	return dashboard;
    }
    
    public static WebElement contractpersondropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='drpContractContactPerson_listbox']/li[2]"));
    	return dashboard;
    }
    
    public static WebElement propdatecalendariconclick(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[11]/span[1]/span/span[2]"));
    	return dashboard;
    }
    
    public static WebElement agreedatecalendariconclick(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[11]/span[2]/span/span[2]"));
    	return dashboard;
    }
    
    public static WebElement startdatecalendariconclick(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[13]/span[1]/span/span[2]"));
    	return dashboard;
    }
    
    public static WebElement enddatecalendariconclick(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[13]/span[2]/span/span[2]"));
    	return dashboard;
    }
    
    public static WebElement lockinperiodcalendariconclick(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[17]/span/span/span[2]"));
    	return dashboard;
    }
    
    
    public static WebElement propcalendarbackicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-60-left'])[3]"));
    	return dashboard;
    }
    
    public static WebElement agreecalendarbackicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-link k-nav-prev'])[2]"));
    	return dashboard;
    }
    
    public static WebElement lockinperiodcalendarbackicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-60-left'])[3]"));
    	return dashboard;
    }
    
    public static WebElement proposaldatevalue(WebDriver driver)
    {
    	dashboard=driver.findElement(By.linkText("1"));
    	return dashboard;
    }
    
    public static WebElement agreedatevalue(WebDriver driver)
    {
    	dashboard=driver.findElement(By.linkText("1"));
    	return dashboard;
    }
    
    
    public static WebElement proposaldate(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("dateContractProposal"));
    	return dashboard;
    }
    
    public static WebElement agreementdate(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("dateContractAgreement"));
    	return dashboard;
    }
    
    public static WebElement startdate(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("txtEffectiveDate"));
    	return dashboard;
    }
    
    public static WebElement enddate(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("txtExpirationDate"));
    	return dashboard;
    }
    
    public static WebElement enddatecalendarforwardicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-link k-nav-next'])[4]"));
    	return dashboard;
    }

    
    public static WebElement contractamount(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("tbxContractAmt"));
    	return dashboard;
    }
    
    public static WebElement taxes(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("tbxTaxes"));
    	return dashboard;
    }
    
    public static WebElement paymenttermdrodpown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[17]/div"));
    	return dashboard;
    }
    
    public static WebElement paymenttermdrodpownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[618]"));
    	return dashboard;
    }

    public static WebElement lockinperiod(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("dateContractLockin"));
    	return dashboard;
    }
    
    public static WebElement noticeterm(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("txtNoticeTerm"));
    	return dashboard;
    }

    public static WebElement noticetermdaysdropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[18]/span"));
    	return dashboard;
    }
    
    public static WebElement noticetermdaysdropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='ddlNoticeTerm_listbox']/li[2]"));
    	return dashboard;
    }

    public static WebElement noticeremark(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("tbxAddNewClause"));
    	return dashboard;
    }
    
    public static WebElement inprinciplecheckbox(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("chkInprincipleApproval"));
    	return dashboard;
    }
    
    public static WebElement contractsubmit(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("btnSaveContract"));
    	return dashboard;
    }
    
    public static WebElement contractpopupokbutton(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//div[@class='k-button-group k-dialog-buttongroup k-dialog-button-layout-stretched'])[1]"));
    	return dashboard;
    }
    
    public static WebElement contractdoctabesignclick(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-signature k-grid-signature'])[1]"));
    	return dashboard;
    }
    
    public static WebElement contractdoctabesigninternalsignerdropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='dvSigner']/div"));
    	return dashboard;
    }
    
    public static WebElement contractdoctabesigninternalsignerselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[990]"));
    	return dashboard;
    }
    
    public static WebElement contractdoctabesignaddsigner(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("btnAddSigner"));
    	return dashboard;
    }
    
    public static WebElement contractpopupclose(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//div[@class='k-window-actions'])[1]"));
    	return dashboard;
    }
    
    public static WebElement contractediticon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[1]"));
    	return dashboard;
    }
    
    public static WebElement contractdetailstab(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='tabstripMain']/ul/li[3]"));
    	return dashboard;
    }
    
    public static WebElement contractdetailsave(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("btnCreateContractDetails"));
    	return dashboard;
    }
    
    public static WebElement contractdocumentstab(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='tabstripMain']/ul/li[4]"));
    	return dashboard;
    }
    
    public static WebElement contractadddocument(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("btnAddDocuments"));
    	return dashboard;
    }

    public static WebElement contractadddocumentpopupclose(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
    	return dashboard;
    }
    
    public static WebElement contractadddocumentpopupfilelocation(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("drpDocumentsLocation"));
    	return dashboard;
    }
    
    public static WebElement contractadddocumentpopupfilenumber(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("drpDocumentsFileNumber"));
    	return dashboard;
    }
    
    public static WebElement contractadddocumentpopupfiletags(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("drpDocumentsFileTags"));
    	return dashboard;
    }
    
    public static WebElement contracttitlevalue(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='gridDashContract']/div[2]/table/tbody/tr[2]/td[5]"));
    	return dashboard;
    }
    
    public static WebElement contractdoctabcheckbox(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='gridCurrentDocs']/div[2]/table/tbody/tr[1]/td[1]"));
    	return dashboard;
    }
    
    public static WebElement contractshareicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("btnShare"));
    	return dashboard;
    }
    
    public static WebElement contractsharevendordropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("ddlVendor_chosen"));
    	return dashboard;
    }
    
    public static WebElement contractsharevendorpopupclose(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divDocumentsharePopup']/div/div/div[1]/button"));
    	return dashboard;
    }

    public static WebElement contractdocumenttabview(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-view k-grid-view'])[11]"));
    	return dashboard;
    }
    
    public static WebElement contractdocumenttabpopupclose(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
    	return dashboard;
    }
    
    public static WebElement contractdocumenttabdownloadicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-download k-grid-download'])[1]"));
    	return dashboard;
    }
    
    public static WebElement contractdocumenttabesignicon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath(""));
    	return dashboard;
    }
    
    public static WebElement contracttasktab(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='tabstripMain']/ul/li[6]"));
    	return dashboard;
    }
    
    public static WebElement contractaddnewtask(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("btnAddCont_Task"));
    	return dashboard;
    }
    
    public static WebElement contracttasktypedropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='divnewtask']/span/span/span[2]"));
    	return dashboard;
    }
    
    public static WebElement contracttasktypedropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='rbTaskType_listbox']/li[2]"));
    	return dashboard;
    }
    
    public static WebElement contracttaskassigntodropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='dvAddTaskwindow']/div[4]/span[2]"));
    	return dashboard;
    }
    
    public static WebElement contracttaskassigntodropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='lstBoxTaskUser_listbox']/li[36]"));
    	return dashboard;
    }
    
    public static WebElement contracttaskduedatedropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-select'])[33]"));
    	return dashboard;
    }
    
    public static WebElement contracttaskduedateselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.linkText("31"));
    	return dashboard;
    }
    
    public static WebElement contracttasksubmit(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("btnSaveTask"));
    	return dashboard;
    }
    
    public static WebElement contracttasksubmitokpopup(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//div[@class='k-button-group k-dialog-buttongroup k-dialog-button-layout-stretched'])[1]"));
    	return dashboard;
    }
    
    public static WebElement contracttaskpopupclose(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
    	return dashboard;
    }
    
    public static WebElement pageauthorisationtab(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[10]/a"));
    	return dashboard;
    }
    
    public static WebElement pageauthorisationuserdropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("ContentPlaceHolder1_ddlUserType_chosen"));
    	return dashboard;
    }
    
    public static WebElement pageauthorisationuserdropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUserType_chosen']/div/ul/li[5]"));
    	return dashboard;
    }
    
    public static WebElement pageauthorisationcheckbox(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("ContentPlaceHolder1_grdPageAuthorization_chkADD_1"));
    	return dashboard;
    }
    
    public static WebElement pageauthorisationsave(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("ContentPlaceHolder1_btnSavePageAutorization"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktab(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("Tasklistmenu"));
    	return dashboard;
    }

    public static WebElement workspacetasktabprioritydropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[1]"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabprioritydropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[1]"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabstatusdropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[2]"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabstatusdropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[8]"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabclearbutton(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("ClearfilterMain"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabsearchbutton(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("txtSearch"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabexportbutton(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("exportAdvanced"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabediticon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[1]"));
    	return dashboard;
    }
    
    public static WebElement workspacetasktabclosepopup(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//button[@class='close'])[1]"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetab(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("milestonelistmenu"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabcontractnamedropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[1]"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabcontractnamedropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[2]"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabmilestonenamedropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[2]"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabmilestonenamedropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[13]"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabstatusdropdown(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/span"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabstatusdropdownselect(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("//*[@id='ddlContractStatus_listbox']/li[4]"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabclear(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("ClearfilterMain"));
    	return dashboard;
    }
    
    
    public static WebElement workspacemilestonetabsearchbox(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("txtSearch"));
    	return dashboard;
    }
    
    public static WebElement workspacemilestonetabediticon(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[1]"));
    	return dashboard;
    }
    
    public static WebElement workspacemyreviewstab(WebDriver driver)
    {
    	dashboard=driver.findElement(By.id("ContractMyreviewmenu"));
    	return dashboard;
    }
    
    
    public static WebElement summarytabentityclick(WebDriver driver)
    {
    	dashboard=driver.findElement(By.xpath("(//div[@class='k-top k-bot'])[2]"));
    	return dashboard;
    }
    
    public static WebElement contdeptdropdownclick(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='divContractSummary']/div[1]/div[2]/span[2]/span/span[2]"));
    	return contract;
    }
    
    public static WebElement contdeptdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlDepartment_listbox']/li[2]"));
    	return contract;
    }
    
    public static WebElement confimrationpopupokbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//button[@class='k-button k-primary'])[1]"));
    	return contract;
    }
    
    public static WebElement contractsummaryrefreshicon(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnRefresh"));
    	return contract;
    }
    
    public static WebElement contractdocconfirmpopup(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("/html/body/div[3]/div[3]/button"));
    	return contract;
    }
    
    public static WebElement doctabpopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));
    	return contract;
    }
    
    public static WebElement contractdocview(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridCurrentDocs']/div[2]/table/tbody/tr[1]/td[10]/a[2]"));
    	return contract;
    }
    
    public static WebElement contractdocviewpopupclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
    	return contract;
    }
    
    public static WebElement contractdocdownload(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridCurrentDocs']/div[2]/table/tbody/tr[1]/td[10]/a[3]"));
    	return contract;
    }
    
    public static WebElement contractdocdelete(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='gridCurrentDocs']/div[2]/table/tbody/tr[1]/td[10]/a[4]"));
    	return contract;
    }
    
    public static WebElement contracttasktabclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
    	return contract;
    }
    
    public static WebElement taskduedateselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//a[@class='k-link'])[54]"));
    	return contract;
    }
    
    public static WebElement taskconfirmpopup(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//div[@class='k-button-group k-dialog-buttongroup k-dialog-button-layout-stretched'])[1]"));
    	return contract;
    }
    
    public static WebElement taskdeleteicon(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-delete k-grid-delete'])[11]"));
    	return contract;
    }
    
    public static WebElement workspacestatusdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='MainContentCW']/div[1]/div[4]"));
    	return contract;
    }
    
    public static WebElement workspacestatusdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[206]"));
    	return contract;
    }
    
    public static WebElement agreementtab(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='tabstripMain']/ul/li[2]"));
    	return contract;
    }
    
    public static WebElement reviewersubmit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnReviwer"));
    	return contract;
    }
    
    public static WebElement reviewerdropdown(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='dvReviewerSection']/div[1]/span/span/span[2]"));
    	return contract;
    }
    
    public static WebElement reviewerdropdownselect(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("//*[@id='ddlUser_listbox']/li[40]"));
    	return contract;
    }
    
    public static WebElement docsharedcheckbox(WebDriver driver)
    {
    	contract=driver.findElement(By.id("chkIsSharedIntenally"));
    	return contract;
    }
    
    public static WebElement addreviewer(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnAdd"));
    	return contract;
    }
        
    public static WebElement submitforreview(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnsubmitforrev"));
    	return contract;
    }
    
    public static WebElement sendforreviewremark(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtRemark"));
    	return contract;
    }
    
    public static WebElement remarksubmit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("remarkButton"));
    	return contract;
    }
    
    public static WebElement agreementtabclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));
    	return contract;
    }
    
    public static WebElement workspacereviewcompletedcheckbox(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("(//span[@class='k-in'])[213]"));
    	return contract;
    }
    
    public static WebElement agreementtabvendorreviewbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnVendor"));
    	return contract;
    }
    
    public static WebElement agreementtabvendorreviewsubmit(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnvendr"));
    	return contract;
    }
    
    public static WebElement agreementtabvendorremark(WebDriver driver)
    {
    	contract=driver.findElement(By.id("VendorMessage_Box"));
    	return contract;
    }
    
    public static WebElement agreementtabvendorremarksubmit(WebDriver driver)
    {
    	contract=driver.findElement(By.name("btnVendorRemark"));
    	return contract;
    }
    
    public static WebElement agreementtabexportbutton(WebDriver driver)
    {
    	contract=driver.findElement(By.id("btnExportDocReport"));
    	return contract;
    }
    
    public static WebElement agreementtabfullhistory(WebDriver driver)
    {
    	contract=driver.findElement(By.id("BtnFullHistory"));
    	return contract;
    }
    
    public static WebElement agreementtabfullhistoryclose(WebDriver driver)
    {
    	contract=driver.findElement(By.xpath("/html/body/form/div[12]/div/div/div[1]/button"));
    	return contract;
    }
    
    public static WebElement workspacesearch(WebDriver driver)
    {
    	contract=driver.findElement(By.id("txtSearch"));
    	return contract;
    }
    
    public static WebElement fullhistoryexportdoc(WebDriver driver)
    {
    	contract=driver.findElement(By.id("BtnExportDocument"));
    	return contract;
    }

}




