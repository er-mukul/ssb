package com.ssbguide.backend.domainobjects;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tourist_Place")
public class TouristPlace {

	/**
	 *   Fields------------------------------------------------------------------
	 */
	@Id
	@Column(name="Id")
	@GeneratedValue
	private Long id;
	
	@Column(name="PageHeading")
	private String pageHeading;
	
	@Column(name="Name")
	private String touristPlaceName;
	
	@Column(name="Place_Id")
	private String touristPlaceId;
	
	@Column(name="Information")
	private String touristPlaceInfo;
	
	@Column(name="Place_Image")
	private Blob touristPlaceImage;


	
	/**
	 *   Setter Getters----------------------------------------------------------
	 */
	
	public String getPageHeading() {
		return pageHeading;
	}

	public void setPageHeading(String pageHeading) {
		this.pageHeading = pageHeading;
	}

	public String getTouristPlaceName() {
		return touristPlaceName;
	}

	public void setTouristPlaceName(String touristPlaceName) {
		this.touristPlaceName = touristPlaceName;
	}

	public String getTouristPlaceId() {
		return touristPlaceId;
	}

	public void setTouristPlaceId(String touristPlaceId) {
		this.touristPlaceId = touristPlaceId;
	}

	public String getTouristPlaceInfo() {
		return touristPlaceInfo;
	}

	public void setTouristPlaceInfo(String touristPlaceInfo) {
		this.touristPlaceInfo = touristPlaceInfo;
	}

	public Blob getTouristPlaceImage() {
		return touristPlaceImage;
	}

	public void setTouristPlaceImage(Blob touristPlaceImage) {
		this.touristPlaceImage = touristPlaceImage;
	}

	public Long getId() {
		return id;
	}
}
