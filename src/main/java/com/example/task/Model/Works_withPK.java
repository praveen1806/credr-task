package com.example.task.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


public class Works_withPK implements Serializable {
	
	int empId;
	int clientId;
	public Works_withPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(clientId, empId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Works_withPK other = (Works_withPK) obj;
		return clientId == other.clientId && empId == other.empId;
	}
	
	
}
