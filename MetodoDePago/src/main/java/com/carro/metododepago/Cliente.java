package com.carro.metododepago;

public class Cliente  {
    private IFormaPago formaPago ;

    public Cliente(IFormaPago FormaPago) {
        this.formaPago = FormaPago;
    }
    
    public String comprar ( double monto){
        String mensaje = formaPago.pagar(monto);
        return mensaje;
    }

    public IFormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(IFormaPago FormaPago) {
        this.formaPago = FormaPago;
    }
    
}
