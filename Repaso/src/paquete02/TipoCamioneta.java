package paquete02;

import paquete01.Auto;
import paquete01.Comprador;

public class TipoCamioneta extends Auto{
    
    private Comprador propietario;
    private int porcentajeAdicionalFijo;
    private double valorAdicionalFijo;
    private double seguroMantenimiento;

    public TipoCamioneta(Comprador c, String m, double p, int pF) {
        super(c, m, p);
        porcentajeAdicionalFijo = pF;
    }
    
    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

    public void establecerProcentajeAdicionalFijo(int p) {
        porcentajeAdicionalFijo = p;
    }

    public void calcularValorAdicionalFijo() {
        valorAdicionalFijo = precioBase * (porcentajeAdicionalFijo / 100);
    }

    public void calcularSeguroMantenimiento() {
        seguroMantenimiento = valorAdicionalFijo * 1.5;
    }

    public void establecerPrecioFinal(double p) {
        precioFinal = p;
    }
    
    @Override
    public void calcularPrecioFinal(){
        precioFinal = precioBase + valorAdicionalFijo + seguroMantenimiento;
    }

    public int obtenerProcentajeAdicionalFijo() {
        return porcentajeAdicionalFijo;
    }

    public double obtenerValorAdicionalFijo() {
        return valorAdicionalFijo;
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }
    
}
