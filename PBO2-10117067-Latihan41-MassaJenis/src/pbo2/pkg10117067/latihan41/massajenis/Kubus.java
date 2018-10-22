/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan41.massajenis;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
 * menghitung massa jenis
 */
public class Kubus {
     private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
    return sisi*sisi*sisi;
}
    public int hitungMassaJenis(int parMassa, int volume){
        return massa/volume;
    }
}
