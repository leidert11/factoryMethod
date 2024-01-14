/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.carro.carro;

/**
 *
 * @author Usuario
 */
public class Carro {

    public static void main(String[] args) {
        auto  carro = new auto();
        
        carro.marca= "chevrolet";
        carro.modelo= "1998";
        carro.color= "verde";
        
        carro.meterLlave("123456");
        
        System.out.println("el carro de marca "+ carro.marca+ " de modelo "+carro.modelo+" con el color "+carro.color);
        System.out.println("lo que puede hacer el carro s :");
        carro.mando("encender");
        carro.acelerar();
        carro.frenar();

    }
}
