package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.PinjamTempat;
import com.ngepet.ToolUSBackend.Repo.PinjamTempatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinjamTempatService {

    @Autowired
    private PinjamTempatRepo pinjamTempatRepo;

    public List<PinjamTempat> getAllPinjamTempat() {
        return pinjamTempatRepo.findAll();
    }

    public void addPinjamTempat(PinjamTempat pinjamTempat) {
        pinjamTempatRepo.save(pinjamTempat);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
