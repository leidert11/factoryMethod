package com.carro.mastertech;

import java.util.*;

public class MasterTech {

    static List<Categoria> categoria = new ArrayList<>();
    static List<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones.crearCategorias();
        
        Producto producto1 = new Producto("Laptop Lenovo", 1500.00, 1, "REF001",
        10, 10, Operaciones.getCategorias().get(0));
        Operaciones.agregarProductoAlInventario(producto1);

        Producto producto2 = new Producto("iPhone 13", 1200.00, 2, "REF002",
        15, 15, Operaciones.getCategorias().get(1));
        Operaciones.agregarProductoAlInventario(producto2);

        Producto producto3 = new Producto("Refrigerador Samsung", 800.00, 3, "REF003",
        8, 8, Operaciones.getCategorias().get(2));
        Operaciones.agregarProductoAlInventario(producto3);

        Producto producto4 = new Producto("TV LG 55 pulgadas", 600.00, 4, "REF004",
        12, 12, Operaciones.getCategorias().get(3));
        Operaciones.agregarProductoAlInventario(producto4);

        Producto producto5 = new Producto("Audífonos Sony", 200.00, 5, "REF005",
        20, 20, Operaciones.getCategorias().get(4));
        Operaciones.agregarProductoAlInventario(producto5);

        Producto producto6 = new Producto("PlayStation 5", 500.00, 6, "REF006",
        10, 10, Operaciones.getCategorias().get(5));
        Operaciones.agregarProductoAlInventario(producto6);

        Producto producto7 = new Producto("Altavoz Bose", 250.00, 7, "REF007",
        15, 15, Operaciones.getCategorias().get(6));
        Operaciones.agregarProductoAlInventario(producto7);

        while (true) {
            System.out.println("------menu principal------");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Crear categoria");
            System.out.println("5. Mostrar categoria");
            System.out.println("6. Eliminar categoria");
            System.out.println("7. salir");
            
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Operaciones.crearProducto();
                break;
                case 2:
                    Operaciones.mostrarInventario();
                break;
                case 3:
                    Operaciones.eliminarProducto();
                break;
                case 4:
                    Operaciones.crearCategoria();
                break;
                case 5:
                    Operaciones.verCategorias();
                break;
                case 6:
                    Operaciones.eliminarCategoria();
                break;
                case 7:
                System.out.println("Saliendo...");
                scanner.close();
                return;
            default:
                System.out.println("Opcion invalida, ingrese una opcion valida.");
                break;
            }
        }

    }

}