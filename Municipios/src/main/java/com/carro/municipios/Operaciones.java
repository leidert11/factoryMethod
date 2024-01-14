package com.carro.municipios;

import java.util.*;

public class Operaciones {

    public static void agregarDepartamento(List<Departamento> departamentos, Scanner scanner) {
        System.out.println("Ingrese el nombre del departamento:");
        String nombreDepartamento = scanner.nextLine();
        if (!Validaciones.validarNombre(nombreDepartamento)) {
            System.out.println("El nombre del departamento no es valido.");
            return;
        }
        System.out.println("Ingrese los datos del gobernador:");
        System.out.println("Nombre:");
        String nombreGobernador = scanner.nextLine();
        System.out.println("Telefono:");
        String telefonoGobernador = scanner.nextLine();
        System.out.println("Correo:");
        String correoGobernador = scanner.nextLine();
        System.out.println("Partido Politico:");
        String partidoPoliticoGobernador = scanner.nextLine();
        System.out.println("\n");
        Gobernador gobernador = new Gobernador(nombreGobernador, telefonoGobernador, correoGobernador, partidoPoliticoGobernador);
        Departamento nuevoDepartamento = new Departamento(nombreDepartamento, gobernador);
        departamentos.add(nuevoDepartamento);
    }
    
    public static void agregarMunicipio(List<Departamento> departamentos, Scanner scanner) {
        Departamento departamento = seleccionarDepartamento(departamentos, scanner);
        if (departamento != null) {
            System.out.println("Ingrese el nombre del municipio:");
            String nombreMunicipio = scanner.nextLine();
            if (!Validaciones.validarNombre(nombreMunicipio)) {
                System.out.println("el nombre del municipio no es valido.");
                return;
            }
            System.out.println("Ingrese la poblacion del municipio:");
            String poblacion = scanner.nextLine();
            if (!Validaciones.validarPoblacion(poblacion)) {
                System.out.println("la poblacion ingresada no es valida.");
                return;
            }
            System.out.println("Ingrese el area del municipio: ");
            String area = scanner.nextLine();
            System.out.println("\n");
            if (!Validaciones.validarArea(area)) {
                System.out.println("El area ingresada no es valida.");
                return;
            }
            Municipio nuevoMunicipio = new Municipio(nombreMunicipio, Integer.parseInt(poblacion), Double.parseDouble(area));
            departamento.agregarMunicipio(nuevoMunicipio);
        } else {
            System.out.println("departamento no seleccionado.");
        }
    }
    

    public static void consultarMunicipios(List<Departamento> departamentos, Scanner scanner) {
        Departamento departamento = seleccionarDepartamento(departamentos, scanner);
        if (departamento != null) {
            departamento.consultarMunicipios();
        } else {
            System.out.println("departamento no seleccionado.");
        }
    }


    public static void buscarMunicipio(List<Departamento> departamentos, Scanner scanner) {
        Departamento departamento = seleccionarDepartamento(departamentos, scanner);
        if (departamento != null) {
            List<Municipio> municipios = departamento.getMunicipios();
            if (municipios.isEmpty()) {
                System.out.println("No hay municipios en este departamento.");
                return;
            }
            System.out.println("Seleccione un municipio:");
            for (int i = 0; i < municipios.size(); i++) {
                System.out.println((i + 1) + ". " + municipios.get(i).getNombre());
            }
            int indiceMunicipio = -1;
            try {
                indiceMunicipio = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero valido para seleccionar un municipio.");
                return;
            }
            if (indiceMunicipio >= 0 && indiceMunicipio < municipios.size()) {
                Municipio encontrado = municipios.get(indiceMunicipio);
                System.out.println("municipio seleccionado:\n" + encontrado.toString());
            } else {
                System.out.println("municipio invalido.");
            }
        } else {
            System.out.println("Departamento no seleccionado.");
        }
    }
    
    public static void eliminarMunicipio(List<Departamento> departamentos, Scanner scanner) {
        Departamento departamento = seleccionarDepartamento(departamentos, scanner);
        if (departamento != null) {
            List<Municipio> municipios = departamento.getMunicipios();
            if (municipios.isEmpty()) {
                System.out.println("No hay municipios en este departamento.");
                return;
            }
            System.out.println("Seleccione un municipio para eliminar:");
            for (int i = 0; i < municipios.size(); i++) {
                System.out.println((i + 1) + ". " + municipios.get(i).getNombre());
            }
            int indiceMunicipio = -1;
            try {
                indiceMunicipio = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero valido para seleccionar un municipio.");
                return;
            }
            if (indiceMunicipio >= 0 && indiceMunicipio < municipios.size()) {
                Municipio eliminar = municipios.get(indiceMunicipio);
                departamento.eliminarMunicipio(eliminar.getNombre());
                System.out.println("Municipio eliminado: " + eliminar.getNombre() + "\n");
            } else {
                System.out.println("municipio invalido.");
            }
        } else {
            System.out.println("Departamento no seleccionado.");
        }
    }
    

    public static void calcularCenso(List<Departamento> departamentos, Scanner scanner) {
        Departamento departamento = seleccionarDepartamento(departamentos, scanner);
        if (departamento != null) {
            int censo = departamento.calcularCenso();
            System.out.println("censo del departamento: " + censo);
        } else {
            System.out.println("departamento no seleccionado.");
        }
    }

    public static void calcularArea(List<Departamento> departamentos, Scanner scanner) {
        Departamento departamento = seleccionarDepartamento(departamentos, scanner);
        if (departamento != null) {
            double areaTotal = departamento.calcularArea();
            System.out.println("area total del departamento: " + areaTotal);
        } else {
            System.out.println("departamento no seleccionado.");
        }
    }

    private static Departamento seleccionarDepartamento(List<Departamento> departamentos, Scanner scanner) {
        System.out.println("seleccione un departamento:");
        for (int i = 0; i < departamentos.size(); i++) {
            System.out.println((i + 1) + ". " + departamentos.get(i).getNombre());
        }
        int indiceDepartamento = -1;
        try {
            indiceDepartamento = Integer.parseInt(scanner.nextLine()) - 1;
        } catch (NumberFormatException e) {
            System.out.println("ingrese un numero valido de un departamento.");
            return null;
        }
        if (indiceDepartamento >= 0 && indiceDepartamento < departamentos.size()) {
            return departamentos.get(indiceDepartamento);
        } else {
            System.out.println("departamento invalido.");
            return null;
        }
    }
}
