/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Archivo Tv.java
package com.tv;

/**
 *
 * @author Owner
 */

//Esta clase representa una television con marca, tamaño, volumen y si esta encendida o no
public class Tv {
    //Aqui se guardan los atributos de cada TV
    private String marca;
    private int pulgadas;
    private int volumen;
    private boolean encendida;
    
    //Constructor
    //Aqui le asignamos los datos iniciales (marca, tamaño, volumen y si esta encendida)
    public Tv(String marca, int pulgadas, int volumen, boolean encendida) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.volumen = volumen;
        this.encendida = encendida;
    }
    
    //Metodo para encender la TV
    public void encender() {
        this.encendida = true;
        System.out.println("La TV " + this.marca + " esta encendida. ");
    }
    
    //Metodo para apagar la TV
    public void apagar() {
        this.encendida = false;
        System.out.println("La TV " + this.marca + " esta apagada. ");
    }
    
    //Metodo para subir el volumen de la TV
    public void subirVolumen() {
        //Solo se puede subir el volumen si la TV esta encendida
        if (this.encendida) {
            this.volumen++;
            System.out.println("Subiendo volumen a: " + this.volumen);
        } else {
            System.out.println("No se puede subir el volumen. La TV esta apagada");
        }
        
    }
    
    //Metodo para cambiar de canal
    public void cambiarCanal(int canal) {
        //Aqui igual, solo se puede cambiar el canal si esta encendida
        if (this.encendida) {
            System.out.println("Cambiando al canal " + canal + " en la TV " + this.marca);
        } else {
            System.out.println("No se puede cambiar el canal. La TV esta apagada");
        }
    }
}
