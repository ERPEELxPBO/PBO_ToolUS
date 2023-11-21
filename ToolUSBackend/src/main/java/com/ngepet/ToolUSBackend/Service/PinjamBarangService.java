package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.PinjamBarang;
import com.ngepet.ToolUSBackend.Repo.PinjamBarangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PinjamBarangService {

    @Autowired
    private PinjamBarangRepo PinjamBarangRepo;

    public PinjamBarangService(com.ngepet.ToolUSBackend.Repo.PinjamBarangRepo pinjamBarangRepo) {
        PinjamBarangRepo = pinjamBarangRepo;
    }

    public List<PinjamBarang> getAllPinjamBarang() {
        return PinjamBarangRepo.findAll();
    }

    public void addPinjamBarang(PinjamBarang pinjamBarang) {
        PinjamBarangRepo.save(pinjamBarang);
    }

    public void replacePinjamBarang(PinjamBarang updatedPinjamBarang) {
        // Find the existing pinjambarang by its ID
        Optional<PinjamBarang> existingPinjamBarangOptional = PinjamBarangRepo.findById(updatedPinjamBarang.getId_pinjam());

        // Check if the pinjambarang exists
        if (existingPinjamBarangOptional.isPresent()) {
            // Update the existing pinjambarang with the data from updatedPinjamBarang
            PinjamBarang existingPinjamBarang = existingPinjamBarangOptional.get();
            existingPinjamBarang.setStok(updatedPinjamBarang.getStok());
            existingPinjamBarang.setStok(updatedPinjamBarang.getStok());
            // Update other properties as needed...

            // Save the updated pinjambarang
            PinjamBarangRepo.save(existingPinjamBarang);
        }
    }

    public void deletePinjamBarang(Long id_pinjam) {
        // Find the existing pinjambarang by its ID
        Optional<PinjamBarang> pinjamBarangOptional = PinjamBarangRepo.findById(String.valueOf(id_pinjam));

        // Check if the pinjambarang exists
        if (pinjamBarangOptional.isPresent()) {
            // If it exists, delete the pinjambarang
            PinjamBarangRepo.delete(pinjamBarangOptional.get());
        }
    }
}
    // tambahkan metode lainnya sesuai kebutuhan
