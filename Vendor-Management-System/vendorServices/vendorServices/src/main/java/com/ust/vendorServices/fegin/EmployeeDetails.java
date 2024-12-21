package com.ust.vendorServices.fegin;

import com.ust.vendorServices.config.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee-services", url = "http://localhost:9097/employee")
public interface EmployeeDetails {

    @GetMapping("/vendor/{vendor_id}")
    List<Employee> findEmployeesByVendorId(@PathVariable("vendor_id") Long vendor_id);
}
