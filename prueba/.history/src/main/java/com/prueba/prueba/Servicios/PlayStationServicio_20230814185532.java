package com.prueba.prueba.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.Objetos.PlayStation;
import com.prueba.prueba.Repositorios.PlayStationRepositorio;

@Service
public class PlayStationServicio {
    
    @Autowired
    PlayStationRepositorio playStationRepositorio;

    public PlayStation registrarPlayStation(PlayStation playStation){
        
        PlayStation play = new PlayStation();
        if(playStationRepositorio.existsById(playStation.getNoSerie())){
            return play;
        }else{
            return playStationRepositorio.save(playStation);
        }
    }

    public List<PlayStation> obtenerPlayStations(){
        return playStationRepositorio.findAll();
    }

}
