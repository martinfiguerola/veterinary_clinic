package com.martin.veterinary_clinic_api.service;

import com.martin.veterinary_clinic_api.dto.PetDto;
import com.martin.veterinary_clinic_api.entity.Pet;
import com.martin.veterinary_clinic_api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService{

    @Autowired
    private PetRepository petRepository;

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public void save(Pet pet) {
        petRepository.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }

    @Override
    public Pet update(Pet pet) {
        petRepository.save(pet);
        return this.findById(pet.getId());
    }

    @Override
    public List<Pet> findBySpeciesAndBreed (String species, String breed) {
        return petRepository.findBySpeciesAndBreed(species, breed);
    }

    @Override
    public PetDto getPetsAndOwners (Long id) {
        PetDto petDto = new PetDto();
        Pet pet = this.findById(id);

        petDto.setPetName(pet.getName());
        petDto.setPetSpecies(pet.getSpecies());
        petDto.setBreed(pet.getBreed());
        petDto.setOwnerName(pet.getOwner().getName());
        petDto.setOwnerLastname(pet.getOwner().getLastname());

        return petDto;
    }

}
