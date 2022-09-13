package com.martinfluviapablo.s4t2.primary_adapters.rest;

import com.martinfluviapablo.s4t2.domain.input_ports.FruitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    primary_adapters.rest: 
        adaptadors d'entrada (controladors) de la API REST d'aquesta aplicació 
        deleguen l'execució de la lògica solicitada pel client al servei.
        Poden estar acoplats al model.
*/
    
@RestController
@RequestMapping(FruitaResource.RESOURCE_URI)
public class FruitaResource {
    
    public static final String RESOURCE_URI = "/fruita";
    
    @Autowired
    private FruitaService fruitaService;
    
}
