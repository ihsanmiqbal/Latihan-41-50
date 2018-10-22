/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan45.cetaknama;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil Cetak Nama
 */

public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak() {
        return jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetak (String nama){
        System.out.println("Nama Anda : "+nama);
    }
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak :");
        for(int i=1; i<=jmlCetak;i++){
            System.out.println(i+". "+nama);
        }
    }
    
}
