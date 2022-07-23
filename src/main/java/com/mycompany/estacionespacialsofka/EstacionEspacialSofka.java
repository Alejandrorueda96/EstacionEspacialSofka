/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estacionespacialsofka;

/**
 *
 * @author Alejandro Rueda
 */
public class EstacionEspacialSofka {

    public static void main(String[] args) {
        
        NaveEspacial nave1 = new NaveEspacial(1, "Vision", "Lanzadera", 100, "Petroleo", "Luna");
        System.out.println("El nombre de la nave espacial es: " + nave1.getNombreNave());
        
        NaveEspacialTripulada tripu = new NaveEspacialTripulada();
        tripu.setNombreNave("NaveTripulada");
        System.out.println(tripu.getNombreNave());
    }
}
