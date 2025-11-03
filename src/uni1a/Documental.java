package uni1a;

import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores; 

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, List<Investigador> investigadores) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = investigadores;
    }

    // Getters y Setters: tema
    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    // Getters y Setters: investigadores
    public List<Investigador> getInvestigadores() { return investigadores; }
    public void setInvestigadores(List<Investigador> investigadores) { this.investigadores = investigadores; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Tema: " + this.tema);

        System.out.println("Investigadores principales:");
        for (Investigador inv : investigadores) {
            System.out.println("  - " + inv.toString());
        }
        System.out.println();
    }
}