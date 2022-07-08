package com.example.task.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.Model.client;

@Repository
public interface clientRepository extends JpaRepository<client,Integer>{
	client findById(int clientId);
	public List<List<client>> findByclientName(String clientName);
}
