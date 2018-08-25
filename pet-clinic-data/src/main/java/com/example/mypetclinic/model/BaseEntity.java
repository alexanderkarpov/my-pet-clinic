package com.example.mypetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(of = "id")
public class BaseEntity implements Serializable {

    private Long id;
}
