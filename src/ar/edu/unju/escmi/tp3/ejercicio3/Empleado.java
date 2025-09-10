package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {

    //Estos son los attributos privados
    private String nombre;
    private int legajo;
    private double salario;

    //Constantes de los valores 
    public static final double SALARIO_MINIMO = 600000.00;
    public static final double AUMENTO_MINIMO = 90000.00;

    //Constructor parametrizado 
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    //Metodo para mostrar los datos del empleado
    public void mostrarDatos(){
        System.out.println("nombbre: " + this.nombre);
        System.out.println("legajo: " + this.legajo);
        System.out.println("Salario: " + this.salario);
    }

    //Metodo para aumentar el salario 
    public void aumentarSalario(){
        this.salario += AUMENTO_MINIMO;
        System.out.println("salario aumentado por meritos");
    }

    public int getLegajo() {
       return legajo;
    }
    
}
