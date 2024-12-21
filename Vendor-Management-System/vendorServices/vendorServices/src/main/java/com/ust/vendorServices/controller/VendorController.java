package com.ust.vendorServices.controller;

import com.ust.vendorServices.config.FullResponse;
import com.ust.vendorServices.entity.Vendor;
import com.ust.vendorServices.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    VendorService vendorService;

    @PostMapping("/addVendor")
    public Vendor addVendor(@RequestBody  Vendor vendor){
        return vendorService.saveVendor(vendor);
    }
    @GetMapping("/findAllVendors")
    public List<Vendor> fetchVendors(){
        return vendorService.getAllVendors();
    }
    @GetMapping("/findVendorById/{vendor_id}")
    public Vendor getVendorById(@PathVariable("vendor_id") Long vendor_id){
        return vendorService.getVendorById(vendor_id);
    }
    @GetMapping("/vendor/{vendor_id}")
    public ResponseEntity<FullResponse> getVendorInfoById(@PathVariable("vendor_id") Long vendor_id){
        return ResponseEntity.ok(vendorService.getVendorInfoById(vendor_id));
    }
}
