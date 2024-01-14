
package com.carro.mastertech;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Producto> inventario = new ArrayList<>();
    private static List<Categoria> categorias = new ArrayList<>();

    public static List<Categoria> getCategorias() {
        return categorias;
    }

    public static List<Producto> getInventario() {
        return inventario;
    }


    public static void agregarProductoAlInventario(Producto producto) {
        inventario.add(producto);
    }
    
    public static void crearCategorias() {
        categorias.add(new Categoria(1, "Computadores"));
        categorias.add(new Categoria(2, "Celulares"));
        categorias.add(new Categoria(3, "Electrodomesticos"));
        categorias.add(new Categoria(4, "TV"));
        categorias.add(new Categoria(5, "Accesorios"));
        categorias.add(new Categoria(6, "Videojuegos"));
        categorias.add(new Categoria(7, "Audio y video"));
    }


    static void crearProducto() {
        try {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();
            if (!Validaciones.validarNombre(nombre)) {
                System.out.println("Nombre invalido.");
                return;
            }
    
            System.out.println("Ingrese el precio:");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            if (!Validaciones.validarPrecio(precio)) {
                System.out.println("Precio invalido.");
                return;
            }
    
            Categoria categoriaSeleccionada = seleccionarCategoria();
            if (categoriaSeleccionada == null) {
                return;
            }
    
            System.out.println("Ingrese el numero:");
            int numero = scanner.nextInt();
            scanner.nextLine();
            if (!Validaciones.validarNumero(numero)) {
                System.out.println("Numero invalido.");
                return;
            }
    
            System.out.println("Ingrese la referencia:");
            String referencia = scanner.nextLine();
            if (!Validaciones.validarReferencia(referencia)) {
                System.out.println("Referencia invalida.");
                return;
            }
    
            System.out.println("Ingrese la cantidad:");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            if (!Validaciones.validarCantidad(cantidad)) {
                System.out.println("Cantidad invalida.");
                return;
            }
    
            System.out.println("Ingrese la cantidad disponible:");
            int cantidadDisponible = scanner.nextInt();
            scanner.nextLine();
            if (!Validaciones.validarCantidadDisponible(cantidadDisponible)) {
                System.out.println("Cantidad disponible invalida.");
                return;
            }
    
            Producto producto = new Producto(nombre, precio, numero, referencia, cantidad, cantidadDisponible, categoriaSeleccionada);
            inventario.add(producto);
            System.out.println("El producto ha sido agregado al inventario.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un formato valido para los datos.");
        }
    }
    
    static void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos disponibles. \n");
        } else {
            imprimirProductos();
        }
    }
    
    static void imprimirProductos() {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i).getNombre());
        }
    }
    
    static void eliminarProducto() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            return;
        }
    
        System.out.println("Productos disponibles en el inventario:");
        imprimirProductos();
    
        System.out.println("Ingrese el numero correspondiente al producto que desea eliminar:");
        int numProducto = scanner.nextInt();
        scanner.nextLine();
    
        if (numProducto > 0 && numProducto <= inventario.size()) {
            Producto productoEliminado = inventario.remove(numProducto - 1);
            System.out.println("Producto eliminado: " + productoEliminado.getNombre());
        } else {
            System.out.println("Numero de producto invalido.");
        }
    }

    static void crearCategoria() {
        System.out.println("ingrese el numero con el que se identificara la categoria");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre de la categoria:");
        String nombre = scanner.nextLine();

        if (nombre.isEmpty() || numero <= 0) {
            System.out.println("Datos invalidos, ingrese valores validos."); 
            
        } else {
            Categoria categoria = new Categoria(numero, nombre);
            categorias.add(categoria);
            System.out.println("categoria creada");
        }
    }
    static void verCategorias() {
        System.out.println("Categorias disponibles:");
        for (Categoria c : categorias) {
            System.out.println(c.getNumero() + ". " + c.getNombre());
        }
    }
    
    static Categoria seleccionarCategoria() {
        verCategorias();
        
        System.out.println("Ingrese el numero correspondiente a la categoria:");
        int numCategoria = scanner.nextInt();
        scanner.nextLine();
        
        for (Categoria c : categorias) {
            if (c.getNumero() == numCategoria) {
                return c;
            }
        }
        
        System.out.println("Categoria invalida.");
        return null;
    }

    static void eliminarCategoria() {
    if (categorias.isEmpty()) {
        System.out.println("No hay categorias disponibles.");
        return;
    }

    Categoria categoriaSeleccionada = seleccionarCategoria();

    if (categoriaSeleccionada != null) {
        categorias.remove(categoriaSeleccionada);
        System.out.println("Categoria eliminada correctamente: " + categoriaSeleccionada.getNombre());
    } else {
        System.out.println("Categoria no encontrada.");
    }
}
}
