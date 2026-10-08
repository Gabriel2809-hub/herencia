/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.clase01.animal;

/**
 *
 * @author gabri
 */
public class Animal {

    public static void main(String[] args) {
        animalHerencia juan = new doberman(" juan ");
        Mamifero gato = new gato(" lunna");
        animalHerencia victor = new Golden("");
        Pato animal = new PatoLucas("luucas ");
        animalHerencia gato1 = new GatoConBotas(" garfiel ");
        
        System.out.println(juan.hacerSonido());
        System.out.println(gato.hacerSonido());
        System.out.println(victor.hacerSonido());
        
        
    }//fin de main  
}
