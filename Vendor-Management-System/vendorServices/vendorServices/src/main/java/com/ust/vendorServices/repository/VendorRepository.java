package com.ust.vendorServices.repository;

import com.ust.vendorServices.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
