/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.respaso.test;

import com.cmc.repaso.entidades.Item;

/**
 *
 * @author Oscar
 */
public class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item("Teclados", 20);
        item1.imprimir();
        item1.vender(12);
        item1.devolver(3);
        item1.imprimir();
        System.out.println("Segundo Item");
        Item item2 = new Item("Auriculares", 80);
        item1.imprimir();
        item1.vender(78);
        item1.devolver(6);
        item1.imprimir();
    }
}
