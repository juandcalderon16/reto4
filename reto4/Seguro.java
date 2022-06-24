
package com.mycompany.reto4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Seguro {
    
    private String nombreEmpresa;
    private String descripcion;
    private String identificadorPanel;
    LocalDate fechaInicio = LocalDate.now();
    LocalDate fechaFinalizacion = LocalDate.now().plus(24, ChronoUnit.MONTHS);

    public Seguro(String nombreEmpresa, String descripcion, String identificadorPanel) {
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.identificadorPanel = identificadorPanel;
    }
    
    
    public String cobertura(){
       long cobertura = ChronoUnit.MONTHS.between(fechaInicio, fechaFinalizacion);
       return "la cobertura es de " + cobertura + " meses.";
    }

    @Override
    public String toString() {
        return "Seguro{" + "nombreEmpresa=" + nombreEmpresa + ", descripcion=" + descripcion + ", identificadorPanel=" + identificadorPanel + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + '}';
    }
    
    

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
