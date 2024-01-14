/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sistemabancario.sistemabancario;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CajeroAutomatico cajero = new CajeroAutomatico();

        while (true) {
            System.out.println("Bienvenido al sistema bancario");
            System.out.println("1. Realizar depósito");
            System.out.println("2. Realizar retiro");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    int cantidadDeposito = scanner.nextInt();
                    cajero.depositar(cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    int cantidadRetiro = scanner.nextInt();
                    cajero.retirar(cantidadRetiro);
                    break;
                case 3:
                    cajero.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema bancario");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida");
            }

            System.out.println();
        }
    }
}

class CajeroAutomatico {
    
    private int saldo;
    private int billetes50k;    
    private int billetes20k;
    private int billetes10k;

    public CajeroAutomatico() {
        this.saldo = 650000;
        this.billetes50k = 5;
        this.billetes20k = 10;
        this.billetes10k = 20;
    }

    public void depositar(int cantidad) {
        this.saldo += cantidad;
        System.out.println("Depósito exitoso" + cantidad + " pesos");
    }

    public void retirar(int cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        int saldoDisponible = calcularSaldoDisponible();
        if (cantidad > saldoDisponible) {
            System.out.println("el cajero no disopone de dicha cantidad");
            return;
        }
        this.saldo -= cantidad;
        entregarBilletes(cantidad);
        System.out.println("retiro exitoso" + cantidad + " pesos");
            
    }

    public void consultarSaldo (){
        System.out.println("Saldo disponible: " + saldo + "pesos");
        System.out.println("billetes disponibles en el cajero: ");
        System.out.println("billetes 50k: " + billetes50k);
        System.out.println("billetes 20k: " + billetes20k);
        System.out.println("billetes 10k: " + billetes10k);
    }

    private void entregarBilletes (int cantidad){
        System.out.println("entregar billetes :");

        int[] denominaciones = {50000, 20000, 10000};
        int[] billetes = {billetes50k, billetes20k, billetes10k};

        for (int i = 0; i < denominaciones.length; i++) {
            int billetesEntregados =  Math.min(cantidad / denominaciones[i] , billetes[i]);
            cantidad -= billetesEntregados * denominaciones[i];
            billetes[i] -= billetesEntregados;

            if (billetesEntregados > 0) {
                System.out.println(billetesEntregados + "billetes de " +  denominaciones[i]);
            }
        }
    }

    private int calcularSaldoDisponible(){
        return (billetes50k * 50000) + (billetes20k * 20000) + (billetes10k * 10000);
    }
}