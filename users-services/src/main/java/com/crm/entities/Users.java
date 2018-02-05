package com.crm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users")
public class Users {

	@Id
	private String id;
	@Field("firstname")
	private String firstName;
	@Field("secondname")
	private String secondName;
	@Field("contactinfo")
	private String contactInfo;
	private String gender;
	private int age;
	@Field("birthdate")
	private String birthDate;
	private String address;
	private String city;
	private String interests;
	private String password;
	@Field("usertype")
	private int userType;

	public Users() {

	}

	public Users(String firstName, String secondName, String contactInfo, String gender, int age, String birthDate,
			String address, String city, String interests, String password, int userType) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.contactInfo = contactInfo;
		this.gender = gender;
		this.age = age;
		this.birthDate = birthDate;
		this.address = address;
		this.city = city;
		this.interests = interests;
		this.password = password;
		this.userType = userType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", contactInfo="
				+ contactInfo + ", gender=" + gender + ", age=" + age + ", birthDate=" + birthDate + ", address="
				+ address + ", city=" + city + ", interests=" + interests + ", password=" + password + ", userType="
				+ userType + "]";
	}

}
