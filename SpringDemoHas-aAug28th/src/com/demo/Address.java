package com.demo;

public class Address {

	private int hunum;
	private String colony;
	private String state;
	private int pincode;
	public int getHunum() {
		return hunum;
	}
	public void setHunum(int hunum) {
		this.hunum = hunum;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int hunum, String colony, String state, int pincode) {
		super();
		this.hunum = hunum;
		this.colony = colony;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hunum=" + hunum + ", colony=" + colony + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
