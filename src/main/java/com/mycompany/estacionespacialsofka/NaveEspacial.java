package com.mycompany.estacionespacialsofka;


public class NaveEspacial {
    int idNave;
    String nombreNave;
    String tipoNave;
    int peso;
    String combustible;
    String destinoFinal;

    //Constructor NaveEspacial
    public NaveEspacial(int idNave, String nombreNave, String tipoNave, int peso, String combustible, String destinoFinal) {
        this.idNave = idNave;
        this.nombreNave = nombreNave;
        this.tipoNave = tipoNave;
        this.peso = peso;
        this.combustible = combustible;
        this.destinoFinal = destinoFinal;
    }
    
}
