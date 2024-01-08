/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolus;

/**
 *
 * @author USER
 */
public class admin {
    public String id_admin;
    public String pass;

    public admin(String id_admin, String pass) {
        this.id_admin = id_admin;
        this.pass = pass;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
