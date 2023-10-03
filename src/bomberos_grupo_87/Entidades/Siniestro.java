/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Entidades;

import java.time.LocalDate;


public class Siniestro {
  
    private int codSiniestro;
    private String especialidad;
    private LocalDate fecha_siniestro;
    private int coord_X;
    private int coord_Y;
    private String detalles;
    private LocalDate fecha_resol;
    private int puntuacion;
    private int codBrig;


    public Siniestro( int CodBrigada, String especialidad, LocalDate fecha_siniestro, int coord_X, int coord_Y, String detalles, LocalDate fecha_resol, int puntuacion, int codBrig) {
        this.codSiniestro = codSiniestro;
        this.especialidad = especialidad;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.codBrig = codBrig;
    }
    
    public Siniestro (String especialidad, LocalDate fecha_siniestro, int coord_X, int coord_Y, String detalles, LocalDate fecha_resol, int puntuacion, int codBrig) {
        this.especialidad = especialidad;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.codBrig = codBrig;
    }
    
    public Siniestro (){
        
    }

    public int getCodSiniestro() {
        return codSiniestro;
    }

    public void setCodSiniestro(int codSiniestro) {
        this.codSiniestro = codSiniestro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(LocalDate fecha_siniestro) {
        this.fecha_siniestro = fecha_siniestro;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(int coord_X) {
        this.coord_X = coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFecha_resol() {
        return fecha_resol;
    }

    public void setFecha_resol(LocalDate fecha_resol) {
        this.fecha_resol = fecha_resol;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodBrig() {
        return codBrig;
    }

    public void setCodBrig(int codBrig) {
        this.codBrig = codBrig;
    }
    
    
}
