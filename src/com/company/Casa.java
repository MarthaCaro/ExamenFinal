package com.company;

public class Casa extends ImpuestoDePropiedad{

    private Double montoPorImpuesto;

    public Double getMontoPorImpuesto() {
        return montoPorImpuesto;
    }

    public void setMontoPorImpuesto(Double montoPorImpuesto) {
        this.montoPorImpuesto = montoPorImpuesto;
    }

    @Override
    public Double calcularImpuesto() {
        if( super.getCalle().equals("Av. San Martín")){
            this.montoPorImpuesto = montoPorImpuesto *1.1;
            return montoPorImpuesto;
        }
        return montoPorImpuesto;
    }
}
