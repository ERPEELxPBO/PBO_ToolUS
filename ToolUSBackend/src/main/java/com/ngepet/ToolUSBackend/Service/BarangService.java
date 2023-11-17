package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.Barang;
import com.ngepet.ToolUSBackend.Repo.BarangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangService {

    @Autowired
    private BarangRepo barangRepo;

    public List<Barang> getAllBarang() {
        return barangRepo.findAll();
    }

    public void addBarang(Barang barang) {
        barangRepo.save(barang);
    }

    // tambahkan metode lainnya sesuai kebutuhan
}
