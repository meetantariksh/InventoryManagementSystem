package com.maass.ecom.inventory.Beans;

public class SystemCheckBean {
	private String checkProperty = null;
	private boolean checkStatus = false;
	public String getCheckProperty() {
		return checkProperty;
	}
	public void setCheckProperty(String checkProperty) {
		this.checkProperty = checkProperty;
	}
	public boolean isCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(boolean checkStatus) {
		this.checkStatus = checkStatus;
	}
}
