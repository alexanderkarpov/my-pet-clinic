package com.example.mypetclinic.service.map;

import com.example.mypetclinic.model.Owner;
import com.example.mypetclinic.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapBasedService<Owner> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return findAll().stream().filter(o -> lastName.equalsIgnoreCase(o.getLastName()))
                .findAny().orElse(null);
    }
}
