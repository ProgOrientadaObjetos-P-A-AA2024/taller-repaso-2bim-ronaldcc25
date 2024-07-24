package paquete02;

import paquete01.Comprador;

public class TipoSedan extends Comprador{
    
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public void establecerProcentajeDescuento(double p) {
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

    public double obtenerProcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDesceunto() {
        return valorDescuento;
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }
    
}
