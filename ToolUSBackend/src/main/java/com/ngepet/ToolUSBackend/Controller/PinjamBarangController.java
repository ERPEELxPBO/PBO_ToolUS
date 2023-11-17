package com.ngepet.ToolUSBackend.Controller;

import com.ngepet.ToolUSBackend.Entity.PinjamBarang;
import com.ngepet.ToolUSBackend.Service.PinjamBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pinjambarang")
public class PinjamBarangController {

    @Autowired
    private PinjamBarangService pinjamBarangService;

    @GetMapping("/all")
    public List<PinjamBarang> getAllPinjamBarang() {
        return pinjamBarangService.getAllPinjamBarang();
    }

    @PostMapping("/add")
    public void addPinjamBarang(@RequestBody PinjamBarang pinjamBarang) {
        pinjamBarangService.addPinjamBarang(pinjamBarang);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
