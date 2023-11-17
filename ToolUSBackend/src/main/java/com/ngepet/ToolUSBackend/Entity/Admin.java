package com.ngepet.ToolUSBackend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admins")
public class Admin {
    @Id
    private String admin_id;
    private String nama;

    // Constructors, getters, setters

    public Admin(String admin_id, String nama) {
        this.admin_id = admin_id;
        this.nama = nama;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public String getNama() {
        return nama;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

