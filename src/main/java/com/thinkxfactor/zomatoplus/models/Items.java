package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;
public class Items {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String starter;
	private String m_course;
	private String dessert;
	public Items(String l,String a,String b,String c)
	{   this.id=l;
		this.starter=a;
		this.m_course=b;
		this.dessert=c;
	}
	public String getStarter() {
		return starter;
	}
	public void setStarter(String starter) {
		this.starter = starter;
	}
	public String getM_course() {
		return m_course;
	}
	public void setM_course(String m_course) {
		this.m_course = m_course;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	

}
