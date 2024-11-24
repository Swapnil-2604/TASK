package com.cjc.springboot.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springboot.model.Employee;
@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer> {

	public Employee findAllByUsernameAndPassword(String un,String ps);

	public Employee findAllById(int id);

	
}
