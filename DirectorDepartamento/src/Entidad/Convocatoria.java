/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * @author Dan
 */
public class Convocatoria {

    private String informacion;
    private String nombreActividad;
    private String fecha;

    public static Convocatoria convocatoria = new Convocatoria();

     public Convocatoria(){

    }

     public String getInformacion() {

         return informacion;
     }

     public void setInformacion(String val) {

         this.informacion = val;
     }

     public String getNombreActividad() {

         return nombreActividad;
     }

     public void setNombreActividad(String val) {

         this.nombreActividad = val;
     }

     public String getFecha() {

         return fecha;
     }

     public void setFecha(String val) {

         this.fecha = val;
     }

}
