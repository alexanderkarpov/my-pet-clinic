package com.example.mypetclinic.service.map;

import com.example.mypetclinic.model.PetType;
import com.example.mypetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapBasedService<PetType> implements PetTypeService {
}
