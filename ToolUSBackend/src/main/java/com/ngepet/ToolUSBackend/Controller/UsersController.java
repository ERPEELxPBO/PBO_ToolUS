package com.ngepet.ToolUSBackend.Controller;

import com.ngepet.ToolUSBackend.Entity.Users;
import com.ngepet.ToolUSBackend.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/users")
public class PinjamTempatUsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody Users users) {
        usersService.addUser(users);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}

