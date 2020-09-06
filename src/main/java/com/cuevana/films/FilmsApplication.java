/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase main que inicializa la aplicación
 * Inicia Spring ApplicationContext y carga los beans en el contexto de aplicacion de spring
 * A traves de @SpringBootApplication se escanean los componentes del paquete actual
 * y sus subpaquetes.
 * Para una aplicación sprint boot, es necesario definir esta clase con la anotacion @SpringBootApplication
 *
 * @author adrian
 */
@SpringBootApplication
public class FilmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmsApplication.class, args);
    }
}
