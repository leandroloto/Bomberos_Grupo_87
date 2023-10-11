/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87;

import bomberos_grupo_87.AccesoADatos.BomberoData;
import bomberos_grupo_87.AccesoADatos.BrigadaData;
import bomberos_grupo_87.AccesoADatos.CuartelData;
import bomberos_grupo_87.AccesoADatos.SiniestroData;
import bomberos_grupo_87.Entidades.Bombero;
import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Cuartel;
import bomberos_grupo_87.Entidades.Especialidad;
import bomberos_grupo_87.Entidades.Siniestro;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 *
 * @author Discar
 */
public class Bomberos_Grupo_87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuartel c1 = new Cuartel(1, "Cuartel TUCUMAN", "Laprida 442", 3881, -22, "3814777777", "bomberosargentinatuc@bomberosar.com", true);
        CuartelData CD = new CuartelData();
        
        Brigada brig = new Brigada(5, "Brigada Alfa", Especialidad.RescateAccTrafico, true, c1,true);
        BrigadaData BD = new BrigadaData();
        
        Bombero bombero1 = new Bombero(9874687, "Lourdes Maria Juarez", LocalDate.of(1999, 12, 15), "O-", "038445878",brig , true);
        BomberoData BombD = new BomberoData();
        
        Siniestro sini = new Siniestro(Especialidad.Incendios, LocalDateTime.of(2023, 10, 05, 16, 17, 10, 10), -10, 2540, "Incendio en una casa, Cordoba 233", brig, true, true);
        SiniestroData SD = new SiniestroData();
            
        
        //CD.crearCuartel(c1); //OK
        //CD.modificarCuartel(c1); //OK
        //CD.eliminarCuartel(7); //OK
        //System.out.println(CD.buscarCuartel(5)); //OK
        
//        for (Cuartel cua : CD.listaDeCuarteles()) {
//            System.out.println(cua);
//        }
        
//        for (Brigada brigada : CD.listarBrigadasDelCuartel(1)) { 
//            System.out.println(brigada);
//        }
//        
//        //                                      X1 - Y1 / X2 - Y2
//        double resultado=CD.distanciaEntreCoord(732, -1855, 732, -6555);
//        System.out.println(resultado + "KM de distancia");
        
//        for (Map.Entry<Double, Cuartel> en : CD.listaCuartCercaDeSiniestro(1).entrySet()) {
//            Object Double = en.getKey();
//            Object Cuartel = en.getValue();
//            System.out.println(en.getKey()+"KM con "+en.getValue());
//        } 
        
        //BD.crearBrigada(brig);  //OK
        //BD.modificarBrigada(brig);  //OK
        //System.out.println(BD.buscarBrigada(1));
        //BD.eliminarBrigada(5);
        //System.out.println(BD.brigadaLibre());
//        for (Brigada brigada : BD.brigadaLibre()) {
//            System.out.println(brigada);
//        }
        
        for (Brigada brigada : BD.brigadaAsignada()) {
            System.out.println(brigada);
        }
        
        
        
        
//            SD.crearSiniestro(sini);
            
            
            //BD.nuevoBombero(bombero1);
            //BD.modificarBombero(bombero1);
//            //BD.eliminarBombero(4);
//            System.out.println(BD.buscarBrigada(1));
//            System.out.println(BombD.buscarBomberoPorCod(9874687));
            //System.out.println(SD.buscarSiniestro(2));
            
            
    }
    
}
