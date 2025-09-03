package ar.edu.unju.escmi.tp3.ejercicio5;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    
    Producto(){}

    public String toString(){
        return "Codigo: " + this.codigo + "\n" +
               "Descripcion: " + this.descripcion + "\n" +
               "Precio: " + this.precio + "\n";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
