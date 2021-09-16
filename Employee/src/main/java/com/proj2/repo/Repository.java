package com.proj2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj2.emp.Employee;

public interface Repository extends JpaRepository<Employee, Integer> {

}
