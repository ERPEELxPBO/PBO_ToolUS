package com.ngepet.ToolUSBackend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public abstract class Produk {
    @Id
    private String id;
    private String nama;

    public Produk(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Abstract method
    public abstract void info();
}


