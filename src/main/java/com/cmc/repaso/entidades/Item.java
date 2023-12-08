/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.repaso.entidades;

/**
 *
 * @author Oscar
 */
public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    public Item(String nombre, int productosActuales) {
        this.nombre = nombre;
        this.productosActuales = productosActuales;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProductosActuales() {
        return productosActuales;
    }

    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }

    public int getProductosDevueltos() {
        return productosDevueltos;
    }

    public void setProductosDevueltos(int productosDevueltos) {
        this.productosDevueltos = productosDevueltos;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }
    
    
    public void imprimir(){
        System.out.println("Productos Actuales de " + this.nombre + " " + this.productosActuales);
        System.out.println("Productos Devueltos de " + this.nombre + " " + this.productosDevueltos);
        System.out.println("Productos Vendidos de " + this.nombre + " " + this.productosVendidos);
    }
    
    public void vender(int vendidos){
        this.productosActuales -= vendidos;
        this.productosVendidos += vendidos;
    }
    
    public void devolver(int devueltos){
        this.productosActuales += devueltos;
        this.productosVendidos -= devueltos;
        this.productosDevueltos += devueltos;
    }
}
