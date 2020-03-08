package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;


public class EmployeeListPageElements extends CommonMethods {

	@FindBy(id = "empsearch_id")
	public WebElement empId;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr")
	public WebElement resultRow;
	
	@FindBy(linkText="9876")
	public WebElement searchResult;
	
	
	
	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public static void clickOnId(WebElement row) {
		if(!row.getText().equals("No Records Found")) {
			WebElement id = row.findElement(By.xpath("./td[2]"));
			waitForClickability(id);
			jsClick(id);
		}
		else {
			System.out.println("Id could not found.");
		}
	} 
	
}
