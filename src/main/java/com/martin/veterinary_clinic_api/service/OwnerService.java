package com.martin.veterinary_clinic_api.service;

import com.martin.veterinary_clinic_api.entity.Owner;

import java.util.List;

public interface OwnerService {

    List<Owner> findAll ();
    void save (Owner owner);
    Owner findById (Long id);
    void deleteById (Long id);
    Owner update (Owner owner);
}
