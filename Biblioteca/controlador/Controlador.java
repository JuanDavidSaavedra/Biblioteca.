package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Libro;
import modelo.LibroDeColeccion;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Libro model;
    private LibroDeColeccion jmodel;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin, Libro model, LibroDeColeccion jmodel)
    {
        this.venPrin = venPrin;
        this.model = model;
        this.jmodel = jmodel;
        this.venPrin.miPanelResultados.agregarOyentesBotones(this);
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    /*
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("jugador"))
            {   
                venPrin.crearDialogoJugador();
                this.venPrin.miDialogoJugador.agregarOyentesBotones2(this);
            }
        
        if(comando.equals("MostrarInfoLibro"))
        {
            try 
            {
                
                String pais = venPrin.miPanelEntradaDatos.getPaises();
                String continente = venPrin.miPanelEntradaDatos.getContinentes();
                int participaciones = Integer.parseInt(venPrin.miPanelEntradaDatos.getParticipaciones());
                int copas = Integer.parseInt(venPrin.miPanelEntradaDatos.getCopas());
                model = new Pais(pais, continente, participaciones, copas);
                venPrin.miPanelResultados.mostrarResultado("Datos del equipo: \nPais = " + model.getNomPais() + "\nContinente = " + model.getNomContinente() + "\nParticipaciones = " + model.getNumParticipacionesCopaMundial() + "\nCopas = " + model.getNumCopasGanadas());
                venPrin.miPanelOperaciones.activarBotones();
            
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }
venPrin.miDialogoDeC.cerrarDialogo();
        }
        if(comando.equals("aceptar2"))
        {
            String nom = venPrin.miDialogoJugador.getNombre();
            String ap = venPrin.miDialogoJugador.getApellidos();
            int ed = Integer.parseInt(venPrin.miDialogoJugador.getEdad());
            String po = venPrin.miDialogoJugador.getPosicion();
            int nGol = Integer.parseInt(venPrin.miDialogoJugador.getGoles());
            String tJugador = venPrin.miDialogoJugador.getTipoJugador();
            jmodel = new Jugador(tJugador, nom, ap, ed, po, nGol);
            venPrin.miPanelResultados.mostrarResultado("Datos del Jugador: \nNombre = " + jmodel.getNombre() + "\nApellidos = " + jmodel.getApellidos() + "\nEdad = " + jmodel.getEdad() + "\nPosicion = " + jmodel.getPosicionEquipo() + "\nGoles = " + jmodel.getNumGolesMarcadosCopasMundiales() + "\nJuega de " + jmodel.getTipoJugador());
            venPrin.miDialogoJugador.cerrarDialogo();          
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

*/

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }


}
