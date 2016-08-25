/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.ave;

import models.Animal;

/**
 *
 * @author fabricio
 */
public class Ave extends Animal implements InterfaceAve{
    
    //ATRIBUTOS
    
    protected String altura;
    
    //CONSTRUCTOR
    public Ave(){
        
    }
    
    @Override
    public String alturaVuelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
