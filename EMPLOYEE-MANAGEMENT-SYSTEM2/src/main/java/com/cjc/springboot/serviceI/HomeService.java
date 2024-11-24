package com.cjc.springboot.serviceI;

import com.cjc.springboot.model.Employee;
public interface HomeService {

	public void savedata(Employee s);

	public Employee logincheck(String un, String ps);

	public Iterable<Employee> displayallData();

//	public Employee editData(int uid);

	public void deletedata(Employee s);

	public Employee editData(int id);



}
