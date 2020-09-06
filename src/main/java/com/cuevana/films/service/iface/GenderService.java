/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.service.iface;

import com.cuevana.films.models.entity.Gender;
import java.util.List;

/**
 * Interfaz gender service
 * @author adrian
 */
public interface GenderService {
    
    List<Gender> getAll();
}
