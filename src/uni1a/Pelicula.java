package uni1a;

import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> elenco; 
    
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, List<Actor> elenco) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.elenco = elenco;
    }
    
    // Getters y Setters: estudio
    public String getEstudio() { return estudio; }
    public void setEstudio(String estudio) { this.estudio = estudio; }

    // Getters y Setters: elenco
    public List<Actor> getElenco() { return elenco; }
    public void setElenco(List<Actor> elenco) { this.elenco = elenco; }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Estudio: " + estudio);
        System.out.println("Elenco:");
        for (Actor actor : elenco) {
            System.out.println("  - " + actor.toString());
        }
        System.out.println();
    }
}