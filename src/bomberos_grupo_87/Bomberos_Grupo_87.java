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

        Brigada brig = new Brigada(5, "Brigada Alfa", Especialidad.RescateAccTrafico, true, c1, true);
        BrigadaData BD = new BrigadaData();

        Bombero bombero1 = new Bombero(10, 9995687, "Jose Lopez", LocalDate.of(1979, 11, 02), "B-", "0789789", brig, true);
        BomberoData BombD = new BomberoData();

        Siniestro sini = new Siniestro(1, Especialidad.RescateMontaña, LocalDateTime.of(2023, 10, 12, 12, 54, 01), 150, -751, "Se perdio una familia, Sierras de cordoba", brig, true, true);
        SiniestroData SD = new SiniestroData();

        //TEST CUARTELDATA
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


        //TEST BRIGADADATA
        //BD.crearBrigada(brig);  //OK
        //BD.modificarBrigada(brig);  //OK
        //System.out.println(BD.buscarBrigada(1));
        //BD.eliminarBrigada(5);
        //System.out.println(BD.brigadaLibre());
//        for (Brigada brigada : BD.brigadaLibre()) {
//            System.out.println(brigada);
//        }
//        for (Brigada brigada : BD.brigadaAsignada()) {
//            System.out.println(brigada);
//        }


        //TEST BOMBERO
        //BombD.nuevoBombero(bombero1);
        //BombD.modificarBombero(bombero1);
        //System.out.println(BombD.buscarBomberoPorDNI(12354687));
        //BombD.eliminarBombero(10);
        
        
        //TEST SINIESTRO
        //SD.crearSiniestro(sini);
        //SD.modificarSiniestro(sini);
        //System.out.println(SD.buscarSiniestro(4));
//            for (Siniestro listaDeSiniestro : SD.listaDeSiniestros()) {
//                System.out.println(listaDeSiniestro);
//        }
//        for (Siniestro listaDeSiniestro : SD.listaDeSiniestrosDeAyerYHoy()) {
//            System.out.println(listaDeSiniestro);
//        }

    }

}
