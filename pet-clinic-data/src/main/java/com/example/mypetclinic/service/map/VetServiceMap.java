package com.example.mypetclinic.service.map;

import com.example.mypetclinic.model.Vet;
import com.example.mypetclinic.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapBasedService<Vet> implements VetService {
}
