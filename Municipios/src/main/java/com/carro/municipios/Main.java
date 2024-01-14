package com.carro.municipios;

import java.util.*;

public class Main {

public static void main(String[] args) {

        List<Departamento> departamentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        Gobernador gobernadorAntioquia = new Gobernador("Juan Perez", "3001234567", "juan.perez@example.com", "Partido liberal");
        Gobernador gobernadorCundinamarca = new Gobernador("Maria Rodriguez", "3109876543", "maria.rodriguez@example.com", "Partido conservador");

        Departamento antioquia = new Departamento("Antioquia", gobernadorAntioquia);
        Departamento cundinamarca = new Departamento("Cundinamarca", gobernadorCundinamarca);

        Municipio medellin = new Municipio("Medellin", 2500000, 382);
        Municipio envigado = new Municipio("Envigado", 200000, 70);
        antioquia.agregarMunicipio(medellin);
        antioquia.agregarMunicipio(envigado);

        Municipio bogota = new Municipio("Bogota", 7000000, 1587);
        Municipio soacha = new Municipio("Soacha", 500000, 184);
        cundinamarca.agregarMunicipio(bogota);
        cundinamarca.agregarMunicipio(soacha);

        departamentos.add(antioquia);
        departamentos.add(cundinamarca);


        while (true) {
        System.out.println("sistema de gestion de informacion de municipios.\n");
        System.out.println("1. Agregar departamento");
        System.out.println("2. Agregar municipio a un departamento");
        System.out.println("3. Consultar todos los municipios de un departamento y su gobernador");
        System.out.println("4. Buscar un municipio en particular dentro de un departamento");
        System.out.println("5. Eliminar un municipio especifico");
        System.out.println("6. Calcular el censo del departamento");
        System.out.println("7. Calcular el area total del departamento");
        System.out.println("8. Salir");        
        System.out.println("\n");
        System.out.print("ingrese una opcion : ");
        int opcion = scanner.nextInt();
        System.out.println("\n");
        scanner.nextLine();

    switch (opcion) {
        case 1:
            Operaciones.agregarDepartamento(departamentos, scanner);
            break;
        case 2:
            Operaciones.agregarMunicipio(departamentos, scanner);
            break;
        case 3:
            Operaciones.consultarMunicipios(departamentos, scanner);
            break;
        case 4:
            Operaciones.buscarMunicipio(departamentos, scanner);
            break;
        case 5:
            Operaciones.eliminarMunicipio(departamentos, scanner);
            break;
        case 6:
            Operaciones.calcularCenso(departamentos, scanner);
            break;
        case 7:
            Operaciones.calcularArea(departamentos, scanner);
            break;
        case 8:
            System.out.println("Saliendo del sistema...");
            scanner.close();
            return;
        default:
            System.out.println("Opcion invalida, ingrese un numero valido.");
            break;
                }
            }
            
        }
        
    }
