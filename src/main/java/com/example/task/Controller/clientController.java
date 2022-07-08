package com.example.task.Controller;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.Model.Answer;
import com.example.task.Model.Employee;
import com.example.task.Model.Works_with;
import com.example.task.Model.client;
import com.example.task.Repository.EmployeeRepository;
import com.example.task.Repository.Works_withRepository;
import com.example.task.Repository.clientRepository;
import com.example.task.Service.taskService;

@RestController

public class clientController {
	@Autowired
	private taskService tsk;
	@GetMapping("/task")
	public List<Answer> getEmployees(@RequestBody Map<String,Object> input){
		String sex = (String)input.get("sex");
		Object obj = input.get("client");
		List<Object> client = (List<Object>) obj;
		List<String> clients = new ArrayList<>();
		for(Object o:client) {
			clients.add((String)o);
		}
		return tsk.getEmployeeService(sex,clients);
	}
}
