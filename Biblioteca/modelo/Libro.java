package modelo;

public class Libro
{
    //Atributos
    protected String nombreLibro;
    protected String nombreAutor;
    protected String nombreAutores;
    protected int anioEdicion;
    protected boolean tipoEdicion;

    //Métodos
    //Constructor nulo
    public Libro()
    {
    }
    
    //Contructor en parámetro
    public Libro(String nL, String nA, String nAs, int aE, boolean tE)
    {
        this.nombreLibro = nL;
        this.nombreAutor = nA;
        this.nombreAutores = nAs;
        this.anioEdicion = aE;
        this.tipoEdicion = tE;
    }

    //Métodos de acceso
    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreAutores() {
        return nombreAutores;
    }

    public void setNombreAutores(String nombreAutores) {
        this.nombreAutores = nombreAutores;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public boolean isTipoEdicion() {
        return tipoEdicion;
    }

    public void setTipoEdicion(boolean tipoEdicion) {
        this.tipoEdicion = tipoEdicion;
    }
    
    //Atributos de LibroDeColeccion
    private String nombreColeccion;
    private int numeroLibroColeccion;

    public void LibroDeColeccion()
    {
    }

    public void LibroDeColeccion(String nombreColecccion, int numeroLibroColeccion)
    {
        this.nombreColeccion = nombreColecccion;
        this.numeroLibroColeccion = numeroLibroColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public int getNumeroLibroColeccion() {
        return numeroLibroColeccion;
    }

    public void setNumeroLibroColeccion(int numeroLibroColeccion) {
        this.numeroLibroColeccion = numeroLibroColeccion;
    }
}
