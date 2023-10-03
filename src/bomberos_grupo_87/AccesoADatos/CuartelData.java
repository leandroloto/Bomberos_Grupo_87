/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.AccesoADatos;

import java.sql.Connection;

/**
 *
 * @author Discar
 */
public class CuartelData {
    
    private Connection con=null;
    
    public CuartelData(){
        con = Conexion.getConexion();
    }
    
    
    
}
