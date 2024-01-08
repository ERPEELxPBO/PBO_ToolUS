/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolus;

/**
 *
 * @author USER
 */
public class barang extends produk implements kuantitasBarang{
    public int totalStok;

    public barang(String id, String nama, int totalStok) {
        super(id, nama);
        this.totalStok = totalStok;
    }

    @Override
    public int hitungStok(){
        
    }
    
    @Override
    public void info(){
        
    }
}
