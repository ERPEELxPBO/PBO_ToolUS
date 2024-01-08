/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolus;

import java.util.Date;

/**
 *
 * @author USER
 */
public class pinjam {
    public String id_produk;
    public String id_admin;
    public String nim;
    public Date tgl_pinjam;
    public String status;

    public pinjam(String id_produk, String id_admin, String nim, Date tgl_pinjam, String status) {
        this.id_produk = id_produk;
        this.id_admin = id_admin;
        this.nim = nim;
        this.tgl_pinjam = tgl_pinjam;
        this.status = status;
    }

    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Date getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(Date tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void info(){
        
    }
}
