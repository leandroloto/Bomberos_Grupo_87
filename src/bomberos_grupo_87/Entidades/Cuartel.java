/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Entidades;

/**
 *
 * @author Discar
 */
public class Cuartel {
    
    private int codCuartel;
    private String nombre_cuartel;
    private String direccion;
    private int coord_X;
    private int coord_Y;
    private String telefono;
    private String correo;
    private boolean estado;

    public Cuartel() {
    }

    public Cuartel(int codCuartel, String nombre_cuartel, String direccion, int coord_X, int coord_Y, String telefono, String correo, boolean estado) {
        this.codCuartel = codCuartel;
        this.nombre_cuartel = nombre_cuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public Cuartel(String nombre_cuartel, String direccion, int coord_X, int coord_Y, String telefono, String correo, boolean estado) {
        this.nombre_cuartel = nombre_cuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public Cuartel(String nombre_cuartel, int codCuartel, String direccion, int coord_x, int coord_y, String telefono, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cuartel(String nombre_cuartel, int codCuartel, String direccion, int coord_x, int coord_y, String telefono, String correo, boolean estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    public String getNombre_cuartel() {
        return nombre_cuartel;
    }

    public void setNombre_cuartel(String nombre_cuartel) {
        this.nombre_cuartel = nombre_cuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "Cuartel :" + nombre_cuartel;
    }
    
    
    
}
