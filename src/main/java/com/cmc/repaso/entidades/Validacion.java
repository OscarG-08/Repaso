/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.repaso.entidades;

/**
 *
 * @author Oscar
 */
public class Validacion {
    public boolean validarMonto(double monto){
        if (!(monto > 0) ) {
            return false;
        }
        return true;
    }
}
