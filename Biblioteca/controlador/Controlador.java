package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Libro;
import vista.LibroDeColeccion;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Libro model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin, Libro model)
    {
        this.venPrin = venPrin;
        this.model = model;
        this.venPrin.miPanelResultados.agregarOyentesBotones2(this);
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("MostrarInfoLibro"))
        {
            try 
            {
                
                String nombreLibro = venPrin.miPanelEntradaDatos.getNomLib();
                String nombreAutor = venPrin.miPanelEntradaDatos.getNomAutor();
                String nombreAutores = venPrin.miPanelEntradaDatos.getNomAutores();
                int anioEdicion = Integer.parseInt(venPrin.miPanelEntradaDatos.getAnioEdicion());
                boolean tipoEdicion = Boolean.parseBoolean(venPrin.miPanelEntradaDatos.getTipoEdicion());
                model = new Libro(nombreLibro, nombreAutor, nombreAutores, anioEdicion, tipoEdicion);
                venPrin.miPanelResultados.mostrarResultado("Información del libro: \nNombre del libro: " + model.getNombreLibro() + "\nNombre del autor: " + model.getNombreAutor() + " " + model.getNombreAutores() + "\nAño de edición: " + model.getAnioEdicion() + "\n¿Es edición de lujo?: " + model.isTipoEdicion());
                venPrin.miPanelOperaciones.activarBotones();
            
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }

        if(comando.equals("aceptar"))
        {
            String nombreColeccion = venPrin.miLibroDeColeccion.getNombreColeccion();
            int NumeroLibroColeccion = Integer.parseInt(venPrin.miLibroDeColeccion.getNumeroLibroColeccion());
            model.LibroDeColeccion(nombreColeccion, NumeroLibroColeccion);
            venPrin.miPanelResultados.mostrarResultado("Información de la colección: \nNombre de la colección: " + model.getNombreColeccion() + "\nNúmero del libro en la colección: " + model.getNumeroLibroColeccion());
            venPrin.miLibroDeColeccion.cerrarDialogo();
        }

        if(comando.equals("MostrarInfoLibroColeccion"))
        {   
            venPrin.crearVentanaLibroColeccion();
            this.venPrin.miLibroDeColeccion.agregarOyentesBotones(this);
        }

        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
        }

        if(comando.equals("limpiar"))
        {
            this.venPrin.miPanelResultados.limpiar();
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}
