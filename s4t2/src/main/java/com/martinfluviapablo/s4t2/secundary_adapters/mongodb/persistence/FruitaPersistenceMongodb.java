package com.martinfluviapablo.s4t2.secundary_adapters.mongodb.persistence;

import com.martinfluviapablo.s4t2.domain.output_ports.persistence_ports.FruitaPersistence;

import com.martinfluviapablo.s4t2.secundary_adapters.mongodb.daos.FruitaRepository;

import org.springframework.stereotype.Repository;

/*
secundary_adapters.XXX.persistence: 
    adaptadors de sortida de dades que ataquen a la BD.
    implementacions de les interfaces de domain.output_ports.persistence_ports
    segons el motor de BD usat (XXX)
*/

@Repository
public class FruitaPersistenceMongodb implements FruitaPersistence{ //??????
    
    private FruitaRepository fruitaRepository;
    
}
