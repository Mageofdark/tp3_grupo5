package ar.edu.unju.escmi.tp3.ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_EMPLEADOS = 5;
        Empleado[] empleados = new Empleado [MAX_EMPLEADOS];
        int cantidadEmpleados = 0;


        int opcion;

        do {
            System.out.println("----Menu de empleado----");
            System.out.println("1. Crear empleado");
            System.out.println("2. Mostrar datos del empleado");
            System.out.println("3. Aumentar salario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcion){
                case 1:
                    if (cantidadEmpleados < MAX_EMPLEADOS) {
                        System.out.print("Ingrese nombre del empleado: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese legajo del empleado: ");
                        int legajo = scanner.nextInt();
                        System.out.print("Ingrese salario del empleado: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine(); 

                        empleados[cantidadEmpleados] = new Empleado(nombre, legajo, salario);
                        cantidadEmpleados++;
                        System.out.println("Empleado creado exitosamente.");
                    } else {
                        System.out.println("No se pueden crear más empleados. Límite alcanzado.");
                    }
                    break;

                case 2:
                    if (cantidadEmpleados == 0) {
                        System.out.println("No hay empleados para mostrar.");
                    } else {
                        for (int i = 0; i < cantidadEmpleados; i++) {
                            System.out.println("\nEmpleado " + (i + 1) + ":");
                            empleados[i].mostrarDatos();
                        }
                    }
                    break;

                case 3:
                   System.out.print("Ingrese el legajo del empleado para aumentar su salario: ");
                   int legajoBuscar = scanner.nextInt();
                     boolean encontrado = false;
                     for (int i = 0; i < cantidadEmpleados; i++) {
                          if (empleados[i].getLegajo() == legajoBuscar) {
                            empleados[i].aumentarSalario();
                            encontrado = true;
                            break;
                          }
                        }
                    if (!encontrado) {
                        System.out.println("Empleado con legajo " + legajoBuscar + " no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}