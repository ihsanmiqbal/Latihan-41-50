/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan44.hukumohm;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
 * menghitung Ohm
 */
public class PBO210117067Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai (3,12);
        System.out.println("Kuat Arus : "+btr.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+btr.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+btr.hitungTegangan()+" volt");
    }
    
}
