package com.example.task.Model;

import org.springframework.stereotype.Component;

@Component
public class Answer {
	String name;
	char sex;
	String clientName;
	int totalSales;
	public Answer(String name, char sex, String clientName, int totalSales) {
		this.name = name;
		this.sex = sex;
		this.clientName = clientName;
		this.totalSales = totalSales;
	}
	public Answer() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
	

}
