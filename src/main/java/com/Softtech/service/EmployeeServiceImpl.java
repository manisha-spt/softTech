package com.Softtech.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Softtech.model.Employee;
import com.Softtech.repository.EmployeeReepo;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeReepo employeeReepo;
	@Transactional
	public Employee SaveEmp(Employee employee) {
			double gs=employee.getSalary().getBaisc()+employee.getSalary().getHouseRent()+employee.getSalary().getMedical()+employee.getSalary().getSpecial();
				employee.getSalary().setGrossSal(gs);
				
				double prodfound=(employee.getSalary().getGrossSal()*12)/100;
					employee.getSalary().setPf(prodfound);
					employee.getSalary().setTotal(gs-(prodfound-employee.getSalary().getOthers()));
		return employeeReepo.save(employee);
	}

	@Override
	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getByEmp(Long empId) {
	Optional<Employee> emp=employeeReepo.findById(empId);
		return emp.get();
	}

	@Override
	public void deleteEmp(Long empId) {
		employeeReepo.deleteById(empId);

	}

	@Override
	public List<Employee> getEmps() {
		return employeeReepo.findAll();
	}

	@Override
	public Employee findByempIdOrempEmailOrempDesiganation(String data) {
		return employeeReepo.findByempIdOrempEmailOrempDesiganation(data);
	}

}
