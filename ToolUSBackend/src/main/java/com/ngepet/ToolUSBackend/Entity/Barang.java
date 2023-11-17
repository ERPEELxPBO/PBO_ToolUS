package com.ngepet.ToolUSBackend.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "barangs")
public class Barang extends Produk implements KuantitasBarang {
    private int totalStok;

    public Barang(String id, String nama, int totalStok) {
        super(id, nama);
        this.totalStok = totalStok;
    }

    // Getter & Setter
    public int getTotalStok() {
        return totalStok;
    }

    public void setTotalStok(int totalStok) {
        this.totalStok = totalStok;
    }

    // Implementasi abstract method dari AbstractProduk
    @Override
    public void info() {
        System.out.println("Informasi Barang:");
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Total Stok: " + totalStok);
    }

    // Implementasi method dari interface KuantitasBarang
    @Override
    public int hitungStok() {
        return totalStok;
    }
}


