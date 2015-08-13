package com.ssbguide.backend.domainobjects;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SSB_Center")
public class SSBCenterInformation {

	/**
	 *   Fields------------------------------------------------------------------
	 */
	@Id
	@Column(name="Id")
	@GeneratedValue
	private Long id;
	
	@Column(name="PageHeading")
	private String pageHeading;
	
	@Column(name="Center_Name")
	private String centerName;
	
	@Column(name="Center_Id")
	private String centerId;
	
	@OneToMany
	@JoinColumn(name="SSB_Center_Id")
	private List<TouristPlace> placesVisit;
	
	@Column(name="Center_Location")
	private String centerLocation;
	
	/**
	 *   Setter Getters----------------------------------------------------------
	 */

	public String getPageHeading() {
		return pageHeading;
	}

	public void setPageHeading(String pageHeading) {
		this.pageHeading = pageHeading;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterId() {
		return centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	public List<TouristPlace> getPlacesVisit() {
		return placesVisit;
	}

	public void setPlacesVisit(List<TouristPlace> placesVisit) {
		this.placesVisit = placesVisit;
	}

	public String getCenterLocation() {
		return centerLocation;
	}

	public void setCenterLocation(String centerLocation) {
		this.centerLocation = centerLocation;
	}

	public Long getId() {
		return id;
	}
	

	
}
