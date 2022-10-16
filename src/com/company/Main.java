package com.company;

public class Main {

    public static void main(String[] args) {

        Municipio municipio= new Municipio("El olvido");
        ImpuestoDePropiedad impuesto1= ImpuestoDePropiedadFactory.getInstance().crearImpuesto(ImpuestoDePropiedadFactory.CASA);
        ImpuestoDePropiedad impuesto2= ImpuestoDePropiedadFactory.getInstance().crearImpuesto(ImpuestoDePropiedadFactory.CASA);
        ImpuestoDePropiedad impuesto3= ImpuestoDePropiedadFactory.getInstance().crearImpuesto(ImpuestoDePropiedadFactory.BARRIO);

        impuesto1.setNumero(130);
        impuesto1.setCalle("Av. San Martín");
        ((Casa) impuesto1).setMontoPorImpuesto(500.00);
        impuesto1.calcularImpuesto();


        impuesto2.setNumero(233);
        impuesto2.setCalle("Mitre");
        ((Casa) impuesto2).setMontoPorImpuesto(700.00);
        impuesto2.calcularImpuesto();



        impuesto3.setCalle("Gutierres");
        impuesto3.setNumero(330);
        ((BarrioCerrado) impuesto3).setFactorMultiplicador(2);





        try{
            cargarImpuesto((Casa)impuesto1, impuesto3);
            cargarImpuesto((Casa)impuesto2, impuesto3);
        }
        catch ( Exception e){
            System.out.println("error: " + e.getMessage());

        }

        municipio.agregarImpuestos(impuesto1);
        municipio.agregarImpuestos(impuesto2);
        municipio.agregarImpuestos(impuesto3);
        municipio.mostrarPropiedades();





	// write your code here
    }

    public static void cargarImpuesto( Casa casa, ImpuestoDePropiedad barrio) throws ExeptionAgregarImpuesto {
        if( barrio instanceof  BarrioCerrado){
            ((BarrioCerrado) barrio).agregarCasa(casa);
        }

        else{
            throw new ExeptionAgregarImpuesto("No pertenece a un Barrio");
        }
    }

}
