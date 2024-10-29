package com.martin.veterinary_clinic_api.controller;

import com.martin.veterinary_clinic_api.entity.Owner;
import com.martin.veterinary_clinic_api.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController{
    @Autowired
    private OwnerService ownerService;

    @GetMapping("/owner/get")
    public List<Owner> getAll () {
        return ownerService.findAll();
    }

    @PostMapping("/owner/create")
    public String create (@RequestBody Owner owner) {
        ownerService.save(owner);
        return "The owner was successfully created";
    }
    @DeleteMapping("/owner/delete/{id}")
    public String delete (@PathVariable Long id) {
        ownerService.deleteById(id);
        return "The owner was successfully removed";
    }
    @PutMapping("/owner/update")
    public Owner update (@RequestBody Owner owner) {
        return ownerService.update(owner);
    }
    
}
