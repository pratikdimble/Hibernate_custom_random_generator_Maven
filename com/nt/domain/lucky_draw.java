package com.nt.domain;


public class lucky_draw {
	public String coupenNumber;
	public String customerName;
	public float billAmount;

	public String getCoupenNumber() {
		return coupenNumber;
	}
	public void setCoupenNumber(String coupenNumber) {
		this.coupenNumber = coupenNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "lucky_draw [coupenNumber=" + coupenNumber + ", customerName=" + customerName + ", billAmount="
				+ billAmount + "]";
	}


	
	
	

}
