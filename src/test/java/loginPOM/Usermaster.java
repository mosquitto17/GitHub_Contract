package loginPOM;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Usermaster 
{
	
	public static WebDriver driver = null;
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;	
	 @BeforeTest
	 public void browserstart() throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver","F:/Eclipse/chromedriver.exe"); 
		  
		  driver=new ChromeDriver();                                    //Created new Chrome driver instance.
		  
		  driver.manage().window().maximize();                                     //Set window size to maximum.
		  
		  driver.get("https://test.avantisregtec.in/pricontract/logout.aspx");     //Set the URL of WebApplication.
		  
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
		      
		  WebElement validate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		  validate.click();                                        //Clicking on Validate button.
		  
		  WebElement contractbox=driver.findElement(By.xpath("//*[@id=\"dvbtnContract\"]/div[1]/img"));
		  contractbox.click();
		
	 }
	//@Test (priority = 1)
	public void createuser() throws InterruptedException, IOException {
		
		  System.setProperty("webdriver.chrome.driver","F:/Eclipse/chromedriver.exe"); 
		  
		  WebDriver driver=new ChromeDriver();                                    //Created new Chrome driver instance.
		  
		  driver.manage().window().maximize();                                     //Set window size to maximum.
		  
		  driver.get("https://test.avantisregtec.in/pricontract/logout.aspx");     //Set the URL of WebApplication.
		  
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
		      
		  WebElement validate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		  validate.click();                                        //Clicking on Validate button.
		  
		  WebElement contractbox=driver.findElement(By.xpath("//*[@id=\"dvbtnContract\"]/div[1]/img"));
		  contractbox.click();
		  
		  WebElement mastermenu=driver.findElement(By.xpath("//*[@id='leftmastermenu']"));
		  mastermenu.click();
		  WebElement usertab=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[2]/a"));
		  usertab.click();
		  WebElement adduser=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnAddUser\"]"));
		  adduser.click();
		  
		  FileInputStream userfile = new FileInputStream("F:\\Contract\\ContractManagement\\TestData\\UserDetails.aspx");
		  XSSFWorkbook workbook=new XSSFWorkbook(userfile);
		  sheet=workbook.getSheetAt(0);
		  Row row0=sheet.getRow(0);
		  Cell c1=row0.getCell(1);
		  String firstname=c1.getStringCellValue();
		  WebElement fname=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxFirstName\"]"));
		  fname.sendKeys(firstname);
		  Row row1=sheet.getRow(1);
		  Cell c2=row1.getCell(1);
		  String lastname=c2.getStringCellValue();
		  WebElement lname=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxLastName\"]"));
		  lname.sendKeys(lastname);
		  Row row2=sheet.getRow(2);
		  Cell c3=row2.getCell(1);
		  String designation=c3.getStringCellValue();
		  WebElement desg=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxDesignation\"]"));
		  desg.sendKeys(designation);
		  Row row3=sheet.getRow(3);
		  Cell c4=row3.getCell(1);
		  String email=c4.getStringCellValue();
		  WebElement emailid=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxEmail\"]"));
		  emailid.sendKeys(email);
		  Row row4=sheet.getRow(4);
		  Cell c5=row4.getCell(1);
          //int contactno=(int)c5.getNumericCellValue();
		  String contact=c5.getStringCellValue();
          //int int0=Integer.parseInt(contactno);
		  WebElement contactnumber=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbxContactNo\"]"));
		  contactnumber.sendKeys(contact);
		  Row row5=sheet.getRow(5);
		  Cell c6=row5.getCell(1);
		  String address=c6.getStringCellValue();
		  WebElement add=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddress']"));
		  add.sendKeys(address);
		  //WebElement dept=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlDepartment\"]"));
		  //dept.click();
		  Select s=new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlDepartment\"]")));
		  s.selectByIndex(3);
		  Select r=new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlContractRole\"]")));
		  r.selectByVisibleText("Non - Admin");
		  Thread.sleep(5000);
		  WebElement loc=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxBranch']"));
		  loc.click();
		  Thread.sleep(4000);
		  WebElement ld=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tvBranchest1\"]"));
		  ld.click();
		  Thread.sleep(3000);
		  WebElement save=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnSave\"]"));
		  save.click();
		  Thread.sleep(3000);
		  WebElement close=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnCancel\"]"));
		  close.click();
		  
}
	
	    //@Test(priority = 2)
	    public void edituser() throws InterruptedException 
	    {
	    	WebElement mastermenu=driver.findElement(By.xpath("//*[@id='leftmastermenu']"));
			  mastermenu.click();
			  WebElement usertab=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[2]/a"));
			  usertab.click();
	             WebElement search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
	             search.sendKeys("Chetan",Keys.ENTER);
	             WebElement edituser=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdUser_lbtnEdit_1\"]/img"));
	             edituser.click();
	             //driver.switchTo().frame(driver.findElement(By.id("ContentPlaceHolder1_upUsersPopup")));
	             Thread.sleep(5000);
	             WebElement desg=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxDesignation']"));
	             desg.clear();
	             desg.sendKeys("research department");
	             WebElement cno=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxContactNo']"));
	             Thread.sleep(3000);
	             cno.clear();
	             Thread.sleep(3000);
	             cno.sendKeys("8888824733");
	             //WebElement emailid=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxEmail']"));
	             //Thread.sleep(3000);
	             //emailid.clear();
	             //Thread.sleep(3000);
	             //emailid.sendKeys("twinkle.khanna234@bita.com");
	             Thread.sleep(3000);
	             WebElement update=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	             update.click();
	             Thread.sleep(3000);
	             WebElement closepopup=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnCancel\"]"));
	             closepopup.click();
	             
	    }
	    
	     @Test (priority = 3)
	     public void deleteuser() throws InterruptedException
	     {
	    	 WebElement mastermenu=driver.findElement(By.xpath("//*[@id='leftmastermenu']"));
			  mastermenu.click();
			  WebElement usertab=driver.findElement(By.xpath("//*[@id='Mastersubmenu']/li[2]/a"));
			  usertab.click();
	    	 WebElement search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
             search.sendKeys("Chetan",Keys.ENTER);
             Thread.sleep(3000);
             WebElement delete=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdUser_lbtnDelete_1\"]/img"));
              delete.click();
             Thread.sleep(3000);
             driver.switchTo().alert().accept();
             Thread.sleep(2000);
             WebElement searchf=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
             searchf.clear();
             Thread.sleep(2000);
             search.sendKeys(Keys.ENTER);
             
	     }
	    
}

