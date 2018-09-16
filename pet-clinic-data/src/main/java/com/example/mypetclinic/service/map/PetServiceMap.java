package com.example.mypetclinic.service.map;

import com.example.mypetclinic.model.Pet;
import com.example.mypetclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapBasedService<Pet> implements PetService {
}
