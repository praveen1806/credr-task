package com.example.task.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="client")
public class client {
	@Id @Column(name="client_id")
	int clientId;
	@Column(name="client_name")
	String clientName;
	@OneToMany(targetEntity = Works_with.class,cascade = CascadeType.ALL)
	@JoinColumn(name="client_id",referencedColumnName="client_id")
	private List<Works_with> works_with;
	public List<Works_with> getWorks_with() {
		return works_with;
	}
	public void setWorks_with(List<Works_with> works_with) {
		this.works_with = works_with;
	}
	public client() {
		
	}
	public client(int clientId,String clientName) {
		this.clientId=clientId;
		this.clientName=clientName;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
}
