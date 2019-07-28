package com.Softtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Softtech.model.Salary;
@Repository
public interface SalaryRepo extends JpaRepository<Salary, Long> {

}
