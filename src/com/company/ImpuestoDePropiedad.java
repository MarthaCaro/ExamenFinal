package com.company;

public abstract class ImpuestoDePropiedad {

    private String calle;
    private int numero;

    public abstract Double calcularImpuesto();

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
