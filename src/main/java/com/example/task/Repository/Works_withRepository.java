package com.example.task.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.Model.Works_with;
import com.example.task.Model.Works_withPK;

@Repository
public interface Works_withRepository extends JpaRepository<Works_with,Works_withPK>{
	List<Works_with> findAll();
	List<Works_with> findByClientId(int clientId);
}
