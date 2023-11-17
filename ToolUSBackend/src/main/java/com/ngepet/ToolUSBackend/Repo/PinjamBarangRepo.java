package com.ngepet.ToolUSBackend.Repo;

import com.ngepet.ToolUSBackend.Entity.PinjamBarang;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PinjamBarangRepo extends MongoRepository<PinjamBarang, String> {
    // tambahkan metode kustom jika diperlukan
}
