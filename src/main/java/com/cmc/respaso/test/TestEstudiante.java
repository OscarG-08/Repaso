/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.respaso.test;

import com.cmc.repaso.entidades.Estudiante;

/**
 *
 * @author Oscar
 */
public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Oscar");
        estudiante.calificar(8);
        System.out.println("El estudiante "+estudiante.getNombre() + " obtuvo como resultado: " + estudiante.getResultado());
    }
}
