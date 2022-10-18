package com.bikleek.frontjsp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.bikleek.frontjsp.models.Employee;

@CrossOrigin(origins = "http://localhost:8080")
@Controller
public class EmployeeController {
	
	private static List<Employee> employees = new ArrayList<Employee>();
	
	private RestTemplate restTemplate;
    
    /*static {
    	employees.add(new Employee("Erika", "Romero", "emromerog@unal.edu.co", "1039457711"));
    	employees.add(new Employee("Valeria", "Romero", "emromerog@unal.edu.co", "1039457711"));
    	employees.add(new Employee("Cristian", "Romero", "emromerog@unal.edu.co", "1039457711"));
    }*/
    
    private static String url = "http://localhost:9000/api/v1/employees/";
    
    public EmployeeController(RestTemplate restTemplate) {
    	this.restTemplate = restTemplate;
    }
    
    // Returns the view that lists all employees
	@RequestMapping("/employees")
    public String showListEmployeeView(Model model) {
		Object[] employees = restTemplate.getForObject(url, Object[].class);
        model.addAttribute("employees", employees);
        return "employee/index";
    }
	
	// Returns the view to create employee
	@RequestMapping("/employees/create")
    public String showCreateEmployeeView(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }
	
	// Save employee
	@RequestMapping(value = "/employees/create", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		restTemplate.postForObject(url, employee, Employee.class);
        return "redirect:/employees";
    }
	
	// Returns the view to edit employee
	@RequestMapping(value = "/employees/edit/{id}", method = RequestMethod.GET)
    public String showEditView(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        //Employee employee = new Employee("Erika", "Romero", "eromerog@unal.edu.co", "1039457711");
        Employee employee = restTemplate.getForObject(url + id, Employee.class);
        model.addAttribute("employee", employee);
        //Return view name
        return "employee/edit";
    }
	
	// Update employee
	@RequestMapping(value = "/employees/edit/{id}", method = RequestMethod.POST)
    public String updateEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee) {
		/*employee.setId(id);
		Map < String, String > params = new HashMap < String, String > ();
        params.put("id", id.toString());
        //Employee updatedEmployee = new Employee("admin123", "admin123", "admin123@gmail.com");
        restTemplate.put(url, employee, params);*/
		return "redirect:/employees";
    }
	
	// Remove employee
	@RequestMapping(value = "/employees/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
		/*Map < String, Long > params = new HashMap < String, Long > ();
        params.put("id", id);
        restTemplate.delete(url, params);*/
		return "redirect:/employees";
    }
}
