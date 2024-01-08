package com.ngepet.ToolUSBackend.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produksproduks  ")
public class Tempat extends Produk implements KuantitasTempat {
    private boolean ketersediaan;

    public Tempat(String id, String nama, boolean ketersediaan) {
        super(id, nama);
        this.ketersediaan = ketersediaan;
    }

    // Getter & Setter


    public boolean isKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    // Implementasi abstract method dari AbstractProduk
    @Override
    public void info() {
        System.out.println("Informasi Tempat:");
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Ketersediaan: " + ketersediaan);
    }

    // Implementasi method dari interface KuantitasTempat
    @Override
    public boolean cekKetersediaan() {
        return ketersediaan;
    }
}

