/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.AccesoADatos;

import bomberos_grupo_87.Entidades.Siniestro;
import java.sql.Connection;

/**
 *
 * @author psg_7
 */
public class SiniestroData {
    
    private Connection con = null;
    
    public SiniestroData (){
        
        con = Conexion.getConexion();
        
    }
    
   // public Siniestro buscarSiniestros(int cod){
     //   Siniestro siniestro = null;
        
        
  //  }
    
}
