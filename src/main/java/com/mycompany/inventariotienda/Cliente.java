/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariotienda;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    //Atributos
    final private String nombre;

    //Constructor
    public Cliente(String nomb){
        this.nombre = nomb;
    }

    //GET
    public String get_nombre(){
            return nombre;
    }
}
