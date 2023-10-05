/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.AccesoADatos;

import bomberos_grupo_87.Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author psg_7
 */
public class SiniestroData {
    
    private Connection con = null;
    
    public SiniestroData (){
        
        con = Conexion.getConexion();
        
    }
    
    public void crearSiniestro (Siniestro siniestro){
        
        String SQL = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalles, codBrigada, estado, enCurso) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try {  
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getEspecialidad().toString());
            ps.setTimestamp(2, Timestamp.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setInt(6, siniestro.getBrigada().getCodBrigada());
            ps.setBoolean(7, siniestro.isEstado());
            ps.setBoolean(8, siniestro.isEnCurso());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                siniestro.setCodSiniestro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se creó un nuevo siniestro");
            }
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla" + ex.getMessage());
 
        }
        
    }
    
    public List<Siniestro> listarSiniestros(){
    List<Siniestro> listaSiniestro = new ArrayList<>();
    String sql= "SELECT * FROM especialidad WHERE siniestro = ?";
    Siniestro especialidad = new Siniestro();
    
    return null;
    
    } 
    
}
