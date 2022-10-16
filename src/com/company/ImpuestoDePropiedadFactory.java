package com.company;

public class ImpuestoDePropiedadFactory {

    private static ImpuestoDePropiedadFactory instancia;
    public static final String CASA="CASA";
    public static final String BARRIO="BARRIO";


    private ImpuestoDePropiedadFactory(){}

    public static ImpuestoDePropiedadFactory getInstance(){
        if(instancia== null)
            instancia=new ImpuestoDePropiedadFactory();
        return instancia;

    }

    public ImpuestoDePropiedad crearImpuesto(String tipo)
    {
        switch (tipo){
            case CASA:
                return new Casa();

            case BARRIO:
                return new BarrioCerrado();
        }
        return null;
    }


}
