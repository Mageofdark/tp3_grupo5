package ar.edu.unju.escmi.tp3.ejercicio4;

public class Cliente {
    private int dni;
    private String nombre;
    private char categoria;

public Cliente( int dni, String nombre, char categoria ){
    this.dni = dni;
    this.nombre = nombre;
    this.categoria = categoria;
}

@Override
public String toString(){
    return "Cliente [DNI= " + dni + ", Nombre= " + nombre + ", Categoría= " + categoria + "]";
}

// son gets para las búsquedas
    public int getDni() {
        return dni;
    }

    public char getCategoria() {
        return categoria;
    }

}
