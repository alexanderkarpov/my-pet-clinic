package com.example.mypetclinic.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pet {

    private PerType perType;
    private Owner owner;
    private LocalDate birthDay;
}
