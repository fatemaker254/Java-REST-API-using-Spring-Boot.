package com.personal.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

    CloudVendor cloudVendor ;
    @GetMapping("{vendorId}")
    //get methhod 
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return new CloudVendor("C1","AWS","Seattle","1234567890");
    }
    //creation of the vendor details
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Details Created Successfully";
    }

    //updation
    @PutMapping
    public String UpdateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Details updated  Successfully";
    }

    //deletion
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor Details deleted  Successfully";
    }
}
