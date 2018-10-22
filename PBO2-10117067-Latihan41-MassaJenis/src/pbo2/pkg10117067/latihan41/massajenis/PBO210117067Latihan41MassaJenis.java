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
public class PBO210117067Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus();
        System.out.println("====== Massa Jenis Kubus ======");
        kbs.setSisi(5);
        kbs.setMassa(250);
        System.out.println("Sisi : " + kbs.getSisi());
        System.out.println("Massa : " + kbs.getMassa());
        System.out.println("");
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(), kbs.hitungVolume(kbs.getSisi())));
 
    }
    
}
