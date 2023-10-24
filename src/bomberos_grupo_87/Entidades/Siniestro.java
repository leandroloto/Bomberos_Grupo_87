/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Entidades;

import java.time.LocalDateTime;

public class Siniestro {

    private int codSiniestro;
    private Especialidad especialidad;
    private LocalDateTime fecha_siniestro;
    private int coord_X;
    private int coord_Y;
    private String detalles;
    private LocalDateTime fecha_resol;
    private int puntuacion;
    private Brigada brigada;
    private boolean estado;
    private boolean enCurso;

    public Siniestro(int codSiniestro, Especialidad especialidad, LocalDateTime fecha_siniestro, int coord_X, int coord_Y, String detalles, LocalDateTime fecha_resol, int puntuacion, Brigada brigada, boolean estado, boolean enCurso) {
        this.codSiniestro = codSiniestro;
        this.especialidad = especialidad;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.brigada = brigada;
        this.estado = estado;
        this.enCurso = enCurso;

    }

    public Siniestro(Especialidad especialidad, LocalDateTime fecha_siniestro, int coord_X, int coord_Y, String detalles, boolean estado, boolean enCurso) {
        this.especialidad = especialidad;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.estado = estado;
        this.enCurso = enCurso;
    }

    public Siniestro(int codSiniestro, Especialidad especialidad, LocalDateTime fecha_siniestro, int coord_X, int coord_Y, String detalles, Brigada brigada, boolean estado, boolean enCurso) {
        this.codSiniestro = codSiniestro;
        this.especialidad = especialidad;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.brigada = brigada;
        this.estado = estado;
        this.enCurso = enCurso;
    }

    public Siniestro() {

    }

    public boolean isEnCurso() {
        return enCurso;
    }

    public void setEnCurso(boolean enCurso) {
        this.enCurso = enCurso;
    }

    public int getCodSiniestro() {
        return codSiniestro;
    }

    public void setCodSiniestro(int codSiniestro) {
        this.codSiniestro = codSiniestro;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDateTime getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(LocalDateTime fecha_siniestro) {
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

    public LocalDateTime getFecha_resol() {
        return fecha_resol;
    }

    public void setFecha_resol(LocalDateTime fecha_resol) {
        this.fecha_resol = fecha_resol;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "codSiniestro=" + codSiniestro + ", especialidad=" + especialidad + ", fecha_siniestro=" + fecha_siniestro + ", coord_X=" + coord_X + ", coord_Y=" + coord_Y + ", detalles=" + detalles + ", fecha_resol=" + fecha_resol + ", puntuacion=" + puntuacion + ", brigada=" + brigada + ", estado=" + estado + ", enCurso=" + enCurso + '}';
    }

}
