package com.example.mypetclinic.service;

import com.example.mypetclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapBasedService<Pet> implements PetService {
}
