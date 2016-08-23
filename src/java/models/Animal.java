/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author fabricio
 */
public abstract class Animal implements InterfaceGeneral{
    
    //ATRIBUTOS
    protected String extremidades;//patas o aletas
    protected String piel;//pelaje, escamas, plumas
    protected String sangre;//caliente o fria
    protected String reproduccion;//Viviparo u oviparo
    
    //CONSTRUCTOR
    public Animal(){
        
    }
    
    //ATRIBUTOS
    @Override
    public String comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String dormir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
