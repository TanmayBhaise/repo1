package com.proj2.serv;

import java.util.List;

import com.proj2.emp.Employee;

public interface EmpService {
	public int insertdb(Employee eid);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployee();
	public String deleteById(int id);
}
