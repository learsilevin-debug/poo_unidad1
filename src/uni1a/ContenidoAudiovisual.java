package uni1a;

public abstract class ContenidoAudiovisual {
    private static int contor = 0;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private int id; 
    
    // Constructor
    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = ++contor;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }
    
    // Getters y Setters: titulo
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    // Getters y Setters: duracionEnMinutos
    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }

    // Getters y Setters: genero
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    // Getter: id (Solo lectura)
    public int getId() { return id; }
    
    public abstract void mostrarDetalles(); 
}