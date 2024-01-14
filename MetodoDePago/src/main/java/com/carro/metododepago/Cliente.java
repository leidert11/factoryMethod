package com.carro.metododepago;

public class Cliente  {
    private IFormaPago FormaPago ;

    public Cliente(IFormaPago FormaPago) {
        this.FormaPago = FormaPago;
    }
    
    public String comprar ( double monto){
        String mensaje = FormaPago.pagar(monto);
        return mensaje;
    }

    public IFormaPago getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(IFormaPago FormaPago) {
        this.FormaPago = FormaPago;
    }
    
}
