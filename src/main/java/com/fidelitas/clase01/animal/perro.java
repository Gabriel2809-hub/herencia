/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase01.animal;

/**
 *
 * @author gabri
 */
public class perro extends Mamifero{
    
    public perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return super.hacerSonido()+" (GUAU GUAU GUAU) ";
    }
    
    
}//fin
