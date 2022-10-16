package com.company;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private String nombre;
    private List<ImpuestoDePropiedad> impuestos;

    public Municipio(String nombre) {
        this.nombre = nombre;
        impuestos= new ArrayList<>();
    }

    public void agregarImpuestos(ImpuestoDePropiedad nuevo){
        impuestos.add(nuevo);
    }

    public void mostrarPropiedades(){
        for(ImpuestoDePropiedad i: impuestos){
            System.out.println("calle: "+i.getCalle()+ " Numero:"+ i.getNumero()+ " Impuesto: "+ i.calcularImpuesto());
        }
    }


}
