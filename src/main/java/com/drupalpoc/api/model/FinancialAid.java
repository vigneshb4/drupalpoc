package com.drupalpoc.api.model;

import java.util.List;

public class FinancialAid {
	
	private String information;
	private List<String> quickLinks;
	private List<String> notifications;
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public List<String> getQuickLinks() {
		return quickLinks;
	}
	public void setQuickLinks(List<String> quickLinks) {
		this.quickLinks = quickLinks;
	}
	public List<String> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<String> notifications) {
		this.notifications = notifications;
	}

	

}
