/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan42.tabungan;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
 * tabungan
 */
public class Tabungan {
    private final int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
        
    }
    
    public int ambilUang(int jumlah){
        return saldo-jumlah;
    }
}
