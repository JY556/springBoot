/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.springBoot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Size(min = 1, max = 50, message = "error de longitud de caracteres" )
    @NotNull
    private String nombre;
    
    @Size(min = 1, max = 50, message = "error de longitud de caracteres" )
    @NotNull
    private String apellido;
    
    @Size(min = 1, max = 50, message = "error de longitud de caracteres" )
    private String img;
    public Persona(){
        
    }
  
    public Persona(Long id, String nombre, String apellido, String imagen){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = imagen;
    }
}
