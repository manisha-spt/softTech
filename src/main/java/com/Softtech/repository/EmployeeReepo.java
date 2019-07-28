package com.Softtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Softtech.model.Employee;
@Repository
public interface EmployeeReepo extends JpaRepository<Employee, Long>{
	 //e.empId = ?1 or 
	@Query("select e from Employee e where e.empId = ?1 or e.empEmail=?1 or e.empDesiganation=?1")
	public Employee findByempIdOrempEmailOrempDesiganation(String data);
}
