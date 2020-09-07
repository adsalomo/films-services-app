/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.controller;

import com.cuevana.films.models.entity.Gender;
import com.cuevana.films.service.iface.GenderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Un web service es una vía de intercomunicación e interoperabilidad entre máquinas conectadas en Red.
 * REST tiene a simplificar las cosas y en esa misma línea se suele usar un lenguaje 
 * diferente para representación de los datos, el lenguaje JSON. 
 * 
 * Hoy REST y JSON se han convertido en la opción más sencilla y por tanto 
 * más recomendable para implementar un servicio web
 * 
 * El cliente solicita información, enviando a veces datos al 
 * servidor para que pueda procesar su solicitud. 
 * El servidor genera una respuesta que envía de vuelta al cliente, 
 * adjuntando otra serie de datos que forman parte de esa respuesta. 
 * Por tanto, podemos entender un servicio web como un tráfico de mensajes entre dos máquinas.
 * @author adrian
 */
@RestController
@RequestMapping("/gender")
@CrossOrigin("*")
public class GenderController {
    
    @Autowired
    private GenderService genderService;
    
    @GetMapping
    public List<Gender> getAll() {
        return this.genderService.getAll();
    }
}
