package com.yourname.Entity;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Student {

	private int id;
	private String name;
	private String course;
	private String serviceIP;
	
	public Student(int id, String name, String course) throws UnknownHostException {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.serviceIP = InetAddress.getLocalHost().getHostAddress();
	}
	
	public Student(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getServiceIP() {
		return serviceIP;
	}

	public void setServiceIP(String serviceIP) {
		this.serviceIP = serviceIP;
	}
	
	
}
