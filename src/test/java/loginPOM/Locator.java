package loginPOM;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import freemarker.core.ReturnInstruction;

public class Locator 
{
	//public WebDriver driver;
	private static WebElement newdoc=null;
	private static WebElement docname=null;
	private static WebElement savedoc=null;
	
	private static WebElement masterclick=null;
	private static WebElement doctype=null;
	private static WebElement fname=null;
	private static WebElement searchdoc=null;
	private static WebElement editdoc=null;
	private static WebElement updatedoc=null;
	private static WebElement closedoc=null;
	private static WebElement deletedoc=null;
	private static WebElement vendormasterclick=null;
	private static WebElement addvendor=null;
	private static WebElement vendorname=null;
	private static WebElement vendoradd=null;
	private static WebElement savevendor=null;
	private static WebElement closevendor=null;
	private static WebElement mastermenu=null;
	private static WebElement vendorsearch=null;
	private static WebElement vendoredit=null;
	private static WebElement vname=null;
	private static WebElement vendor_name=null;
    private static WebElement contracttype=null;
	private static WebElement subcontracttype=null;
	private static WebElement dept=null;
	private static WebElement customfield=null;
	private static WebElement deptmapping;
	private static WebElement template=null;
	private static WebElement section=null;
	private static List<WebElement> elementsList = null;
	private static WebElement workspace;
	private static WebElement contract=null;
	private static WebElement vendor=null;
	private static WebElement user=null;
		
	
	
	public static WebElement mastermenuclick(WebDriver driver)
	{
		mastermenu=driver.findElement(By.xpath("//*[@id='leftmastermenu']"));
		return mastermenu;
	}
	public static WebElement setnewdoc(WebDriver driver) 
	{
		docname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']"));
		return docname;
		
	}

	public static WebElement setdocname(WebDriver driver)
	{
		docname=driver.findElement(By.xpath("//*[@id='tbxDocumentType']"));
		return docname;
	}

    public static WebElement clicksavedoc(WebDriver driver)
    {
    	savedoc=driver.findElement(By.xpath("//*[@id='btnSave']"));
    	return savedoc;
    }
    
    public static WebElement clickclose(WebDriver driver)
    {
    	closedoc=driver.findElement(By.xpath("//*[@id='btnCancel']"));
    	return closedoc;
    }
    
    public static WebElement masterclick(WebDriver driver)
    {
            masterclick=driver.findElement(By.xpath("//*[@id='leftmastermenu']/a"));
            return masterclick;
    }
    
    public static WebElement doctype(WebDriver driver)
    {
    	doctype=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[5]/a"));
    	return doctype;
    }
    
