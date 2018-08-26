package com.example.mypetclinic.service;

import com.example.mypetclinic.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetServiceMap extends AbstractMapBasedService<Pet> implements PetService {
}
