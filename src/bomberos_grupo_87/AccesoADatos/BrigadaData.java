/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.AccesoADatos;

import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel925
 */
public class BrigadaData {
    private Connection con = null;
    
    public BrigadaData(){
        con = Conexion.getConexion();
        
    }
    
    public void crearBrigada(Brigada brigada){
        
        String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, codCuartel,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad().toString());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodCuartel());
            ps.setBoolean(5, brigada.isLibre());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se creo una nueva Brigada.");
            }
            ps.close();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla "+ex.getMessage());
            
        }
    }
    
    public Brigada buscar(int codBrigada){
        Brigada brigada = new Brigada();
        CuartelData CD = new CuartelData();
            String sql = "SELECT * FROM brigada WHERE codBrigada=? AND estado=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setCuartel(CD.buscarCuartel(rs.getInt("codCuartel")));
                brigada.setEstado(rs.getBoolean("estado"));
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla "+ex.getMessage());
        }
        return brigada;
    }
    
    
    
    
}
