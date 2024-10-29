package com.martin.veterinary_clinic_api.service;

import com.martin.veterinary_clinic_api.dto.PetDto;
import com.martin.veterinary_clinic_api.entity.Owner;
import com.martin.veterinary_clinic_api.entity.Pet;

import java.util.List;

public interface PetService {

    List<Pet> findAll ();
    void save (Pet pet);
    Pet findById (Long id);
    void deleteById (Long id);
    Pet update (Pet pet);
    List<Pet> findBySpeciesAndBreed (String species, String breed);
    PetDto getPetsAndOwners (Long id);


}
