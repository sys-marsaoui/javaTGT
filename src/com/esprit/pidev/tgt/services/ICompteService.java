/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.pidev.tgt.services;

import com.esprit.pidev.tgt.entities.Compte;
import java.sql.SQLException;

/**
 *
 * @author goldzeo
 */
public interface ICompteService {
    public int save(Compte compte) throws SQLException;
    public Compte findByUsername(String username) throws SQLException; 
    
}
