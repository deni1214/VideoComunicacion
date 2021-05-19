/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocomunicacion;

/**
 *
 * @author Denilson
 */
public class VideoComunicacion {
    
    private static String nombre;
    private static int CantidadDeUsuarios;
    private static int Tiempo;
    private static String nivel;
    private static int Estrellas;
            
    public VideoComunicacion(String nombre, int CantidadDeUsuarios, int Tiempo, String nivel, int Estrellas){
        VideoComunicacion.nombre = nombre;
        VideoComunicacion.CantidadDeUsuarios = CantidadDeUsuarios;
        VideoComunicacion.Estrellas = Estrellas;
        VideoComunicacion.Tiempo = Tiempo;
        VideoComunicacion.nivel = nivel;
        
    }
    
    public static int cali(){
        return CantidadDeUsuarios*Tiempo*Estrellas;
    }
    
    public static void main(String[] args) {
        VideoComunicacion MiExamen = new VideoComunicacion ("Meet", 40, 2, "libre", 5);
        System.out.println(cali());
    }
    
}
