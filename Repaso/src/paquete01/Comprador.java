package paquete01;

public class Comprador {
    
    private String nombre;
    private String cedula;    
    
    public Comprador(String n, String c, String m){
    
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }
}
