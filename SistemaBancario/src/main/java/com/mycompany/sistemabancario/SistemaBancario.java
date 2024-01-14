/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancario;

/**
 *
 * @author user
 */import java.util.Scanner;

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
        System.out.println("Depósito exitoso de " + cantidad + " pesos");
    }

    public void retirar(int cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            int saldoDisponible = calcularSaldoDisponible();
            if (cantidad > saldoDisponible) {
                System.out.println("El cajero no dispone de suficientes billetes para este retiro.");
            } else {
                this.saldo -= cantidad;
                entregarBilletes(cantidad);
                System.out.println("Retiro exitoso de " + cantidad + " pesos");
            }
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual en el cajero: " + saldo + " pesos");
        System.out.println("Billetes disponibles en el cajero:");
        System.out.println("Billetes de 50,000: " + billetes50k);
        System.out.println("Billetes de 20,000: " + billetes20k);
        System.out.println("Billetes de 10,000: " + billetes10k);
    }

    private void entregarBilletes(int cantidad) {
        System.out.println("Entregar billetes:");

        int billete50k = Math.min(cantidad / 50000, billetes50k);
        cantidad -= billete50k * 50000;
        billetes50k -= billete50k;

        int billete20k = Math.min(cantidad / 20000, billetes20k);
        cantidad -= billete20k * 20000;
        billetes20k -= billete20k;

        int billete10k = Math.min(cantidad / 10000, billetes10k);
        cantidad -= billete10k * 10000;
        billetes10k -= billete10k;

        if (billete50k > 0) {
            System.out.println(billete50k + " billetes de 50,000");
        }
        if (billete20k > 0) {
            System.out.println(billete20k + " billetes de 20,000");
        }
        if (billete10k > 0) {
            System.out.println(billete10k + " billetes de 10,000");
        }
    }

    private int calcularSaldoDisponible() {
        return (billetes50k * 50000) + (billetes20k * 20000) + (billetes10k * 10000);
    }
}