package com.Softtech.service;

import java.util.List;

import com.Softtech.model.Employee;

public interface IEmployeeService {

	public Employee SaveEmp(Employee employee);
	public void updateEmp(Employee employee);
	public Employee getByEmp(Long empId);
	public void deleteEmp(Long empId);
	public List<Employee> getEmps();
	public Employee findByempIdOrempEmailOrempDesiganation(String data);
}
