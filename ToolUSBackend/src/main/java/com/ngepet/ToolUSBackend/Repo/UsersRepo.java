package com.ngepet.ToolUSBackend.Repo;

import com.ngepet.ToolUSBackend.Entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepo extends MongoRepository<Users, String> {
    // tambahkan metode kustom jika diperlukan
}

