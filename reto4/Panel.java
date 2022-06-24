
package com.mycompany.reto4;
import java.time.YearMonth;

public class Panel {
    private String identificadorEmpresa;
    private String identificadorSerie;
    private String tipo;
    private String modelo;
    private String descripcion;
    private int añoFabricacion;
    private double precio;

    public Panel(String identificadorEmpresa, String identificadorSerie, String tipo, String modelo, String descripcion, int añoFabricacion, double precio) {
        this.identificadorEmpresa = identificadorEmpresa;
        this.identificadorSerie = identificadorSerie;
        this.tipo = tipo;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.añoFabricacion = añoFabricacion;
        this.precio = precio;
    }
    
     public String calcularUso()
    {
        
        if(YearMonth.now().getYear()-añoFabricacion<=1){
            return "el paanel " + tipo + " es nuevo";
        } else if(YearMonth.now().getYear()-añoFabricacion<4){
            return "el panel " + tipo + " es medianamente usado";
        }
        return "el panel " + tipo + " es usado"; 
        
    }

    public String getIdentificadorEmpresa() {
        return identificadorEmpresa;
    }

    public String getIdentificadorSerie() {
        return identificadorSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getAñoFabricacion() {
        return añoFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
