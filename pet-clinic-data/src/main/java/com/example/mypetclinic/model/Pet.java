package com.example.mypetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDay;
}
