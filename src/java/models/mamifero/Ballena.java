/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.mamifero;

import models.pez.InterfacePez;

/**
 *
 * @author fabricio
 */
public class Ballena extends Mamifero implements InterfacePez{
    
    //CONSTRUCTOR
    public Ballena(String nombre){
        this.nombre = nombre;
    }

    //METODOS
    @Override
    public String nadar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
