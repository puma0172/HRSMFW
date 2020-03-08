package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddDependentSteps extends CommonMethods {

	
	@Given("I navigated to Employee List Page")
	public void i_navigated_to_Employee_List_Page() {
	   
		dashboard.navigateToEmployeeList();
		
		
		
	}

	@Then("I search for Employee ID {string} and click on search")
	public void i_search_for_Employee_ID_and_click_on_search(String string) {
	   
		sendText(elist.empId, "9876");
		click(elist.searchBtn);
		
		
		
	}

	@Then("I select the Employee")
	public void i_select_the_Employee() {
	   
		click(elist.searchResult);
		
		
		
	}
	
	
	
	
	@Then("I click on Dependents")
	public void i_click_on_Dependents() {
	   
		click(dependent.dependent);
		
		
		
	}
     
	@Then("I click on add button")
	public void i_click_on_add_button() throws InterruptedException {
	 Thread.sleep(2000);   
		click(dependent.addDependent);
		
		
	}

//	@Then("I enter dependent information")
//	public void i_enter_dependent_information() {
//	   sendText(dependent.depName, "Sande");
//	   
//	   selectDdValue(dependent.depType, "Child"); 
//		
//		sendText(dependent.depDOB, "2015-04-05");
		
		
//	}

	@Then("I enter {string},{string},{string}")
	public void i_enter(String string, String string2, String string3) {
	    
		sendText(dependent.depName,string);
		
		if(string2.equals("Child")) {
		selectDdValue(dependent.depType, "Child");
		sendText(dependent.depDOB, string3);
		
		}else {
			selectDdValue(dependent.depType,"Other");
			sendText(dependent.depRship, "Spouse");	
			sendText(dependent.depDOB, string3);	
		}	
	
	}
	
	@Then("I click save button")
	public void i_click_save_button() {
	    
		click(dependent.depSaveBtn);
	
	}

	@Then("I see Dependent added")
	public void i_see_Dependent_added() {
	    
		String expected="Jon  Merry Jennifer";
		
		  for(int i=1; i<dependent.addedDep.size(); i++) {
				
				String actual=dependent.addedDep.get(i-1).getText();
		         System.out.println(actual);
	            
		         if(actual.contains(expected)){
	            
		        	 Assert.assertEquals(expected, actual);;
	            }
		         
		} 
		
	}
	

}
