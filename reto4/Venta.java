
package com.mycompany.reto4;

import java.time.LocalDateTime;

public class Venta {
    private String identificadorPanel;
    private String tipoId;
    private String numId;
    private String nombreCliente;
    private double valorPago;
    private String descripcionUso;
    LocalDateTime fechaVenta = LocalDateTime.now();


    public Venta(String identificadorPanel, String tipoId, String numId, String nombreCliente, double valorPago, String descripcionUso) {
        this.identificadorPanel = identificadorPanel;
        this.tipoId = tipoId;
        this.numId = numId;
        this.nombreCliente = nombreCliente;
        this.valorPago = valorPago;
        this.descripcionUso = descripcionUso;
    }
    
    
          
}
