/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author yadav
 */
@Service
public class EmployeeService {
   private  EmployeeRepository employeeRepository;

   


    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }


    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
  
}
