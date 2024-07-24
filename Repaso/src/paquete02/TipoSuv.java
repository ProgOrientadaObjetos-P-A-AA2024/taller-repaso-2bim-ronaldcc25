package paquete02;

import paquete01.Comprador;

public class TipoSuv extends Comprador {

    private int porcentajeAdicional;
    private double seguroPersonas;

    public void establecerPorcentajeAdicional(int p) {
        porcentajeAdicional = p;
    }

    public void calcularSeguroPersonas() {
        seguroPersonas = precioBase * (porcentajeAdicional / 100);
    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroPersonas;
    }

    public int obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }

}
