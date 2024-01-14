package com.carro.mastertech;

public class Validaciones {
    public static boolean validarNombre(String nombre) {
        return !nombre.isEmpty();
    }

    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }

    public static boolean validarNumero(int numero) {
        return numero > 0;
    }

    public static boolean validarReferencia(String referencia) {
        return !referencia.isEmpty();
    }

    public static boolean validarCantidad(int cantidad) {
        return cantidad >= 0;
    }

    public static boolean validarCantidadDisponible(int cantidadDisponible) {
        return cantidadDisponible >= 0;
    }
}
