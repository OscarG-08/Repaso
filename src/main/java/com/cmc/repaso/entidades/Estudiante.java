/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.repaso.entidades;

/**
 *
 * @author Oscar
 */
public class Estudiante {
    private String nombre;
    private double nota;
    private String resultado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    public void calificar(double nota){
        this.nota = nota;
        this.resultado = (nota >= 8) ? "A" : "F";
    } 
}
