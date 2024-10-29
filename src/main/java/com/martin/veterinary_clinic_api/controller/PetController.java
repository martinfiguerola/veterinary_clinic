package com.martin.veterinary_clinic_api.controller;


import com.martin.veterinary_clinic_api.dto.PetDto;
import com.martin.veterinary_clinic_api.entity.Pet;
import com.martin.veterinary_clinic_api.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pet/get")
    public List<Pet> getAll () {
        return petService.findAll();
    }

    @PostMapping("/pet/create")
    public String create (@RequestBody Pet pet) {
        petService.save(pet);
        return "The pet was successfully created";
    }
    @DeleteMapping("/pet/delete/{id}")
    public String delete (@PathVariable Long id) {
        petService.deleteById(id);
        return "The pet was successfully removed";
    }
    @PutMapping("/pet/update")
    public Pet update (@RequestBody Pet pet) {
        return petService.update(pet);
    }

    @GetMapping("/pet")
    public List<Pet> findOnePet (@RequestParam String species, @RequestParam String breed) {
        return petService.findBySpeciesAndBreed(species, breed);
    }

    @GetMapping("/pet/owner/get/{id}")
    public PetDto getPetAndOwnerDto (@PathVariable Long id) {
        return petService.getPetsAndOwners(id);
    }
}
