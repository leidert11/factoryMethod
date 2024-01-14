package com.carro.municipios;

public class Validaciones {
    public static boolean validarNombre(String nombre) {
        return !nombre.isEmpty();
    }

    public static boolean validarPoblacion(String poblacion) {
        try {
            int poblacionInt = Integer.parseInt(poblacion);
            return poblacionInt >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validarArea(String area) {
        try {
            double areaDouble = Double.parseDouble(area);
            return areaDouble >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
