package com.example.mypetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

}
