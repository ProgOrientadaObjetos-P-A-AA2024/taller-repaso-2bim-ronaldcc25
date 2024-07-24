package paquete01;

public abstract class Auto {
        
    protected Comprador comprador;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;
    
    public Auto(Comprador c, String m, double p){
        marca = m;
        precioBase = p;
    }   

    public void establecerComprador(Comprador c) {
        comprador = c;
    }

    public void establecerPrecioBase(double p) {
        precioBase = p;
    }
    
    public void establecerMarca(String m) {
        marca = m;
    }

    public abstract void calcularPrecioFinal();       

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }
    
    public Comprador obtenerComprador() {
        return comprador;
    }
    
}
