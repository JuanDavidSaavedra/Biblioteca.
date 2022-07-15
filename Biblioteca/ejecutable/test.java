package ejecutable;

import controlador.Controlador;
import modelo.Libro;
import vista.VentanaPrincipal;

public class test
{
    public static void main (String[] args)
    {
        VentanaPrincipal venPrin = new VentanaPrincipal();
        Libro model = new Libro("", "", "", 0, false);
        Controlador miControlador = new Controlador(venPrin, model);
        
    }
}