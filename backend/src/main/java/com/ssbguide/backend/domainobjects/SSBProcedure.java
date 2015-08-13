package com.ssbguide.backend.domainobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SSB_Procedure")
public class SSBProcedure {
	
	/**
	 *   Fields------------------------------------------------------------------
	 */
	@Id
	@Column(name="Id")
	@GeneratedValue
	private Long id;
	
	@Column(name="PageHeading")
	private String pageHeading;
	
	@Column(name="Day1")
	private String day1;
	
	@Column(name="Day2")
	private String day2;
	
	@Column(name="Day3")
	private String day3;
	
	@Column(name="Day4")
	private String day4;
	
	@Column(name="Day5")
	private String day5;


	
	/**
	 *   Setter Getters----------------------------------------------------------
	 */
	
	public String getPageHeading() {
		return pageHeading;
	}

	public void setPageHeading(String pageHeading) {
		this.pageHeading = pageHeading;
	}

	public String getDay1() {
		return day1;
	}

	public void setDay1(String day1) {
		this.day1 = day1;
	}

	public String getDay2() {
		return day2;
	}

	public void setDay2(String day2) {
		this.day2 = day2;
	}

	public String getDay3() {
		return day3;
	}

	public void setDay3(String day3) {
		this.day3 = day3;
	}

	public String getDay4() {
		return day4;
	}

	public void setDay4(String day4) {
		this.day4 = day4;
	}

	public String getDay5() {
		return day5;
	}

	public void setDay5(String day5) {
		this.day5 = day5;
	}

	public Long getId() {
		return id;
	}
}
