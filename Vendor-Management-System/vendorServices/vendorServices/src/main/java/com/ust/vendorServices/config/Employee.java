package com.ust.vendorServices.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    public Long emp_id;
    public String name;
    public Long phone_no;
    public String address;
    public String ordered_on;
    public String estimated_delivery;
    public String status;
    public Long vendor_id;
    public String deliveryType;
}
