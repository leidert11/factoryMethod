package com.carro.metododepago;

public class FormaPagoNoSoportadaException extends RuntimeException {
    public FormaPagoNoSoportadaException(String tipo){
        super("la forma de pago "+tipo+" no esta soportada");
    }
}
