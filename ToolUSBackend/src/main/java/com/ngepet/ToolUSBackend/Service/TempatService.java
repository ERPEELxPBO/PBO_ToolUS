package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.Tempat;
import com.ngepet.ToolUSBackend.Repo.TempatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempatService {

    @Autowired
    private TempatRepo tempatRepo;

    public List<Tempat> getAllTempat() {
        return tempatRepo.findAll();
    }

    public void addTempat(Tempat tempat) {
        tempatRepo.save(tempat);
    }

    public void updateTempat(Tempat tempat, String id) {
        tempatRepo.save(tempat);
    }

    public void deleteTempat(String id) {
        tempatRepo.deleteById(id);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
