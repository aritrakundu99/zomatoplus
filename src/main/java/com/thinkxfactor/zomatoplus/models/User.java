package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;
public class User implements Serializable
{
	private String username;
	private String password;
	public User()
	{
		username="unknown";
		password="unknown";
	}
	public User(String a,String b)
	{
		username=a;
		password=b;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
