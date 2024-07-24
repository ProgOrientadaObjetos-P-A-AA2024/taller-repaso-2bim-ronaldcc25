package paquete03;

import java.util.ArrayList;
import paquete01.*;
import paquete02.*;

public class Repaso {

    public static void main(String[] args) {
        
        ArrayList<Auto> listaVehiculos = new ArrayList<> ();
        
        Comprador c1 = new Comprador("Julio", "1102354698", "Lexus");
        TipoSuv t1 = new TipoSuv(c1, "", 0, 0);
    }
    
}
