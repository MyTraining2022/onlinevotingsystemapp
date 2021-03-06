package org.society.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "Cooperative_Society")
public class CooperativeSociety implements Serializable{
	
	
	private static final long serialVersionUID = -5923648127953469592L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String societyName;
	
	@NotNull
	private String headOfSociety;
	
	@NotNull
	private String village;
	
	@NotNull
	private String mandal;
	
	@NotNull
	private String district;
	
	@NotNull(message = "Pincode is required")
	@Min(6)
	private String pincode;
	

	public CooperativeSociety() {
		super();
		
	}

	public CooperativeSociety(Long id, String societyName, String headOfSociety, String village, String mandal,
			String district, String pincode) {
		super();
		this.id = id;
		this.societyName = societyName;
		this.headOfSociety = headOfSociety;
		this.village = village;
		this.mandal = mandal;
		this.district = district;
		this.pincode = pincode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "CooperativeSociety [id=" + id + ", societyName=" + societyName + ", headOfSociety=" + headOfSociety
				+ ", village=" + village + ", mandal=" + mandal + ", district=" + district + ", pincode=" + pincode
				+ "]";
	}

	
	
}
