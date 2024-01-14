package com.carro.metododepago;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FactoriaFormaPago fabrica = new FactoryFormaPago();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        ArrayList<IFormaPago> metodos = new ArrayList<>();
        while (!salir) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Crear forma de pago efectivo");
            System.out.println("2. Crear forma de pago tarjeta");
            System.out.println("3. Crear forma de pago PayPal");
            System.out.println("4. Ver los métodos de pago guardados");
            System.out.println("5. Salir");
            System.out.println("Elija una opción:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    IFormaPago efectivo = fabrica.crearFormaPago("efectivo");
                    System.out.println("Se ha creado la forma de pago efectivo");
                    metodos.add(efectivo);
                    break;
                case 2:
                    IFormaPago tarjeta = fabrica.crearFormaPago("tarjeta");
                    System.out.println("Se ha creado la forma de pago tarjeta");
                    metodos.add(tarjeta);
                    break;
                case 3:
                    IFormaPago paypal = fabrica.crearFormaPago("paypal");
                    System.out.println("Se ha creado la forma de pago PayPal");
                    metodos.add(paypal);
                    break;
                case 4:
                    System.out.println("Los métodos de pago guardados son:");
                    for (IFormaPago metodo : metodos) {
                        System.out.println(metodo.getClass().getSimpleName());
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}


