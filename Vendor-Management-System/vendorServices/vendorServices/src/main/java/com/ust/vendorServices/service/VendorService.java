package com.ust.vendorServices.service;

import com.ust.vendorServices.config.Employee;
import com.ust.vendorServices.config.FullResponse;
import com.ust.vendorServices.entity.Vendor;

import com.ust.vendorServices.fegin.EmployeeDetails;
import com.ust.vendorServices.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    VendorRepository repository;
    @Autowired
    public EmployeeDetails details;

    public Vendor saveVendor(Vendor vendor){
        return repository.save(vendor);
    }
    public List<Vendor> getAllVendors(){
        return  repository.findAll();
    }
    public Vendor getVendorById(Long vendor_id){
        return repository.findById(vendor_id).orElse(null);
    }
    public FullResponse getVendorInfoById(Long vendor_id){
        Vendor vendor = repository.findById(vendor_id).orElse(null);
        List<Employee> customers = details.findEmployeesByVendorId(vendor_id);
        FullResponse fullResponse = new FullResponse();
        fullResponse.setVendor_id(vendor.getVendor_id());
        fullResponse.setVendor_name(vendor.getVendor_name());
        fullResponse.setVendor_address(vendor.getVendor_address());
        fullResponse.setOp_hours(vendor.getOp_hours());
        fullResponse.setServices(vendor.getServices());
        fullResponse.setAvailableServiceLocations(vendor.getAvailableServiceLocations());
        fullResponse.setPhone_no(vendor.getPhone_no());
        fullResponse.setEmail(vendor.getEmail());
        fullResponse.setSellingProduct(vendor.getSellingProduct());
        fullResponse.setCustomers(customers);
        return fullResponse;
    }
}
