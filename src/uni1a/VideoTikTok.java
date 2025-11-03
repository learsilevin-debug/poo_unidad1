package uni1a;

public class VideoTikTok extends ContenidoAudiovisual {
    private String creador;

    // Constructor (solo creador)
    public VideoTikTok(String titulo, int duracionEnMinutos, String genero, String creador) {
        super(titulo, duracionEnMinutos, genero); 
        this.creador = creador;
    }

    // Getters y Setters: creador
    public String getCreador() { return creador; }
    public void setCreador(String creador) { this.creador = creador; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video de TikTok:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Creador: " + creador);
        System.out.println();
    }
}