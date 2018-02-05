package com.crm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "workshopsusersreview")
public class WorkShopReviews {
	@Id
	private String id;
	
	
	@Field("_userref")
	private String userRef;
	@Field("usercomment")
	private String userComment;
	@Field("userrating")
	private String userRating;
	public WorkShopReviews(String userRef, String userComment, String userRating) {
		super();
		this.userRef = userRef;
		this.userComment = userComment;
		this.userRating = userRating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserRef() {
		return userRef;
	}
	public void setUserRef(String userRef) {
		this.userRef = userRef;
	}
	public String getUserComment() {
		return userComment;
	}
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	public String getUserRating() {
		return userRating;
	}
	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}
	@Override
	public String toString() {
		return "WorkShopReviews [id=" + id + ", userRef=" + userRef + ", userComment=" + userComment + ", userRating="
				+ userRating + "]";
	}
	
	
}
