/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase01.animal;

/**
 *
 * @author gabri
 */
public class animalHerencia {
    private String nombre;

    public animalHerencia(String nombre) {
        this.nombre = nombre;
    }

    public animalHerencia() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String hacerSonido(){
        return "mi sonido es : ";
    
    }

    @Override
    public String toString() {
        return "animalHerencia{" + "nombre=" + nombre + '}';
    }
    
    
}//
