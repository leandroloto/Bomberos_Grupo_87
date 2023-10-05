/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87;

import bomberos_grupo_87.AccesoADatos.BrigadaData;
import bomberos_grupo_87.AccesoADatos.CuartelData;
import bomberos_grupo_87.AccesoADatos.SiniestroData;
import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Cuartel;
import bomberos_grupo_87.Entidades.Especialidad;
import bomberos_grupo_87.Entidades.Siniestro;
import java.time.LocalDateTime;

/**
 *
 * @author Discar
 */
public class Bomberos_Grupo_87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuartel c1 = new Cuartel(1,"Cuartel BS.AS.", "9 de Julio 233", 321, -22, "011-42775851", "bomberosargentina@bomberosar.com");
        CuartelData CD = new CuartelData();
        Brigada brig = new Brigada(1, "Brigada Bravo", Especialidad.Incendios, true, c1,true);
        
//        BrigadaData BD = new BrigadaData();
//        BD.crearBrigada(brig);
        
        //CD.crearCuartel(c1);
        //CD.modificarCuartel(c1);
        //CD.eliminarCuartel(0);
        //System.out.println(CD.buscarCuartel(2));
        
//        for (Cuartel cua : CD.listaDeCuarteles()) {
//            System.out.println(cua);
//        }
        
//        for (Brigada brigada : CD.listarBrigadasDelCuartel(3)) {
//            System.out.println(brigada);
//        }
//        
//        //                                      X1 - Y1 / X2 - Y2
//        double resultado=CD.distanciaEntreCoord(32, -12, 22, -42);
//        System.out.println(resultado);
        
            Siniestro sini = new Siniestro(Especialidad.Incendios, LocalDateTime.of(2023, 10, 05, 16, 17, 10, 10), -10, 2540, "Incendio en una casa, Cordoba 233", brig, true, true);
            SiniestroData SD = new SiniestroData();
            System.out.println(sini);
            SD.crearSiniestro(sini);
            
            

        
    }
    
}
