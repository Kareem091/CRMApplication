package com.crm.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


@Document(collection = "images")
public class Images {

	@Id
	private String id;
	@Field("userid")
	private String userid;
	@Field("imgSrc")
	private String imgSrc;
	@Field("date")
	private String date;
	@Field("like")
	private String like;
	@Field("dislike")
	private String disLike;
	
	private List<Comments> comments;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getDisLike() {
		return disLike;
	}
	public void setDisLike(String disLike) {
		this.disLike = disLike;
	}
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
    	ObjectMapper mapper = new ObjectMapper();
    	String jsonString = "";
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			jsonString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	return jsonString;
	}
	
}
