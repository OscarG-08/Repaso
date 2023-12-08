/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.repaso.entidades;

/**
 *
 * @author Oscar
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = (precio > 0) ? precio : precio*-1;
    }
    public double calcularPrecioPromo(double porcentaje){
        if (porcentaje < 0) {
            return this.precio;
        }else{
            return ((1 - (porcentaje/100))*this.precio);
        }
    }
}
