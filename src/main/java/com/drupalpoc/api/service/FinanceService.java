package com.drupalpoc.api.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drupalpoc.api.model.AccountDetails;
import com.drupalpoc.api.model.AccountSummary;
import com.drupalpoc.api.model.Courses;
import com.drupalpoc.api.model.FinancialAid;


@Service("financeService")
public class FinanceService {
	

	public FinancialAid getFinancialAid() {
		FinancialAid finance = new FinancialAid();
		
		finance.setInformation("Finance Aid is approved");
		
		
		List<String> quickLinks = new ArrayList<>();
		quickLinks.add("Financial Aid Application");
		quickLinks.add("Application status");
		quickLinks.add("List of Sponsors");
		quickLinks.add("Finance FAQs");
		finance.setQuickLinks(quickLinks);
		
		List<String> notifications = new ArrayList<>();
		notifications.add("Financial Aid waiting for approval");
		notifications.add("Acknowledge sponsor's clarifications");
		finance.setNotifications(notifications);
		
		return finance;
	}

	
	public AccountSummary getAccountSummary() {
		AccountSummary account = new AccountSummary();
		
		account.setDueAmount(0.0);
		
		List<String> quickLinks = new ArrayList<>();
		quickLinks.add("Account Activity");
		quickLinks.add("View Charges Due");
		quickLinks.add("Payment History");
		quickLinks.add("Create Account Statement");
		quickLinks.add("Direct Deposit");
		quickLinks.add("Tax Document");
		account.setQuickLinks(quickLinks);
		
		AccountDetails accountDetails = new AccountDetails(); 
		accountDetails.setAidAmount(0.0);
		accountDetails.setTaxAmount(0.0);
		accountDetails.setTotalAmount(0.0);
		account.setAccountDetails(accountDetails);
		
		return account;
	}

	public Courses getStudentNewCourses() {
		Courses coursenames = new Courses();
		List<String> courselist = new ArrayList<>();
		courselist.add("Review your readiness at Capella");
		courselist.add("Join discussion and groups");
		courselist.add("Edit your Campus profile");
		courselist.add("Download Capella mobile app");
		coursenames.setCourses(courselist);
		return coursenames;
	}

	
	public Courses getStudentGraduateCourses() {
		Courses coursenames = new Courses();
		List<String> courselist = new ArrayList<>();
		courselist.add("Graduate & Commencement information");
		courselist.add("Alumni Association benefits");
		courselist.add("Career center");
		coursenames.setCourses(courselist);
		return coursenames;
	}

}
