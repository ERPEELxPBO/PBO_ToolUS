package com.ngepet.ToolUSBackend.Repo;

import com.ngepet.ToolUSBackend.Entity.Tempat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TempatRepo extends MongoRepository<Tempat, String> {
    // tambahkan metode kustom jika diperlukan
}
