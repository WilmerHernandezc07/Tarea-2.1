/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Archivo Prueba.java
package com.tv;

/**
 *
 * @author Owner
 */

//Esta clase es para probar como funciona la clse Tv
public class Prueba {
    public static void main(String[] args) {
        
        //Aqui vse crean las 3 instancias, que son tres televisores diferentes
        Tv tvSala = new Tv ("Samsung", 55, 10, false);
        Tv tvCuarto = new Tv ("Tecnomaster", 46, 8, false);
        Tv tvCocina = new Tv ("Sony", 32, 5, false);
        
        //Aqui se hacen pruebas con cada TV
        System.out.println("\n--- TV de la Sala ---");
        tvSala.encender(); //Prendemos la TV de la Sala
        tvSala.subirVolumen(); //Subimos el volumen
        tvSala.cambiarCanal(7); //Cambiamos al canal 7
        tvSala.apagar(); //Apagamos la TV
        
        System.out.println("\n--- TV del Cuarto ---");
        tvCuarto.encender(); //Prendemos la TV del Cuarto
        tvCuarto.subirVolumen(); //Subimos el volumen
        tvCuarto.cambiarCanal(12); //Cambiamos al canal 12
        tvCuarto.apagar(); //Apagamos
        
        System.out.println("\n--- TV de la Cocina ---");
        tvCocina.encender(); //Prendemos la TV de la Cocina
        tvCocina.subirVolumen(); //Subimos el volumen
        tvCocina.cambiarCanal(3); //Cambiamos al canal 12
        tvCocina.apagar(); //Apagamos
    }
    
}
