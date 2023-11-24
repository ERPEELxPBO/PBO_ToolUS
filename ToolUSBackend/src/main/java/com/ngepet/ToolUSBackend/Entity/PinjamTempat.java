package com.ngepet.ToolUSBackend.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "pinjamtempats")
public class PinjamTempat extends Pinjam implements KuantitasTempat {
    private boolean ketersediaan;

    // Constructors, getters, setters
    public PinjamTempat(String id_pinjam, String id_produk, String id_admin, String nim, Date tanggal_pinjam, String status, boolean ketersediaan) {
        super(id_pinjam, id_produk, id_admin, nim, tanggal_pinjam, status);
        this.ketersediaan = ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    @Override
    public void updateKetersediaan() {
        // Logika update ketersediaan
        setKetersediaan(ketersediaan);
    }

    @Override
    public boolean cekKetersediaan() {
        return ketersediaan;
    }


    // Implementasi method dari AbstractPinjam
    @Override
    public void info() {
        System.out.println("Informasi Peminjaman Tempat:");
        System.out.println("ID Produk: " + getId_produk());
        System.out.println("ID Admin: " + getId_admin());
        System.out.println("NIM: " + getNim());
        System.out.println("Tanggal Pinjam: " + getTanggal_pinjam());
        System.out.println("Status: " + getStatus());
        System.out.println("Ketersediaan: " + cekKetersediaan());
    }
}

