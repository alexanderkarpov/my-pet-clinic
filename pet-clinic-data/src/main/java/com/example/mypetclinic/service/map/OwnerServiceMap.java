package com.example.mypetclinic.service.map;

import com.example.mypetclinic.model.Owner;
import com.example.mypetclinic.service.OwnerService;
import com.example.mypetclinic.service.PetService;
import com.example.mypetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerServiceMap extends AbstractMapBasedService<Owner> implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return findAll().stream().filter(o -> lastName.equalsIgnoreCase(o.getLastName()))
                .findAny().orElse(null);
    }

    @Override
    public Owner save(Owner obj) {
        return Optional.ofNullable(obj)
                .map(this::saveNotNull)
                .orElse(null);
    }

    private Owner saveNotNull(Owner obj) {
        return super.save(obj);
    }

}
