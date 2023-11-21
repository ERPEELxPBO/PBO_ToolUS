package com.ngepet.ToolUSBackend.Service;

import com.ngepet.ToolUSBackend.Entity.Barang;
import com.ngepet.ToolUSBackend.Repo.BarangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void replaceBarang(Barang updatedBarang) {
        // Find the existing barang by its ID
        Optional<Barang> existingBarangOptional = barangRepo.findById(updatedBarang.getId());

        // Check if the barang exists
        if (existingBarangOptional.isPresent()) {
            // Update the existing barang with the data from updatedBarang
            Barang existingBarang = existingBarangOptional.get();
            existingBarang.setTotalStok(updatedBarang.getTotalStok());
            existingBarang.setTotalStok(updatedBarang.getTotalStok());
            // Update other properties as needed...

            // Save the updated barang
            barangRepo.save(existingBarang);
        } else {
            // Handle the case where the barang with the given ID is not found
            // You can throw an exception or handle it according to your application's requirements.
        }
    }

    public void deleteBarang(Long totalStok) {
        // Find the existing barang by its ID
        Optional<Barang> barangOptional = barangRepo.findById(String.valueOf(totalStok));

        // Check if the barang exists
        if (barangOptional.isPresent()) {
            // If it exists, delete the barang
            barangRepo.delete(barangOptional.get());
        } else {
            // Handle the case where the barang with the given ID is not found
            // You can throw an exception or handle it according to your application's requirements.
        }
    }
}
