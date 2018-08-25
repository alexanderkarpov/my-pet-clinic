package com.example.mypetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pet extends BaseEntity {

    private PerType perType;
    private Owner owner;
    private LocalDate birthDay;
}
