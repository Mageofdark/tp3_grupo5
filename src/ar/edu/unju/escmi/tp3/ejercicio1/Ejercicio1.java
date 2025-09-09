package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        
        do { 
            System.out.println("--- MENU ---");
            System.out.println("1 - Crear objeto con Constructor por defecto.");
            System.out.println("2 - Crear objeto con Constructor parametrizado.");
            System.out.println("3 - Crear objeto con Constructor (dni, nombre, fecha de nacimiento).");
            System.out.println("4 - Mostrar personas.");
            System.out.println("5 - Salir.");
            System.out.print("Ingrese la opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                Persona p1 = new Persona();
                    System.out.print("Ingrese el DNI: ");
                    p1.setDni(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    p1.setNombre(sc.nextLine());
                    System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
                    p1.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
                    System.out.print("Ingrese el domicilio: ");
                    p1.setDireccion(sc.nextLine());
                    System.out.print("Ingrese la provincia: ");
                    p1.setProvincia(sc.nextLine());
                    personas.add(p1);
                    System.out.println("Persona creada exitosamente.\n");
                    break;

                case 2:
                System.out.print("Ingrese el DNI: ");
                    int dni2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fecha2 = LocalDate.parse(sc.nextLine());
                    System.out.print("Ingrese el domicilio: ");
                    String domicilio2 = sc.nextLine();
                    System.out.print("Ingrese la provincia: ");
                    String provincia2 = sc.nextLine();
                    Persona p2 = new Persona(dni2, nombre2, fecha2, domicilio2, provincia2);
                    personas.add(p2);
                    System.out.println("Persona creada exitosamente.\n");
                    break;
                case 3:
                System.out.print("Ingrese el DNI: ");
                    int dni3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombre3 = sc.nextLine();
                    System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fecha3 = LocalDate.parse(sc.nextLine());
                    Persona p3 = new Persona(dni3, nombre3, fecha3);
                    personas.add(p3);
                    System.out.println("Persona creada exitosamente.\n");
                    break;
                case 4:
                if (personas.isEmpty()) {
                        System.out.println("No hay personas para mostrar.\n");
                    } else {
                        System.out.println("Personas registradas:");
                        for (Persona persona : personas) {
                            persona.mostrarDatos();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("por favor ingrese una opcion valida");
            }
            
        } while (opcion != 5);
        sc.close();
    }
}
