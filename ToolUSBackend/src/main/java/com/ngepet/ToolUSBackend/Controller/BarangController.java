package com.ngepet.ToolUSBackend.Controller;

import com.ngepet.ToolUSBackend.Entity.Barang;
import com.ngepet.ToolUSBackend.Service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/barang")
public class BarangController {

    @Autowired
    private BarangService barangService;

    @GetMapping("/all")
    public List<Barang> getAllBarang() {
        return barangService.getAllBarang();
    }

    @PostMapping("/add")
    public void addBarang(@RequestBody Barang barang) {
        barangService.addBarang(barang);
    }

    @PutMapping("/replace")
    public void replaceBarang(@RequestBody Barang updatedBarang) {
        barangService.replaceBarang(updatedBarang);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBarang(@PathVariable Long id) {
        barangService.deleteBarang(id);
    }
}
