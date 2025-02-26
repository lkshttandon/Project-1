package com.dxc.cook.model;

import org.springframework.data.annotation.Id;

public class Cook {

	@Id
	private String cookid;
	private String cookname;
	private String cooklocation;
	private String cookpassword;
	private String cookphone;
	private String cookaddress;
	private String cookcity;
	private String cookzip;
	
	public Cook() {
		super();
		
	}
	
	public Cook(String cookid, String cookname, String cooklocation, String cookpassword, String cookphone,
			String cookaddress, String cookcity, String cookzip) {
		super();
		this.cookid = cookid;
		this.cookname = cookname;
		this.cooklocation = cooklocation;
		this.cookpassword = cookpassword;
		this.cookphone = cookphone;
		this.cookaddress = cookaddress;
		this.cookcity = cookcity;
		this.cookzip = cookzip;
	}

	public String getCookid() {
		return cookid;
	}
	public void setCookid(String cookid) {
		this.cookid = cookid;
	}
	public String getCookname() {
		return cookname;
	}
	public void setCookname(String cookname) {
		this.cookname = cookname;
	}
	public String getCooklocation() {
		return cooklocation;
	}
	public void setCooklocation(String cooklocation) {
		this.cooklocation = cooklocation;
	}
	public String getCookpassword() {
		return cookpassword;
	}
	public void setCookpassword(String cookpassword) {
		this.cookpassword = cookpassword;
	}
	public String getCookphone() {
		return cookphone;
	}
	public void setCookphone(String cookphone) {
		this.cookphone = cookphone;
	}
	public String getCookaddress() {
		return cookaddress;
	}
	public void setCookaddress(String cookaddress) {
		this.cookaddress = cookaddress;
	}
	public String getCookcity() {
		return cookcity;
	}
	public void setCookcity(String cookcity) {
		this.cookcity = cookcity;
	}
	public String getCookzip() {
		return cookzip;
	}
	public void setCookzip(String cookzip) {
		this.cookzip = cookzip;
	}
	
	
}
