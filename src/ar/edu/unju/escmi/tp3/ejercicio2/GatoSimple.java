package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
    private String color;
    private float peso;
    private String raza;
    private int edad;
    private String nombre;
    private String sexo;
    
    public GatoSimple(String color, float peso, String raza, int edad, String nombre, String sexo) {
        this.color = color;
        this.peso = peso;
        this.raza = raza.toLowerCase();
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo.toLowerCase();
        
    }
    public void maullar() {
        System.out.println(this.nombre + ": Miauu");
    }

    public void ronronear() {
        System.out.println(this.nombre + ": prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println(this.nombre + ": Que rico ¡Gracias!!");
        } else {
            System.out.println(this.nombre + ": Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println(this.nombre + ": No me gusta pelear");
        } else {
            if (gatoContrincante.sexo.equals("hembra")) {
                System.out.println(this.nombre + ": No peleo contra gatitas");
            } else  {
                System.out.println(this.nombre + ": ¡Ven aqui que te vas a enterar!");
            } 
        }
    }

    public void mostrarInfo() {
        System.out.println("\n----- Información del Gato -----");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Color: " + this.color);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Sexo: " + this.sexo);
    }
}
