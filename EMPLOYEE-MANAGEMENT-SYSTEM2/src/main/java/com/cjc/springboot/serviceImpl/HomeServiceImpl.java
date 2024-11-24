package com.cjc.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springboot.model.Employee;
import com.cjc.springboot.repositiry.HomeRepository;
import com.cjc.springboot.serviceI.HomeService;

import jakarta.validation.ConstraintViolationException;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeRepository hr;

	@Override
	public void savedata(Employee s) {
		 if (s.getUsername() == null || s.getUsername().trim().isEmpty()) {
	            throw new ConstraintViolationException("Username cannot be blank", null);
	        }
		hr.save(s);

	}

	@Override
	public Employee logincheck(String un, String ps) {
		return hr.findAllByUsernameAndPassword(un, ps);

	}

	@Override
	public Iterable<Employee> displayallData() {

		return hr.findAll();
	}

	@Override
	public Employee editData(int id) {

		return hr.findAllById(id);
	}

	@Override
	public void deletedata(Employee s) {
		hr.delete(s);

	}

}
