package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.Admin;
import com.ngepet.ToolUSBackend.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public List<Admin> getAllAdmins() {
        return adminRepo.findAll();
    }

    public void addAdmin(Admin admin) {
        adminRepo.save(admin);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
