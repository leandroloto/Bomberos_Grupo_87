
package bomberos_grupo_87.Entidades;

import java.time.LocalDate;


public class Bombero {
    private int codBombero;
    private int dni;
    private String nombre_ape;
    private LocalDate fecha_nac;
    private String grupo_sang;
    private String celular;
    private Brigada codBrigada;
    private boolean estado;

    public Bombero(int codBombero, int dni, String nombre_ape, LocalDate fecha_nac, String grupo_sang, String celular, Brigada codBrigada, boolean estado) {
        this.codBombero = codBombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.grupo_sang = grupo_sang;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public int getCodBombero() {
        return codBombero;
    }

    public void setCodBombero(int codBombero) {
        this.codBombero = codBombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getGrupo_sang() {
        return grupo_sang;
    }

    public void setGrupo_sang(String grupo_sang) {
        this.grupo_sang = grupo_sang;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DNI: "+ dni + "- Nombre y Apellido: "+ nombre_ape + ", Grupo Sanguineo: " + grupo_sang + ", Brigada:" + codBrigada;
    }
   
    
}
