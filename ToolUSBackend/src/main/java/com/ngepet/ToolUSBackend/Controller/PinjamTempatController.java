package com.ngepet.ToolUSBackend.Controller;

import com.ngepet.ToolUSBackend.Entity.PinjamTempat;
import com.ngepet.ToolUSBackend.Entity.Tempat;
import com.ngepet.ToolUSBackend.Service.PinjamTempatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/pinjamtempat")
public class PinjamTempatController {

    @Autowired
    private PinjamTempatService pinjamTempatService;

    @GetMapping("/all")
    public List<PinjamTempat> getAllPinjamTempat() {
        return pinjamTempatService.getAllPinjamTempat();
    }

    @PostMapping("/add")
    public void addPinjamTempat(@RequestBody PinjamTempat pinjamTempat) {
        pinjamTempatService.addPinjamTempat(pinjamTempat);
    }

    // tambahkan metode lainnya sesuai kebutuhan
    @PutMapping("/update/{id}")
    public PinjamTempat updatePinjamTempat(@RequestBody PinjamTempat pinjamTempat, @PathVariable(name="id")String id){
        pinjamTempat.setId_pinjam(id);
        pinjamTempatService.updatePinjamTempat(pinjamTempat, id);
        return pinjamTempat;
    }

    @DeleteMapping("/delete/{id}")
    public void deletePinjamTempat(@PathVariable("id") String id) {
        pinjamTempatService.deletePinjamTempat(id);
    }
}
