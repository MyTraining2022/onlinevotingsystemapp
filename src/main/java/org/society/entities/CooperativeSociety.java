package org.society.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Cooperative_Society")
public class CooperativeSociety implements Serializable{
	
	
	private static final long serialVersionUID = -5923648127953469592L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "society_id")
	private Long societyId;
	
	private String societyName;
	private String headOfSociety;
	private String village;
	private String mandal;
	private String district;
	private String pincode;
	public CooperativeSociety(Long societyId, String societyName, String headOfSociety, String village, String mandal,
			String district, String pincode) {
		super();
		this.societyId = societyId;
		this.societyName = societyName;
		this.headOfSociety = headOfSociety;
		this.village = village;
		this.mandal = mandal;
		this.district = district;
		this.pincode = pincode;
	}
	public CooperativeSociety() {
		super();
		
	}
	public Long getSocietyId() {
		return societyId;
	}
	public void setSocietyId(Long societyId) {
		this.societyId = societyId;
	}
	public String getSocietyName() {
		return societyName;
	}
	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}
	public String getHeadOfSociety() {
		return headOfSociety;
	}
	public void setHeadOfSociety(String headOfSociety) {
		this.headOfSociety = headOfSociety;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "CooperativeSociety [societyId=" + societyId + ", societyName=" + societyName + ", headOfSociety="
				+ headOfSociety + ", village=" + village + ", mandal=" + mandal + ", district=" + district
				+ ", pincode=" + pincode + "]";
	}
	
	
}
