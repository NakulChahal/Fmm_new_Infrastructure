package com.controller.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@EnableAutoConfiguration
//@EntityScan
@Entity
@Table(name = "FMM_PHOTO_INFRASTRUCTURE" , schema="NAKUL")
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
//allowGetters = true)
public class FmmPhotoInfrastruture {

	@Override
	public String toString() {
		return "FmmPhotoInfrastruture [orgSlNo=" + orgSlNo + ", PhotoUpload=" + Arrays.toString(PhotoUpload)
				+ ", PhotoSlNo=" + PhotoSlNo + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORG_SLNO")
	public Long orgSlNo;
	
	@Column(name="PHOTO_UPLOAD")
	public byte[] PhotoUpload;
	public Long getOrgSlNo() {
		return orgSlNo;
	}


	public void setOrgSlNo(Long orgSlNo) {
		this.orgSlNo = orgSlNo;
	}

	@Column(name="PHOTO_SL_NO")
	public Long PhotoSlNo;
	
	

	public FmmPhotoInfrastruture() {
		
	}
	 
	


public FmmPhotoInfrastruture(Long orgSlNo, byte[] photoUpload, Long photoSlNo) {
		super();
		this.orgSlNo = orgSlNo;
		PhotoUpload = photoUpload;
		PhotoSlNo = photoSlNo;
	}




	public Long getPhotoSlNo() {
		return PhotoSlNo;
	}

	public void setPhotoSlNo(Long photoSlNo) {
		this.PhotoSlNo = photoSlNo;
	}

	public byte[] getPhotoUpload() {
		return PhotoUpload;
	}

	public void setPhotoUpload(byte[] photoUpload) {
		this.PhotoUpload = photoUpload;
	}
	

}
