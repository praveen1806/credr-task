package com.example.task.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	Employee findById(int empId);

}
