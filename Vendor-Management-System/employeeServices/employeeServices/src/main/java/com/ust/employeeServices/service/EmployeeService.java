package com.ust.employeeServices.service;

import com.ust.employeeServices.entity.Employee;
import com.ust.employeeServices.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository repository;

    public Employee addEmployee(Employee employee){
        return repository.save(employee);
    }
    public Employee getEmployeeById(Long emp_id){
        return repository.findById(emp_id).orElse(null);
    }

    public List<Employee> getEmployeesByVendorId(Long vendor_id){
        return repository.findByVendorId(vendor_id);
    }
    public List<Employee> getEmployeesByDeliveryType(String deliveryType){
        return  repository.findEmployeesByDeliveryType(deliveryType);
    }
}
