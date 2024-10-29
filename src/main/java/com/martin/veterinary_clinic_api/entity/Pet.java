package com.martin.veterinary_clinic_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
    private String breed;
    private String color;
    @OneToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(Long id, String name, String species, String breed, String color) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.color = color;
    }
}
