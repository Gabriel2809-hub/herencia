/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase01.animal;

/**
 *
 * @author gabri
 */
public class GatoConBotas extends gato{
    
    public GatoConBotas(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return super.hacerSonido()+" tiene botas el gato con botas ? "; 
    }
    
    
}
