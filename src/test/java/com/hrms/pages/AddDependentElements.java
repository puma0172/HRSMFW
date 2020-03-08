package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;


public class AddDependentElements  extends CommonMethods{

	@FindBy(xpath="//a[contains(@href, 'viewDependents/')]")
	public WebElement dependent;
	
	@FindBy(id="btnAddDependent")
	public WebElement addDependent;
	
	@FindBy(id="dependent_name")
	public WebElement depName ;
	
	
	@FindBy(id="dependent_relationshipType")
	public WebElement depType;
	
	@FindBy(id="dependent_dateOfBirth")
	public WebElement depDOB;
	
	
	@FindBy(id="btnSaveDependent")
	public WebElement depSaveBtn;
	
	@FindBy(xpath="//td[@class='dependentName']/a")
	public List <WebElement> addedDep;
	
	@FindBy(id="delDependentBtn")
	public WebElement depDelBtn;
	
	@FindBy(id="dependent_relationship")
	public WebElement depRship;
	
	public AddDependentElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
}

}