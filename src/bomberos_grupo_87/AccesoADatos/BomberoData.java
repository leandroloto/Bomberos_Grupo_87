package bomberos_grupo_87.AccesoADatos;

import bomberos_grupo_87.Entidades.Bombero;
import bomberos_grupo_87.Entidades.Brigada;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BomberoData {

    private Connection con = null;
    private BrigadaData BrigData = new BrigadaData();

    public BomberoData() {
        con = Conexion.getConexion();

    }

    public void nuevoBombero(Bombero bombero) {
        String sql = "INSERT INTO bombero (dni, nombre_ape, fecha_nac, grupo_sang, celular, estado)"
                + " VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setDate(3, Date.valueOf(bombero.getFecha_nac()));
            ps.setString(4, bombero.getGrupo_sang());
            ps.setString(5, bombero.getCelular());
            //ps.setInt(6, bombero.getBrigada().getCodBrigada());
            ps.setBoolean(6, bombero.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setCodBombero(1);
                JOptionPane.showMessageDialog(null, "se registro un nuevo bombero");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la base de datos" + ex.getMessage());
        }

    }

    public void eliminarBombero(int cod) {
        String sql = "UPDATE bombero SET estado=0 WHERE codBombero=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "se elimino el bombero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la base de datos" + ex.getMessage());
        }
    }

    public void modificarBombero(Bombero bombero) {

        String sql = "UPDATE bombero SET dni=?, nombre_ape = ?, fecha_nac = ?, grupo_sang = ?, celular = ?, codBrigada = ?"
                + " WHERE codBombero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setDate(3,Date.valueOf(bombero.getFecha_nac()));
            ps.setString(4,bombero.getGrupo_sang());
            ps.setString(5,bombero.getCelular());
            
            ps.setInt(6, bombero.getBrigada().getCodBrigada());
            
            ps.setInt(7, bombero.getCodBombero());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"se modifico el bombero");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha modificado el Bombero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la base de Datos"+ ex.getMessage());
        }

    }
    public Bombero buscarBomberoPorDNI(int dni){
     String sql = "SELECT * FROM bombero WHERE dni=? AND estado=true";
     Bombero bombero = null;
     try{
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1,dni);
         ResultSet rs = ps.executeQuery();
         
         if(rs.next()){
             bombero = new Bombero();
             bombero.setCodBombero(rs.getInt("codBombero"));
             bombero.setDni(rs.getInt("dni"));
             bombero.setNombre_ape(rs.getString("nombre_ape"));
             bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
             bombero.setGrupo_sang(rs.getString("grupo_sang"));
             bombero.setCelular(rs.getString("celular"));
            Brigada brig = BrigData.buscarBrigada(rs.getInt("codBrigada"));
            bombero.setBrigada(brig);
             bombero.setEstado(rs.getBoolean("estado"));
         }else{
             JOptionPane.showMessageDialog(null,"No existen bomeros con el DNI ingresado");
         }
         ps.close();
         
     }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectarse con la base de datos"+ ex.getMessage());
        }
     return bombero;
    }
    public List<Bombero> listarBombero(){
        String sql = "SELECT * FROM bombero WHERE estado = 1";
        ArrayList<Bombero> bomberos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Bombero bo = new Bombero();
                bo.setCodBombero(rs.getInt("codBombero"));
                bo.setNombre_ape(rs.getString("nombre_ape"));
                bo.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bo.setGrupo_sang(rs.getString("grupo_sang"));
                bo.setCelular(rs.getString("celular"));
                Brigada brig = BrigData.buscarBrigada(rs.getInt("codBrigada"));
                bo.setBrigada(brig);
                bo.setEstado(rs.getBoolean("estado"));
                bomberos.add(bo);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectarse con la base de datos"+ ex.getMessage());
        }
        
      return bomberos;  
    }
    
    public void setBrigadaBombero(Bombero bombero){
        String sql = "UPDATE BOMBERO SET codBrigada = null WHERE codBombero =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bombero.getCodBombero());
            int exito = ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la base de Datos"+ ex.getMessage());
        }
    }
}
