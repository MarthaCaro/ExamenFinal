package com.company;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends ImpuestoDePropiedad{

    private int factorMultiplicador;
    private List<Casa> casas;


    public BarrioCerrado(){
        casas = new ArrayList<>();
    }

    public int getFactorMultiplicador() {
        return factorMultiplicador;
    }

    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }

    public List<Casa> getCasas() {
        return casas;
    }

    public void setCasas(List<Casa> casas) {
        this.casas = casas;
    }

    public void agregarCasa(Casa nuevo){
        casas.add(nuevo);
    }

    @Override
    public Double calcularImpuesto() {
        double impuestoTotal=0;
        for ( ImpuestoDePropiedad p: casas){
            impuestoTotal+= p.calcularImpuesto()* this.factorMultiplicador;
        }
        return impuestoTotal;
    }


}
