package com.controller.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.annotation.CreatedDate;

//@EnableAutoConfiguration
//@EntityScan
@Entity
@Table(name = "FMM_INFRASTRUCTURE" , schema="NAKUL")
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
//allowGetters = true)
public class FmmInfrastructure  {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="ORG_SLNO")
	public Long orgSlNo;
	
	@Column(name="INCHARGE")
	public String incharge;
	
	@Column(name="PATTERN_EXAM")
	public String patternExam;
	
	@Column(name="ROH_CAPACITY")
	public String rohCapacity;
	
	@Column(name="TRACK_DISTANCE")
	public Long trackCenterDistanceBetweenLines;
	
	@Column(name="CONCRETE_FLOORING")
	public String heavyDutyFlooring;
	
	@Column(name="NIGHT_WORKING")
	public String nightWorking;
	
	@Column(name="ILLUMINATION_FAC")
	public String sufficientIllumination;
	
	@Column(name="EOT_CRANE")
	public String eOTCane;
	
	@Column(name="JACKS")
	public String syncWhitingJackes;
	
	@Column(name="WHEEL_LATHE")
	public String wheelTurningLathe;

	@Column(name="WELDING_FAC")
	public String weldingFacilities;

    @Column(name="DV_REPAIR")
	public String dVRepair;
	
	@Column(name="SAB_REPAIR")
	public String sabrepair;
	
	@Column(name="UST_FAC")
	public String ustfacility;
	
	@Column(name="AV_PC")
	public String pc;
	
	@Column(name="AV_PC_NETWORKING")
	public String pcsNetworkingFacility;
	
	@Column(name="AV_TELE_COMM")
	public String teleCommunicationFacility;
	
	@Column(name="FUTURE_EXTENTION")
	public String futureExtension;

	public Long getOrgSlNo() {
		return orgSlNo;
	}

	public void setOrgSlNo(Long orgSlNo) {
		this.orgSlNo = orgSlNo;
	}

	@Column(name="REMARKS")
	public String remarks;
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	@Column(name="DATE_TIME")
	public Date dateTime;
	
	@Column(name="USER_ID")
	public String userId;
	
	
	
	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	public String getPatternExam() {
		return patternExam;
	}

	public void setPatternExam(String patternExam) {
		this.patternExam = patternExam;
	}

	public String getRohCapacity() {
		return rohCapacity;
	}

	public Long getTrackCenterDistanceBetweenLines() {
		return trackCenterDistanceBetweenLines;
	}

	public void setTrackCenterDistanceBetweenLines(Long trackCenterDistanceBetweenLines) {
		this.trackCenterDistanceBetweenLines = trackCenterDistanceBetweenLines;
	}

	public String getHeavyDutyFlooring() {
		return heavyDutyFlooring;
	}

	public void setHeavyDutyFlooring(String heavyDutyFlooring) {
		this.heavyDutyFlooring = heavyDutyFlooring;
	}

	public String getNightWorking() {
		return nightWorking;
	}

	public void setNightWorking(String nightWorking) {
		this.nightWorking = nightWorking;
	}

	public String getSufficientIllumination() {
		return sufficientIllumination;
	}

	public void setSufficientIllumination(String sufficientIllumination) {
		this.sufficientIllumination = sufficientIllumination;
	}

	public String geteOTCane() {
		return eOTCane;
	}

	public void seteOTCane(String eOTCane) {
		this.eOTCane = eOTCane;
	}

	public String getSyncWhitingJackes() {
		return syncWhitingJackes;
	}

	public void setSyncWhitingJackes(String syncWhitingJackes) {
		this.syncWhitingJackes = syncWhitingJackes;
	}

	public String getWheelTurningLathe() {
		return wheelTurningLathe;
	}

	public void setWheelTurningLathe(String wheelTurningLathe) {
		this.wheelTurningLathe = wheelTurningLathe;
	}

	public String getWeldingFacilities() {
		return weldingFacilities;
	}

	public void setWeldingFacilities(String weldingFacilities) {
		this.weldingFacilities = weldingFacilities;
	}

	public String getdVRepair() {
		return dVRepair;
	}

	public void setdVRepair(String dVRepair) {
		this.dVRepair = dVRepair;
	}

	public String getSabrepair() {
		return sabrepair;
	}

	public void setSabrepair(String sabrepair) {
		this.sabrepair = sabrepair;
	}

	public String getUstfacility() {
		return ustfacility;
	}

	public void setUstfacility(String ustfacility) {
		this.ustfacility = ustfacility;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getPcsNetworkingFacility() {
		return pcsNetworkingFacility;
	}

	public void setPcsNetworkingFacility(String pcsNetworkingFacility) {
		this.pcsNetworkingFacility = pcsNetworkingFacility;
	}

	public String getTeleCommunicationFacility() {
		return teleCommunicationFacility;
	}

	public void setTeleCommunicationFacility(String teleCommunicationFacility) {
		this.teleCommunicationFacility = teleCommunicationFacility;
	}

	public String getFutureExtension() {
		return futureExtension;
	}

	public void setFutureExtension(String futureExtension) {
		this.futureExtension = futureExtension;
	}

	public void setRohCapacity(String rohCapacity) {
		this.rohCapacity = rohCapacity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}


