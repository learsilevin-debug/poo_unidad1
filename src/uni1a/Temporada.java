package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int numEpisodios;

    // Constructor
    public Temporada(int numeroTemporada, int numEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.numEpisodios = numEpisodios;
    }

    // Getters y Setters: numeroTemporada
    public int getNumeroTemporada() { return numeroTemporada; }
    public void setNumeroTemporada(int numeroTemporada) { this.numeroTemporada = numeroTemporada; }

    // Getters y Setters: numEpisodios
    public int getNumEpisodios() { return numEpisodios; }
    public void setNumEpisodios(int numEpisodios) { this.numEpisodios = numEpisodios; }

    @Override
    public String toString() {
        return "Temporada N°" + numeroTemporada + " (" + numEpisodios + " episodios)";
    }
}