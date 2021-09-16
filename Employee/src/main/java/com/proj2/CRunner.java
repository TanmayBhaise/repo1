package com.proj2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.proj2.emp.Employee;
import com.proj2.serv.EmpService;

@Component
public class CRunner implements CommandLineRunner {
	@Autowired
	private Employee e;
	@Autowired
	private EmpService es;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//es.insertdb(e);
		
		List<Employee> list = es.getAllEmployee();
		System.out.println("EmpId\tEmpName\tEmpSal");
		for(Employee i: list) {
			System.out.println(i.getEid() + "\t" + i.getEname()+ "\t"+ i.getEsal());
		}
		
		Employee e1 = es.getEmployeeById(222);
		System.out.println("Employee Details of id 111:");
		System.out.println(e1.getEid() + "\t" + e1.getEname()+"\t"+e1.getEsal());
		
//		String s = es.deleteById(444);
//		System.out.println(s+" id 444");
	}

}
