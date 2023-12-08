/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.respaso.test;

import com.cmc.repaso.entidades.Producto;

/**
 *
 * @author Oscar
 */
public class TestProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Samsung", 648);
        producto.setPrecio(-255);
        System.out.println("Precio  original " + producto.getPrecio());
        System.out.println("Precio con descuento "+producto.calcularPrecioPromo(25)); 
        
    }
}
