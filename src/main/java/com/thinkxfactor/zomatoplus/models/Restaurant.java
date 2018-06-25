package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;
public class Restaurant implements Serializable
{
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String address;
	private String phno;
	private String rating;
	private String pay_method;
	public Restaurant(String l,String a,String b,String c,String d,String e)
	{   this.id=l;
		this.name=a;
		this.address=b;
		this.phno=c;
		this.rating=d;
		this.pay_method=e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
}
	