package com.Softtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Softtech.model.Employee;
import com.Softtech.service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService empService;
	
	@RequestMapping("/show")
	public String showreg(Model map) {
		map.addAttribute("employee", new Employee());
		return "EmployeeReg";
	}
	
	@RequestMapping("/saveEmp")
	public String saveEmp(@ModelAttribute Employee employee,Model map) {
		Employee emp=empService.SaveEmp(employee);
		map.addAttribute("employee",emp);
		map.addAttribute("message","Employee Record Inserted");
		return "EmployeeReg";
	}
	
	
	@RequestMapping("/getAll")
	public String getAllEmps(Model map) {
		List<Employee> emps=empService.getEmps();
		map.addAttribute("employee", emps);
		return "EmployeeData";
	}

		@RequestMapping("/delete")
		public String deleteEmp(@RequestParam Long id) {
			empService.deleteEmp(id);
			//List<Employee> emps=empService.getEmps();
			//map.addAttribute("employee", emps);
			return "redirect:getAll";
		}
		
		@RequestMapping("/edit")
		public String editEmp(@RequestParam Long id, Model map) {
			Employee e=empService.getByEmp(id);
				map.addAttribute("employee",e);
				map.addAttribute("Mode","EDIT");
			return "EditReg";
		}
		
		@RequestMapping("/searchData")
		public String findpage() {
			return "SearchEmpData";
		}
		
		@RequestMapping(value="/findEmpDetails",method=RequestMethod.GET)
		public String findEmpDetails(@RequestParam String data,Model map) {
				
			String page=null;
				data=Integer.
			Employee e=empService.findByempIdOrempEmailOrempDesiganation(data);
			if(e==null) {
				map.addAttribute("message", "Employee Details Not Found");
				page="SearchEmpData";
			}
			else {
			map.addAttribute("emp", e);
			page="EmpDetails";
			}
			return page;
		}
}
