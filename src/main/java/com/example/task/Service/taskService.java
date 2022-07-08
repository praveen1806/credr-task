package com.example.task.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.task.Model.Answer;
import com.example.task.Model.Employee;
import com.example.task.Model.Works_with;
import com.example.task.Model.client;
import com.example.task.Repository.EmployeeRepository;
import com.example.task.Repository.Works_withRepository;
import com.example.task.Repository.clientRepository;

@Service
public class taskService {
	@Autowired
	private  clientRepository repo;
	@Autowired
	private  Works_withRepository wrepo;
	@Autowired
	private EmployeeRepository erepo;
	
	public List<Answer> getEmployeeService(String sex, List<String> clients) {
		// TODO Auto-generated method stub
		List<Answer> res = new ArrayList<>();
		for(String obj:clients) {
			String clientName=obj;
			List<List<client>> temp = repo.findByclientName(clientName);
			List<List<Works_with>> wlist = new ArrayList<>();
			for(List<client> cl:temp) {
				for(int i=0;i<cl.size();i++) {
					wlist.add(wrepo.findByClientId(cl.get(i).getClientId()));
				}	
			}
			for(List<Works_with> curr:wlist) {
				
				for(int i=0;i<curr.size();i++) {
					Answer ans = new Answer();
					Works_with w = curr.get(i);
					int eid = w.getEmpId();
					int cid = w.getClientId();
					int sales = w.getSales();
					Employee e = erepo.findById(eid);
					client c = repo.findById(cid);
					if(e.getSex()=='M') {
						ans.setName(e.getFirstName()+e.getLastName());
						ans.setSex('M');
						ans.setClientName(c.getClientName());
						ans.setTotalSales(sales);
					}
					if(ans.getName()!=null) res.add(ans);
					
				}
			}
			
		}
		return res;
	}
}
	
	