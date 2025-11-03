package poo;
import uni1a.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        
        // --- 1. Preparar Objetos Relacionados (Relaciones) ---
        
        // Actores (Agregación)
        Actor a1 = new Actor("Tim", 55);
        Actor a2 = new Actor("Morgan", 88);
        List<Actor> elenco = new ArrayList<>();
        elenco.add(a1);
        elenco.add(a2);
        
        // Investigadores (Asociación)
        Investigador i1 = new Investigador("Dr. Carl Sagan", "Astronomía");
        List<Investigador> equipoInv = new ArrayList<>();
        equipoInv.add(i1);
        
        // Temporadas (Composición)
        Temporada t1 = new Temporada(1, 10);
        Temporada t2 = new Temporada(2, 10);
        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add(t1);
        temporadas.add(t2);
        
        // --- 2. Crear Contenidos y Demostrar Polimorfismo ---
        
        List<ContenidoAudiovisual> catalogo = new ArrayList<>();

        // Clases originales con relaciones
        catalogo.add(new Pelicula("Sueño de Fuga", 142, "Drama", "Castle Rock", elenco));
        catalogo.add(new SerieDeTV("Juego de Tronos", 60, "Fantasía", 8, temporadas));
        catalogo.add(new Documental("Cosmos", 60, "Ciencia", "Universo", equipoInv));
        
        // Nuevas subclases 
        Comercial comercial = new Comercial("Navidad Coca-Cola", 2, "Publicidad", "Coca-Cola", "Familias");
        // *** Creación del objeto VideoTikTok 
        VideoTikTok tiktok = new VideoTikTok("El baile del verano", 1, "Comedia", "BailarinPro");
        
        catalogo.add(comercial);
        catalogo.add(tiktok);

        
        // Demostración de Polimorfismo
        for (ContenidoAudiovisual contenido : catalogo) {
            contenido.mostrarDetalles(); 
        }
        

    }
}