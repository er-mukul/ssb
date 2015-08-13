package com.ssbguide.backend.domainobjects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MenuItems")
public class MenuItems implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *   Fields------------------------------------------------------------------
	 */
	@Id
	@Column(name="Id")
	@GeneratedValue
	private Long id;
	
	@Column(name="PageHeading")
	private String pageHeading;
	
	@Column(name="ItemName")
	private String itemName;
	
	@Column(name="Item_Id")
	private Long itemId;
	
	/**
	 *   Setter Getters----------------------------------------------------------
	 */
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getId() {
		return id;
	}
	
	
	public String getPageHeading() {
		return pageHeading;
	}

	public void setPageHeading(String pageHeading) {
		this.pageHeading = pageHeading;
	}

	/**
	 *   Methods-----------------------------------------------------------------
	 */
	
	public void addItem(Long itemId){
		
	}
	
	public void removeItem(Long itemId){
		
	}
}
