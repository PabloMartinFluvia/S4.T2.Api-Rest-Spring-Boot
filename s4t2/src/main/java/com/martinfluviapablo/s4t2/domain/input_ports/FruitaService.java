package com.martinfluviapablo.s4t2.domain.input_ports;

import org.springframework.stereotype.Service;

/*
    domain.input_ports: És atacat pels adaptadors d'entrada / controladors.
        S'usa una interfaç entre els adaptadors i la implementació del servei per a,
        en cas de necessitat, fer modificacions en l'execució de la lògica solicitada
        sense afectar als adaptadors d'entrada / controladors
        Poden estar acoplats als models i a les interfaces de la persistencia.
        implementacio en domain.services
    
*/

@Service
public interface FruitaService {
    
}
