package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.Users;
import com.ngepet.ToolUSBackend.Repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepo usersRepo;

    public List<Users> getAllUsers() {
        return usersRepo.findAll();
    }

    public void addUser(Users users) {
        usersRepo.save(users);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
