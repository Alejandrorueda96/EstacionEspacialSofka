/*
 * 
 * 
 */
package com.mycompany.estacionespacialsofka;

public class NaveEspacialTripulada extends NaveEspacial{
    int numeroTripulantes;
    String finalidadViaje;

    public NaveEspacialTripulada() {
        
    }

    
    public NaveEspacialTripulada(int numeroTripulantes, String finalidadViaje, int idNave, String nombreNave, String tipoNave, int peso, String combustible, String destinoFinal) {
        super(idNave, nombreNave, tipoNave, peso, combustible, destinoFinal);
        this.numeroTripulantes = numeroTripulantes;
        this.finalidadViaje = finalidadViaje;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getFinalidadViaje() {
        return finalidadViaje;
    }

    public void setFinalidadViaje(String finalidadViaje) {
        this.finalidadViaje = finalidadViaje;
    }

    
}
