package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.PinjamBarang;
import com.ngepet.ToolUSBackend.Repo.PinjamBarangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinjamBarangService {

    @Autowired
    private PinjamBarangRepo pinjamBarangRepo;

    public List<PinjamBarang> getAllPinjamBarang() {
        return pinjamBarangRepo.findAll();
    }

    public void addPinjamBarang(PinjamBarang pinjamBarang) {
        pinjamBarangRepo.save(pinjamBarang);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
