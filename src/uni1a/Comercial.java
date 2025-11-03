package uni1a;

public class Comercial extends ContenidoAudiovisual {
    private String marcaCliente;
    private String publicoObjetivo;

    public Comercial(String titulo, int duracionEnMinutos, String genero, String marcaCliente, String publicoObjetivo) {
        super(titulo, duracionEnMinutos, genero);
        this.marcaCliente = marcaCliente;
        this.publicoObjetivo = publicoObjetivo;
    }

    // Getters y Setters: marcaCliente
    public String getMarcaCliente() { return marcaCliente; }
    public void setMarcaCliente(String marcaCliente) { this.marcaCliente = marcaCliente; }

    // Getters y Setters: publicoObjetivo
    public String getPublicoObjetivo() { return publicoObjetivo; }
    public void setPublicoObjetivo(String publicoObjetivo) { this.publicoObjetivo = publicoObjetivo; }

    // Nuevo método propio
    public void imprimirEstrategia() {
        System.out.println("El comercial es para la marca " + marcaCliente + " y apunta a: " + publicoObjetivo);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Comercial:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Marca Cliente: " + marcaCliente);
        System.out.println("Público: " + publicoObjetivo);
        System.out.println();
    }
}