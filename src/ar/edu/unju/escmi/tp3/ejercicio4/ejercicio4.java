package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {


    public static void main(String[] args) {
          Cliente[] cliente1 = new Cliente[4];
    
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    System.out.println("---");
    System.out.println("\n"+ " --- MENU --- \n"+
                "1 - Crear cliente \n" + //
                "2 - Mostrar los datos de un cliente.\n" + //
                "3 - Mostrar todos los clientes.\n" + //
                "4 - Mostrar todos los clientes por categoría.\n" + //
                "5 - Salir.");
    
                do{
    System.out.println("Ingrese la opcion:");
    contador = sc.nextInt();
    sc.nextLine();
    switch (contador) {
        case 1:
            
            break;
        case 2:

            break;
        case 3:

            break;
        case 4:

            break;
        case 5:

            break;
        default:
            System.out.println("opcion no valida");
            break;
    }
    }while(contador!=5);
    }
}
