package com.martin.veterinary_clinic_api.service;

import com.martin.veterinary_clinic_api.entity.Owner;
import com.martin.veterinary_clinic_api.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService{

    @Autowired
    private OwnerRepository ownerRepository;


    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    @Override
    public void save(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner update(Owner owner) {
        ownerRepository.save(owner);
        return this.findById(owner.getId());
    }
}
