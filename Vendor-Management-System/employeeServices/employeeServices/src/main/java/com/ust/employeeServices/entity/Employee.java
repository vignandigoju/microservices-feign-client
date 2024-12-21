package com.ust.employeeServices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    public Long emp_id;
    public String name;
    public Long phone_no;
    public String email;
    @Column(name = "vendor_id")
    public Long vendorId;
    public String ordered_on;
    public String estimated_delivery;
    public String status;
    public String address;
    public Long order_id;
    public String deliveryType;

}
