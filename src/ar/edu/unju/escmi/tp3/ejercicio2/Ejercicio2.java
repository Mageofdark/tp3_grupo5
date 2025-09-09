package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GatoSimple gato = null;
        GatoSimple gatoContrincante = null;

        int opcion;
        do {
            System.out.println("\n--- MENÚ GATO ---");
            System.out.println("1 - Crear gato");
            System.out.println("2 - Dar de comer a un gato simple");
            System.out.println("3 - Mostrar todos los gatos");
            System.out.println("4 - Crear gato contrincante para pelear con un gato simple");
            System.out.println("5 - Salir");
            System.out.print("Elegí una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("-----Datos del gato-----");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Peso (kg): ");
                    float peso = sc.nextFloat();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Sexo(Macho/Hembra): ");
                    String sexo = sc.nextLine();

                    gato = new GatoSimple(color, peso, raza, edad, nombre, sexo);
                    System.out.println("Gato creado.");
                    break;

                case 2:
                    if (gato == null) {
                        System.out.println("Primero crea un gato simple.");
                    } else {
                        System.out.println("Que alimento le vas a dar?");
                        String comida = sc.next();
                        gato.comer(comida);
                    } 
                    break;

                case 3:
                    if (gato == null) {
                        System.out.println("Primero crea un gato simple.");
                    } else {
                        gato.maullar();
                        gato.ronronear();
                        gato.mostrarInfo();
                    }
                    break;

                case 4:
                    if (gato == null) {
                        System.out.println("Primero crea un gato simple");
                    } else {
                        System.out.println("-----Datsos del gato contrincante-----");
                        //sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombreCon = sc.nextLine();
                        System.out.print("Raza: ");
                        String razaCon = sc.nextLine();
                        System.out.print("Color: ");
                        String colorCon = sc.nextLine();
                        System.out.print("Peso (kg): ");
                        float pesoCon = sc.nextFloat();
                        System.out.print("Edad: ");
                        int edadCon = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Sexo(Macho/Hembra): ");
                        String sexoCon = sc.nextLine();

                        gatoContrincante = new GatoSimple(colorCon, pesoCon, razaCon, edadCon, nombreCon, sexoCon);
                        gato.pelear(gatoContrincante);
                    }
                    break;

                case 5:
                    System.out.println("Ningun gato fue dañado durante la ejecución del programa.");
                    break;
                } 
        } while (opcion != 5);
        sc.close();
    }
}
