package com.martin.veterinary_clinic_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String name;
    private String lastname;
    private Integer phone_number;

    public Owner() {
    }

    public Owner(Long id, String dni, String name, String lastname, Integer phone_number) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.phone_number = phone_number;
    }
}
