package paquete02;

import paquete01.Auto;
import paquete01.Comprador;

public class TipoSuv extends Auto {

    private Comprador propietario;
    private int porcentajeAdicional;
    private double seguroPersonas;
    
    public TipoSuv(Comprador c, String m, double p, int pA){
        super(c, m, p);
        porcentajeAdicional = pA;
    }

    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

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

    public Comprador obtenerPropietario() {
        return propietario;
    }

}
