package org.society.entities;

import java.io.Serializable;

public class Admin implements Serializable {
	
	private static final long serialVersionUID = 2L;
	
	private long adminId;
	private String adminName;
	private String adminPassword;
	
	
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
