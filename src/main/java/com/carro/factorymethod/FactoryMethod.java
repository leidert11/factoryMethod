package com.carro.factorymethod;

import java.util.*;

public class FactoryMethod {

    public static void main(String[] args) {
        UnidadFactory fabricaUnidades  = new UnidadFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("seleccione el de unidad que desea crear : ");
            System.out.println("1. Infanteria ");
            System.out.println("2. Arqueria ");
            System.out.println("3. Caballeria ");
            System.out.println("4. salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                System.out.println("Introduce la vida de la Infantería:");
                int vidaInf = scanner.nextInt();
                System.out.println("Introduce el ataque de la Infantería:");
                int ataqueInf = scanner.nextInt();
                System.out.println("Introduce la cantidad de personal en la Infantería:");
                int cantidadDePersonalEnUnidadInf = scanner.nextInt();
                scanner.nextLine();
                Unidad Infanteria = fabricaUnidades.crearUnidad("INFANTERIA", vidaInf, ataqueInf, cantidadDePersonalEnUnidadInf);
                    break;
                case 2:
                System.out.println("Introduce la vida de la Arqueria:");
                int vidaArq = scanner.nextInt();
                System.out.println("Introduce el ataque de la Arqueria:");
                int ataqueArq = scanner.nextInt();
                System.out.println("Introduce la cantidad de personal en la Arqueria:");
                int cantidadDePersonalEnUnidadArq = scanner.nextInt();
                scanner.nextLine();
                Unidad Arqueria = fabricaUnidades.crearUnidad("ARQUERIA", vidaArq, ataqueArq, cantidadDePersonalEnUnidadArq);
                    break;
                case 3:
                System.out.println("Introduce la vida de la Caballeria:");
                int vidaCab = scanner.nextInt();
                System.out.println("Introduce el ataque de la Caballeria:");
                int ataqueCab = scanner.nextInt();
                System.out.println("Introduce la cantidad de personal en la Caballeria:");
                int cantidadDePersonalEnUnidadCab = scanner.nextInt();
                Unidad Caballeria = fabricaUnidades.crearUnidad("CABALLERIA", vidaCab, ataqueCab, cantidadDePersonalEnUnidadCab);
                scanner.nextLine();
                    break;
                    case 4:
                    System.out.println("saliendo del menu ");
                    System.exit(0);
            
                default:
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }
}
