/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.AccesoADatos;

import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Especialidad;
import bomberos_grupo_87.Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private BrigadaData BD = new BrigadaData();

    public SiniestroData() {

        con = Conexion.getConexion();

    }

    public void crearSiniestro(Siniestro siniestro) {

        String SQL = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalles,  estado, enCurso) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getEspecialidad().toString());
            ps.setTimestamp(2, Timestamp.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setBoolean(6, siniestro.isEstado());
            ps.setBoolean(7, siniestro.isEnCurso());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                siniestro.setCodSiniestro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se creó un nuevo siniestro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla" + ex.getMessage());

        }

    }

    public void modificarSiniestro(Siniestro siniestro) {

        String sql = "UPDATE siniestro SET tipo=?, fecha_siniestro=?, coord_X=?, coord_Y=?, detalles=?, fecha_resol=?, puntuacion=?, codBrigada=?, estado=?, enCurso=? WHERE codSiniestro=? AND estado = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, siniestro.getEspecialidad().toString());
            ps.setTimestamp(2, Timestamp.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            try{
            ps.setTimestamp(6, Timestamp.valueOf(siniestro.getFecha_resol()));
            }catch(NullPointerException ex){
                    ps.setTimestamp(6,null);
                }
            ps.setInt(7, siniestro.getPuntuacion());
            ps.setInt(8, siniestro.getBrigada().getCodBrigada());
            ps.setBoolean(9, siniestro.isEstado());
            ps.setBoolean(10, siniestro.isEnCurso());
            ps.setInt(11, siniestro.getCodSiniestro());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos del Siniestro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'Siniestro' " + ex.getMessage());
        }
    }

    public void eliminarSiniestro(int codSiniestro) {

        String sql = "UPDATE siniestro SET estado = false WHERE codSiniestro = ? AND estado = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codSiniestro);
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el Siniestro");
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el siniestro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'Siniestro'");

        }

    }

    public Siniestro buscarSiniestro(int codSiniestro) {
        Siniestro siniestro = new Siniestro();

        String sql = "SELECT * FROM siniestro WHERE codSiniestro = ? AND estado = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codSiniestro);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Brigada brigada=null;
                siniestro.setCodSiniestro(rs.getInt("codSiniestro"));
                siniestro.setEspecialidad(Especialidad.valueOf(rs.getString("tipo")));
                siniestro.setFecha_siniestro(rs.getTimestamp("fecha_siniestro").toLocalDateTime());
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalles"));
                try{
                siniestro.setFecha_resol(rs.getTimestamp("fecha_resol").toLocalDateTime());
                }catch(NullPointerException ex){
                    siniestro.setFecha_resol(null);
                }
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                brigada = BD.buscarBrigada(rs.getInt("codBrigada"));
                siniestro.setBrigada(brigada);
                siniestro.setEstado(rs.getBoolean("estado"));
                siniestro.setEnCurso(rs.getBoolean("enCurso"));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el Siniestro.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'siniestro'");
        }
        return siniestro;

    }

    public List<Siniestro> listaDeSiniestros() {
        List<Siniestro> listaDeSiniestros = new ArrayList<>();
        String Sql = "SELECT * FROM siniestro";
        try {
            PreparedStatement ps = con.prepareStatement(Sql);
            ResultSet rs = ps.executeQuery();
            Brigada brigada = null;
            while (rs.next()) {
                Siniestro siniestro = new Siniestro();
                siniestro.setCodSiniestro(rs.getInt("codSiniestro"));
                siniestro.setEspecialidad(Especialidad.valueOf(rs.getString("tipo")));
                siniestro.setFecha_siniestro(rs.getTimestamp("fecha_siniestro").toLocalDateTime());
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalles"));
                try{
                siniestro.setFecha_resol(rs.getTimestamp("fecha_resol").toLocalDateTime());
                }catch(NullPointerException ex){
                    siniestro.setFecha_resol(null);
                }
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                brigada = BD.buscarBrigada(rs.getInt("codBrigada"));
                siniestro.setBrigada(brigada);
                siniestro.setEstado(rs.getBoolean("estado"));
                siniestro.setEnCurso(rs.getBoolean("enCurso"));
                listaDeSiniestros.add(siniestro);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'siniestro'");
        }
        return listaDeSiniestros;
    }

    public List<Siniestro> listaDeSiniestrosDeAyerYHoy() {
        List<Siniestro> listaDeSiniestrosDeAyerYHoy = new ArrayList<>();
        String Sql = "SELECT * FROM siniestro WHERE CURRENT_DATE() = DATE(fecha_siniestro) OR CURRENT_DATE()-1 = DATE(fecha_siniestro)";
        try {
            PreparedStatement ps = con.prepareStatement(Sql);
            ResultSet rs = ps.executeQuery();
            Brigada brigada = null;
            while (rs.next()) {
                Siniestro siniestro = new Siniestro();
                siniestro.setCodSiniestro(rs.getInt("codSiniestro"));
                siniestro.setEspecialidad(Especialidad.valueOf(rs.getString("tipo")));
                siniestro.setFecha_siniestro(rs.getTimestamp("fecha_siniestro").toLocalDateTime());
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalles"));
                try{
                siniestro.setFecha_resol(rs.getTimestamp("fecha_resol").toLocalDateTime());
                }catch(NullPointerException ex){
                    siniestro.setFecha_resol(null);
                }
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setBrigada(BD.buscarBrigada(rs.getInt("codBrigada")));
                siniestro.setEstado(rs.getBoolean("estado"));
                siniestro.setEnCurso(rs.getBoolean("enCurso"));
                listaDeSiniestrosDeAyerYHoy.add(siniestro);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'siniestro'");

        }
        return listaDeSiniestrosDeAyerYHoy;
    }

}