    public static WebElement setnewframe(WebDriver driver) 
	{
		fname=driver.findElement(By.id("ContentPlaceHolder1_tbxFirstName")); //*[@id="ContentPlaceHolder1_IframeDocType"]
		return fname;
		
	}
    public static WebElement searchdoctype(WebDriver driver)
    {
    	searchdoc=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxFilter\"]"));
    	return searchdoc;
    }
    public static WebElement editdoctype(WebDriver driver)
    {
    	editdoc=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContDoctType_lnkEditContractDocType_0']/img"));
    	return editdoc;
    }
    
    public static WebElement updatedoctype(WebDriver driver)
    { 
    	updatedoc=driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
    	return updatedoc;
    }
    
    public static WebElement closedoctype(WebDriver driver)
    {
    	closedoc=driver.findElement(By.xpath("//*[@id='btnCancel']"));
    	return closedoc;
    }

     public static WebElement deletedoctype(WebDriver driver)
     {
    	 deletedoc=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContDoctType_lnkDeleteContractDocType_0']/img"));
    	 return deletedoc;
     }
     
     public static WebElement vendortab(WebDriver driver)
     {
    	 vendormasterclick=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[3]"));
    	 return vendormasterclick;
     }
     
     public static WebElement addnewvendor(WebDriver driver)
     {
    	 addvendor=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']"));
    	 return addvendor;
     }
     
     public static WebElement vendorname(WebDriver driver)
     {
    	 vendorname=driver.findElement(By.xpath("//*[@id='tbxName']"));
    	 return vendorname;
     }
     
     public static WebElement vendoraddress(WebDriver driver)
     {
    	 vendoradd=driver.findElement(By.xpath("//*[@id='tbxAddress']"));
    	 return vendoradd;
     }
     
     public static WebElement savevendor(WebDriver driver)
     {
    	 savevendor=driver.findElement(By.xpath("//*[@id='btnSave']"));
    	 return savevendor;
     }
     
     public static WebElement closevendor(WebDriver driver)
     {
    	 closevendor=driver.findElement(By.xpath("//*[@id='btnCancel']"));
    	 return closevendor;
     }
     public static WebElement searchvendor(WebDriver driver) // search the vendor name
     {
    	 vendorsearch=driver.findElement(By.xpath("//*[@class='form-control']"));
    	 return vendorsearch;
     }
     public static WebElement vendoredit(WebDriver driver) //edit vendor
     {
    	 vendoredit=driver.findElement(By.id("ContentPlaceHolder1_grdVendor_LinkButton1_0"));
    	 return vendoredit;
     }
    /* public static WebElement vnameedit(WebDriver driver)
     {
    	 vname=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdVendor\"]/tbody/tr[1]/th[3]/a"));
    	 return vname;
     }*/
     public static WebElement vendorfind(WebDriver driver)
     {
    	 vendor_name=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdVendor']/tbody/tr[7]/td[3]/div/span"));
    	 return vendor_name;
     }
     public static WebElement vendorcontactperson(WebDriver driver)
     {
    	 vendoredit=driver.findElement(By.xpath("//*[@id='tbxContactPerson']"));
    	 return vendoredit;
     }
     public static WebElement vendoremail(WebDriver driver)
     {
    	 vendoredit=driver.findElement(By.xpath("//*[@id='tbxEmail']"));
    	 return vendoredit;
     }
     public static WebElement vendorcontact(WebDriver driver)
     {
    	 vendoredit=driver.findElement(By.xpath("//*[@id='tbxContactNo']"));
    	 return vendoredit;
     }
     public static WebElement vendorupdate(WebDriver driver)
     {
    	 vendoredit=driver.findElement(By.xpath("//*[@id='btnSave']"));
    	 return vendoredit;
     }
     public static WebElement vendorclose(WebDriver driver)
     {
    	 vendoredit=driver.findElement(By.xpath("//*[@id='btnCancel']"));
    	 return vendoredit;
     }
     public static WebElement vendordelete(WebDriver driver)
     {
    	 vendoredit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdVendor_LinkButton2_5']"));
    	 return vendoredit;
     }
       public static WebElement contracttypemaster(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[4]/a"));
    	   return contracttype;
       }
       public static WebElement addcontracttype(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']"));
    	   return contracttype;
    	   
       }
       public static WebElement contracttypename(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='tbxContType']"));
    	   return contracttype;
       }
       public static WebElement contracttypesave(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='btnSave']"));
    	   return contracttype;
       }
       public static WebElement contracttypeclose(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.id("btnCancel"));
    	   return contracttype;
    	  
       }
       
       public static WebElement contracttypesearch(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.name("ctl00$ContentPlaceHolder1$tbxFilter"));
    	   return contracttype;
       }
       public static WebElement pgdropdown(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
    	   return contracttype;
       }
       public static WebElement selectpage(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']/div/ul/li[2]"));
    	   return contracttype;
       }
       public static WebElement typeedit(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContractType_lnkEditContractType_3']"));
    	   return contracttype;
       }
       public static WebElement ctypefind(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContractType_lblUploadedBy_3']"));
    	   return contracttype;
       }
       public static WebElement ctypeupdate(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='tbxContType']"));
    	   return contracttype;
       }
       public static WebElement ctypesave(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='btnSave']"));
    	   return contracttype;
       }
       public static WebElement ctypeclose(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='btnCancel']"));
    	   return contracttype;
       }
       public static WebElement ctypedelete(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContractType_lnkDeleteContractType_3']"));
    	   return contracttype;
       }
       public static WebElement vsearchbox(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.id("ContentPlaceHolder1_tbxtypeTofilter"));
    	   return contracttype;
       }
       public static WebElement ctypesearch(WebDriver driver)
       {
    	   contracttype=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	   return contracttype;
       }
       public static WebElement subcontracttype(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContractType_lblSubConttype_0']")); //click on subtype link
    	  return subcontracttype;
       }
       public static WebElement addsubcontracttype(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.id("ContentPlaceHolder1_btnAddSubType")); // click on add new subtype
    	   return subcontracttype;
       }
       public static WebElement subcontracttypetext(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.id("tbxSubContType")); // enter subcontract type
    	   return subcontracttype;
       }
       public static WebElement subcontracttypesave(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.name("btnSave")); // save subcontract type
    	   return subcontracttype;
       }
       public static WebElement subcontracttypeclose(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.name("btnCancel")); // close subcontract type
    	   return subcontracttype;
       }
       public static WebElement subcontracttypeedit(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.id("ContentPlaceHolder1_grdSubConType_LinkButton1_0")); // edit subcontract type
    	   return subcontracttype;
       }
       public static WebElement subcontracttypedelete(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.id("ContentPlaceHolder1_grdSubConType_LinkButton2_0")); // delete subcontract type
    	   return subcontracttype;
       }
       public static WebElement subcontracttypeback(WebDriver driver)
       {
    	   subcontracttype=driver.findElement(By.id("ContentPlaceHolder1_lnkBackToContractType")); // delete subcontract type
    	   return subcontracttype;
       }
       public static WebElement doctypeclick(WebDriver driver)
       {
    	   doctype=driver.findElement(By.xpath("//*[@id=\"Mastersubmenu\"]/li[5]/a"));
    	   return doctype;
       }
       public static WebElement doctypeadd(WebDriver driver)
       {
    	   doctype=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	   return doctype;
       }
       public static WebElement doctypetext(WebDriver driver)
       {
    	   doctype=driver.findElement(By.name("tbxDocumentType"));
    	   return doctype;
       }
       public static WebElement doctypesave(WebDriver driver)
       {
    	   doctype=driver.findElement(By.name("btnSave"));
    	   return doctype;
       }
       public static WebElement doctypeclose(WebDriver driver)
       {
    	   doctype=driver.findElement(By.name("btnCancel"));
    	   return doctype;
       }
       public static WebElement doctypesearch(WebDriver driver)
       {
    	   doctype=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	   return doctype;
       }
       public static WebElement doctypedit(WebDriver driver)
       {
    	   doctype=driver.findElement(By.id("ContentPlaceHolder1_grdContDoctType_lnkEditContractDocType_0"));
    	   return doctype;
       }
       public static WebElement doctypedelete(WebDriver driver)
       {
    	   doctype=driver.findElement(By.id("ContentPlaceHolder1_grdContDoctType_lnkDeleteContractDocType_0"));
    	   return doctype;
       }

       public static WebElement deptclick(WebDriver driver)
       {
    	   dept=driver.findElement(By.xpath("//*[@id=\"Mastersubmenu\"]/li[6]/a"));
    	   return dept;
       }
       public static WebElement deptadd(WebDriver driver)
       {
    	   dept=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	   return dept;
       }
       public static WebElement deptname(WebDriver driver)
       {
    	   dept=driver.findElement(By.id("txtFName"));
    	   return dept;
       }
       public static WebElement deptsave(WebDriver driver)
       {
    	   dept=driver.findElement(By.xpath("//*[@id='btnSave']"));
    	   return dept;
       }

       public static WebElement deptclose(WebDriver driver)
       {
    	   dept=driver.findElement(By.xpath("//*[@id='btnCloseDeptPopUp']"));
    	   return dept;
       }
       public static WebElement deptpopupclose(WebDriver driver)
       {
    	   dept=driver.findElement(By.xpath("//*[@id='AddDocumentTypePopUp']/div/div/div[1]/button"));
    	   return dept;
       }
       public static WebElement customclick(WebDriver driver)
       {
    	   customfield=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[7]/a"));
    	   return customfield;
       }
       public static WebElement customadd(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("ContentPlaceHolder1_btnAddCustomFields"));
    	   return customfield;
       }
       public static WebElement customdropdown(WebDriver driver)
       {
    	   customfield=driver.findElement(By.xpath("//*[@id='upContCustomField']/div/div[2]/div/span[1]/div/button"));
    	   return customfield;
       }
       public static WebElement customdropdowncheck(WebDriver driver)
       {
    	   customfield=driver.findElement(By.xpath("//*[@id='upContCustomField']/div/div[2]/div/span[1]/div/ul/li[2]/a/label/input"));
    	   return customfield;
       }
       public static WebElement customdropdownfield(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("tbxLableName"));
    	   return customfield;
       }
       public static WebElement customdfieldsave(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("btnSave"));
    	   return customfield;
       }
       public static WebElement customdfieldclose(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("btnCancel"));
    	   return customfield;
       }
       public static WebElement customfieldnamedropdown(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("ContentPlaceHolder1_ddlType_chosen"));
    	   return customfield;
       }
       public static WebElement customdfieldsearch(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	   return customfield;
       }
       public static WebElement customfieldselect(WebDriver driver)
       {
    	   customfield=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType_chosen']/a/span"));
    	   return customfield;
       }
       public static WebElement customfieldedit(WebDriver driver)
       {
    	   customfield=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContCustomField_lnkEditContractDocType_0']"));
    	   return customfield;
       }
       public static WebElement customfieldnameedit(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("tbxLableName"));
    	   return customfield;
       }
       public static WebElement customfieldupdate(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("btnSave"));
    	   return customfield;
       }
       public static WebElement customfieldclose(WebDriver driver)
       {
    	   customfield=driver.findElement(By.id("btnCancel"));
    	   return customfield;
       }
       public static WebElement customfielddelete(WebDriver driver)
       {
    	   customfield=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContCustomField_lnkDeleteContractDocType_0']"));
    	   return customfield;
       }
       public static WebElement deptmappingclick(WebDriver driver)
       {
    	   deptmapping=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[8]/a"));
    	   return deptmapping;
       }
       public static WebElement deptmappingaddnew(WebDriver driver)
       {
    	   deptmapping=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	   return deptmapping;
       }
       public static WebElement deptmappinguser(WebDriver driver)
       {
    	   deptmapping=driver.findElement(By.xpath("//*[@id='ddlUser_chosen']"));
    	   return deptmapping;
       }
       public static WebElement deptmappingusersearch(WebDriver driver)
       {
    	   deptmapping=driver.findElement(By.xpath("//*[@id='ddlUser_chosen']/div/div/input"));
    	   return deptmapping;
       }
       public static WebElement deptmappinguserdeptcheck(WebDriver driver)
       {
    	   deptmapping=driver.findElement(By.xpath("//*[@id='grddept_chkHeader']"));
    	   return deptmapping;
       }
       public static WebElement deptmappingusersave(WebDriver driver)
       {
    	   deptmapping=driver.findElement(By.id("btnSave"));
    	   return deptmapping;
       }
       public static WebElement deptmappinguserclose(WebDriver driver)
       {
    	   deptmapping=driver.findElement(By.id("btnCancel"));
    	   return deptmapping;
       }
       public static WebElement deptsearch(WebDriver driver)
       {
    	   dept=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	   return dept;
       }
       public static WebElement deptsearchapply(WebDriver driver)
       {
    	   dept=driver.findElement(By.name("ctl00$ContentPlaceHolder1$Button2"));
    	   return dept;
       }
       public static WebElement deptedit(WebDriver driver)
       {
    	   dept=driver.findElement(By.id("ContentPlaceHolder1_grdContDoctType_lnkEditContractDocType_0"));
    	   return dept;
       }

       public static WebElement deptupdate(WebDriver driver)
       {
    	   dept=driver.findElement(By.name("txtFName"));
    	   return dept;
       }
       
       public static WebElement deptsavebtn(WebDriver driver)
       {
    	   dept=driver.findElement(By.id("btnSave"));
    	   return dept;
       }

       public static WebElement deptclosebtn(WebDriver driver)
       {
    	   dept=driver.findElement(By.id("btnCloseDeptPopUp"));
    	   return dept;
       }

       public static WebElement templatemenu(WebDriver driver)
       {
    	   template=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[9]/a"));
    	   return template;
       }
      
       public static WebElement addsection(WebDriver driver)
       {
    	   section=driver.findElement(By.id("ContentPlaceHolder1_btnSection"));
    	   return section;
    	   
       }

       public static WebElement addsectionclick(WebDriver driver)
       {
    	   section=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	   return section;
    	   
       }
     
       public static WebElement sectionheader(WebDriver driver)
       {
    	   section=driver.findElement(By.id("tbxHeader"));
    	   return section;
    	   
       }
         
       public static WebElement sectiondept(WebDriver driver)
       {
    	   section= driver.findElement(By.xpath("//*[@id=\"ddlDeptPage_chosen\"]\r\n"+ ""));
    	   return section;
       }
       
       public static List<WebElement> chooseDropDownOption(WebDriver driver)
   	{
   		
   		elementsList = driver.findElements(By.xpath("//*[@id='ddlDeptPage_chosen']/div/ul/li"));
   		return elementsList;
   	}
       
       public static WebElement headervisibility(WebDriver driver)
       {
    	   section= driver.findElement(By.xpath("//*[@id=\"ddlVisibilitySectionHeader\"]"));
    	   return section;
       }
       
       public static WebElement showheader(WebDriver driver)
       {
    	   section= driver.findElement(By.xpath("//*[@id=\"ddlVisibilitySectionHeader\"]/option[1]"));
    	   return section;
       }
       
       public static WebElement sectioncontent(WebDriver driver)
       {
    	   section= driver.findElement(By.xpath("/html/body"));
    	   return section;
       }

       public static WebElement sectionsave(WebDriver driver)
       {
    	   section= driver.findElement(By.xpath("//*[@id='btnSave']"));
    	   return section;
       }

       public static WebElement sectionclose(WebDriver driver)
       {
    	   section= driver.findElement(By.id("btnCancel"));
    	   return section;
       }
       
       public static WebElement sectionupdate(WebDriver driver)
       {
    	   section= driver.findElement(By.id("ContentPlaceHolder1_grdTemplateSections_lnkEditSection_0"));
    	   return section;
       }

       public static WebElement sectiondelete(WebDriver driver)
       {
    	   section= driver.findElement(By.id("ContentPlaceHolder1_grdTemplateSections_lnkDeleteSection_8"));
    	   return section;
       }
       
       public static WebElement templateadd(WebDriver driver)
       {
    	   template= driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	   return template;
       }
  
       public static WebElement templatename(WebDriver driver)
       {
    	   template= driver.findElement(By.id("tbxTemplateName"));
    	   return template;
       }
        
       public static WebElement templatedept(WebDriver driver)
       {
    	   section= driver.findElement(By.xpath("//*[@id='upAddEditTemplate']/div[3]/div[1]/div[2]/span[1]/div/button"));
    	   return section;
       }
  
       public static WebElement templatedeptcheckbox(WebDriver driver)
       {
    	   section= driver.findElement(By.xpath("//*[@id='upAddEditTemplate']/div[3]/div[1]/div[2]/span[1]/div/ul/li[6]/a/label/input"));
    	   return section;
       }
  
       public static WebElement approverlevel(WebDriver driver)
       {
    	   template= driver.findElement(By.id("tbxApprover"));
    	   return template;
       }

       public static WebElement sectionorder(WebDriver driver)
       {
    	   template= driver.findElement(By.id("grdTemplateSection_txtOrder_0"));
    	   return template;
       }
       
       public static WebElement sectionordercheckbox(WebDriver driver)
       {
    	   template= driver.findElement(By.id("grdTemplateSection_chkRow_0"));
    	   return template;
       }
       
       public static WebElement sectiondeptdropdown(WebDriver driver)
       {
    	   template= driver.findElement(By.id("grdTemplateSection_ddldpetsection_0_chosen"));
    	   return template;
       }

       public static WebElement sectiondeptdropdownoption(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='grdTemplateSection_ddldpetsection_0_chosen']/div/ul/li[4]"));
    	   return template;
       }
       
       public static WebElement templatereviewerdropdown(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='grdTemplateSection_ddlReviewer_0_chosen']"));
    	   return template;
       }
       
       public static WebElement templatereviewersearch(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='grdTemplateSection_ddlReviewer_0_chosen']/div/div/input"));
    	   return template;
       }
       
       public static WebElement temaplatereviewerselect(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='grdTemplateSection_ddlReviewer_0_chosen']/div/ul/li[17]"));
    	   return template;
       }

       
       public static WebElement templatesave(WebDriver driver)
       {
    	   template= driver.findElement(By.id("btnSaveSections"));
    	   return template;
       }

       public static WebElement templateedit(WebDriver driver)
       {
    	   template= driver.findElement(By.id("ContentPlaceHolder1_grdContractTemplates_lnkEditTemplate_0"));
    	   return template;
       }
      
       public static WebElement templatetwo(WebDriver driver)
       {
    	   template= driver.findElement(By.id("lnkBtnImportSection"));
    	   return template;
       }
       
       public static WebElement templatestatusbox(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='rptComplianceVersionView_lblDocumentVersionView_0']"));
    	   return template;
       }
       
       public static WebElement templatereviewer(WebDriver driver)
       {
    	   template= driver.findElement(By.id("ddlUser"));
    	   return template;
       }
       
       public static WebElement templatereviewerselect(WebDriver driver)
       {
    	   template= driver.findElement(By.id("ddlUser"));
    	   return template;
       }
       
       public static WebElement templatereviewersubmit(WebDriver driver)
       {
    	   template= driver.findElement(By.id("btnSubmit"));
    	   return template;
       }
       
       public static WebElement templatesearch(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
    	   return template;
       }

       public static WebElement templatepopupclose(WebDriver driver)
       {
    	   template= driver.findElement(By.className("close"));
    	   return template;
       }

       public static WebElement templateexport(WebDriver driver)
       {
    	   template= driver.findElement(By.name("BtnExportDocument"));
    	   return template;
       }
       public static WebElement pageauthorisationmenuclick(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[10]/a"));
    	   return template;
       }
       public static WebElement pageauthorisationuserdropdown(WebDriver driver)
       {
    	   template= driver.findElement(By.id("ContentPlaceHolder1_ddlUserType_chosen"));
    	   return template;
       }
       
       public static WebElement pageauthorisationuserselect(WebDriver driver)
       {
    	   template= driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUserType_chosen']/div/ul/li[5]"));
    	   return template;
       }
       
       public static WebElement pageauthorisationuserselectcheckbox(WebDriver driver)
       {
    	   template= driver.findElement(By.id("ContentPlaceHolder1_grdPageAuthorization_chkADD_2"));
    	   return template;
       }
       
       public static WebElement pageauthorisationsave(WebDriver driver)
       {
    	   template= driver.findElement(By.id("ContentPlaceHolder1_btnSavePageAutorization"));
    	   return template;
       }
       
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

       public static WebElement contracttypedropdown(WebDriver driver)
       {
    	   contract=driver.findElement(By.id("ddlContractType_chosen"));
    	   return contract;
       }

       public static List<WebElement> contracttypeDropDownOption(WebDriver driver)
      	{
      		
      		elementsList = driver.findElements(By.xpath("//*[@id='ddlDeptPage_chosen']/div/ul/li"));
      		return elementsList;
      	}

       public static WebElement deletevendor(WebDriver driver)
   	{
   		vendor=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_vsVendorPage']/ul"));
   		return vendor;
   	}

      public static WebElement vendorsuccessmsg(WebDriver driver)
      {
    	  vendor=driver.findElement(By.xpath("//div[@class='col-md-12 alert alert-block alert-success fade in']"));
    	  return vendor;
      }
      
      public static WebElement vendorfailmsg(WebDriver driver)
      {
    	  vendor=driver.findElement(By.xpath("//*[@id='vsAddVendor']/ul/li"));
    	  return vendor;
      }
      
      public static WebElement contracttypesuccessmsg(WebDriver driver)
      {
    	  contracttype=driver.findElement(By.xpath("//*[@id='successmsgaCType']"));
    	  return contracttype;
      }
      
      public static WebElement contracttypefailmsg(WebDriver driver)
      {
    	  contracttype=driver.findElement(By.xpath("//*[@id='vsAddEditContractType']/ul/li"));
    	  return contracttype;
      }
      
      public static WebElement contracttypeedit(WebDriver driver)
      {
    	  contracttype=driver.findElement(By.id("ContentPlaceHolder1_grdContractType_lnkEditContractType_0"));
    	  return contracttype;
      }
      
      public static WebElement contracttypedelete(WebDriver driver)
      {
    	  contracttype=driver.findElement(By.id("ContentPlaceHolder1_grdContractType_lnkDeleteContractType_0"));
    	  return contracttype;
      }
      
      public static WebElement subcontracttypesuccessmsg(WebDriver driver)
      {
    	  subcontracttype=driver.findElement(By.id("divsuccessmsgaCSubType"));
    	  return subcontracttype;
      }

      public static WebElement subcontracttypefailmsg(WebDriver driver)
      {
    	  subcontracttype=driver.findElement(By.xpath("//*[@id='vsAddEditSubType']/ul/li"));
    	  return subcontracttype;
      }
      
      public static WebElement subcontracttypeupdatesuccessmsg(WebDriver driver)
      {
    	  subcontracttype=driver.findElement(By.id("successmsgaCSubType"));
    	  return subcontracttype;
      }
      
      public static WebElement subcontracttypeupdatefailmsg(WebDriver driver)
      {
    	  subcontracttype=driver.findElement(By.xpath("//*[@id='vsAddEditSubType']/ul/li"));
    	  return subcontracttype;
      }
      
      public static WebElement subcontracttypeupdateedit(WebDriver driver)
      {
    	  subcontracttype=driver.findElement(By.id("ContentPlaceHolder1_grdSubConType_LinkButton1_0"));
    	  return subcontracttype;
      }
      
      public static WebElement contractdoctypesuccessmsg(WebDriver driver)
      {
    	  doctype=driver.findElement(By.id("successmsgaCDoctype"));
    	  return doctype;
      }

      public static WebElement contractdoctypefailmsg(WebDriver driver)
      {
    	  doctype=driver.findElement(By.xpath("//*[@id='vsAddDocType']/ul/li"));
    	  return doctype;
      }

      public static WebElement contractdoctypeupdatesuccessmsg(WebDriver driver)
      {
    	  doctype=driver.findElement(By.id("successmsgaCDoctype"));
    	  return doctype;
      }
      
      public static WebElement contractdeptadd(WebDriver driver)
      {
    	  dept=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
    	  return dept;
      }
      
      public static WebElement contractdeptname(WebDriver driver)
      {
    	  dept=driver.findElement(By.id("txtFName"));
    	  return dept;
      }
      
      public static WebElement contractdeptsave(WebDriver driver)
      {
    	  dept=driver.findElement(By.id("btnSave"));
    	  return dept;
      }
      
      public static WebElement contractdeptsuccessmsg(WebDriver driver)
      {
    	  dept=driver.findElement(By.xpath("//*[@id='vsAddEditDept']/ul/li"));
    	  return dept;
      }
      
      public static WebElement contractdeptfailmsg(WebDriver driver)
      {
    	  dept=driver.findElement(By.xpath("//*[@id='vsAddEditDept']/ul/li"));
    	  return dept;
      }
      
      public static WebElement contractdeptclose(WebDriver driver)
      {
    	  dept=driver.findElement(By.id("btnCloseDeptPopUp"));
    	  return dept;
      }
      
      public static WebElement contractdeptsearch(WebDriver driver)
      {
    	  dept=driver.findElement(By.id("ContentPlaceHolder1_tbxFilter"));
    	  return dept;
      }
      
      public static WebElement contractdeptsearchapply(WebDriver driver)
      {
    	  dept=driver.findElement(By.id("ContentPlaceHolder1_Button2"));
    	  return dept;
      }
      
      public static WebElement contractdeptdelete(WebDriver driver)
      {
    	  dept=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdContDoctType_lnkDeleteContractDocType_0']"));
    	  return dept;
      }

      public static WebElement contractcustomfieldfailmsg(WebDriver driver)
      {
    	  customfield=driver.findElement(By.xpath("//*[@id='vsCustomField']/ul/li"));
    	  return customfield;
      }
      
      public static WebElement contractcustomfieldsuccessmsg(WebDriver driver)
      {
    	  customfield=driver.findElement(By.xpath("//*[@id='successmsgaCcustomtype']"));
    	  return customfield;
      }

      public static WebElement contractcustomfieldclose(WebDriver driver)
      {
    	  customfield=driver.findElement(By.id("btnCancel"));
    	  return customfield;
      }
      
      public static WebElement contractcustomfielddelete(WebDriver driver)
      {
    	  customfield=driver.findElement(By.xpath("successmsgaCcustomtype"));
    	  return customfield;
      }

      public static WebElement contractdeptmapsuccessmsg(WebDriver driver)
      {
    	  deptmapping=driver.findElement(By.id("successmsgaCDoctype"));
    	  return deptmapping;
      }

      public static WebElement contractdeptmapdelete(WebDriver driver)
      {
    	  deptmapping=driver.findElement(By.id("ContentPlaceHolder1_grdContDoctType_lnkDeleteContractDocType_0"));
    	  return deptmapping;
      }

      public static WebElement usertab(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[2]/a"));
    	  return user;
      }

      public static WebElement adduser(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnAddUser\"]"));;
    	  return user;
      }
      
      public static WebElement fname(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxFirstName\"]"));
    	  return user;
      }
      
      public static WebElement lname(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxLastName\"]"));
    	  return user;
      }
      
      public static WebElement desg(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxDesignation\"]"));
    	  return user;
      }
      
      public static WebElement emailid(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxEmail\"]"));
    	  return user;
      }
      
      public static WebElement contactno(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxEmail\"]"));
    	  return user;
      }
      
      public static WebElement address(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddress']"));
    	  return user;
      }
      
      public static WebElement loc(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxBranch']"));
    	  return user;
      }

      public static WebElement ld(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tvBranchest1\"]"));
    	  return user;
      }
      
      public static WebElement save(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnSave\"]"));
    	  return user;
      }
      
      public static WebElement close(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnCancel\"]"));
    	  return user;
      }

      public static WebElement edituserclick(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdUser_lbtnEdit_1\"]/img"));
    	  return user;
      }
      
      public static WebElement updateuser(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
    	  return user;
      }
      
      public static WebElement closepopup(WebDriver driver)
      {
    	  user=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnCancel\"]"));
    	  return user;
      }

      
     
      




}




