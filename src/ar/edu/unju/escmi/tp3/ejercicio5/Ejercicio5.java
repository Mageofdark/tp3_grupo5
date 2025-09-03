package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.*;

public class Ejercicio5 {
    private static final int N = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[N];
        int tamanoActualProductos = 0;

        int op = 0;
        do{
            System.out.println("1 - Crear producto.");
            System.out.println("2 - Mostrar productos (mostrar todos los productos)\r");
            System.out.println("3 - Modificar precio de producto");
            System.out.println("4 - Mostrar los productos que superen un precio.");
            System.out.println("5 - Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    if(tamanoActualProductos == 3){
                        System.out.println("La lista de productos ya esta llena");
                        break;
                    }

                    System.out.print("Ingrese el Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la Descripcion: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingrese el Precio: ");
                    int precio = sc.nextInt();
                    
                    productos[tamanoActualProductos] = new Producto();
                    
                    productos[tamanoActualProductos].setCodigo(codigo);
                    productos[tamanoActualProductos].setDescripcion(descripcion);
                    productos[tamanoActualProductos].setPrecio(precio);

                    tamanoActualProductos++;
                    System.out.println("Producto N° " + tamanoActualProductos + " creado con exito!");
                    break;
                case 2:
                    for(int i = 0; i < tamanoActualProductos; i++){
                        System.out.println(productos[i].toString());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el codigo del producto a cambiar el precio: ");
                    codigo = sc.nextInt();
                    boolean existe = false;
                    int idx = 0;
                    for(int i = 0; i < tamanoActualProductos; i++){
                        if(productos[i].getCodigo() == codigo){
                            existe = true;
                            idx = i;
                        }
                    }
                    if(!existe){
                        System.out.println("El producto con el codigo " + codigo + " no existe.");
                        break;
                    }
                    System.out.print("Ingrese el precio nuevo: ");
                    precio = sc.nextInt();

                    productos[idx].setPrecio(precio);
                    break;
                case 4:
                    System.out.print("Ingrese un precio: ");
                    precio = sc.nextInt();

                    for(int i = 0; i < tamanoActualProductos; i++){
                        if(productos[i].getPrecio() > precio)
                            System.out.println(productos[i].toString());
                    }

                    break;
                case 5:
                    System.out.print("¿Seguro que desea salir?(S/N): ");
                    String res = sc.nextLine().toUpperCase();
                    // System.out.println(res.equals("S"));
                    if(!res.equals("S")) op = 0;
                    break;
                default:
                    System.out.println("Error. La opcion debe ser un numero del 1 al 5");
                    break;
            }
            System.out.println("\n");
        }while(op != 5);
        sc.close();
    }
}
