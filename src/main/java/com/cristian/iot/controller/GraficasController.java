package com.cristian.iot.controller;


import com.cristian.iot.model.DataSensores;
import com.cristian.iot.repository.DataSensoresRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GraficasController {

    @Autowired
    private DataSensoresRepository dataSensoresRepository;


    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/graficas")
    public String mostrarGraficas() {
        // No es necesario agregar nada al modelo, ya que los datos serán obtenidos por la API
        return "graficas"; // El archivo HTML donde se carga el gráfico
    }

    // Endpoint para obtener los datos en formato JSON (para el gráfico)

}
