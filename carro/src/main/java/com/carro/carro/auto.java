/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carro.carro;

/**
 *
 * @author Usuario
 */
public class auto {
    String marca ;
    String modelo;
    String color ;
    private boolean acceso = false;
    
    public void meterLlave (String clave) {
        if (clave.equals("12345")) {
            acceso = true;
        }else{
            acceso = false;
            System.out.println("llamando al dueño");
        }
    }
    public void mando(String accion ){
        if (acceso==true) {
            if (accion.equals("encender")) {
                encender();
            }
        }
    }
    private void encender(){
        System.out.println("encender ");
    }
        public void acelerar(){
        System.out.println("acelerarando runnnnn");
    }
        public void frenar(){
        System.out.println("frenando");
    }

}
