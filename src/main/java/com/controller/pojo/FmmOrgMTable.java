package com.controller.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;

//@EnableAutoConfiguration
//@EntityScan
@Entity		
@Table(name="FMM_ORG_M", schema="NAKUL")
public class FmmOrgMTable {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORG_SLNO")
	public Long orgSlNo;
	
	@Column(name="ORG_CODE")
	public Long orgCode;
	
	@Column(name="ORG_TYPE")
	public String orgType;
	
	@Column(name="ORG_DESC")
	public String orgDesc;

	
	


	public Long getOrgSlNo() {
		return orgSlNo;
	}

	public void setOrgSlNo(Long orgSlNo) {
		this.orgSlNo = orgSlNo;
	}

	public Long getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(Long orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
    
	

	public FmmOrgMTable() {
		
		super();
	}
	

	
	public FmmOrgMTable(Long orgSlNo, Long orgCode, String orgType, String orgDesc) {
		super();
		this.orgSlNo = orgSlNo;
		this.orgCode = orgCode;
		this.orgType = orgType;
		this.orgDesc = orgDesc;
		
	}

	
	
	

	public List<FmmInfrastructure> getFmmOrgInfrastructure() {
		return fmmInfrastructure;
	}

	public void setFmmOrgInfrastructure(List<FmmInfrastructure> fmmInfrastructure) {
		this.fmmInfrastructure = fmmInfrastructure;
	}


	@Override
	public String toString() {
		return "FmmOrgMTable [orgSlNo=" + orgSlNo + ", orgCode=" + orgCode + ", orgType=" + orgType + ", orgDesc="
				+ orgDesc + "]";
	}


	public List<FmmPhotoInfrastruture> getFmmPhotoInfrastrutures() {
		return fmmPhotoInfrastrutures;
	}

	public void setFmmPhotoInfrastrutures(List<FmmPhotoInfrastruture> fmmPhotoInfrastrutures) {
		this.fmmPhotoInfrastrutures = fmmPhotoInfrastrutures;
	}


	@OneToMany(cascade =  CascadeType.ALL)
	
	public List<FmmInfrastructure> fmmInfrastructure;
	
	



	@OneToMany(cascade= CascadeType.ALL)
	public  List<FmmPhotoInfrastruture> fmmPhotoInfrastrutures;

	
	
	

	
}
