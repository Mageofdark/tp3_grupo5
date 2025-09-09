package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {


    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int contador = 0; //esto va a llevar la cuenta de los clientes que ya cargaron
        int opcion;
  
        do {
            System.out.println("\n--- MENÚ CLIENTES ---");
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Mostrar cliente por DNI");
            System.out.println("3 - Mostrar todos los clientes");
            System.out.println("4 - Mostrar clientes por categoría");
            System.out.println("5 - Salir");
            System.out.print("Elegí una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (contador < clientes.length) {
                        System.out.print("Ingresá el DNI: ");
                        int dni = sc.nextInt();
                        sc.nextLine(); // limpiar el buffer para que no quede llenito
                        System.out.print("Ingrese Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese Categoría: ");
                        char categoria = sc.next().charAt(0);

                        clientes[contador] = new Cliente(dni, nombre, categoria);
                        contador++;
                    } else {
                        System.out.println("No se pueden agregar más clientes porque el array ta lleno.");
                    }
                    break;

                case 2:
                    System.out.print("Ingresa el DNI para buscar: ");
                    int dniBuscar = sc.nextInt();
                    boolean encontrado = false;
                    for (Cliente c : clientes) {
                        if (c != null && c.getDni() == dniBuscar) {
                            System.out.println(c);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el DNI.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de clientes:");
                    for (Cliente c : clientes) {
                        if (c != null) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la categoría a buscar: ");
                    char catBuscar = sc.next().charAt(0);
                    System.out.println("Clientes en categoría " + catBuscar + ":");
                    for (Cliente c : clientes) {
                        if (c != null && c.getCategoria() == catBuscar) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
        sc.close();
    }

}
