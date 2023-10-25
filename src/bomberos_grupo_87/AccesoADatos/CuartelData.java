package bomberos_grupo_87.AccesoADatos;

import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Cuartel;
import bomberos_grupo_87.Entidades.Especialidad;
import bomberos_grupo_87.Entidades.Siniestro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Discar
 */
public class CuartelData {

    private Connection con = null;
     

    public CuartelData() {
        con = Conexion.getConexion();
    }

    //Crear un nuevo Cuartel
    public void crearCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel(codCuartel, nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo, estado) VALUES(?, ?, ?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cuartel.getCodCuartel());
            ps.setString(2, cuartel.getNombre_cuartel());
            ps.setString(3, cuartel.getDireccion());
            ps.setInt(4, cuartel.getCoord_X());
            ps.setInt(5, cuartel.getCoord_Y());
            ps.setString(6, cuartel.getTelefono());
            ps.setString(7, cuartel.getCorreo());
            ps.setBoolean(8, true);
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cuartel.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "SE CREO UN NUEVO CUARTEL: " + cuartel.getNombre_cuartel());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'cuartel'");
        }
    }

    //Se modifica datos del Cuartel
    public void modificarCuartel(Cuartel cuartel) {

        String sql = "UPDATE cuartel SET nombre_cuartel=?, direccion=?, coord_X=?, coord_Y=?, telefono=?, correo=? WHERE codCuartel=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setInt(7, cuartel.getCodCuartel());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos del Cuartel");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'cuartel' " + ex.getMessage());
        }
    }

    //Se da de baja al cuartel ingresado
    public void eliminarCuartel(int codCuartel) {
        
        String sql = "UPDATE cuartel SET estado = false WHERE codCuartel=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el Cuartel");
            } else {
                JOptionPane.showMessageDialog(null, "No se puede dar de baja el Cuartel");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'cuartel'");
        }

    }

    //Buscar cuartel segun su Codigo de cuartel
    public Cuartel buscarCuartel(int codCuartel) {
        Cuartel cuartel = null;
        String sql = "SELECT * FROM cuartel WHERE codCuartel=? AND estado=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Cuartel");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'cuartel'");
        }
        return cuartel;

    }

    //Devuelve la lista de cuarteles
    public List<Cuartel> listaDeCuarteles() {
        List<Cuartel> listaCuartel = new ArrayList<>();

        String sql = "SELECT * FROM cuartel WHERE estado=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cuartel cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                listaCuartel.add(cuartel);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla 'cuartel'");
        }
        return listaCuartel;
    }

    //Devuelve lista de Brigadas de un cuartel segun su Codigo de Cuartel
    public List<Brigada> listarBrigadasDelCuartel(int codCuartel) {
        List<Brigada> listaBrigCuartel = new ArrayList<>();
        String sql = "SELECT * FROM brigada WHERE codCuartel=? AND estado=true;";
        Cuartel cuartel;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setCuartel(this.buscarCuartel(codCuartel));
                listaBrigCuartel.add(brigada);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CuartelData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaBrigCuartel;

    }

    //Calcula distancia entre dos coordenadas
    public double distanciaEntreCoord(int x1, int y1, int x2, int y2) {

        double distan = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        //Calculo para que se modifique el formato a 2 decimales
        double distancia = Math.round(distan * Math.pow(10, 2)) / Math.pow(10, 2);
        return distancia;
        
    }

    //Devuelve una lista de los 3 Cuarteles mas cercanos al Incidente
    public TreeMap<Double, Cuartel> listaCuartCercaDeSiniestro(int codSiniestro) {
        
        Siniestro sini;
        SiniestroData SD = new SiniestroData();
        sini=SD.buscarSiniestro(codSiniestro);
        List<Cuartel> listaC = listaDeCuarteles();
        TreeMap<Double, Cuartel> listaCercana = new TreeMap<>();

        for (Cuartel cuartel : listaC) {
            double dist=distanciaEntreCoord(sini.getCoord_X(),sini.getCoord_Y(),cuartel.getCoord_X(),cuartel.getCoord_Y());
            listaCercana.put(dist, cuartel);
        }
        return listaCercana;
        
    }

}
