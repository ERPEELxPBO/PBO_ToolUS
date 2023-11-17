package com.ngepet.ToolUSBackend.Repo;

import com.ngepet.ToolUSBackend.Entity.Barang;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BarangRepo extends MongoRepository<Barang, String> {
    // tambahkan metode kustom jika diperlukan
}
