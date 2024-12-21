package com.ust.employeeServices.repository;

import com.ust.employeeServices.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByVendorId(Long vendor_id);
    List<Employee> findEmployeesByDeliveryType(String deliveryType);
}
