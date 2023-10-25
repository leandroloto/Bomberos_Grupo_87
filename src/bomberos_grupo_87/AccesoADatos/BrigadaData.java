/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.AccesoADatos;

import bomberos_grupo_87.Entidades.Bombero;
import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Cuartel;
import bomberos_grupo_87.Entidades.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel925
 */
public class BrigadaData {

    private Connection con = null;
    CuartelData CD = new CuartelData();

    public BrigadaData() {
        con = Conexion.getConexion();

    }

    public void crearBrigada(Brigada brigada) {

        String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, codCuartel,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad().toString());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodCuartel());
            ps.setBoolean(5, brigada.isLibre());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se creo una nueva Brigada.");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla " + ex.getMessage());

        }
    }

    public void modificarBrigada(Brigada brigada) {
        String sql = "UPDATE brigada SET nombre_br = ?, especialidad = ?, libre =?, codCuartel =? WHERE codBrigada = ? and estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, String.valueOf(brigada.getEspecialidad()));
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodCuartel());
            ps.setInt(5, brigada.getCodBrigada());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico con exito la brigada.");

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la brigada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos " + ex.getMessage());
        }
    }

    public void eliminarBrigada(int codBrigada) {

        String sql = "UPDATE brigada SET estado=0 WHERE codBrigada=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino la brigada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos " + ex.getMessage());
        }
    }

    public Brigada buscarBrigada(int codBrigada) {
        Brigada brigada = null;
        String sql = "SELECT * FROM brigada WHERE codBrigada=? AND estado=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                brigada.setLibre(rs.getBoolean("libre"));
                Cuartel cuart = CD.buscarCuartel(rs.getInt("codCuartel"));
                brigada.setCuartel(cuart);
                brigada.setEstado(rs.getBoolean("estado"));
            }else
                JOptionPane.showMessageDialog(null, "No existe una BRIGADA con ese Codigo.");
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla " + ex.getMessage());
        }
        return brigada;
    }
    
    public List<Brigada> listarBrigadas() {
        String sql = "SELECT * FROM brigada WHERE estado = 1";
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada br = new Brigada();
                br.setCodBrigada(rs.getInt("codBrigada"));
                br.setNombre_br(rs.getString("nombre_br"));
                br.setLibre(rs.getBoolean("libre"));
                br.setEstado(rs.getBoolean("estado"));
                br.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                Cuartel cuar = CD.buscarCuartel(rs.getInt("codCuartel"));
                br.setCuartel(cuar);
                brigadas.add(br);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex.getMessage());
        }

        return brigadas;
    }
    

    public List<Brigada> brigadaLibre() {
        String sql = "SELECT * FROM brigada WHERE libre = 1 AND estado=true";
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada br = new Brigada();
                br.setCodBrigada(rs.getInt("codBrigada"));
                br.setNombre_br(rs.getString("nombre_br"));
                br.setLibre(rs.getBoolean("libre"));
                br.setEstado(rs.getBoolean("estado"));
                br.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                Cuartel cuar = CD.buscarCuartel(rs.getInt("codCuartel"));
                br.setCuartel(cuar);
                brigadas.add(br);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex.getMessage());
        }

        return brigadas;
    }

    public List<Brigada> brigadaAsignada() {

        String sql = "SELECT * FROM brigada WHERE libre = 0 AND estado = 1";
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada br = new Brigada();
                br.setCodBrigada(rs.getInt("codBrigada"));
                br.setNombre_br(rs.getString("nombre_br"));
                br.setLibre(rs.getBoolean("libre"));
                br.setEstado(rs.getBoolean("estado"));
                br.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                br.setCuartel(CD.buscarCuartel(rs.getInt("codCuartel")));
                brigadas.add(br);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex.getMessage());
        }

        return brigadas;
    }

    public List<Bombero> listarBomberosPorBrigada(int codBrigada) {
        List<Bombero> listaBombero = new ArrayList<Bombero>();
        String sql = "Select * FROM bombero WHERE codBrigada=? AND estado=true;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bombero bomb = new Bombero();
                bomb.setCodBombero(rs.getInt("codBombero"));
                bomb.setDni(rs.getInt("dni"));
                bomb.setNombre_ape(rs.getString("nombre_ape"));
                bomb.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bomb.setGrupo_sang(rs.getString("grupo_sang"));
                bomb.setCelular(rs.getString("celular"));
                bomb.setBrigada(buscarBrigada(rs.getInt("codBrigada")));
                bomb.setEstado(rs.getBoolean("estado"));
                listaBombero.add(bomb);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex.getMessage());
        }
        return listaBombero;
    }

}
