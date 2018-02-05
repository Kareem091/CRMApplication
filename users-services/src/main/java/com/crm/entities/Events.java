package com.crm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "events")
public class Events {
	@Id
	private String id;
	
	@Field("_workshopidref")
	private String workShopId;
	@Field("name")
	private String eventName;
	@Field("category")
	private String eventCategory;
	@Field("details")
	private String eventDetails;
	@Field("date")
	private String eventDate;
	public Events(String workShopId, String eventName, String eventCategory, String eventDetails, String eventDate) {
		super();
		this.workShopId = workShopId;
		this.eventName = eventName;
		this.eventCategory = eventCategory;
		this.eventDetails = eventDetails;
		this.eventDate = eventDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWorkShopId() {
		return workShopId;
	}
	public void setWorkShopId(String workShopId) {
		this.workShopId = workShopId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventCategory() {
		return eventCategory;
	}
	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}
	public String getEventDetails() {
		return eventDetails;
	}
	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	@Override
	public String toString() {
		return "Events [id=" + id + ", workShopId=" + workShopId + ", eventName=" + eventName + ", eventCategory="
				+ eventCategory + ", eventDetails=" + eventDetails + ", eventDate=" + eventDate + "]";
	}
	
	
}
