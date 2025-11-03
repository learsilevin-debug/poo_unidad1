package uni1a;

public class Actor {
    private String nombre;
    private int edad;

    // Constructor
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters: nombre
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // Getters y Setters: edad
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    @Override
    public String toString() {
        return "Actor: " + nombre + " (" + edad + " años)";
    }
}