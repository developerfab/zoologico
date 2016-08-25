/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author fabricio
 */
public class ListaAnimales {
    
    //ATRIBUTOS
    private static ArrayList<Animal> animales = new ArrayList<Animal>();
    private static ListaAnimales lista = null;
    
    //CONSTRUCTOR
    private ListaAnimales(){
        
    }
    
    //METODOS
    public static ListaAnimales getListaAnimales(){
        if (lista==null){
            lista = new ListaAnimales();
        }
        return lista;
    }
    
    public ArrayList<Animal> getAnimales(){
        return animales;
        
    }

    public void adicionar(Animal animal) {
        animales.add(animal);
        System.out.println("********************");
        System.out.println(animales.get(0));
        System.out.println("********************");
    }
    
}
