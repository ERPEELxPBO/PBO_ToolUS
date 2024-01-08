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
public class tempat extends produk implements ketersediaanTempat{
    public boolean ketersediaan;

    public tempat(String id, String nama, boolean ketersediaan) {
        super(id, nama);
        this.ketersediaan = ketersediaan;
    }
    
    @Override
    public boolean cekKetersediaan(){
        
    }
    
    @Override
    public void info(){
        
    }
}
