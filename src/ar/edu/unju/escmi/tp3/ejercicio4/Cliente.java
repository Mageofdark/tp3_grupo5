package ar.edu.unju.escmi.tp3.ejercicio4;

public class Cliente {
     int dni;
     String nombre;
     char categoria;

public Cliente( int dni, String nombre, char categoria ){
    this.dni = dni;
    this.nombre = nombre;
    this.categoria = categoria;
}

@Override
public String toString(){
    return "cliente [dni= "+dni+", nombre= "+nombre+", categoria= "+categoria+"]";
}
}
