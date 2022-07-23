/*
 * 
 * 
 */
package com.mycompany.estacionespacialsofka;

public class NaveEspacialTripulada extends NaveEspacial{
    int numeroTripulantes;
    String finalidadViaje;

    public NaveEspacialTripulada(int numeroTripulantes, String finalidadViaje, int idNave, String nombreNave, String tipoNave, int peso, String combustible, String destinoFinal) {
        super(idNave, nombreNave, tipoNave, peso, combustible, destinoFinal);
        this.numeroTripulantes = numeroTripulantes;
        this.finalidadViaje = finalidadViaje;
    }

    
    
    
}
