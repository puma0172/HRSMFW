package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class LoginDetailsElements extends CommonMethods {

	
	@FindBy(id="chkLogin")
	public WebElement loginChk;
	
	@FindBy(id="user_name")
	public WebElement uName;
	
	
	@FindBy(id="user_password")
	public WebElement pword;
	
	@FindBy(id="re_password")
	public WebElement pwordCon;
	
	

	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	public LoginDetailsElements () {
		PageFactory.initElements(BaseClass.driver, this);
	}
		
	public void loginDetails(String userName, String passWord, String passwrodConf) {
		jsClick(loginChk);
		sendText(uName, userName);
		sendText(pword, passWord);
		sendText(pwordCon, passwrodConf);
		jsClick(saveBtn);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
