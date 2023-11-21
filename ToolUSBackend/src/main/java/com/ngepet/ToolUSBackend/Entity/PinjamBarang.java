package com.ngepet.ToolUSBackend.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "pinjambarangs")
public class PinjamBarang extends Pinjam implements KuantitasBarang {
    private int stok;

    public PinjamBarang(String id_pinjam, String id_produk, String id_admin, String nim, Date tanggal_pinjam, String status, int stok) {
        super(id_pinjam, id_produk, id_admin, nim, tanggal_pinjam, status);
        this.stok = stok;
    }

    // Constructors, getters, setters

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public int hitungStok() {
        return stok;
    }

    @Override
    public void updateKetersediaan() {
        setStok(stok);
    }

    // Implementasi abstract method dari AbstractProduk
    @Override
    public void info() {
        System.out.println("Informasi Peminjaman Barang:");
        System.out.println("ID: " + getId_produk());
        System.out.println("Stok: " + hitungStok());
    }


}
