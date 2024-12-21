package com.ust.employeeServices.controller;

import com.ust.employeeServices.entity.Employee;
import com.ust.employeeServices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/getEmployeeById/{emp_id}")
    public Employee fetchEmployeeById(@PathVariable("emp_id") Long emp_id){
        return employeeService.getEmployeeById(emp_id);
    }

    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return  employeeService.addEmployee(employee);
    }
    @GetMapping("/vendor/{vendor_id}")
    public List<Employee> fetchEmployeesByVendorId(@PathVariable("vendor_id") Long vendor_id){
        return employeeService.getEmployeesByVendorId(vendor_id);
    }
    @GetMapping("/getEmployeesByDeliveryTpe/{deliveryType}")
    public List<Employee> fetchEmployeesByDeliveryType(@PathVariable("deliveryType") String deliveryType){
        return employeeService.getEmployeesByDeliveryType(deliveryType);
    }
}
