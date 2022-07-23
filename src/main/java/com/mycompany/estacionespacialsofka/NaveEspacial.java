package com.mycompany.estacionespacialsofka;


public class NaveEspacial {
    int idNave;
    String nombreNave;
    String tipoNave;
    int peso;
    String combustible;
    String destinoFinal;

    //Constructor NaveEspacial
    public NaveEspacial(){
        
    }
    
    public NaveEspacial(int idNave, String nombreNave, String tipoNave, int peso, String combustible, String destinoFinal) {
        this.idNave = idNave;
        this.nombreNave = nombreNave;
        this.tipoNave = tipoNave;
        this.peso = peso;
        this.combustible = combustible;
        this.destinoFinal = destinoFinal;
    }
    //Getters y Setters 
    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }
    
    
    
}
