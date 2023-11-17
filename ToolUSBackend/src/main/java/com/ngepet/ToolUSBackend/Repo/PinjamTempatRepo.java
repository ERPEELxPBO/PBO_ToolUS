package com.ngepet.ToolUSBackend.Repo;

import com.ngepet.ToolUSBackend.Entity.PinjamTempat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PinjamTempatRepo extends MongoRepository<PinjamTempat, String> {
    // tambahkan metode kustom jika diperlukan
}
