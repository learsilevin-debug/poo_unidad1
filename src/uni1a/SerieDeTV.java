package uni1a;

import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int numTemporadas;
    private List<Temporada> temporadas; 

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numTemporadas, List<Temporada> temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numTemporadas = numTemporadas;
        this.temporadas = temporadas;
    }

    // Getters y Setters: numTemporadas
    public int getNumTemporadas() { return numTemporadas; }
    public void setNumTemporadas(int numTemporadas) { this.numTemporadas = numTemporadas; }

    // Getters y Setters: temporadas
    public List<Temporada> getTemporadas() { return temporadas; }
    public void setTemporadas(List<Temporada> temporadas) { this.temporadas = temporadas; }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Total de temporadas: " + numTemporadas);
        
        System.out.println("Numero de temporadas:");
        for (Temporada temp : temporadas) {
            System.out.println("  - " + temp.toString());
        }
        System.out.println();
    }
}