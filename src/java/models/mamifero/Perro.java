/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.mamifero;

/**
 *
 * @author fabricio
 */
public class Perro extends Mamifero {
    
    //CONSTRUCTOR
    public Perro(String nombre){
        this.nombre = nombre;
        this.especie = "Perro";
        this.tipo = "Mamifero";
    }
    
}
