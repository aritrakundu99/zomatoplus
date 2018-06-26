package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_table")
public class User implements Serializable
{   @Id
    @GeneratedValue
    @Column(name="user_id")
    private long id1;
    public long getId1() {
	return id1;
}
public void setId1(long id1) {
	this.id1 = id1;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
	@Column(name="name")
	private String name;
    @Column(name="type")
    private String type;
    @Column(name="mobile")
    private String mobile;
    @Column(name="address")
    private String address;
    @Column(name="password")
    private String password;
    @Column(name="landmark")
    private String landmark;
    @Column(name="pincode")
    private String pincode;
	public User()
	{
		
	}
	
	

}
