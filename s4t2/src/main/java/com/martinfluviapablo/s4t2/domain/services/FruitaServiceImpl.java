package com.martinfluviapablo.s4t2.domain.services;

import com.martinfluviapablo.s4t2.domain.input_ports.FruitaService;
import com.martinfluviapablo.s4t2.domain.output_ports.persistence_ports.FruitaPersistence;

import org.springframework.stereotype.Service;

/*
    domain.services: implementacions de les interfaces en domain.input_ports
*/

@Service
public class FruitaServiceImpl implements FruitaService{
    
   private FruitaPersistence fruitaPersistence;   
    
}
