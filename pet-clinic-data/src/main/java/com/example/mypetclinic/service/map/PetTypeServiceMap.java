package com.example.mypetclinic.service.map;

import com.example.mypetclinic.model.PetType;
import com.example.mypetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return null;
    }

    @Override
    public PetType findById(Long aLong) {
        return null;
    }

    @Override
    public PetType save(PetType obj) {
        return null;
    }

    @Override
    public void delete(PetType obj) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
