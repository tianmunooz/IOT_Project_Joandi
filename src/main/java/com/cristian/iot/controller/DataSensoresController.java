package com.cristian.iot.controller;


import com.cristian.iot.model.DataSensores;
import com.cristian.iot.repository.DataSensoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class DataSensoresController {


    @Autowired
    private DataSensoresRepository dataSensoresRepository;

    @PostMapping("/guardarDatos")
    public DataSensores crearDataSensores(@RequestBody DataSensores dataSensores){

        return dataSensoresRepository.save(dataSensores);
    }



    @GetMapping("/obtenerdatos")
    public List<DataSensores> obtenerDatosSensores() {
        return dataSensoresRepository.findAll(); // Retorna todos los datos de la base de datos
    }

}
