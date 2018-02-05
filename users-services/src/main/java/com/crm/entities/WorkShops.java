package com.crm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "workshops")
public class WorkShops {

	@Id
	private String id;

	@Field("name")
	private String workShopsName;
	@Field("address")
	@DBRef
	private Address workShopsAddress;
	@Field("details")
	private String workShopDetails;
	@Field("workshopsusersreview")
	@DBRef
	private WorkShopReviews workShopsUsersReview;
	@Field("rooms")
	@DBRef
	private Rooms workShopRoom;

	public WorkShops(String workShopsName, Address workShopsAddress, String workShopDetails,
			WorkShopReviews workShopsUsersReview, Rooms workShopRoom) {
		super();
		this.workShopsName = workShopsName;
		this.workShopsAddress = workShopsAddress;
		this.workShopDetails = workShopDetails;
		this.workShopsUsersReview = workShopsUsersReview;
		this.workShopRoom = workShopRoom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWorkShopsName() {
		return workShopsName;
	}

	public void setWorkShopsName(String workShopsName) {
		this.workShopsName = workShopsName;
	}

	public Address getWorkShopsAddress() {
		return workShopsAddress;
	}

	public void setWorkShopsAddress(Address workShopsAddress) {
		this.workShopsAddress = workShopsAddress;
	}

	public String getWorkShopDetails() {
		return workShopDetails;
	}

	public void setWorkShopDetails(String workShopDetails) {
		this.workShopDetails = workShopDetails;
	}

	public WorkShopReviews getWorkShopsUsersReview() {
		return workShopsUsersReview;
	}

	public void setWorkShopsUsersReview(WorkShopReviews workShopsUsersReview) {
		this.workShopsUsersReview = workShopsUsersReview;
	}

	public Rooms getWorkShopRoom() {
		return workShopRoom;
	}

	public void setWorkShopRoom(Rooms workShopRoom) {
		this.workShopRoom = workShopRoom;
	}

	@Override
	public String toString() {
		return "WorkShops [id=" + id + ", workShopsName=" + workShopsName + ", workShopsAddress=" + workShopsAddress
				+ ", workShopDetails=" + workShopDetails + ", workShopsUsersReview=" + workShopsUsersReview
				+ ", workShopRoom=" + workShopRoom + "]";
	}

}
