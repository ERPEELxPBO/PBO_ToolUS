/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolus;

import java.util.Date;

/**
 *
 * @author USER
 */
public class pinjamBarang extends pinjam{
    public int Stok;

    public pinjamBarang(String id_produk, String id_admin, String nim, Date tgl_pinjam, String status, int Stok) {
        super(id_produk, id_admin, nim, tgl_pinjam, status);
        this.Stok = Stok;
    }
    
    @Override
    public void info(){
        
    }
}
