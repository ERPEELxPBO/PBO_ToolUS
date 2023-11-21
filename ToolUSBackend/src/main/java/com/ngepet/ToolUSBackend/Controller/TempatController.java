package com.ngepet.ToolUSBackend.Controller;

import com.ngepet.ToolUSBackend.Entity.Tempat;
import com.ngepet.ToolUSBackend.Service.TempatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/tempat")
public class TempatController {

    @Autowired
    private TempatService tempatService;

    @GetMapping("/all")
    public List<Tempat> getAllTempat() {
        return tempatService.getAllTempat();
    }

    @PostMapping("/add")
    public void addTempat(@RequestBody Tempat tempat) {
        tempatService.addTempat(tempat);
    }

    // tambahkan metode lainnya sesuai kebutuhan
    @PutMapping("/update/{id}")
    public Tempat updateTempat(@RequestBody Tempat tempat, @PathVariable(name="id")String id){
        tempat.setId(id);
        tempatService.updateTempat(tempat, id);
        return tempat;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTempat(@PathVariable("id") String id) {
        tempatService.deleteTempat(id);
    }
}
