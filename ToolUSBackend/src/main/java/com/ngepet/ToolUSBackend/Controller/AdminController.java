package com.ngepet.ToolUSBackend.Controller;

import com.ngepet.ToolUSBackend.Entity.Admin;
import com.ngepet.ToolUSBackend.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @PostMapping("/add")
    public void addAdmin(@RequestBody Admin admin) {
        adminService.addAdmin(admin);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
