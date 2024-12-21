package com.ust.vendorServices.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public Long vendor_id;
    public String vendor_name;
    public String vendor_address;
    public String op_hours;
    public String[] services;
    public String[] availableServiceLocations;
    public Long phone_no;
    public String email;
    public String sellingProduct;
    public List<Employee> customers;

    public Long getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(Long vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }

    public String getOp_hours() {
        return op_hours;
    }

    public void setOp_hours(String op_hours) {
        this.op_hours = op_hours;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String[] getAvailableServiceLocations() {
        return availableServiceLocations;
    }

    public void setAvailableServiceLocations(String[] availableServiceLocations) {
        this.availableServiceLocations = availableServiceLocations;
    }

    public Long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Long phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSellingProduct() {
        return sellingProduct;
    }

    public void setSellingProduct(String sellingProduct) {
        this.sellingProduct = sellingProduct;
    }

    public List<Employee> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Employee> customers) {
        this.customers = customers;
    }
}
