package paquete02;

import paquete01.Auto;
import paquete01.Comprador;

public class TipoSedan extends Auto{
    
    private Comprador propietario;
    private int porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public TipoSedan(Comprador c, String m, double p, int pD) {
        super(c, m, p);
        porcentajeDescuento = pD;
    }
    
    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

    public void establecerProcentajeDescuento(int p) {
        porcentajeDescuento = p;
    }

    public void calcularValorDesceunto() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
    }

    public void establecerSeguroMecanico() {
        seguroMecanico = precioBase * 0.1;
    }
    
    @Override
    public void calcularPrecioFinal(){
        precioFinal = (precioBase - valorDescuento) + seguroMecanico;
    }

    public int obtenerProcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDesceunto() {
        return valorDescuento;
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }
    
    public Comprador obtenerPropietario() {
        return propietario;
    }
    
}
