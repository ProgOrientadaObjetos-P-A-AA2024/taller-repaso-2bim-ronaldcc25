package paquete01;

public abstract class Comprador {
    
    protected String nombre;
    protected String cedula;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecioBase(double p) {
        precioBase = p;
    }

    public abstract void calcularPrecioFinal();    

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }
    
    
}
