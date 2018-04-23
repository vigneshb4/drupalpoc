package com.drupalpoc.api.model;

import java.util.List;

public class AccountSummary {

	private Double dueAmount;
	private List<String> quickLinks;
	private AccountDetails accountDetails;
	public Double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(Double dueAmount) {
		this.dueAmount = dueAmount;
	}
	public List<String> getQuickLinks() {
		return quickLinks;
	}
	public void setQuickLinks(List<String> quickLinks) {
		this.quickLinks = quickLinks;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	
	
}
