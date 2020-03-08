package com.hrms.testbase;

import com.hrms.pages.AddDependentElements;
import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitiliazer extends BaseClass {
	
/**
 * PAGE INITIALIZER - COMMON METHODS - BASECLASS
 * 
 * 
 */

	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements pdetails;
	protected static AddDependentElements dependent;
	protected static EmployeeListPageElements elist;
	
	public static void initializeAllPage() {

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
		elist= new EmployeeListPageElements();		
		dependent= new AddDependentElements();
		
		
		
	}
}
