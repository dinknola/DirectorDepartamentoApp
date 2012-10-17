/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * @author Dan
 */
public class Administrador {

    private String userAdmin;
    private String passwordAdmin;
    private String nombreAdmin;
    private int identidadAdmin;

    public Administrador(){

    }

    public String getUserAdmin () {
        return userAdmin;
    }

    public void setUserAdmin (String val) {
        this.userAdmin = val;
    }

    public String getPasswordAdmin () {
        return passwordAdmin;
    }

    public void setPasswordAdmin (String val) {
        this.passwordAdmin = val;
    }

    public String getNombreAdmin () {
        return nombreAdmin;
    }

    public void setNombreAdmin (String val) {
        this.nombreAdmin = val;
    }

    public int getIdetidadAdmin () {
        return identidadAdmin;
    }

    public void setIdentidadAdmin (int val) {
        this.identidadAdmin = val;
    }


}
