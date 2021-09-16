package com.proj2.serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.exceptions.RSAException;
import com.proj2.emp.Employee;
import com.proj2.repo.Repository;

@Service
public class EmpServiceIml implements EmpService{
	
	@Autowired
	private Repository r;
	
	@Override
	public int insertdb(Employee eid) {
		// TODO Auto-generated method stub
		Employee e1 = r.save(eid);
		return e1.getEid();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> e = r.findById(id);
		if(e.isPresent()) {
		return e.get();
		}else {
		return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> l =null;
		l = r.findAll();
		return l;
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		r.deleteById(id);
		return "Successfully Deleted";
	}

}
