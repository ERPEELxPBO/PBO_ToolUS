package com.ngepet.ToolUSBackend.Entity;

import org.springframework.data.annotation.Id;
import java.util.Date;

public abstract class Pinjam
{   @Id
    private String id_produk;
    private String id_admin;
    private String nim;
    private Date tanggal_pinjam;
    private String status;

    public Pinjam(String id_produk, String id_admin, String nim, Date tanggal_pinjam, String status) {
        this.id_produk = id_produk;
        this.id_admin = id_admin;
        this.nim = nim;
        this.tanggal_pinjam = tanggal_pinjam;
        this.status = status;
    }

    // Getter & Setter
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

    public Date getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(Date tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void updateKetersediaan();

    // Abstract method
    public abstract void info();
}

