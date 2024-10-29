package com.martin.veterinary_clinic_api.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PetDto {

    private String petName;
    private String petSpecies;
    private String breed;
    private String ownerName;
    private String ownerLastname;

    public PetDto() {
    }
    public PetDto(String petName, String petSpecies, String breed, String ownerName, String ownerLastname) {
        this.petName = petName;
        this.petSpecies = petSpecies;
        this.breed = breed;
        this.ownerName = ownerName;
        this.ownerLastname = ownerLastname;
    }


}
