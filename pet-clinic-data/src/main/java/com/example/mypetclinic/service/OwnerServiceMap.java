package com.example.mypetclinic.service;

import com.example.mypetclinic.model.Owner;
import org.springframework.stereotype.Component;

@Component
public class OwnerServiceMap extends AbstractMapBasedService<Owner> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return findAll().stream().filter(o -> lastName.equalsIgnoreCase(o.getLastName()))
                .findAny().orElse(null);
    }
}
