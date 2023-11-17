package com.ngepet.ToolUSBackend.Repo;

import com.ngepet.ToolUSBackend.Entity.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository<Admin, String> {
    // tambahkan metode kustom jika diperlukan
}
